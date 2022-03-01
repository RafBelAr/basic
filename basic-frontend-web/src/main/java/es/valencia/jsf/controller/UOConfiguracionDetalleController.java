package es.valencia.jsf.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.PrimeFaces;
import org.primefaces.event.CloseEvent;
import org.springframework.context.annotation.Scope;

import es.valencia.aytowebfwk.utils.StrUtils;
import es.valencia.aytowebfwk.utils.comparators.ComparatorNombreCompleto;
import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.aytowebfwk.utils.pf.PFUtils;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.UnidadOrganizativaException;
import es.valencia.exception.UnidadesOrganizativasProxyException;
import es.valencia.jsf.model.ResponsableView;
import es.valencia.jsf.model.UOConfiguracionViewDetalle;
import es.valencia.jsf.model.UsuarioView;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.proxies.internal.UnidadesOrganizativasSoaProxy.UpdateUnidadParams;
import es.valencia.proxies.internal.dto.SustitutoDto;
import es.valencia.proxies.internal.dto.UnidadSoaDto;
import es.valencia.service.basico.UnidadOrganizativaService;

@Named("uoConfiguracionDetalleController")
@Scope("view")
public class UOConfiguracionDetalleController {

	private static Logger logger = LogManager.getLogger(UOConfiguracionDetalleController.class);

	private static final String MESSAGES_SUSTITUTO = "messagesSustituto";

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private UnidadOrganizativaService uoService;

	@Inject
	private es.valencia.proxies.internal.UnidadOrganizativaFacade uoServiceComp;

	private String uid;

	private UOConfiguracionViewDetalle unidadOrganizativa = new UOConfiguracionViewDetalle();

	private UOConfiguracionViewDetalle unidadOrganizativaOrig = new UOConfiguracionViewDetalle();

	private List<UsuarioView> candidatosAGestor = new ArrayList<>();

	private List<UsuarioView> personalAdd = new ArrayList<>();

	private List<UsuarioView> gestoresRemove = new ArrayList<>();
	private List<UsuarioView> deshabilitadosRemove = new ArrayList<>();
	private List<ResponsableView> sustitutosRemove = new ArrayList<>();

	private List<UsuarioView> gestoresFiltered = new ArrayList<>();
	private List<UsuarioView> deshabilitadosFiltered = new ArrayList<>();
	private List<ResponsableView> sustitutosFiltered = new ArrayList<>();

	private List<UsuarioView> personalFiltered;

	private ResponsableView sustitutoSeleccionado = new ResponsableView();

	private enum ModoSeleccionPersonal {
		SUSTITUTO, GESTOR, DESHABILITADO
	};

	private ModoSeleccionPersonal modoSeleccionPersonal;

	private boolean editandoSustituto = false;

	public void init() {

		if (uid != null) {

			try {

				UnidadSoaDto unidadSoa = uoServiceComp.getByKid(uoService.getKid(uid), true);

				init(unidadSoa);

			} catch (UnidadesOrganizativasProxyException | UnidadOrganizativaException ex) {

				logger.error("", ex);
				FwkMessages.error("uo_conf_detalle_error_obteniendo_unidad");
			}

		}

	}

	private void init(UnidadSoaDto unidadSoa) {

		UnidadOrganizativaBDO bdo = uoService.getByUid(unidadSoa.getUid());

		unidadOrganizativa = viewMapper.map(bdo, UOConfiguracionViewDetalle.class);

		unidadOrganizativa.setGestoresAndOrder(viewMapper.mapList(unidadSoa.getGestores(), UsuarioView.class));
		unidadOrganizativa.setRedactoresDeshabilitadosAndOrder(viewMapper.mapList(unidadSoa.getRedactoresBy(true), UsuarioView.class));
		unidadOrganizativa.setRedactoresHabilitadosAndOrder(viewMapper.mapList(unidadSoa.getRedactoresBy(false), UsuarioView.class));

		try {
			unidadOrganizativaOrig = (UOConfiguracionViewDetalle) unidadOrganizativa.clone();
		} catch (CloneNotSupportedException ex) {
			logger.error("", ex);
			FwkMessages.error("uo_conf_detalle_error_titulo", "uo_conf_detalle_error_obteniendo_unidad");
		}

		candidatosAGestor.clear();
		candidatosAGestor.addAll(new HashSet<>(viewMapper.mapList(unidadSoa.getCandidatosAGestor(), UsuarioView.class)));

		if (unidadOrganizativa.getResponsable() != null)
			candidatosAGestor.remove(viewMapper.map(unidadOrganizativa.getResponsable(), UsuarioView.class));

		Collections.sort(candidatosAGestor, new ComparatorNombreCompleto());

	}

	public UOConfiguracionViewDetalle getUnidadOrganizativa() {

		return unidadOrganizativa;
	}

	public void setUnidadOrganizativa(UOConfiguracionViewDetalle unidadOrganizativa) {

		this.unidadOrganizativa = unidadOrganizativa;
	}

	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {

		this.uid = uid;
	}

	public boolean isEditandoSustituto() {

		return editandoSustituto;
	}

	public void setEditandoSustituto(boolean editandoSustituto) {

		this.editandoSustituto = editandoSustituto;
	}

	public List<UsuarioView> getPersonalFiltered() {

		return personalFiltered;
	}

	public void setPersonalFiltered(List<UsuarioView> personalFiltered) {

		this.personalFiltered = personalFiltered;
	}

	public List<UsuarioView> getPersonal() {

		if (modoSeleccionPersonal == null)
			return null;

		List<UsuarioView> personalResult = new ArrayList<>();

		if (ModoSeleccionPersonal.GESTOR.equals(modoSeleccionPersonal))
			personalResult = new ArrayList<>(candidatosAGestor);
		else if (ModoSeleccionPersonal.DESHABILITADO.equals(modoSeleccionPersonal))
			personalResult = new ArrayList<>(unidadOrganizativa.getRedactoresHabilitados());

		personalResult.removeAll(unidadOrganizativa.getGestores());

		if (unidadOrganizativa.getResponsable() != null)
			personalResult.remove(viewMapper.map(unidadOrganizativa.getResponsable(), UsuarioView.class));

		return personalResult;

	}

	public List<UsuarioView> getGestoresFiltered() {

		return gestoresFiltered;
	}

	public void setGestoresFiltered(List<UsuarioView> gestoresFiltered) {

		this.gestoresFiltered = gestoresFiltered;
	}

	public List<UsuarioView> getDeshabilitadosFiltered() {

		return deshabilitadosFiltered;
	}

	public void setDeshabilitadosFiltered(List<UsuarioView> deshabilitadosFiltered) {

		this.deshabilitadosFiltered = deshabilitadosFiltered;
	}

	public List<ResponsableView> getSustitutosFiltered() {

		return sustitutosFiltered;
	}

	public void setSustitutosFiltered(List<ResponsableView> sustitutosFiltered) {

		this.sustitutosFiltered = sustitutosFiltered;
	}

	public List<UsuarioView> getDeshabilitadosRemove() {

		return deshabilitadosRemove;
	}

	public void setDeshabilitadosRemove(List<UsuarioView> deshabilitadosRemove) {

		this.deshabilitadosRemove = deshabilitadosRemove;
	}

	public List<ResponsableView> getSustitutosRemove() {

		return sustitutosRemove;
	}

	public void setSustitutosRemove(List<ResponsableView> sustitutosRemove) {

		this.sustitutosRemove = sustitutosRemove;
	}

	public List<UsuarioView> getGestoresRemove() {

		return gestoresRemove;
	}

	public void setGestoresRemove(List<UsuarioView> gestoresRemove) {

		this.gestoresRemove = gestoresRemove;
	}

	public List<UsuarioView> getPersonalAdd() {

		return personalAdd;
	}

	public void setPersonalAdd(List<UsuarioView> personalAdd) {

		this.personalAdd = personalAdd;
	}

	public ResponsableView getSustitutoSeleccionado() {

		return sustitutoSeleccionado;
	}

	public void setSustitutoSeleccionado(ResponsableView sustitutoSeleccionado) {

		this.sustitutoSeleccionado = sustitutoSeleccionado;
	}

	public void setSustitutoSeleccionadoId(UsuarioView sustituto) {

		int index = candidatosAGestor.indexOf(sustituto);

		if (index != -1) {

			UsuarioView sustitutoAux = candidatosAGestor.get(candidatosAGestor.indexOf(sustituto));
			sustitutoSeleccionado.setUsuarioView(sustitutoAux);
		}

	}

	public UsuarioView getSustitutoSeleccionadoId() {

		return sustitutoSeleccionado;
	}

	public boolean isPersonalAddNotSelected() {

		return CollectionUtils.isEmpty(personalAdd);
	}

	public boolean isGestoresDisabled() {

		return !unidadOrganizativa.isEmisoraNI() && !unidadOrganizativa.isReceptoraNI();
	}

	public void buttonPersonalAceptar() {

		if (ModoSeleccionPersonal.GESTOR.equals(modoSeleccionPersonal)) {

			for (UsuarioView gestor : personalAdd)
				getUnidadOrganizativa().addGestor(candidatosAGestor.get(candidatosAGestor.indexOf(gestor)));

			filterTableGestores();
			return;
		}

		if (ModoSeleccionPersonal.DESHABILITADO.equals(modoSeleccionPersonal)) {

			for (UsuarioView redactor : personalAdd)
				getUnidadOrganizativa().addRedactorDeshabilitado(redactor);

			filterTableDeshabilitados();
		}

	}

	public void buttonRemoveGestores() {

		for (UsuarioView gestor : gestoresRemove) {

			unidadOrganizativa.getGestores().remove(gestor);
		}

		filterTableGestores();

	}

	public void buttonEditarSustituto() {

		if (sustitutosRemove.size() != 1) {

			FwkMessages.info("uo_conf_detalle_info_editar_multiple");
		} else {

			sustitutoSeleccionado = unidadOrganizativa.getSustitutos().get(unidadOrganizativa.getSustitutos().indexOf(sustitutosRemove.get(0)));

			editandoSustituto = true;
		}

		filterTableFirmantes();

	}

	public void buttonAceptarSustituto() {

		if (sustitutoSeleccionado.isValid()) {

			unidadOrganizativa.addSustituto(sustitutoSeleccionado);
			filterTableFirmantes();
			PrimeFaces.current().ajax().addCallbackParam("isSustituoSeleccionado", true);

		} else {

			FwkMessages.error(MESSAGES_SUSTITUTO, "uo_conf_detalle_error_titulo", "uo_conf_detalle_error_firmante_no_seleccionado");

		}

	}

	public void buttonRemoveSustitutos() {

		for (ResponsableView sustituto : sustitutosRemove)
			unidadOrganizativa.getSustitutos().remove(sustituto);

		filterTableFirmantes();
	}

	public void buttonRemoveDeshabilitados() {

		for (UsuarioView redactor : deshabilitadosRemove)
			unidadOrganizativa.removeRedactorDeshabilitado(redactor);

		filterTableDeshabilitados();
	}

	private void filterTableGestores() {

		PrimeFaces.current().executeScript("PF('tableGestores').filter()");

	}

	private void filterTableDeshabilitados() {

		PrimeFaces.current().executeScript("PF('tableDeshabilitados').filter()");

	}

	private void filterTableFirmantes() {

		PrimeFaces.current().executeScript("PF('tableFirmantes').filter()");

	}

	public void initDialogSeleccionPersonal(String modoSeleccion) {

		try {

			modoSeleccionPersonal = ModoSeleccionPersonal.valueOf(modoSeleccion);
		} catch (Exception ex) {

			logger.error("Error en el modo de selección de personal.");
			modoSeleccionPersonal = null;
		}

		personalAdd.clear();
		gestoresRemove.clear();
		deshabilitadosRemove.clear();
		sustitutosRemove.clear();

		sustitutoSeleccionado = new ResponsableView();

		editandoSustituto = false;
		PrimeFaces.current().executeScript("PF('personalResultTable').filter()");
	}

	public List<UsuarioView> completeSustitutos(String query) {

		List<UsuarioView> filteredSustitutos = new ArrayList<>();

		for (UsuarioView sustituto : getPosiblesSustitutos())
			if (StrUtils.containsIgnoreCaseAccents(sustituto.getDescripcionFilter(), query))
				filteredSustitutos.add(sustituto);

		return filteredSustitutos;
	}

	public List<UsuarioView> getPosiblesSustitutos() {

		List<UsuarioView> lista = new ArrayList<>(candidatosAGestor);

		lista.removeAll(unidadOrganizativa.getSustitutos());

		return lista;
	}

	public List<ResponsableView> getSustitutos() {

		return getUnidadOrganizativa().getSustitutos();
	}

	private boolean isSustitutosModificados() {

		List<ResponsableView> sustitutosMod = unidadOrganizativa.getSustitutos();
		Collections.sort(sustitutosMod, new ComparatorNombreCompleto());

		List<ResponsableView> sustitutosOrig = unidadOrganizativaOrig.getSustitutos();
		Collections.sort(sustitutosOrig, new ComparatorNombreCompleto());

		if (!sustitutosOrig.equals(sustitutosMod))
			return true;

		for (int i = 0; i < sustitutosOrig.size(); i++)
			if (!sustitutosOrig.get(i).isModified(sustitutosMod.get(i)))
				return true;

		return false;
	}

	private boolean isGestoresModificados() {

		List<String> listGestoresMod = ViewMapper.getIds(unidadOrganizativa.getGestores());
		Collections.sort(listGestoresMod);

		List<String> listGestoresOrig = ViewMapper.getIds(unidadOrganizativaOrig.getGestores());
		Collections.sort(listGestoresOrig);
		return !listGestoresOrig.equals(listGestoresMod);
	}

	private boolean isDeshabilitadosModificados() {

		List<String> deshabilitadosMod = ViewMapper.getIds(unidadOrganizativa.getRedactoresDeshabilitados());
		Collections.sort(deshabilitadosMod);

		List<String> deshabilitadosOrig = ViewMapper.getIds(unidadOrganizativaOrig.getRedactoresDeshabilitados());
		Collections.sort(deshabilitadosOrig);
		return !deshabilitadosOrig.equals(deshabilitadosMod);
	}

	private Map<UpdateUnidadParams, Object> getModificacionesEmisionRecepcion() {

		Map<UpdateUnidadParams, Object> mapParams = new HashMap<>();

		if (ObjectUtils.notEqual(unidadOrganizativa.isEmisoraNI(), unidadOrganizativaOrig.isEmisoraNI())) {

			mapParams.put(UpdateUnidadParams.EMISORA_NI, unidadOrganizativa.isEmisoraNI());
			mapParams.put(UpdateUnidadParams.AMBITO_RESTRINGIDO_ENVIO, !unidadOrganizativa.isEmisoraNI() ? false : unidadOrganizativa.isAmbitoRestringidoEnvio());

			if (!unidadOrganizativa.isEmisoraNI())
				getUnidadOrganizativa().clearSustitutos();

		}

		if (ObjectUtils.notEqual(unidadOrganizativa.isReceptoraNI(), unidadOrganizativaOrig.isReceptoraNI())) {

			mapParams.put(UpdateUnidadParams.RECEPTORA_NI, unidadOrganizativa.isReceptoraNI());
			mapParams.put(UpdateUnidadParams.AMBITO_RESTRINGIDO_RECEPCION,
					!unidadOrganizativa.isReceptoraNI() ? false : unidadOrganizativa.isAmbitoRestringidoRecepcion());

		}

		if (unidadOrganizativa.isEmisoraNI() && ObjectUtils.notEqual(unidadOrganizativa.isAmbitoRestringidoEnvio(), unidadOrganizativaOrig.isAmbitoRestringidoEnvio())) {
			mapParams.put(UpdateUnidadParams.EMISORA_NI, unidadOrganizativa.isEmisoraNI());
			mapParams.put(UpdateUnidadParams.AMBITO_RESTRINGIDO_ENVIO, unidadOrganizativa.isAmbitoRestringidoEnvio());
		}

		if (unidadOrganizativa.isReceptoraNI()
				&& ObjectUtils.notEqual(unidadOrganizativa.isAmbitoRestringidoRecepcion(), unidadOrganizativaOrig.isAmbitoRestringidoRecepcion())) {
			mapParams.put(UpdateUnidadParams.RECEPTORA_NI, unidadOrganizativa.isReceptoraNI());
			mapParams.put(UpdateUnidadParams.AMBITO_RESTRINGIDO_RECEPCION, unidadOrganizativa.isAmbitoRestringidoRecepcion());
		}

		return mapParams;
	}

	private Map<UpdateUnidadParams, Object> getModificaciones() {

		Map<UpdateUnidadParams, Object> mapParams = getModificacionesEmisionRecepcion();

		if (!unidadOrganizativa.isEmisoraNI() && !unidadOrganizativa.isReceptoraNI())
			unidadOrganizativa.getGestores().clear();

		if (isSustitutosModificados())
			mapParams.put(UpdateUnidadParams.SUSTITUTOS, viewMapper.mapList(unidadOrganizativa.getSustitutos(), SustitutoDto.class));

		if (isDeshabilitadosModificados())
			mapParams.put(UpdateUnidadParams.REDACTORES_DESHABILITADOS, ViewMapper.getIds(unidadOrganizativa.getRedactoresDeshabilitados()));

		if (isGestoresModificados())
			mapParams.put(UpdateUnidadParams.GESTORES, ViewMapper.getIds(unidadOrganizativa.getGestores()));

		return mapParams;
	}

	public void checkModificaciones() {

		Map<UpdateUnidadParams, Object> mapParams = getModificacionesEmisionRecepcion();

		if (mapParams.containsKey(UpdateUnidadParams.EMISORA_NI) || mapParams.containsKey(UpdateUnidadParams.RECEPTORA_NI)
				|| mapParams.containsKey(UpdateUnidadParams.AMBITO_RESTRINGIDO_ENVIO) || mapParams.containsKey(UpdateUnidadParams.AMBITO_RESTRINGIDO_RECEPCION)) {

			PrimeFaces.current().executeScript("$(\"[id='configuracionUOForm:buttonConfirmarGuardado']\").click();");
		} else {

			guardarModificaciones();
		}
	}

	public void guardarModificaciones() {

		try {

			Map<UpdateUnidadParams, Object> mapParams = getModificaciones();

			if (mapParams.size() > 0) {

				UnidadSoaDto unidad = uoServiceComp.updateUnidad(unidadOrganizativa.getKid(), mapParams);
				FwkMessages.info("uo_conf_detalle_info_unidad_actualizada");

				if (unidadOrganizativa.isEmisoraNI() && !unidadOrganizativaOrig.isEmisoraNI())
					FwkMessages.info("uo_conf_detalle_info_redactores_disponibles_minutos");

				init(unidad);

			} else {

				FwkMessages.info("uo_conf_detalle_info_sin_cambios");
			}

		} catch (Exception ex) {

			logger.error("", ex);
			FwkMessages.error("uo_conf_detalle_error_actualizar");
		}
	}

	public void buttonSalir() {

		if (getModificaciones().size() == 0)
			salirAction();

		else
			PrimeFaces.current().executeScript("$(\"[id='configuracionUOForm:buttonConfirmarSalida']\").click();");

	}

	public void salirAction() {

		PrimeFaces.current().dialog().closeDynamic(null);
	}

	public static void openDialogUOConfiguracionDetalle(String uid) {

		Map<String, Object> options = new HashMap<>();
		options.put("modal", true);
		options.put("resizable", false);
		options.put("contentHeight", 590);
		options.put("contentWidth", 850);

		Map<String, List<String>> params = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add(uid);
		params.put("uid", list);

		// Si el diálogo tarda mucho tiempo en cargarse, por ejemplo al recuperar datos de BD, eso
		// mostrará el mensaje de "En progreso" al usuario.
		PFUtils.initDialogLoadListener();

		PrimeFaces.current().dialog().openDynamic("/view/pantallas/secured/uoConfiguracionDetalle.xhtml", options, params);

	}

	public void handleCloseDialogSustituto(CloseEvent event) {

		sustitutoSeleccionado = new ResponsableView();
	}

}

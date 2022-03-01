package es.valencia.jsf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.PrimeFaces;
import org.springframework.context.annotation.Scope;

import es.valencia.aytowebfwk.security.utils.SecurityChecker;
import es.valencia.aytowebfwk.utils.LocaleUtil;
import es.valencia.aytowebfwk.utils.StrUtils;
import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.aytowebfwk.utils.pf.PFUtils;
import es.valencia.application.AppController;
import es.valencia.entity.ListaDestino;
import es.valencia.jsf.model.ListaDetalleView;
import es.valencia.jsf.model.UOBasicView;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.service.basico.ListaDestinoService;
import es.valencia.service.basico.UnidadOrganizativaService;

@Named
@Scope("view")
public class ListasGestionDetalleController {

	private static final Logger logger = LogManager.getLogger(ListasGestionDetalleController.class.getName());

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private UnidadOrganizativaService unidadOrgService;

	@Inject
	private AppController appControlller;

	@Inject
	private ListaDestinoService listaDestinoService;

	private String nombreCas;

	private String uidPropietaria;

	private ListaDetalleView lista = new ListaDetalleView();

	private List<UOBasicView> unidadesPropietarias;

	private List<UOBasicView> unidadesRemove = new ArrayList<>();;

	private List<UOBasicView> unidadesAdd = new ArrayList<>();;

	private List<UOBasicView> unidadesFiltered = new ArrayList<>();;

	private List<UOBasicView> unidadesDestino;

	public void init() {

		unidadesDestino = viewMapper.mapList(unidadOrgService.getReceptorasVigentes(), UOBasicView.class);

		if (nombreCas != null) {

			ListaDestino listaDestino = listaDestinoService.getListaDestino(uidPropietaria, nombreCas);
			lista = viewMapper.map(listaDestino, ListaDetalleView.class);

		} else {

			lista = new ListaDetalleView();
		}

		unidadesPropietarias = viewMapper.mapList(unidadOrgService.getVigenteGestorListasDestinos(), UOBasicView.class);

	}

	/**
	 * Indica si la lista ya existe o es una lista nueva.
	 *
	 * @return boolean
	 */
	public boolean isListaExistente() {

		return StringUtils.isNotBlank(nombreCas);
	}

	public String getNombreCas() {

		return nombreCas;
	}

	public void setNombreCas(String nombreCas) {

		this.nombreCas = nombreCas;
	}

	public String getUidPropietaria() {

		return uidPropietaria;
	}

	public void setUidPropietaria(String uidPropietaria) {

		this.uidPropietaria = uidPropietaria;
	}

	public List<UOBasicView> getUnidadesRemove() {

		return unidadesRemove;
	}

	public void setUnidadesRemove(List<UOBasicView> unidadesRemove) {

		this.unidadesRemove = unidadesRemove;
	}

	public List<UOBasicView> getUnidadesPropietarias() {

		return unidadesPropietarias;
	}

	public void setUnidadesPropietarias(List<UOBasicView> unidadesPropietarias) {

		this.unidadesPropietarias = unidadesPropietarias;
	}

	public List<UOBasicView> completeUnidadPropietaria(String query) {

		List<UOBasicView> filteredUnidadesGestionadas = new ArrayList<>();

		boolean valenciano = LocaleUtil.isValenciano(appControlller.getLocale());

		if (CollectionUtils.isNotEmpty(unidadesPropietarias))
			for (UOBasicView unidad : unidadesPropietarias)
				if (StrUtils.containsIgnoreCaseAccents(valenciano ? unidad.getNombreUnidadVal() : unidad.getNombreUnidadCas(), query))
					filteredUnidadesGestionadas.add(unidad);

		return filteredUnidadesGestionadas;
	}

	public ListaDetalleView getLista() {

		return lista;
	}

	public void setLista(ListaDetalleView lista) {

		this.lista = lista;
	}

	public List<UOBasicView> getUnidadesAdd() {

		return unidadesAdd;
	}

	public void setUnidadesAdd(List<UOBasicView> unidadesAdd) {

		this.unidadesAdd = unidadesAdd;
	}

	public List<UOBasicView> getUnidadesFiltered() {

		return unidadesFiltered;
	}

	public void setUnidadesFiltered(List<UOBasicView> unidadesFiltered) {

		this.unidadesFiltered = unidadesFiltered;
	}

	public List<UOBasicView> getUnidadesDestino() {

		return unidadesDestino;
	}

	public UOBasicView getUnidadPropietaria() {

		return lista.getUnidadPropietaria();
	}

	public void setUnidadPropietaria(final UOBasicView unidad) {

		if (unidad != null) {
			UOBasicView unidadPropietaria = IterableUtils.find(unidadesPropietarias, new Predicate<UOBasicView>() {

				@Override
				public boolean evaluate(UOBasicView object) {

					return StringUtils.equals(object.getUid(), unidad.getUid());
				}

			});

			lista.setUnidadPropietaria(unidadPropietaria);
		}
	}

	public static void openGestionDetalleDialog() {

		openGestionDetalleDialog(null, null);
	}

	public static void openGestionDetalleDialog(String nombreCas, String uidPropietaria) {

		Map<String, Object> options = new HashMap<>();

		options.put("modal", true);
		options.put("resizable", false);
		options.put("contentHeight", 500);
		options.put("contentWidth", 850);

		Map<String, List<String>> params = new HashMap<>();

		if (nombreCas != null) {

			params.put("nombreCas", Arrays.asList(nombreCas));
			params.put("uidPropietaria", Arrays.asList(uidPropietaria));
		}

		// Si el diálogo tarda mucho tiempo en cargarse, por ejemplo al recuperar datos de BD, eso
		// mostrará el mensaje de "En progreso" al usuario.
		PFUtils.initDialogLoadListener();
		PrimeFaces.current().dialog().openDynamic("/view/pantallas/secured/listasGestionDetalle.xhtml", options, params);
	}

	private boolean validar() {

		boolean valido = true;

		if (lista.getKidUnidadPropietaria() == null && !SecurityChecker.check("hasRole('ROLE_OPERADOR') or hasRole('ROLE_ADMINISTRADOR')")) {

			FwkMessages.error("listas_gestion_detalle_validation_uidPropietaria");
			valido = false;
		}

		if (CollectionUtils.isEmpty(lista.getUnidades())) {

			FwkMessages.error("listas_gestion_detalle_validation_unidades_vacia");
			valido = false;
		}

		if (lista.containsDestino(lista.getUidUnidadPropietaria())) {

			FwkMessages.error("listas_gestion_detalle_validation_propietaria_como_destino");
			valido = false;
		}

		return valido;

	}

	public void buttonGuardar() {

		if (lista != null) {

			try {

				if (validar()) {

					listaDestinoService.addOrUpdateListaDestino(lista.getKidUnidadPropietaria(), lista.getNombreCas(), lista.getNombreVal(), lista.getDescripcion(),
							lista.getListUnidadesUid());

					setNombreCas(lista.getNombreCas());

					setUidPropietaria(lista.getUidUnidadPropietaria());

					init();

					FwkMessages.info("listas_gestion_detalle_info_update");

					PrimeFaces.current().executeScript("parent.filtrarListas();");
				}

			} catch (Exception ex) {

				logger.error("Error al guardar lista de gestión", ex);
				FwkMessages.error("listas_gestion_detalle_error_update");
			}
		}
	}

	public void buttonSalir() {

		PrimeFaces.current().dialog().closeDynamic(null);
	}

	public boolean isUnidadesAddNoSelected() {

		return CollectionUtils.isEmpty(unidadesAdd);
	}

	public void buttonAddUnidadesDestino() {

		if (CollectionUtils.isNotEmpty(unidadesAdd)) {

			String uidPropietaria = lista.getUidUnidadPropietaria();

			for (UOBasicView unidad : unidadesAdd)
				if (uidPropietaria != null && uidPropietaria.equals(unidad.getUid()))
					FwkMessages.error("listas_gestion_detalle_info_propietaria_no_anyadida");
				else
					lista.addUnidad(unidad);

		}
	}

	public void removeUnidadesDestino() {

		if (CollectionUtils.isNotEmpty(unidadesRemove)) {

			lista.removeUnidades(unidadesRemove);
		}
	}

	public void initDialogSeleccionUnidades() {

		unidadesAdd.clear();
		unidadesRemove.clear();

		PrimeFaces.current().executeScript("PF('unidadResultTable').filter()");
	}

}

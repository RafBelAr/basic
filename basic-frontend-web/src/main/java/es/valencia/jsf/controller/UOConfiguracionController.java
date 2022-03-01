package es.valencia.jsf.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.faces.event.BehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.primefaces.PrimeFaces;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.AccessDeniedException;

import es.valencia.aytowebfwk.security.utils.SecurityChecker;
import es.valencia.aytowebfwk.utils.StrUtils;
import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.application.AppController;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.jsf.model.UOConfiguracionView;
import es.valencia.jsf.model.UOConfiguracionView.ComparatorUOConfiguracionViewNombre;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.service.basico.UnidadOrganizativaService;

@Named("uoConfiguracionController")
@Scope("view")
public class UOConfiguracionController {

	private UOConfiguracionView unidadSeleccionada;

	private String filtroCodOrganicoExterno;

	private String filtroNombreUnidad;

	private List<UOConfiguracionView> listaUnidadesGestionadas;

	private List<UOConfiguracionView> listaUnidadesFiltradas;

	@Inject
	private AppController appController;

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private @Named("unidadOrganizativaService") UnidadOrganizativaService unidadOrgService;

	public void init() throws IOException {

		List<UnidadOrganizativaBDO> unidadesGestionadas = unidadOrgService.getUnidadesConfiguracion();

		if (!SecurityChecker.check("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')") && CollectionUtils.isEmpty(unidadesGestionadas))
			throw new AccessDeniedException("no_permisos_gestion_unidades");

		listaUnidadesGestionadas = viewMapper.mapList(unidadesGestionadas, UOConfiguracionView.class);
		listaUnidadesFiltradas = new ArrayList<>(listaUnidadesGestionadas);
		Collections.sort(listaUnidadesFiltradas, new ComparatorUOConfiguracionViewNombre(appController.isValenciano()));
	}

	public String getFiltroCodOrganicoExterno() {

		return filtroCodOrganicoExterno;
	}

	public void setFiltroCodOrganicoExterno(String filtroCodOrganicoExterno) {

		this.filtroCodOrganicoExterno = filtroCodOrganicoExterno;
	}

	public String getFiltroNombreUnidad() {

		return filtroNombreUnidad;
	}

	public void setFiltroNombreUnidad(String filtroNombreUnidad) {

		this.filtroNombreUnidad = filtroNombreUnidad;
	}

	public List<UOConfiguracionView> getListaUnidadesFiltradas() {

		return listaUnidadesFiltradas;
	}

	public UOConfiguracionView getUnidadSeleccionada() {

		return unidadSeleccionada;
	}

	public void setUnidadSeleccionada(UOConfiguracionView unidadSeleccionada) {

		this.unidadSeleccionada = unidadSeleccionada;
	}

	public boolean isUnidadNotSelected() {

		return unidadSeleccionada == null;
	}

	public void filtrarUnidades() {

		listaUnidadesFiltradas.clear();
		boolean valenciano = appController.isValenciano();
		boolean filtrarCodOrgExterno = StringUtils.isNotBlank(filtroCodOrganicoExterno);
		boolean filtrarNombreUnidad = StringUtils.isNotBlank(filtroNombreUnidad);

		if (filtrarCodOrgExterno || filtrarNombreUnidad) {

			for (UOConfiguracionView unidad : listaUnidadesGestionadas) {

				boolean addUnidad = true;

				if (filtrarCodOrgExterno && !StrUtils.containsIgnoreCaseAccents(unidad.getCodigoOrganicoExterno(), filtroCodOrganicoExterno)) {

					addUnidad = false;
				}

				if (filtrarNombreUnidad) {

					String descripcion = valenciano ? unidad.getNombreUnidadVal() : unidad.getNombreUnidadCas();

					if (!StrUtils.containsIgnoreCaseAccents(descripcion, filtroNombreUnidad)) {
						addUnidad = false;
					}

				}

				if (addUnidad) {
					listaUnidadesFiltradas.add(unidad);
				}

			}
		} else {
			listaUnidadesFiltradas.addAll(listaUnidadesGestionadas);
		}

	}

	public void resetFilterSearch() {

		setFiltroCodOrganicoExterno(null);
		setFiltroNombreUnidad(null);

		filtrarUnidades();
	}

	public void buttonConfigurar(BehaviorEvent event) {

		this.buttonConfigurar();
	}

	public void buttonConfigurar() {

		if (unidadSeleccionada == null) {

			FwkMessages.info("uo_conf_info_titulo", "uo_conf_info_seleccione_unidad");
			PrimeFaces.current().ajax().addCallbackParam("showDialog", false);
		} else {
			PrimeFaces.current().ajax().addCallbackParam("showDialog", true);
			UOConfiguracionDetalleController.openDialogUOConfiguracionDetalle(unidadSeleccionada.getUid());

		}
	}

	public void buttonCancelar() {

		PrimeFaces.current().dialog().closeDynamic(null);
	}

}

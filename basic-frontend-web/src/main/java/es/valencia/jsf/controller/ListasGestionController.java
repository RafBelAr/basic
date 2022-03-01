package es.valencia.jsf.controller;

import java.io.IOException;
import java.util.List;

import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.collections.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.PrimeFaces;
import org.springframework.context.annotation.Scope;
import org.springframework.security.access.AccessDeniedException;

import es.valencia.aytowebfwk.security.utils.SecurityChecker;
import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.application.AppController;
import es.valencia.entity.ListaDestino;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.exception.ListaDestinoReferenciadaException;
import es.valencia.jsf.model.ListaGestionView;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.service.basico.ListaDestinoService;
import es.valencia.service.basico.UnidadOrganizativaService;

@Named
@Scope("view")
public class ListasGestionController {

	private static final Logger logger = LogManager.getLogger(ListasGestionController.class.getName());

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private ListaDestinoService listaDestinoService;

	@Inject
	private UnidadOrganizativaService unidadOrgService;
	
	@Inject
	private AppController appController;
	
	private ListaGestionView listaSeleccionada;

	private List<ListaGestionView> listasGestionadas;

	private String filtroNombreLista;

	public void checkSecurity() throws IOException {

		if (!SecurityChecker.check("hasRole('ROLE_ADMINISTRADOR') or hasRole('ROLE_OPERADOR')")) {
			List<UnidadOrganizativaBDO> listaGestionadas = unidadOrgService.getUnidadesConfiguracion();
			if (CollectionUtils.isEmpty(listaGestionadas)) 
				throw new AccessDeniedException("no_permisos_gestion_listas");
			
		}

		initListasGestionadas();
	}

	private void initListasGestionadas() {

		List<ListaDestino> listaAux = listaDestinoService.getGestionadasLikeNombreOrNombreUnidad(filtroNombreLista, appController.isValenciano());

		listasGestionadas = viewMapper.mapList(listaAux, ListaGestionView.class);
	}

	public List<ListaGestionView> getListasGestionadas() {

		return listasGestionadas;
	}

	public ListaGestionView getListaSeleccionada() {

		return listaSeleccionada;
	}

	public void setListaSeleccionada(ListaGestionView listaSeleccionada) {

		this.listaSeleccionada = listaSeleccionada;
	}

	public void listaSeleccionadaListener(AjaxBehaviorEvent event) {

		buttonEditarLista();
	}

	public void buttonAnadirLista() {

		PrimeFaces.current().ajax().addCallbackParam("showDialog", true);
		ListasGestionDetalleController.openGestionDetalleDialog();
	}

	public boolean isButtonEditarListaDisabled() {

		return listaSeleccionada == null;
	}

	public void buttonEditarLista() {

		if (listaSeleccionada == null) {

			PrimeFaces.current().ajax().addCallbackParam("showDialog", false);
			FwkMessages.info( "listas_gestion_info_seleccione_lista");
		} else {

			PrimeFaces.current().ajax().addCallbackParam("showDialog", true);
			ListasGestionDetalleController.openGestionDetalleDialog(listaSeleccionada.getNombreCas(), listaSeleccionada.getUidUnidadPropietaria());
		}

	}

	public void buttonBorrarLista() {

		if (listaSeleccionada == null) {

			FwkMessages.info("listas_gestion_info_titulo", "listas_gestion_info_seleccione_lista");
		} else {

			try {

				listaDestinoService.deleteListaDestino(listaSeleccionada.getKidUnidadPropietaria(), listaSeleccionada.getNombreCas());
				initListasGestionadas();

				FwkMessages.info("listas_gestion_info_titulo", "listas_gestion_info_delete");

			} catch (ListaDestinoReferenciadaException e) {

				logger.error("", e);
				FwkMessages.info("listas_gestion_error_titulo", "listas_gestion_error_delete");
			}

		}

	}

	public String getFiltroNombreLista() {

		return filtroNombreLista;
	}

	public void setFiltroNombreLista(String filtroNombreLista) {

		this.filtroNombreLista = filtroNombreLista;
	}

	public void resetSearch() {

		filtroNombreLista = null;
		;
		initListasGestionadas();
	}

	public void filtrarListas() {

		initListasGestionadas();
	}

}

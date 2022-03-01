package es.valencia.jsf.controller;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.cxf.interceptor.security.AccessDeniedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;

import es.valencia.aytowebfwk.security.utils.SecurityUtil;
import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.entity.Coche;
import es.valencia.jsf.model.CocheView;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.service.basico.CocheService;

@Named
@Scope("view")
public class CochesController {

	private static final Logger logger = LogManager.getLogger(CochesController.class.getName());

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private CocheService cocheService;

	private CocheView cocheSeleccionado;

	private List<CocheView> coches;

	public void initTablaCoches() {

		List<Coche> listasCoches = cocheService.getListaCoches();
		coches = viewMapper.mapList(listasCoches, CocheView.class);
	}

	public void initTablaCoches(SelectEvent event) {

		initTablaCoches();
	}

	public CocheView getCocheSeleccionado() {

		return cocheSeleccionado;
	}

	public Long getCocheSeleccionadoId() {

		return cocheSeleccionado == null ? -1 : cocheSeleccionado.getKid();
	}

	public void setCocheSeleccionado(CocheView cocheSeleccionado) {

		this.cocheSeleccionado = cocheSeleccionado;
	}

	public List<CocheView> getCoches() {

		return coches;
	}

	public void setCoches(List<CocheView> coches) {

		this.coches = coches;
	}

	private boolean checkCocheSeleccionado() {

		if (cocheSeleccionado == null) {
			FwkMessages.warn("coches_titulo", "coches_coche_no_seleccionado");
			return false;
		}

		return true;
	}

	// BOTONES OPERACIONES

	public void buttonAnadir() {

		CocheDetalleController.openGestionDetalleDialog(null);
	}

	public void buttonEditar() {

		if (!checkCocheSeleccionado())
			return;

		CocheDetalleController.openGestionDetalleDialog(cocheSeleccionado.getMatricula());

	}

	public void buttonBorrar() {

		try {
			if (!checkCocheSeleccionado())
				return;

			cocheService.eliminar(cocheSeleccionado.getMatricula());

			FwkMessages.info("coches_info_delete");

		} catch (Exception ex) {
			throwMessageError(ex);
		}

		initTablaCoches();
	}

	public void buttonReservar() {

		try {

			if (!checkCocheSeleccionado())
				return;

			cocheService.resevarCoche(cocheSeleccionado.getKid(), SecurityUtil.getPrincipal());

			FwkMessages.info("coches_info_reservado");

		} catch (Exception ex) {
			throwMessageError(ex);

		}

		initTablaCoches();

	}

	private void throwMessageError(Exception ex) {

		throwMessageError(null, ex);
	}

	private void throwMessageError(String message, Exception ex) {

		if (checkAccessDeniedException(ex)) {
			FwkMessages.error("coches_acceso_denegado");

		} else if (ex instanceof DataIntegrityViolationException) {
			logger.error("", ex);
			FwkMessages.error("coches_error_matricula");
		} else {
			logger.error("", ex);
			FwkMessages.error(message == null ? "coches_error" : message);
		}

	}

	public static boolean checkAccessDeniedException(Throwable throwable) {

		if (ExceptionUtils.indexOfThrowable(throwable, org.springframework.security.access.AccessDeniedException.class) != -1
				|| ExceptionUtils.indexOfThrowable(throwable, AccessDeniedException.class) != -1)
			return true;

		return false;

	}

}

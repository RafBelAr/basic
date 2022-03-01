package es.valencia.jsf.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.cxf.interceptor.security.AccessDeniedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.PrimeFaces;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;

import es.valencia.aytowebfwk.utils.jsf.FwkMessages;
import es.valencia.aytowebfwk.utils.pf.PFUtils;
import es.valencia.entity.Coche;
import es.valencia.jsf.model.CocheView;
import es.valencia.jsf.util.ViewMapper;
import es.valencia.service.basico.CocheService;

@Named
@Scope("view")
public class CocheDetalleController {

	private static final Logger logger = LogManager.getLogger(CocheDetalleController.class.getName());

	@Inject
	private ViewMapper viewMapper;

	@Inject
	private CocheService cocheService;

	private String matricula;

	private CocheView coche;

	public void init() {

		if (matricula == null) {

			coche = new CocheView();
		} else {

			Coche entityObj = cocheService.getCocheByMatricula(matricula);
			coche = viewMapper.map(entityObj, CocheView.class);
		}

	}

	public String getMatricula() {

		return matricula;
	}

	public void setMatricula(String matricula) {

		this.matricula = matricula;
	}

	public CocheView getCoche() {

		return coche;
	}

	public void setCoche(CocheView coche) {

		this.coche = coche;
	}

	public void buttonGuardar() {

		try {
			if (coche.isNuevo()) {

				cocheService.crearCoche(coche.getMatricula(), coche.getModelo(), coche.getColor());
				FwkMessages.info("coches_message_info", "coches_info_create");
			} else {

				cocheService.actualizarCoche(coche.getKid(), coche.getMatricula(), coche.getModelo(), coche.getColor());
				FwkMessages.info("coches_message_info", "coches_info_update");
			}
		} catch (Exception ex) {
			throwMessageError(ex);

		}
	}

	public void buttonSalir() {

		PrimeFaces.current().dialog().closeDynamic(null);
	}

	public static void openGestionDetalleDialog(String matricula) {

		Map<String, Object> options = new HashMap<>();

		options.put("modal", true);
		options.put("resizable", false);
		options.put("closable", false);
		options.put("contentHeight", 300);
		options.put("contentWidth", 750);

		Map<String, List<String>> params = new HashMap<>();

		if (matricula != null) {

			params.put("matricula", Arrays.asList(matricula));
		}

		// Si el diálogo tarda mucho tiempo en cargarse, por ejemplo al recuperar datos de BD, eso
		// mostrará el mensaje de "En progreso" al usuario.
		PFUtils.initDialogLoadListener();
		PrimeFaces.current().dialog().openDynamic("/view/pantallas/secured/cocheDetalle.xhtml", options, params);
	}

	private void throwMessageError(Exception ex) {

		throwMessageError(null, ex);
	}

	private void throwMessageError(String message, Exception ex) {

		if (checkAccessDeniedException(ex)) {
			FwkMessages.error("coches_message_info", "coches_acceso_denegado");

		} else if (ex instanceof DataIntegrityViolationException) {
			logger.error("", ex);
			FwkMessages.error("coches_message_info", "coches_error_matricula");
		} else {
			logger.error("", ex);
			FwkMessages.error("coches_message_info", message == null ? "coches_error" : message);
		}

	}

	public static boolean checkAccessDeniedException(Throwable throwable) {

		if (ExceptionUtils.indexOfThrowable(throwable, org.springframework.security.access.AccessDeniedException.class) != -1
				|| ExceptionUtils.indexOfThrowable(throwable, AccessDeniedException.class) != -1)
			return true;

		return false;

	}

}

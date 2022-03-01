package es.valencia.application;

import javax.inject.Named;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

import es.valencia.aytowebfwk.core.pf.ApplicationController;

/**
 * El Controlador/Gestor principal de la aplicación. Gestiona dinámicamente los
 * tabs de navegación y el menú principal. Extiende su clase padre
 * ApplicationController
 *
 * @author LRMR
 *
 */
@Named("applicationController")
@Scope("session")
public class AppController extends ApplicationController {

	@SuppressWarnings("unused")
	private static final Logger log = LogManager.getLogger(AppController.class.getCanonicalName());

	@Value("${aywebfwk.app.mostrar.excepcion.usuario}")
	private boolean mostrarExcepcionUsuario;

	@Value("${aywebfwk.app.version}")
	private String versionNie;

	public AppController() {

		super();
	}

	@Override
	public boolean isMostrarExcepcionUsuario() {

		return mostrarExcepcionUsuario;
	}

	public String getVersionNie() {

		return versionNie;
	}

	public void setVersionNie(String versionNie) {

		this.versionNie = versionNie;
	}

}

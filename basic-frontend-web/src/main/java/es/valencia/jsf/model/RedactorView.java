package es.valencia.jsf.model;

public class RedactorView extends UsuarioView implements Cloneable {

	private boolean deshabilitado;

	public boolean isDeshabilitado() {

		return deshabilitado;
	}

	public void setDeshabilitado(boolean deshabilitado) {

		this.deshabilitado = deshabilitado;
	}

}

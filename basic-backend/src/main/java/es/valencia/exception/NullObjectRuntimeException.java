package es.valencia.exception;

import es.valencia.aytowebfwk.exception.RuntimeBusinessException;

public class NullObjectRuntimeException extends RuntimeBusinessException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String metodo;
	private String nullClassName;

	public NullObjectRuntimeException() {

		super();
	}

	public NullObjectRuntimeException(String message) {

		super(message);
	}

	public NullObjectRuntimeException(String message, Throwable cause) {

		super(message, cause);
	}

	public NullObjectRuntimeException(Throwable cause) {

		super(cause);
	}

	public NullObjectRuntimeException(String message, Object id, String metodo, String nullClassName) {

		super(message);
		this.setIdEntidad(id);
		this.metodo = metodo;
		this.nullClassName = nullClassName;
	}

	public String getMetodo() {

		return metodo;
	}

	public void setMetodo(String metodo) {

		this.metodo = metodo;
	}

	public String getNullClassName() {

		return nullClassName;
	}

	public void setNullClassName(String nullClassName) {

		this.nullClassName = nullClassName;
	}

}

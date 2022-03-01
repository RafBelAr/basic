package es.valencia.exception;

import es.valencia.aytowebfwk.exception.RuntimeBusinessException;

public class ListaDestinoPreconditionRuntimeException extends RuntimeBusinessException {

	private static final long serialVersionUID = 15165768456092025L;

	public ListaDestinoPreconditionRuntimeException() {

		super();
	}

	public ListaDestinoPreconditionRuntimeException(String message, Throwable cause) {

		super(message, cause);
	}

	public ListaDestinoPreconditionRuntimeException(String message) {

		super(message);
	}

	public ListaDestinoPreconditionRuntimeException(Throwable cause) {

		super(cause);
	}

}

package es.valencia.exception;

import es.valencia.aytowebfwk.exception.BussinessException;

public class ListaDestinoReferenciadaException extends BussinessException {

	private static final long serialVersionUID = 15165768456092025L;

	public ListaDestinoReferenciadaException() {

		super();
	}

	public ListaDestinoReferenciadaException(String message, Throwable cause) {

		super(message, cause);
	}

	public ListaDestinoReferenciadaException(String message) {

		super(message);
	}

	public ListaDestinoReferenciadaException(Throwable cause) {

		super(cause);
	}

}

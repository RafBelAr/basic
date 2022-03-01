package es.valencia.exception;

import es.valencia.aytowebfwk.exception.BussinessException;

public class UnidadOrganizativaException extends BussinessException {

	private static final long serialVersionUID = 2679902908430773202L;

	private String uid;

	public UnidadOrganizativaException() {

		super();
	}

	public UnidadOrganizativaException(String message, Throwable cause, String uid) {

		super(message, cause);
		setUid(uid);
	}

	public UnidadOrganizativaException(String message, String uid) {

		super(message);
		setUid(uid);
	}

	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {

		this.uid = uid;
	}

}

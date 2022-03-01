package es.valencia.security;

import org.springframework.security.acls.domain.BasePermission;
import org.springframework.security.acls.model.Permission;

public class AppPermission extends BasePermission {

	private static final long serialVersionUID = 831567860133791738L;

	//TODO ARQUETIPO Aquí definiremos los permisos particulares de nuestra aplicación.
	//Los siguientes son ejemplos de dos permisos especificos de la aplicación.
	public static final Permission REDACCION = new AppPermission(1 << 5, 'E'); // 32
	public static final Permission GESTION = new AppPermission(1 << 6, 'G'); // 64

	protected AppPermission(int mask, char code) {

		super(mask, code);
	}

	protected AppPermission(int mask) {

		super(mask);
	}

}

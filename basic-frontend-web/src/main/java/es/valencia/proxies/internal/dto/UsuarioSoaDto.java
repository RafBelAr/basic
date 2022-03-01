package es.valencia.proxies.internal.dto;

import java.io.Serializable;

import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

import es.valencia.aytowebfwk.utils.comparators.NombreApellidos;

public class UsuarioSoaDto implements Serializable, NombreApellidos {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String usuario;
	private boolean deshabilitado;

	public UsuarioSoaDto() {

	}

	public UsuarioSoaDto(String usuario) {

		super();
		this.usuario = usuario;
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	public String getApellido1() {

		return apellido1;
	}

	public void setApellido1(String apellido1) {

		this.apellido1 = apellido1;
	}

	public String getApellido2() {

		return apellido2;
	}

	public void setApellido2(String apellido2) {

		this.apellido2 = apellido2;
	}

	@Override
	@Transient
	public String getApellidos() {

		return StringUtils.defaultIfEmpty(apellido1, "").concat(apellido2);
	}

	public static long getSerialversionuid() {

		return serialVersionUID;
	}

	public String getNif() {

		return nif;
	}

	public void setNif(String nif) {

		this.nif = nif;
	}

	public String getUsuario() {

		return usuario;
	}

	public void setUsuario(String usuario) {

		this.usuario = usuario;
	}

	public boolean isDeshabilitado() {

		return deshabilitado;
	}

	public void setDeshabilitado(boolean deshabilitado) {

		this.deshabilitado = deshabilitado;
	}

	@Transient
	public String getNombreApellidos() {

		return StringUtils.defaultString(nombre).concat(" ").concat(StringUtils.defaultString(apellido1)).concat(" ")
				.concat(StringUtils.defaultString(apellido2));
	}

	@Transient
	public String getApellidosNombre() {

		return StringUtils.defaultString(apellido1).concat(" ").concat(StringUtils.defaultString(apellido2))
				.concat(", ").concat(StringUtils.defaultString(nombre));
	}

	@Transient
	public String getDescripcion() {

		return StringUtils.defaultString(usuario).concat(" - ").concat(getNombreApellidos());
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioSoaDto other = (UsuarioSoaDto) obj;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}

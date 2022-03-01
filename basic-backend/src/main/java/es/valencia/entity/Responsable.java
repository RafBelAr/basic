package es.valencia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

import es.valencia.aytowebfwk.utils.comparators.NombreApellidos;

@Embeddable
public class Responsable implements Serializable, NombreApellidos {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String usuario;
	private String nombreCargoCas;
	private String nombreCargoVal;

	/**
	 * Constructor sin argumentos requerido por Hibernate
	 */
	public Responsable() {

	}

	public Responsable(String nombre, String apellido1, String apellido2,
			String usuario, String nombreCargoCas, String nombreCargoVal,
			String nif) {

		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nombre = nombre;
		this.nombreCargoCas = nombreCargoCas;
		this.nombreCargoVal = nombreCargoVal;
		this.usuario = usuario;
		this.nif = nif;
	}

	@Column(name = "responsable_nombre", length = 60)
	public String getNombre() {

		return nombre;
	}

	public void setNombre(String nombre) {

		this.nombre = nombre;
	}

	@Override
	@Transient
	public String getApellidos() {

		return StringUtils.defaultIfEmpty(apellido1, "").concat(apellido2);
	}

	@Column(name = "responsable_apellido1", length = 60)
	public String getApellido1() {

		return apellido1;
	}

	public void setApellido1(String apellido1) {

		this.apellido1 = apellido1;
	}

	@Column(name = "responsable_apellido2", length = 60)
	public String getApellido2() {

		return apellido2;
	}

	public void setApellido2(String apellido2) {

		this.apellido2 = apellido2;
	}

	@Column(name = "responsable_nif", length = 10)
	public String getNif() {

		return nif;
	}

	public void setNif(String nif) {

		this.nif = nif;
	}

	@Column(name = "responsable_usuario", length = 20)
	public String getUsuario() {

		return usuario;
	}

	public void setUsuario(String usuario) {

		this.usuario = usuario;
	}

	@Column(name = "responsable_cargo_cas", length = 100)
	public String getNombreCargoCas() {

		return nombreCargoCas;
	}

	public void setNombreCargoCas(String nombreCargoCas) {

		this.nombreCargoCas = nombreCargoCas;
	}

	@Column(name = "responsable_cargo_val", length = 100)
	public String getNombreCargoVal() {

		return nombreCargoVal;
	}

	public void setNombreCargoVal(String nombreCargoVal) {

		this.nombreCargoVal = nombreCargoVal;
	}

	@Transient
	public String getNombreCargo(boolean valenciano) {

		return valenciano ? getNombreCargoVal() : getNombreCargoCas();
	}

	@Transient
	public String getNombreCompleto() {

		return StringUtils.defaultString(nombre) + " "
				+ StringUtils.defaultString(apellido1) + " "
				+ (StringUtils.defaultString(apellido2));
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
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
		Responsable other = (Responsable) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Transient
	public boolean isModified(Responsable responsable) {

		if (!equals(responsable)) {
			return true;
		} else {

			if (!StringUtils.equals(responsable.getNombre(), getNombre()))
				return true;

			if (!StringUtils.equals(responsable.getApellido1(), getApellido1()))
				return true;

			if (!StringUtils.equals(responsable.getApellido2(), getApellido2()))
				return true;

			if (!StringUtils.equals(responsable.getNif(), getNif()))
				return true;

			if (!StringUtils.equals(responsable.getNombreCargoCas(),
					getNombreCargoCas()))
				return true;

			if (!StringUtils.equals(responsable.getNombreCargoVal(),
					getNombreCargoVal()))
				return true;

		}

		return false;
	}

}

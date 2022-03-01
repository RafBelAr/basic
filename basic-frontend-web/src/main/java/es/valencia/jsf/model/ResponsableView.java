package es.valencia.jsf.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class ResponsableView extends UsuarioView implements Cloneable {

	private String nombreCargoCas;
	private String nombreCargoVal;

	public ResponsableView() {

		super();
	}

	public String getNombreCargoCas() {

		return nombreCargoCas;
	}

	public void setNombreCargoCas(String nombreCargoCas) {

		this.nombreCargoCas = nombreCargoCas;
	}

	public String getNombreCargoVal() {

		return nombreCargoVal;
	}

	public void setNombreCargoVal(String nombreCargoVal) {

		this.nombreCargoVal = nombreCargoVal;
	}

	public void setUsuarioView(UsuarioView usuarioView) {

		if (usuarioView == null) {
			throw new IllegalArgumentException("El usuario no puede ser nulo.");
		}

		setNif(usuarioView.getNif());
		setUsuario(usuarioView.getUsuario());
		setNombreCompleto(usuarioView.getNombreCompleto());

	}

	@Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;

		return true;
	}

	public boolean isModified(ResponsableView obj) {

		if (!equals(obj)) {
			return false;
		}

		ResponsableView other = obj;

		if (nombreCargoCas == null) {
			if (other.nombreCargoCas != null)
				return false;
		} else if (!nombreCargoCas.equals(other.nombreCargoCas))
			return false;

		if (nombreCargoVal == null) {
			if (other.nombreCargoVal != null)
				return false;
		} else if (!nombreCargoVal.equals(other.nombreCargoVal))
			return false;

		return true;
	}

	@Override
	public String getDescripcionFilter() {

		StringBuilder descripcionFilter = new StringBuilder();
		descripcionFilter.append(StringUtils.defaultString(getUsuario()));
		descripcionFilter.append(" ");
		descripcionFilter.append(StringUtils.defaultString(getNombreCompleto()));
		descripcionFilter.append(" ");
		descripcionFilter.append(StringUtils.defaultString(getNombreCargoCas()));
		descripcionFilter.append(" ");
		descripcionFilter.append(StringUtils.defaultString(getNombreCargoVal()));
		return descripcionFilter.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static List<ResponsableView> cloneResponsables(List<ResponsableView> listaAClonar) throws CloneNotSupportedException {

		List<ResponsableView> clonedList = new ArrayList<>(listaAClonar.size());

		for (ResponsableView elemento : listaAClonar) {

			clonedList.add((ResponsableView) elemento.clone());
		}

		return clonedList;

	}

	public boolean isValid() {

		return StringUtils.isNotBlank(super.getNif()) && StringUtils.isNotBlank(super.getUsuario());
	}

}

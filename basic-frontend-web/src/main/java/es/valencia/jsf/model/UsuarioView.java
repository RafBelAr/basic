package es.valencia.jsf.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import es.valencia.aytowebfwk.utils.comparators.NombreCompleto;

public class UsuarioView implements NombreCompleto, Cloneable {

	private String usuario;
	private String nombreCompleto;
	private String nif;

	public UsuarioView() {

		super();
	}

	public String getViewId() {

		return getUsuario();
	}

	public String getUsuario() {

		return usuario;
	}

	public void setUsuario(String usuario) {

		this.usuario = usuario;
	}

	@Override
	public String getNombreCompleto() {

		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {

		this.nombreCompleto = nombreCompleto;
	}

	public String getNif() {

		return nif;
	}

	public void setNif(String nif) {

		this.nif = nif;
	}

	public boolean isUsuario(String usuario) {

		return StringUtils.equals(this.usuario, usuario);
	}

	public String getDescripcionFilter() {

		StringBuilder descripcionFilter = new StringBuilder();
		descripcionFilter.append(StringUtils.defaultString(getUsuario()));
		descripcionFilter.append(" ");
		descripcionFilter.append(StringUtils.defaultString(getNombreCompleto()));
		return descripcionFilter.toString();
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
		if (!(obj instanceof UsuarioView))
			return false;

		UsuarioView other = (UsuarioView) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public static List<UsuarioView> cloneUsuarios(List<UsuarioView> listaAClonar) throws CloneNotSupportedException {

		List<UsuarioView> clonedList = new ArrayList<>(listaAClonar.size());

		for (UsuarioView elemento : listaAClonar) {

			clonedList.add((UsuarioView) elemento.clone());
		}

		return clonedList;

	}

}

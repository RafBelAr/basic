package es.valencia.proxies.internal.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import es.valencia.aytowebfwk.utils.comparators.ComparatorNombreApellidos;

public class UnidadSoaDto {
	String uid;
	Set<UsuarioSoaDto> gestores;
	Set<UsuarioSoaDto> redactores;
	Set<UsuarioSoaDto> candidatosAGestor;
	String responsableUsuario;
	Set<UsuarioSoaDto> sustitutos;

	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {

		this.uid = uid;
	}

	public Set<UsuarioSoaDto> getGestores() {

		return gestores;
	}

	public List<UsuarioSoaDto> getGestoresSortedByNombreApellidos() {

		return asSortedList(gestores);
	}

	public void setGestores(Set<UsuarioSoaDto> gestores) {

		this.gestores = gestores;
	}

	public Set<UsuarioSoaDto> getRedactores() {

		return redactores;
	}

	public void setRedactores(Set<UsuarioSoaDto> redactores) {

		this.redactores = redactores;
	}

	public List<UsuarioSoaDto> getRedactoresSortedByNombreApellidos() {

		return asSortedList(redactores);
	}

	public List<UsuarioSoaDto> getRedactoresBy(boolean desHabilitados) {

		List<UsuarioSoaDto> result = new ArrayList<>();

		for (UsuarioSoaDto usuario : redactores) {
			boolean addUsuario = desHabilitados ? usuario.isDeshabilitado() : !usuario.isDeshabilitado();

			if (addUsuario)
				result.add(usuario);
		}

		return result;
	}

	public List<UsuarioSoaDto> getRedactoresDeshabilitados() {

		return getRedactoresBy(true);
	}

	public List<UsuarioSoaDto> getRedactoresHabilitados() {

		return getRedactoresBy(true);
	}

	public Set<UsuarioSoaDto> getCandidatosAGestor() {

		return candidatosAGestor;
	}

	public void setCandidatosAGestor(Set<UsuarioSoaDto> candidatosAGestor) {

		this.candidatosAGestor = candidatosAGestor;
	}

	public String getResponsableUsuario() {

		return responsableUsuario;
	}

	public void setResponsableUsuario(String responsableUsuario) {

		this.responsableUsuario = responsableUsuario;
	}

	public Set<UsuarioSoaDto> getSustitutos() {

		return sustitutos;
	}

	public void setSustitutos(Set<UsuarioSoaDto> sustitutos) {

		this.sustitutos = sustitutos;
	}

	private List<UsuarioSoaDto> asSortedList(Set<UsuarioSoaDto> setUsuarios) {

		List<UsuarioSoaDto> sortedList = new ArrayList<>(setUsuarios);
		Collections.sort(sortedList, new ComparatorNombreApellidos());
		return sortedList;
	}

}

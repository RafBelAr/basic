package es.valencia.jsf.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import es.valencia.aytowebfwk.utils.comparators.ComparatorNombreCompleto;

public class UOConfiguracionViewDetalle extends UOConfiguracionView {

	private Long kid;
	private Long codigoBDO;
	private String codigoOrganicoInterno;
	private String codigoInvariable;
	private boolean emisoraNI;
	private boolean receptoraNI;
	private boolean primerNivel;
	private boolean vigente;
	private boolean ambitoRestringidoEnvio;
	private boolean ambitoRestringidoRecepcion;

	private ResponsableView responsable;

	private List<UsuarioView> gestores = new ArrayList<>();

	private List<ResponsableView> sustitutos = new ArrayList<>();

	private List<UsuarioView> redactoresDeshabilitados = new ArrayList<>();

	private List<UsuarioView> redactoresHabilitados = new ArrayList<>();

	public UOConfiguracionViewDetalle() {

		super();
	}

	@Override
	public Long getKid() {

		return kid;
	}

	@Override
	public void setKid(Long kid) {

		this.kid = kid;
	}

	public Long getCodigoBDO() {

		return codigoBDO;
	}

	public void setCodigoBDO(Long codigoBDO) {

		this.codigoBDO = codigoBDO;
	}

	public String getCodigoOrganicoInterno() {

		return codigoOrganicoInterno;
	}

	public void setCodigoOrganicoInterno(String codigoOrganicoInterno) {

		this.codigoOrganicoInterno = codigoOrganicoInterno;
	}

	public String getCodigoInvariable() {

		return codigoInvariable;
	}

	public void setCodigoInvariable(String codigoInvariable) {

		this.codigoInvariable = codigoInvariable;
	}

	public boolean isEmisoraNI() {

		return emisoraNI;
	}

	public void setEmisoraNI(boolean emisoraNI) {

		this.emisoraNI = emisoraNI;
	}

	public boolean isReceptoraNI() {

		return receptoraNI;
	}

	public void setReceptoraNI(boolean receptoraNI) {

		this.receptoraNI = receptoraNI;
	}

	public boolean isPrimerNivel() {

		return primerNivel;
	}

	public void setPrimerNivel(boolean primerNivel) {

		this.primerNivel = primerNivel;
	}

	public boolean isVigente() {

		return vigente;
	}

	public void setVigente(boolean vigente) {

		this.vigente = vigente;
	}

	public boolean isAmbitoRestringidoEnvio() {

		return ambitoRestringidoEnvio;
	}

	public void setAmbitoRestringidoEnvio(boolean ambitoRestringidoEnvio) {

		this.ambitoRestringidoEnvio = ambitoRestringidoEnvio;
	}

	public boolean isAmbitoRestringidoRecepcion() {

		return ambitoRestringidoRecepcion;
	}

	public void setAmbitoRestringidoRecepcion(boolean ambitoRestringidoRecepcion) {

		this.ambitoRestringidoRecepcion = ambitoRestringidoRecepcion;
	}

	public ResponsableView getResponsable() {

		return responsable;
	}

	public void setResponsable(ResponsableView responsable) {

		this.responsable = responsable;
	}

	public void clearSustitutos() {

		sustitutos.clear();
	}

	public List<ResponsableView> getSustitutos() {

		return sustitutos;
	}

	public void setSustitutos(List<ResponsableView> sustitutos) {

		this.sustitutos = sustitutos;
	}

	public void addSustituto(ResponsableView sustituto) {

		if (sustitutos.contains(sustituto)) {

			sustitutos.set(sustitutos.indexOf(sustituto), sustituto);
		} else {
			sustitutos.add(sustituto);
		}
	}

	public boolean addGestor(UsuarioView gestor) {

		boolean contiene = gestores.contains(gestor);

		if (!contiene)
			gestores.add(gestor);

		return !contiene;
	}

	public List<UsuarioView> getGestores() {

		return gestores;
	}

	public void setGestoresAndOrder(List<UsuarioView> gestores) {

		this.gestores.clear();
		this.gestores.addAll(gestores);
		this.gestores.remove(getResponsable());
		Collections.sort(this.gestores, new ComparatorNombreCompleto());
	}

	public void setGestores(List<UsuarioView> gestores) {

		this.gestores = gestores;
	}

	public void addRedactorDeshabilitado(UsuarioView redactor) {

		UsuarioView redactorAux = redactoresHabilitados
				.get(redactoresHabilitados.indexOf(redactor));

		if (!redactoresDeshabilitados.contains(redactorAux)) {

			redactoresDeshabilitados.add(redactorAux);
			redactoresHabilitados.remove(redactorAux);

		}

	}

	public void removeRedactorDeshabilitado(UsuarioView redactor) {

		int index = redactoresDeshabilitados.indexOf(redactor);

		UsuarioView redactorAux = redactoresDeshabilitados.remove(index);
		redactoresHabilitados.add(redactorAux);

	}

	public List<UsuarioView> getRedactoresDeshabilitados() {

		return redactoresDeshabilitados;
	}

	public void setRedactoresDeshabilitadosAndOrder(
			List<UsuarioView> redactoresDeshabilitados) {

		this.redactoresDeshabilitados.clear();
		this.redactoresDeshabilitados.addAll(redactoresDeshabilitados);
		Collections.sort(this.redactoresDeshabilitados,
				new ComparatorNombreCompleto());
	}

	public void setRedactoresDeshabilitados(
			List<UsuarioView> redactoresDeshabilitados) {

		this.redactoresDeshabilitados = redactoresDeshabilitados;
	}

	public List<UsuarioView> getRedactoresHabilitados() {

		return redactoresHabilitados;
	}

	public void setRedactoresHabilitadosAndOrder(
			List<UsuarioView> redactoresHabilitados) {

		this.redactoresHabilitados.clear();
		this.redactoresHabilitados.addAll(redactoresHabilitados);
		Collections.sort(this.redactoresHabilitados,
				new ComparatorNombreCompleto());
	}

	public void setRedactoresHabilitados(List<UsuarioView> redactoresHabilitados) {

		this.redactoresHabilitados = redactoresHabilitados;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		UOConfiguracionViewDetalle cloned = (UOConfiguracionViewDetalle) super
				.clone();
		if (cloned.getResponsable() != null)
			cloned.setResponsable((ResponsableView) cloned.getResponsable()
					.clone());

		cloned.setSustitutos(ResponsableView.cloneResponsables(getSustitutos()));
		cloned.setGestores(UsuarioView.cloneUsuarios(getGestores()));
		cloned.setRedactoresDeshabilitados(UsuarioView
				.cloneUsuarios(getRedactoresDeshabilitados()));
		cloned.setRedactoresHabilitados(UsuarioView
				.cloneUsuarios(getRedactoresHabilitados()));

		return cloned;
	}

}

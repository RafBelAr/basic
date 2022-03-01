package es.valencia.jsf.model;

public class CocheView {

	private Long kid;

	private String matricula;

	private String modelo;

	private String color;

	private String usuarioReserva;

	public CocheView() {

		super();
	}


	public String getMatricula() {

		return matricula;
	}

	public void setMatricula(String matricula) {

		this.matricula = matricula;
	}

	public String getModelo() {

		return modelo;
	}

	public void setModelo(String modelo) {

		this.modelo = modelo;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public String getUsuarioReserva() {

		return usuarioReserva;
	}

	public void setUsuarioReserva(String usuarioReserva) {

		this.usuarioReserva = usuarioReserva;
	}

	public boolean isNuevo() {

		return kid == null;
	}





	public Long getKid() {

		return kid;
	}



	public void setKid(Long kid) {

		this.kid = kid;
	}

}

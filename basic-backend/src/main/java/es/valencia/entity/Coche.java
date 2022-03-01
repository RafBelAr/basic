package es.valencia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NaturalId;

import es.valencia.aytowebfwk.utils.StrUtils;

@Entity
@Table(name = "coches")
public class Coche {

	private Long kid;

	private String matricula;

	private String modelo;

	private String color;

	private String usuarioReserva;

	public Coche() {

	}

	@Id
	@SequenceGenerator(name = "sequence", sequenceName = "coche_sequence")
	@GeneratedValue(generator = "sequence")
	@Column(name = "id")
	public Long getKid() {

		return kid;
	}

	public void setKid(Long kid) {

		this.kid = kid;
	}

	@Column(name = "matricula", length = 10)
	@NaturalId(mutable = true)
	public String getMatricula() {

		return matricula;
	}

	public void setMatricula(String matricula) {

		this.matricula = matricula;
	}

	@Column(name = "modelo", length = 250)
	public String getModelo() {

		return modelo;
	}

	public void setModelo(String modelo) {

		this.modelo = modelo;
	}

	@Column(name = "color", length = 10)
	public String getColor() {

		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	@Transient
	public String getDescripcion() {

		return StrUtils.joinSeparator(" - ", modelo, color);
	}

	@Column(name = "usuario_reserva", length = 20)
	public String getUsuarioReserva() {

		return usuarioReserva;
	}

	public void setUsuarioReserva(String usuarioReserva) {

		this.usuarioReserva = usuarioReserva;
	}

}

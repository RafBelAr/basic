package es.valencia.entity;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.OptimisticLock;

import es.valencia.aytowebfwk.utils.LocaleUtil;
import es.valencia.exception.ListaDestinoPreconditionRuntimeException;
import es.valencia.exception.NullObjectRuntimeException;

@Entity
@Table(name = "lista_destino")

public class ListaDestino  {

	private static Logger log = LogManager.getLogger(ListaDestino.class);

	private static final String EXCEPTION_MSG_UO_PROPIETARIA_COMO_DESTINO = "No se puede añadir como destino la unidad propietaria de la lista";
	private Long kid;
	private String nombreCas;
	private String nombreVal;
	private String descripcion;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private UnidadOrganizativaBDO unidadPropietaria;
	private Set<UnidadOrganizativaBDO> listaUnidadesDestino = new HashSet<>();
	private Integer occVersion;

	/**
	 * Constructor sin argumentos requerido por Hibernate
	 */
	public ListaDestino() {

		super();
		setFechaCreacion(new Date());
	}

	public ListaDestino(UnidadOrganizativaBDO unidadPropietaria, String nombreCas) {

		this();
		this.nombreCas = nombreCas;
		this.unidadPropietaria.addListaDestinoUnidad(this);
	}

	public ListaDestino(UnidadOrganizativaBDO unidadPropietaria, String nombreCas, String descripcion) {

		this(unidadPropietaria, nombreCas);
		this.descripcion = descripcion;

	}

	@Id
	@SequenceGenerator(name = "sequence", sequenceName = "listadest_sequence")
	@GeneratedValue(generator = "sequence")
	@Column(name = "ld_lista_id")
	public Long getKid() {

		return kid;
	}

	public void setKid(Long kid) {

		this.kid = kid;
	}

	@Column(name = "ld_nombre_cas", length = 150)
	@NaturalId
	@NotNull
	public String getNombreCas() {

		return nombreCas;
	}

	public void setNombreCas(String nombreCas) {

		this.nombreCas = nombreCas;
	}

	@Column(name = "ld_nombre_val", length = 150)
	@NotNull
	public String getNombreVal() {

		return nombreVal;
	}

	public void setNombreVal(String nombreVal) {

		this.nombreVal = nombreVal;
	}

	@Transient
	public String getNombre(String lang) {

		return LocaleUtil.VALENCIANO_LANG.equals(lang) ? getNombreVal() : getNombreCas();
	}

	@Column(name = "ld_descripcion", length = 255)
	public String getDescripcion() {

		return descripcion;
	}

	public void setDescripcion(String descripcion) {

		this.descripcion = descripcion;
	}

	@Column(name = "ld_fecha_creacion")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFechaCreacion() {

		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {

		this.fechaCreacion = fechaCreacion;
	}

	@Column(name = "ld_fecha_modificacion")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFechaModificacion() {

		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {

		this.fechaModificacion = fechaModificacion;
	}

	@ManyToOne
	@JoinColumn(name = "ld_uo_id", referencedColumnName = "uo_id", foreignKey = @ForeignKey(name = "FK_LISTA_DEST__UO_ID"))
	@NaturalId
	public UnidadOrganizativaBDO getUnidadPropietaria() {

		return unidadPropietaria;
	}

	public void setUnidadPropietaria(UnidadOrganizativaBDO unidadPropietaria) {

		this.unidadPropietaria = unidadPropietaria;
	}

	@OptimisticLock(excluded = true)
	@SuppressWarnings("unused")
	@ManyToMany
	@JoinTable(name = "lista_destino_unidades", joinColumns = { @JoinColumn(name = "ldu_lista_id", referencedColumnName = "ld_lista_id") }, inverseJoinColumns = {
			@JoinColumn(name = "ldu_uo_id", referencedColumnName = "uo_id") }, foreignKey = @ForeignKey(name = "FK_LISTA__UO_ID"))
	@OrderBy("nombreUnidadCas")
	private Set<UnidadOrganizativaBDO> getListaUnidadesDestino() {

		return listaUnidadesDestino;
	}

	@SuppressWarnings("unused")
	private void setListaUnidadesDestino(Set<UnidadOrganizativaBDO> listaUnidadesDestino) {

		this.listaUnidadesDestino = listaUnidadesDestino;
	}

	@Transient
	public Set<UnidadOrganizativaBDO> getListaUnidadesDestinoUnmodifiable() {

		return Collections.unmodifiableSet(listaUnidadesDestino);
	}

	@Transient
	public void clearListaUnidadesDestino() {

		listaUnidadesDestino.clear();
	}

	public void addUnidadDestino(UnidadOrganizativaBDO unidadDestino) {

		if (unidadDestino == null) {

			log.error("El objeto pasado como parámetro no puede ser nulo: Entidad = " + this.getClass().getName() + "; Entidad ID: = " + kid
					+ "; metodo = addUnidadDestino; NullObjectClass = UnidadOrganizativaBDO");
			throw new NullObjectRuntimeException("{exception.null.object}", kid, "addUnidadDestino", "UnidadOrganizativaBDO");
		}

		if (unidadDestino.equals(getUnidadPropietaria())) {

			throw new ListaDestinoPreconditionRuntimeException(EXCEPTION_MSG_UO_PROPIETARIA_COMO_DESTINO);
		}

		listaUnidadesDestino.add(unidadDestino);
	}

	public void setUnidadesDestino(List<UnidadOrganizativaBDO> unidadesDestino) {

		if (unidadesDestino.contains(getUnidadPropietaria())) {

			throw new ListaDestinoPreconditionRuntimeException(EXCEPTION_MSG_UO_PROPIETARIA_COMO_DESTINO);
		}

		listaUnidadesDestino.clear();
		listaUnidadesDestino.addAll(unidadesDestino);

	}

	public void removeUnidadDestino(UnidadOrganizativaBDO unidadDestino) {

		if (unidadDestino != null) {
			listaUnidadesDestino.remove(unidadDestino);
		} else {
			log.error("El objeto pasado como parámetro no puede ser nulo: Entidad = " + this.getClass().getName() + "; Entidad ID: = " + kid
					+ "; metodo = removeUnidadDestino; NullObjectClass = UnidadOrganizativaBDO");
			throw new NullObjectRuntimeException("{exception.null.object}", kid, "removeUnidadDestino", "UnidadOrganizativaBDO");
		}
	}

	@Version
	@Column(name = "occ_version")
	public Integer getOccVersion() {

		return occVersion;
	}

	public void setOccVersion(Integer occVersion) {

		this.occVersion = occVersion;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreCas == null) ? 0 : nombreCas.hashCode());
		result = prime * result + ((unidadPropietaria == null) ? 0 : unidadPropietaria.hashCode());
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
		ListaDestino other = (ListaDestino) obj;
		if (nombreCas == null) {
			if (other.nombreCas != null)
				return false;
		} else if (!nombreCas.equals(other.nombreCas))
			return false;
		if (unidadPropietaria == null) {
			if (other.unidadPropietaria != null)
				return false;
		} else if (!unidadPropietaria.equals(other.unidadPropietaria))
			return false;
		return true;
	}

}

package es.valencia.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.annotations.NaturalId;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import es.valencia.aytowebfwk.security.annotations.Propagable;
import es.valencia.aytowebfwk.utils.LocaleUtil;
import es.valencia.aytowebfwk.utils.comparators.ComparatorNombreApellidos;
import es.valencia.exception.NullObjectRuntimeException;

@Entity
@Table(name = "unidad_organizativa")
// Si la entidad estuviera securizada mediante ACLs, sería necesaria la siguiente anotación
// @Secured
@Audited
public class UnidadOrganizativaBDO {

	private static Logger log = LogManager.getLogger(UnidadOrganizativaBDO.class);

	private Long kid;
	private String uid;
	private Long codigoBDO;
	private String codigoOrganicoExterno;
	private String codigoOrganicoInterno;
	private String codigoInvariable;
	private boolean emisoraNI;
	private boolean receptoraNI;
	private String nombreUnidadCas;
	private String nombreUnidadVal;
	private boolean primerNivel;
	private boolean vigente;

	private boolean ambitoRestringidoEnvio;
	private boolean ambitoRestringidoRecepcion;

	private UnidadOrganizativaBDO redireccionBuzon;

	private Responsable responsable;
	private Set<Responsable> sustitutos = new HashSet<>();

	private UnidadOrganizativaBDO unidadPadre;
	private Set<UnidadOrganizativaBDO> listaUnidadesHija = new HashSet<>();
	private Set<ListaDestino> coleccionListasDestinosUnidad = new HashSet<>();

	private Integer occVersion;
	private Integer forceUpdate;

	/**
	 * Constructor sin argumentos requerido por Hibernate
	 */
	public UnidadOrganizativaBDO() {

	}

	public UnidadOrganizativaBDO(String codigoInvariable) {

		super();
		this.codigoInvariable = codigoInvariable;
	}

	public UnidadOrganizativaBDO(String uid, Long codigoBDO, String codigoOrganicoExterno, String codigoOrganicoInterno, String codigoInvariable, boolean emisoraNI,
			boolean receptoraNI, String nombreUnidadCas, String nombreUnidadVal, boolean primerNivel, boolean vigente, boolean ambitoRestringidoEnvio,
			boolean ambitoRestringidoRecepcion) {

		super();
		this.uid = uid;
		this.codigoBDO = codigoBDO;
		this.codigoOrganicoExterno = codigoOrganicoExterno;
		this.codigoOrganicoInterno = codigoOrganicoInterno;
		this.codigoInvariable = codigoInvariable;
		this.emisoraNI = emisoraNI;
		this.receptoraNI = receptoraNI;
		this.nombreUnidadCas = nombreUnidadCas;
		this.nombreUnidadVal = nombreUnidadVal;
		this.primerNivel = primerNivel;
		this.vigente = vigente;
		this.ambitoRestringidoEnvio = ambitoRestringidoEnvio;
		this.ambitoRestringidoRecepcion = ambitoRestringidoRecepcion;
	}

	@Id
	@SequenceGenerator(name = "sequence", sequenceName = "uniorg_sequence")
	@GeneratedValue(generator = "sequence")
	@Column(name = "uo_id")
	public Long getKid() {

		return kid;
	}

	@Transient
	public Long getId() {

		return kid;
	}

	public void setKid(Long kid) {

		this.kid = kid;
	}

	@Column(name = "uo_uid", length = 10)
	@NaturalId
	// Anotación de seguridad para el uso de ACLs con GCA. Especifica a GCA el identificador de negocio de la entidad
	// @BusinessId
	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {

		this.uid = uid;
	}

	@Column(name = "uo_codigo_bdo", length = 10)
	public Long getCodigoBDO() {

		return codigoBDO;
	}

	public void setCodigoBDO(Long codigoBDO) {

		this.codigoBDO = codigoBDO;
	}

	@Column(name = "uo_codigo_organico_externo", length = 30)
	public String getCodigoOrganicoExterno() {

		return codigoOrganicoExterno;
	}

	public void setCodigoOrganicoExterno(String codigoOrganicoExterno) {

		this.codigoOrganicoExterno = codigoOrganicoExterno;
	}

	@Column(name = "uo_codigo_organico_interno", length = 30)
	public String getCodigoOrganicoInterno() {

		return codigoOrganicoInterno;
	}

	public void setCodigoOrganicoInterno(String codigoOrganicoInterno) {

		this.codigoOrganicoInterno = codigoOrganicoInterno;
	}

	@Column(name = "uo_codigo_invariable", length = 6)
	public String getCodigoInvariable() {

		return codigoInvariable;
	}

	public void setCodigoInvariable(String codigoInvariable) {

		this.codigoInvariable = codigoInvariable;
	}

	@Column(name = "uo_emisora_ni", nullable = false)
	@Propagable
	public boolean isEmisoraNI() {

		return emisoraNI;
	}

	public void setEmisoraNI(boolean emisoraNI) {

		this.emisoraNI = emisoraNI;
	}

	@Column(name = "uo_receptora_ni", nullable = false)
	@Propagable
	public boolean isReceptoraNI() {

		return receptoraNI;
	}

	public void setReceptoraNI(boolean receptoraNI) {

		this.receptoraNI = receptoraNI;
	}

	@Column(name = "uo_nombre_unidad_cas", length = 120)
	public String getNombreUnidadCas() {

		return nombreUnidadCas;
	}

	public void setNombreUnidadCas(String nombreUnidadCas) {

		this.nombreUnidadCas = nombreUnidadCas;
	}

	@Column(name = "uo_nombre_unidad_val", length = 120)
	public String getNombreUnidadVal() {

		return nombreUnidadVal;
	}

	public void setNombreUnidadVal(String nombreUnidadVal) {

		this.nombreUnidadVal = nombreUnidadVal;
	}

	@Transient
	public String getNombreUnidad(String lang) {

		return getNombreUnidad(LocaleUtil.VALENCIANO_LANG.equals(lang));
	}

	@Transient
	public String getNombreUnidad(boolean valenciano) {

		return valenciano ? getNombreUnidadVal() : getNombreUnidadCas();
	}

	@Column(name = "uo_primer_nivel", nullable = false)
	@Propagable
	public boolean isPrimerNivel() {

		return primerNivel;
	}

	public void setPrimerNivel(boolean primerNivel) {

		this.primerNivel = primerNivel;
	}

	@Column(name = "uo_vigente", nullable = false)
	@Propagable
	public boolean isVigente() {

		return vigente;
	}

	public void setVigente(boolean vigente) {

		this.vigente = vigente;
	}

	@Column(name = "UO_AMBITO_RESTRING_ENVIO", nullable = false)
	public boolean isAmbitoRestringidoEnvio() {

		return isPrimerNivel() ? false : ambitoRestringidoEnvio;
	}

	public void setAmbitoRestringidoEnvio(boolean ambitoRestringidoEnvio) {

		this.ambitoRestringidoEnvio = ambitoRestringidoEnvio;
	}

	@Column(name = "UO_AMBITO_RESTRING_RECEPCION", nullable = false)
	public boolean isAmbitoRestringidoRecepcion() {

		return isPrimerNivel() ? false : ambitoRestringidoRecepcion;
	}

	public void setAmbitoRestringidoRecepcion(boolean ambitoRestringidoRecepcion) {

		this.ambitoRestringidoRecepcion = ambitoRestringidoRecepcion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uo_redireccion_buzon", foreignKey = @ForeignKey(name = "FK_UO__REDIRECCION_BUZON"))
	public UnidadOrganizativaBDO getRedireccionBuzon() {

		return redireccionBuzon;
	}

	public void setRedireccionBuzon(UnidadOrganizativaBDO redireccionBuzon) {

		this.redireccionBuzon = redireccionBuzon;
	}

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "nombre", column = @Column(name = "uo_responsable_nombre", length = 60)),
			@AttributeOverride(name = "apellido1", column = @Column(name = "uo_responsable_apellido1", length = 60)),
			@AttributeOverride(name = "apellido2", column = @Column(name = "uo_responsable_apellido2", length = 60)),
			@AttributeOverride(name = "usuario", column = @Column(name = "uo_responsable_usuario", length = 20)),
			@AttributeOverride(name = "nif", column = @Column(name = "uo_responsable_nif", length = 10)),
			@AttributeOverride(name = "nombreCargoCas", column = @Column(name = "uo_responsable_cargo_cas", length = 100)),
			@AttributeOverride(name = "nombreCargoVal", column = @Column(name = "uo_responsable_cargo_val", length = 100)) })
	public Responsable getResponsable() {

		return responsable;
	}

	public void setResponsable(Responsable responsable) {

		this.responsable = responsable;
	}

	@ElementCollection
	@CollectionTable(name = "sustituto", joinColumns = @JoinColumn(name = "su_uo_id"), foreignKey = @ForeignKey(name = "FK_SUSTITUTO__UO_ID"))
	@AttributeOverrides({ @AttributeOverride(name = "nombre", column = @Column(name = "su_nombre", length = 60)),
			@AttributeOverride(name = "apellido1", column = @Column(name = "su_apellido1", length = 60)),
			@AttributeOverride(name = "apellido2", column = @Column(name = "su_apellido2", length = 60)),
			@AttributeOverride(name = "usuario", column = @Column(name = "su_usuario", length = 20)),
			@AttributeOverride(name = "nif", column = @Column(name = "su_nif", length = 10)),
			@AttributeOverride(name = "nombreCargoCas", column = @Column(name = "su_cargo_cas", length = 100)),
			@AttributeOverride(name = "nombreCargoVal", column = @Column(name = "su_cargo_val", length = 100)) })
	@SuppressWarnings("unused")
	private Set<Responsable> getSustitutos() {

		return sustitutos;
	}

	@SuppressWarnings("unused")
	private void setSustitutos(Set<Responsable> sustitutos) {

		this.sustitutos = sustitutos;
	}

	public void clearSustitutos() {

		sustitutos.clear();
	}

	public void actualizarSustitutos(List<Responsable> sustitutosNuevos) {

		// eliminamos los sustitutos que no están en sustitutosNuevos
		Collection<Responsable> removed = CollectionUtils.subtract(sustitutos, sustitutosNuevos);
		for (Responsable responsable : removed) {
			sustitutos.remove(responsable);
		}

		// Eliminamos los sustitutos y actualizamos los sustitutos que ya
		// existían

		Iterator<Responsable> iterator = sustitutos.iterator();
		while (iterator.hasNext()) {

			Responsable sustituto = iterator.next();

			int index = sustitutosNuevos.indexOf(sustituto);
			Responsable nuevo = sustitutosNuevos.get(index);

			if (nuevo.isModified(sustituto))
				iterator.remove();

		}

		// Añadimos los nuevos sustitutos
		// Añadimos las nuevas unidades
		Collection<Responsable> added = CollectionUtils.subtract(sustitutosNuevos, sustitutos);

		for (Responsable sustituto : added) {
			sustitutos.add(sustituto);
		}

	}

	@Transient
	public List<Responsable> getListaFirmantes() {

		return getListaFirmantes(false);
	}

	@Transient
	public List<Responsable> getListaFirmantes(boolean order) {

		List<Responsable> firmantes = new ArrayList<>();

		if (responsable != null)
			firmantes.add(responsable);

		firmantes.addAll(sustitutos);

		if (order)
			Collections.sort(firmantes, new ComparatorNombreApellidos());

		return firmantes;

	}

	@Transient
	public Set<Responsable> getSustitutosUnmodifiable() {

		return Collections.unmodifiableSet(sustitutos);
	}

	@Transient
	public UnidadOrganizativaBDO getUnidadPrimerNivel() {

		return isPrimerNivel() ? null : getUnidadPadre() == null ? null : getUnidadPadre().searchUnidadPrimerNivel();
	}

	@Transient
	private UnidadOrganizativaBDO searchUnidadPrimerNivel() {

		return isPrimerNivel() ? this : getUnidadPadre() == null ? null : getUnidadPadre().searchUnidadPrimerNivel();
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uo_unidad_padre", foreignKey = @ForeignKey(name = "FK_UO__UNIDAD_PADRE"))
	public UnidadOrganizativaBDO getUnidadPadre() {

		return unidadPadre;
	}

	public void setUnidadPadre(UnidadOrganizativaBDO unidadPadre) {

		this.unidadPadre = unidadPadre;
	}

	@Transient
	public String getUidAmbitoPrimerNivel() {

		return isPrimerNivel() ? getUid() : (unidadPadre == null ? null : unidadPadre.getUidAmbitoPrimerNivel());
	}

	@Transient
	public boolean isAmbitoPrimerNivel(String uidAmbito) {

		String miAmbito = getUidAmbitoPrimerNivel();
		return StringUtils.equals(miAmbito, uidAmbito);
	}

	@SuppressWarnings("unused")
	@OneToMany(mappedBy = "unidadPadre")
	@NotAudited
	private Set<UnidadOrganizativaBDO> getListaUnidadesHija() {

		return listaUnidadesHija;
	}

	@SuppressWarnings("unused")
	private void setListaUnidadesHija(Set<UnidadOrganizativaBDO> listaUnidadesHija) {

		this.listaUnidadesHija = listaUnidadesHija;
	}

	/**
	 * Método recursivo que devuelve un Set de unidades descendientes
	 * jerárquicamente de una unidad dada
	 * 
	 * @return Set de unidades organizativas
	 */
	public Set<UnidadOrganizativaBDO> obtenerUnidadesHija() {

		Set<UnidadOrganizativaBDO> listaHijas = new HashSet<>();
		listaHijas.addAll(listaUnidadesHija);
		Iterator<UnidadOrganizativaBDO> iter = listaUnidadesHija.iterator();
		while (iter.hasNext()) {
			listaHijas.addAll(iter.next().obtenerUnidadesHija());
		}
		return Collections.unmodifiableSet(listaHijas);
	}

	@SuppressWarnings("unused")
	@NotAudited
	@OneToMany(mappedBy = "unidadPropietaria", orphanRemoval = true)
	private Set<ListaDestino> getColeccionListasDestinosUnidad() {

		return coleccionListasDestinosUnidad;
	}

	@SuppressWarnings("unused")
	private void setColeccionListasDestinosUnidad(Set<ListaDestino> coleccionListasDestinosUnidad) {

		this.coleccionListasDestinosUnidad = coleccionListasDestinosUnidad;
	}

	@Transient
	public Set<ListaDestino> getColeccionListasDestinosUnidadUnmodifiable() {

		return Collections.unmodifiableSet(coleccionListasDestinosUnidad);
	}

	public void addListaDestinoUnidad(ListaDestino listaDestino) {

		if (listaDestino != null) {
			listaDestino.setUnidadPropietaria(this);
			coleccionListasDestinosUnidad.add(listaDestino);
		} else {
			log.error("El objeto pasado como parámetro no puede ser nulo: Entidad = " + this.getClass().getName() + "; Entidad ID: = " + kid
					+ "; metodo = addListaDestinoUnidad; NullObjectClass = ListaDestino");
			throw new NullObjectRuntimeException("{exception.null.object}", kid, "addListaDestinoUnidad", "ListaDestino");
		}
	}

	public void removeListaDestinoUnidad(ListaDestino listaDestino) {

		if (listaDestino != null) {
			coleccionListasDestinosUnidad.remove(listaDestino);
			listaDestino.setUnidadPropietaria(null);
		} else {
			log.error("El objeto pasado como parámetro no puede ser nulo: Entidad = " + this.getClass().getName() + "; Entidad ID: = " + kid
					+ "; metodo = removeListaDestinoUnidad; NullObjectClass = ListaDestino");
			throw new NullObjectRuntimeException("{exception.null.object}", kid, "removeListaDestinoUnidad", "ListaDestino");
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

	@NotAudited
	@Column(name = "force_update")
	public Integer getForceUpdate() {

		return forceUpdate;
	}

	public void setForceUpdate(Integer forceUpdate) {

		this.forceUpdate = forceUpdate;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		UnidadOrganizativaBDO other = (UnidadOrganizativaBDO) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

}

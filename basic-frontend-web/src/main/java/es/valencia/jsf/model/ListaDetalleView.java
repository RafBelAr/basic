package es.valencia.jsf.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaDetalleView {

	private String nombreCas;
	private String nombreVal;
	private String descripcion;
	private UOBasicView unidadPropietaria;
	private Date fechaCreacion;
	private Date fechaModificacion;
	private List<UOBasicView> unidades = new ArrayList<>();

	public ListaDetalleView() {

		super();
	}

	public String getNombreCas() {

		return nombreCas;
	}

	public void setNombreCas(String nombreCas) {

		this.nombreCas = nombreCas;
	}

	public String getNombreVal() {

		return nombreVal;
	}

	public void setNombreVal(String nombreVal) {

		this.nombreVal = nombreVal;
	}

	public String getDescripcion() {

		return descripcion;
	}

	public void setDescripcion(String descripcion) {

		this.descripcion = descripcion;
	}

	public UOBasicView getUnidadPropietaria() {

		return unidadPropietaria;
	}

	public void setUnidadPropietaria(UOBasicView unidadPropietaria) {

		this.unidadPropietaria = unidadPropietaria;
	}

	public Long getKidUnidadPropietaria() {

		return unidadPropietaria == null ? null : unidadPropietaria.getKid();
	}

	public String getUidUnidadPropietaria() {

		return unidadPropietaria == null ? null : unidadPropietaria.getUid();
	}

	public Date getFechaCreacion() {

		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {

		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {

		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {

		this.fechaModificacion = fechaModificacion;
	}

	public List<UOBasicView> getUnidades() {

		return unidades;
	}

	public void setUnidades(List<UOBasicView> unidades) {

		this.unidades = unidades;
	}

	public void addUnidad(UOBasicView unidad) {

		if (!unidades.contains(unidad)) {

			unidades.add(unidad);
		}
	}

	public void removeUnidades(List<UOBasicView> listUnidadesRemove) {

		unidades.removeAll(listUnidadesRemove);
	}

	public List<String> getListUnidadesUid() {

		List<String> uids = new ArrayList<>();
		for (UOBasicView unidad : unidades) {
			uids.add(unidad.getUid());
		}

		return uids;
	}

	public boolean containsDestino(String uid) {

		if (uid != null) {

			for (UOBasicView unidad : unidades) {

				if (uid.equals(unidad.getUid())) {

					return true;
				}
			}
		}

		return false;
	}
}

package es.valencia.jsf.model;

import java.util.Comparator;

import org.apache.commons.lang.StringUtils;

import es.valencia.aytowebfwk.utils.StrUtils;

public class UOBasicView implements Cloneable {

	private Long kid;
	private String uid;
	private String codigoOrganicoExterno;
	private String nombreUnidadCas;
	private String nombreUnidadVal;

	public UOBasicView() {

		super();
	}

	public Long getKid() {

		return kid;
	}

	public void setKid(Long kid) {

		this.kid = kid;
	}

	public String getUid() {

		return uid;
	}

	public void setUid(String uid) {

		this.uid = uid;
	}

	public String getCodigoOrganicoExterno() {

		return codigoOrganicoExterno;
	}

	public void setCodigoOrganicoExterno(String codigoOrganicoExterno) {

		this.codigoOrganicoExterno = codigoOrganicoExterno;
	}

	public String getNombreUnidadCas() {

		return nombreUnidadCas;
	}

	public void setNombreUnidadCas(String nombreUnidadCas) {

		this.nombreUnidadCas = nombreUnidadCas;
	}

	public String getNombreUnidadVal() {

		return nombreUnidadVal;
	}

	public void setNombreUnidadVal(String nombreUnidadVal) {

		this.nombreUnidadVal = nombreUnidadVal;
	}

	public boolean contains(String cadena, boolean valenciano) {

		if (StringUtils.containsIgnoreCase(codigoOrganicoExterno, cadena)) {

			return true;
		} else if (StrUtils.containsIgnoreCaseAccents(valenciano ? nombreUnidadVal : nombreUnidadCas, cadena)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((kid == null) ? 0 : kid.hashCode());
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
		UOBasicView other = (UOBasicView) obj;
		if (kid == null) {
			if (other.kid != null)
				return false;
		} else if (!kid.equals(other.kid))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		UOBasicView cloned = (UOBasicView) super.clone();
		cloned.setNombreUnidadCas(nombreUnidadCas);
		cloned.setNombreUnidadVal(nombreUnidadVal);
		cloned.setUid(uid);
		cloned.setKid(kid);
		cloned.setCodigoOrganicoExterno(codigoOrganicoExterno);
		return cloned;
	}

	public static class ComparatorUOConfiguracionViewNombre implements Comparator<UOBasicView> {

		boolean valenciano = false;

		public ComparatorUOConfiguracionViewNombre(boolean valenciano) {

			super();
			this.valenciano = valenciano;
		}

		@Override
		public int compare(UOBasicView o1, UOBasicView o2) {

			if (valenciano) {

				return StrUtils.compareNormalized(o1.getNombreUnidadVal(), o2.getNombreUnidadVal());
			} else {
				return StrUtils.compareNormalized(o1.getNombreUnidadCas(), o2.getNombreUnidadCas());
			}

		}

	}

}

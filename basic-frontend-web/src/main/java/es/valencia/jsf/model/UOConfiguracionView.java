package es.valencia.jsf.model;

import java.util.Comparator;

import es.valencia.aytowebfwk.utils.StrUtils;

public class UOConfiguracionView implements Cloneable {

	private Long kid;
	private String uid;
	private String codigoOrganicoExterno;
	private String nombreUnidadCas;
	private String nombreUnidadVal;

	public UOConfiguracionView() {

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

	public String getNombreUnidad(boolean valenciano) {

		return valenciano ? nombreUnidadVal : nombreUnidadCas;
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
		UOConfiguracionView other = (UOConfiguracionView) obj;
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

		UOConfiguracionView cloned = (UOConfiguracionView) super.clone();
		cloned.setKid(kid);
		cloned.setNombreUnidadCas(nombreUnidadCas);
		cloned.setNombreUnidadVal(nombreUnidadVal);
		cloned.setUid(uid);
		cloned.setCodigoOrganicoExterno(codigoOrganicoExterno);
		return cloned;
	}

	public static class ComparatorUOConfiguracionViewNombre implements Comparator<UOConfiguracionView> {

		boolean valenciano = false;

		public ComparatorUOConfiguracionViewNombre(boolean valenciano) {

			super();
			this.valenciano = valenciano;
		}

		@Override
		public int compare(UOConfiguracionView o1, UOConfiguracionView o2) {

			if (valenciano) {

				return StrUtils.compareNormalized(o1.getNombreUnidadVal(), o2.getNombreUnidadVal());
			} else {
				return StrUtils.compareNormalized(o1.getNombreUnidadCas(), o2.getNombreUnidadCas());
			}

		}

	}

}

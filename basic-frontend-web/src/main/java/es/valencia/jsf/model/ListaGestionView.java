package es.valencia.jsf.model;

public class ListaGestionView {

	private String nombreCas;
	private String nombreVal;
	private UOBasicView unidadPropietaria;
	private static final String KEY_SEPARATOR = "|";

	private ListaGestionView() {

		super();
	}

	public String getRowKey() {

		return new StringBuilder().append(unidadPropietaria == null ? null : unidadPropietaria.getUid())
				.append(KEY_SEPARATOR).append(nombreCas).toString();
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

	public UOBasicView getUnidadPropietaria() {

		return unidadPropietaria;
	}

	public void setUnidadPropietaria(UOBasicView unidadPropietaria) {

		this.unidadPropietaria = unidadPropietaria;
	}

	public String getUidUnidadPropietaria() {

		return unidadPropietaria == null ? null : unidadPropietaria.getUid();
	}

	public Long getKidUnidadPropietaria() {

		return unidadPropietaria == null ? null : unidadPropietaria.getKid();
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nombreCas == null) ? 0 : nombreCas.hashCode());
		result = prime * result + ((unidadPropietaria == null) ? 0 : unidadPropietaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaGestionView other = (ListaGestionView) obj;
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

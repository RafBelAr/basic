package es.valencia.repository;

import java.util.List;

import es.valencia.entity.UnidadOrganizativaBDO;

public interface UnidadOrganizativaBDORepositoryCustom {

	public List<UnidadOrganizativaBDO> findAll(Boolean emisora, Boolean receptora, Boolean vigente);
	
	public List<UnidadOrganizativaBDO> findAllByProperty(String codigoOrganicoExterno, String codigoOrganicoInterno, String responsableNif, String sustitutoNif,
			String nombreUnidadCas, String nombreUnidadVal, String unidadPadreUid, Boolean emisoraNI, Boolean primerNivel, Boolean receptoraNI, Boolean vigente,
			Integer firstResult, Integer maxResults) ; 
}

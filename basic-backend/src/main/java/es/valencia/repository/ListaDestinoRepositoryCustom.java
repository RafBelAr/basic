package es.valencia.repository;

import java.util.List;

import es.valencia.entity.ListaDestino;

public interface ListaDestinoRepositoryCustom {

	public ListaDestino findByNombreAndUid(String nombreCas, String uidPropietaria);

	public ListaDestino findListaByNombreAndKid(String nombreCas, Long kidPropietaria);

	public List<ListaDestino> findListasDestinoUidVisibleUnidad(String uid, String uidPadre);

	public List<ListaDestino> findListasUOGobales(String uid);

	public List<ListaDestino> findAllLikeNombreOrNombreUnidad(String nombre, boolean valenciano);

	public ListaDestino findGlobalByNombreCas(String nombreCas);
}

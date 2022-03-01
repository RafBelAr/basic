package es.valencia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.valencia.entity.ListaDestino;

@Repository
public interface ListaDestinoRepository extends JpaRepository<ListaDestino, Long>, ListaDestinoRepositoryCustom {



	@Query("Select l from ListaDestino l where l.unidadPropietaria is null")
	public List<ListaDestino> findListasDestinoGlobales();

	@Query("Select l from ListaDestino l where l.unidadPropietaria.uid=:uid")
	public List<ListaDestino> findByUidUnidadPropietaria(@Param("uid") String uid);

}

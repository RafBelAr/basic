package es.valencia.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import es.valencia.entity.UnidadOrganizativaBDO;

@Repository
public interface UnidadOrganizativaBDORepository extends JpaRepository<UnidadOrganizativaBDO, Long>,UnidadOrganizativaBDORepositoryCustom {

	public UnidadOrganizativaBDO findByUid(String uid);

	@Query("select u.kid from UnidadOrganizativaBDO u where u.uid=:uid")
	public Long findKidByUid(@Param("uid") String uid);
	
	public List<UnidadOrganizativaBDO> findByUidIn(Collection<String> uids);

	public List<UnidadOrganizativaBDO> findAllByOrderByCodigoOrganicoExternoAscNombreUnidadCasAsc();


	
}

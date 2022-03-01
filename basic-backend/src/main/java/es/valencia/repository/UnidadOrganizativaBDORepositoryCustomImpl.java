package es.valencia.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import es.valencia.entity.UnidadOrganizativaBDO;

public class UnidadOrganizativaBDORepositoryCustomImpl implements UnidadOrganizativaBDORepositoryCustom {

	private static Logger log = LogManager.getLogger(UnidadOrganizativaBDORepositoryCustomImpl.class);

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<UnidadOrganizativaBDO> findAll(Boolean emisora, Boolean receptora, Boolean vigente) {

		log.debug("Obteniendo UnidadOrganizativaBDO emisora/receptora/vigente.");

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<UnidadOrganizativaBDO> cq = cb.createQuery(UnidadOrganizativaBDO.class);

		Root<UnidadOrganizativaBDO> root = cq.from(UnidadOrganizativaBDO.class);
		List<Predicate> predicates = new ArrayList<>();

		if (emisora != null)
			predicates.add(cb.equal(root.get("emisoraNI"), emisora));

		if (receptora != null)
			predicates.add(cb.equal(root.get("receptoraNI"), receptora));

		if (vigente != null)
			predicates.add(cb.equal(root.get("vigente"), vigente));

		cq.where(predicates.toArray(new Predicate[0]));
		cq.orderBy(cb.asc(root.get("codigoOrganicoExterno")));

		return entityManager.createQuery(cq).getResultList();
	}

	@Override
	public List<UnidadOrganizativaBDO> findAllByProperty(String codigoOrganicoExterno, String codigoOrganicoInterno, String responsableNif, String sustitutoNif,
			String nombreUnidadCas, String nombreUnidadVal, String unidadPadreUid, Boolean emisoraNI, Boolean primerNivel, Boolean receptoraNI, Boolean vigente,
			Integer firstResult, Integer maxResults) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<UnidadOrganizativaBDO> cq = cb.createQuery(UnidadOrganizativaBDO.class);

		Root<UnidadOrganizativaBDO> root = cq.from(UnidadOrganizativaBDO.class);
		List<Predicate> predicates = new ArrayList<>();

		if (StringUtils.isNotBlank(codigoOrganicoExterno))
			predicates.add(cb.equal(root.get("codigoOrganicoExterno"), codigoOrganicoExterno));

		if (StringUtils.isNotBlank(codigoOrganicoInterno))
			predicates.add(cb.equal(root.get("codigoOrganicoInterno"), codigoOrganicoInterno));

		if (StringUtils.isNotBlank(responsableNif))
			predicates.add(cb.equal(root.get("responsable").get("nif"), responsableNif));

		if (StringUtils.isNotBlank(sustitutoNif))
			predicates.add(cb.equal(root.join("sustitutos").get("nif"), sustitutoNif));

		if (StringUtils.isNotBlank(nombreUnidadCas))
			predicates.add(cb.equal(root.get("nombreUnidadCas"), nombreUnidadCas));

		if (StringUtils.isNotBlank(nombreUnidadVal))
			predicates.add(cb.equal(root.get("nombreUnidadVal"), nombreUnidadVal));

		if (StringUtils.isNotBlank(unidadPadreUid))
			predicates.add(cb.equal(root.join("unidadPadre").get("uid"), unidadPadreUid));

		if (emisoraNI != null)
			predicates.add(cb.equal(root.get("emisoraNI"), emisoraNI));

		if (receptoraNI != null)
			predicates.add(cb.equal(root.get("receptoraNI"), receptoraNI));

		if (vigente != null)
			predicates.add(cb.equal(root.get("vigente"), vigente));

		if (primerNivel != null)
			predicates.add(cb.equal(root.get("primerNivel"), primerNivel));

		cq.where(predicates.toArray(new Predicate[0]));
		cq.orderBy(cb.asc(root.get("codigoOrganicoExterno")));

		TypedQuery<UnidadOrganizativaBDO> query = entityManager.createQuery(cq);
		
		if (firstResult != null)
			query.setFirstResult(firstResult <= 0 ? 0 : firstResult);

		if (maxResults != null)
			query.setMaxResults(maxResults);

		return query.getResultList();
	}

}

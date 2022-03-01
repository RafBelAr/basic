package es.valencia.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.dao.support.DataAccessUtils;

import es.valencia.entity.ListaDestino;
import es.valencia.entity.UnidadOrganizativaBDO;

public class ListaDestinoRepositoryCustomImpl implements ListaDestinoRepositoryCustom {

	@PersistenceContext
	EntityManager entityManager;

	public void save(ListaDestino entidad) {

		entidad.setFechaModificacion(new Date());
		entityManager.persist(entidad);
	}

	@Override
	public ListaDestino findByNombreAndUid(String nombreCas, String uidPropietaria) {

		if (uidPropietaria == null) {
			return findGlobalByNombreCas(nombreCas);
		} else {

			String sql = "SELECT a FROM ListaDestino a where  a.nombreCas=:nombreCas and a.unidadPropietaria.uid = :uid ";

			TypedQuery<ListaDestino> query = entityManager.createQuery(sql, ListaDestino.class);

			query.setParameter("nombreCas", nombreCas);
			query.setParameter("uid", uidPropietaria);

			return query.getSingleResult();
		}

	}

	@Override
	public ListaDestino findListaByNombreAndKid(String nombreCas, Long kidPropietaria) {

		if (kidPropietaria == null) {
			return findGlobalByNombreCas(nombreCas);
		} else {
			String sql = "SELECT a FROM ListaDestino a where  a.nombreCas=:nombreCas and a.unidadPropietaria.kid = :kid ";

			TypedQuery<ListaDestino> query = entityManager.createQuery(sql, ListaDestino.class);

			query.setParameter("nombreCas", nombreCas);
			query.setParameter("kid", kidPropietaria);

			return DataAccessUtils.singleResult(query.getResultList());
		}

	}

	public List<ListaDestino> findListasDestinoGlobales() {

		String sql = "SELECT a FROM ListaDestino a where a.unidadPropietaria is null ";

		return entityManager.createQuery(sql, ListaDestino.class).getResultList();
	}

	public List<ListaDestino> findListasDestinoUidPropietaria(String uid) {

		String sql = "SELECT a FROM ListaDestino a where a.unidadPropietaria.uid = :uid ";

		TypedQuery<ListaDestino> query = entityManager.createQuery(sql, ListaDestino.class);

		query.setParameter("uid", uid);

		return query.getResultList();
	}

	@Override
	public List<ListaDestino> findListasDestinoUidVisibleUnidad(String uid, String uidPadre) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListaDestino> cq = cb.createQuery(ListaDestino.class);
		Root<ListaDestino> root = cq.from(ListaDestino.class);
		List<Predicate> predicates = new ArrayList<>();

		Join<ListaDestino, UnidadOrganizativaBDO> joinPropietaria = root.join("unidadPropietaria", javax.persistence.criteria.JoinType.LEFT);

		predicates.add(cb.equal(joinPropietaria.get("uid"), uid));
		predicates.add(cb.isNull(root.get("unidadPropietaria")));

		if (uidPadre != null) {
			predicates.add(cb.equal(joinPropietaria.get("uid"), uidPadre));
		}

		cq.where(cb.or(predicates.toArray(new Predicate[0])));
		return entityManager.createQuery(cq.distinct(true)).getResultList();

	}

	@Override
	public List<ListaDestino> findListasUOGobales(String uid) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListaDestino> cq = cb.createQuery(ListaDestino.class);
		Root<ListaDestino> root = cq.from(ListaDestino.class);
		List<Predicate> predicates = new ArrayList<>();

		predicates.add(cb.equal(root.join("unidadPropietaria").get("uid"), uid));
		predicates.add(cb.isNull(root.get("unidadPropietaria")));

		cq.where(cb.or(predicates.toArray(new Predicate[0])));

		return entityManager.createQuery(cq.distinct(true)).getResultList();
	}

	@Override
	public List<ListaDestino> findAllLikeNombreOrNombreUnidad(String nombre, boolean valenciano) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListaDestino> cq = cb.createQuery(ListaDestino.class);
		Root<ListaDestino> root = cq.from(ListaDestino.class);
		List<Predicate> predicates = new ArrayList<>();

		if (StringUtils.isNotBlank(nombre)) {
			Join<ListaDestino, UnidadOrganizativaBDO> joinPropietaria = root.join("unidadPropietaria", javax.persistence.criteria.JoinType.LEFT);
			predicates.add(cb.equal(root.get(valenciano ? "nombreVal" : "nombreCas"), nombre));
			predicates.add(cb.equal(joinPropietaria.get(valenciano ? "nombreUnidadVal" : "nombreUnidadCas"), nombre));
			predicates.add(cb.isNull(root.get("unidadPropietaria")));
		}

		cq.where(predicates.toArray(new Predicate[0]));
		cq.orderBy(cb.asc(root.get(valenciano ? "nombreVal" : "nombreCas")));

		return entityManager.createQuery(cq).getResultList();

	}

	@Override
	public ListaDestino findGlobalByNombreCas(String nombreCas) {

		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ListaDestino> cq = cb.createQuery(ListaDestino.class);
		Root<ListaDestino> root = cq.from(ListaDestino.class);
		List<Predicate> predicates = new ArrayList<>();

		predicates.add(cb.equal(root.get("nombreCas"), nombreCas));
		predicates.add(cb.isNull(root.get("unidadPropietaria")));

		cq.where(predicates.toArray(new Predicate[0]));
		cq.orderBy(cb.asc(root.get("codigoOrganicoExterno")));

		return entityManager.createQuery(cq).getSingleResult();

	}

}

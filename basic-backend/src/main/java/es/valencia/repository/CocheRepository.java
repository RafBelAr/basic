package es.valencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.valencia.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {

	
	public Coche findByMatricula(String matricula);
}

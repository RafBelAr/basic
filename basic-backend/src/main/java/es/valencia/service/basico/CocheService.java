package es.valencia.service.basico;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import es.valencia.entity.Coche;

public interface CocheService {

	// OPERACIONES DE NEGOCIO
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public void crearCoche(String matricula, String modelo, String color);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public void actualizarCoche(Long id, String matricula, String modelo, String color);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public void eliminar(String matricula);

	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public void resevarCoche(Long idCoche, String usuario);





	// OPERACIONES DE CONSULTA PARA LA INTERFAZ DE USUARIO
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public List<Coche> getListaCoches();
	
	@PreAuthorize("hasRole('ROLE_USUARIO')")
	public Coche getCocheByMatricula(String matricula);
	
	
	//Ejemplos de expresiones de seguridad
	// @PreAuthorize("hasRole('ROLE_RESPONSABLE')")
	// @PreAuthorize("hasPermission(#idCoche,'es.valencia.taller.entity.Coche', 'RESERVAR')")
	// @PreAuthorize("hasRole('ROLE_USUARIO')")
}



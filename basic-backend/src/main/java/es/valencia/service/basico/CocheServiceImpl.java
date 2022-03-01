package es.valencia.service.basico;

import java.util.List;

import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import es.valencia.entity.Coche;
import es.valencia.repository.CocheRepository;

@Service("cocheService")
public class CocheServiceImpl implements CocheService {

	@SuppressWarnings("unused")
	private static final Logger LOG = LogManager.getLogger(CocheServiceImpl.class.getName());

	@Inject
	private CocheRepository cocheRepository;

	@Override
	@Transactional
	public void crearCoche(String matricula, String modelo, String color) {

		Assert.hasText(matricula, "matricula_nula_o_vacia");

		Coche coche = new Coche();

		coche.setColor(color);
		coche.setMatricula(matricula);
		coche.setModelo(modelo);

		cocheRepository.save(coche);

	}

	@Override
	@Transactional
	public void actualizarCoche(Long id, String matricula, String modelo, String color) {

		Coche coche = cocheRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("error_coche_id_not_found"));

		Assert.notNull(coche, "matricula_no_existe");

		coche.setMatricula(matricula);
		coche.setColor(color);
		coche.setModelo(modelo);

	}

	@Override
	@Transactional
	public void eliminar(String matricula) {

		Coche coche = cocheRepository.findByMatricula(matricula);

		Assert.notNull(coche, "matricula_no_existe");

		cocheRepository.delete(coche);

	}

	@Override
	@Transactional
	public void resevarCoche(Long idCoche, String usuario) {

		Coche coche = cocheRepository.findById(idCoche).orElseThrow(() -> new IllegalArgumentException("error_coche_id_not_found"));

		Assert.notNull(coche, "coche_no_existe");

		coche.setUsuarioReserva(usuario);

	}

	@Override
	@Transactional(readOnly = true)
	public List<Coche> getListaCoches() {

		return cocheRepository.findAll();
	}

	@Override
	public Coche getCocheByMatricula(String matricula) {

		return cocheRepository.findByMatricula(matricula);
	}

}
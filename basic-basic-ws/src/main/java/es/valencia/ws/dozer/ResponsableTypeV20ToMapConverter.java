package es.valencia.ws.dozer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dozer.DozerConverter;

import es.valencia.schema.nie.common.ResponsableTypeV20;
import es.valencia.schema.nie.common.UsuarioTypeV11;

public class ResponsableTypeV20ToMapConverter extends DozerConverter<List<ResponsableTypeV20>, Object> {

	@SuppressWarnings("unchecked")
	public ResponsableTypeV20ToMapConverter() {

		super(((Class<List<ResponsableTypeV20>>) (Class<?>) List.class), Object.class);
	}

	@Override
	public Object convertTo(List<ResponsableTypeV20> source, Object destination) {

		if (source == null)
			return null;

		List<Map<String, Object>> listaDestino = new ArrayList<>();

		for (ResponsableTypeV20 responsable : source) {
			listaDestino.add(toMap(responsable));
		}

		return listaDestino;

	}

	@Override
	public List<ResponsableTypeV20> convertFrom(Object source, List<ResponsableTypeV20> destination) {

		if (source == null) {
			return null;
		}

		@SuppressWarnings("unchecked")
		List<Map<String, Object>> listaSource = (List<Map<String, Object>>) source;

		List<ResponsableTypeV20> listaDestino = new ArrayList<>();

		for (Map<String, Object> map : listaSource) {
			listaDestino.add(fromMap(map));
		}

		return listaDestino;

	}

	private ResponsableTypeV20 fromMap(Map<String, Object> map) {

		ResponsableTypeV20 resp = new ResponsableTypeV20();
		resp.setNombreCargoCas((String) map.get("nombreCargoCas"));
		resp.setNombreCargoVal((String) map.get("nombreCargoVal"));

		UsuarioTypeV11 usuario = new UsuarioTypeV11();
		usuario.setApellido1((String) map.get("apellido1"));
		usuario.setApellido2((String) map.get("apellido2"));
		usuario.setEmail((String) map.get("email"));
		usuario.setNif((String) map.get("nif"));
		usuario.setNombre((String) map.get("nombre"));
		usuario.setUsuario((String) map.get("usuario"));

		resp.setUsuario(usuario);

		return resp;
	}

	private Map<String, Object> toMap(ResponsableTypeV20 source) {

		Map<String, Object> map = new HashMap<>();

		map.put("nombreCargoCas", source.getNombreCargoCas());
		map.put("nombreCargoVal", source.getNombreCargoVal());

		if (source.getUsuario() != null) {

			map.put("apellido1", source.getUsuario().getApellido1());
			map.put("apellido2", source.getUsuario().getApellido2());
			map.put("email", source.getUsuario().getEmail());
			map.put("nif", source.getUsuario().getNif());
			map.put("nombre", source.getUsuario().getNombre());
			map.put("usuario", source.getUsuario().getUsuario());
		} else {

			map.put("apellido1", null);
			map.put("apellido2", null);
			map.put("email", null);
			map.put("nif", null);
			map.put("nombre", null);
			map.put("usuario", null);
		}
		return map;
	}

}

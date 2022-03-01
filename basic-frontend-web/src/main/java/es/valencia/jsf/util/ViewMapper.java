package es.valencia.jsf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import es.valencia.aytowebfwk.utils.dozer.AyFwkBeanMapper;
import es.valencia.entity.UnidadOrganizativaBDO;
import es.valencia.jsf.model.UsuarioView;

public class ViewMapper extends AyFwkBeanMapper {

	public static List<String> getIds(List<UsuarioView> listaUsuarios) {

		List<String> lista = new ArrayList<>();

		if (CollectionUtils.isNotEmpty(listaUsuarios))
			for (UsuarioView usu : listaUsuarios)
				lista.add(usu.getViewId());

		return lista;
	}

	public static List<String> mapUnidades(Collection<UnidadOrganizativaBDO> source) {

		List<String> dest = new ArrayList<>();

		for (UnidadOrganizativaBDO unidad : source)
			dest.add(unidad.getUid());

		return dest;
	}

}

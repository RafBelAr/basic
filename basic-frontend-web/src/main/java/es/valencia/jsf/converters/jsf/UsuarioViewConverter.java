package es.valencia.jsf.converters.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.commons.lang.StringUtils;

import es.valencia.jsf.model.UsuarioView;

@FacesConverter(value = "usuarioViewConverter")
public class UsuarioViewConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		if (StringUtils.isNotBlank(value)) {

			UsuarioView usuario = new UsuarioView();
			usuario.setUsuario(value);

			return usuario;
		} else {

			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		return value == null ? null : ((UsuarioView) value).getUsuario();
	}

}
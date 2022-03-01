package es.valencia.jsf.converters.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.commons.lang.StringUtils;

import es.valencia.jsf.model.ResponsableView;

@FacesConverter(value = "responsableConverter")
public class ResponsableConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {

		if (StringUtils.isNotBlank(value)) {
			ResponsableView responsable = new ResponsableView();
			responsable.setUsuario(value);

			return responsable;
		} else {
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		return value == null ? null : ((ResponsableView) value).getUsuario();
	}

}
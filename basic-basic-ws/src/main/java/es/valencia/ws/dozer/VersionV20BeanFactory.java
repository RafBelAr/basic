package es.valencia.ws.dozer;

import javax.annotation.PostConstruct;

import org.dozer.BeanFactory;
import org.dozer.util.MappingUtils;
import org.dozer.util.ReflectionUtils;
import org.springframework.beans.factory.annotation.Value;

import es.valencia.schema.nie.common.EntidadBaseTypeV10;
import es.valencia.services.nie.comunicaciones.FindRequestMessageBaseTypeV10;
import es.valencia.services.nie.comunicaciones.FindResponseMessageBaseTypeV10;
import es.valencia.services.nie.comunicaciones.RequestMessageBaseTypeV10;
import es.valencia.services.nie.comunicaciones.ResponseMessageBaseTypeV10;

public class VersionV20BeanFactory implements BeanFactory {

	@Value("${aywebfwk.ws.comunicaciones.version}")
	private String version;

	private static String staticVersion;

	@PostConstruct
	public void init() {

		staticVersion = version;
	}

	public static String getVersion() {

		return staticVersion;
	}

	/**
	 * Create a bean implementation of a jaxb interface.
	 *
	 * @param srcObj
	 *            The source object
	 * @param srcObjClass
	 *            The source object class
	 * @param beanId
	 *            the name of the destination interface class
	 * @return A implementation of the destination interface
	 */
	@Override
	public Object createBean(Object srcObj, Class<?> srcObjClass, String beanId) {

		Class<?> objectFactory = MappingUtils.loadClass(beanId);
		Object result = ReflectionUtils.newInstance(objectFactory);
		if (result instanceof EntidadBaseTypeV10) {
			((EntidadBaseTypeV10) result).setVersion(version);
		} else if (result instanceof ResponseMessageBaseTypeV10) {
			((ResponseMessageBaseTypeV10) result).setVersion(version);
		} else if (result instanceof FindResponseMessageBaseTypeV10) {
			((FindResponseMessageBaseTypeV10) result).setVersion(version);
		} else if (result instanceof RequestMessageBaseTypeV10) {
			((RequestMessageBaseTypeV10) result).setVersion(version);
		} else if (result instanceof FindRequestMessageBaseTypeV10) {
			((FindRequestMessageBaseTypeV10) result).setVersion(version);
		}
		// } else if (result instanceof RemoveAdjuntoResponseTypeV10) {
		// ((RemoveAdjuntoResponseTypeV10) result).setVersion(VERSION_1_0);
		// }

		return result;

	}
}

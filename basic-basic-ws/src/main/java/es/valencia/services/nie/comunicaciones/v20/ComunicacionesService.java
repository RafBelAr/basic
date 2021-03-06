package es.valencia.services.nie.comunicaciones.v20;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-05-02T11:41:08.023+02:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "ComunicacionesService", 
                  wsdlLocation = "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/Comunicaciones_v2.0_concreto",
                  targetNamespace = "http://www.valencia.es/services/nie/Comunicaciones/v20") 
public class ComunicacionesService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComunicacionesService");
    public final static QName ComunicacionesSOAP11 = new QName("http://www.valencia.es/services/nie/Comunicaciones/v20", "ComunicacionesSOAP11");
    static {
        URL url = null;
        try {
            url = new URL("http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/Comunicaciones_v2.0_concreto");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ComunicacionesService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/Comunicaciones_v2.0_concreto");
        }
        WSDL_LOCATION = url;
    }

    public ComunicacionesService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ComunicacionesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComunicacionesService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComunicacionesService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComunicacionesService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComunicacionesService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ComunicacionesPortType
     */
    @WebEndpoint(name = "ComunicacionesSOAP11")
    public ComunicacionesPortType getComunicacionesSOAP11() {
        return super.getPort(ComunicacionesSOAP11, ComunicacionesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComunicacionesPortType
     */
    @WebEndpoint(name = "ComunicacionesSOAP11")
    public ComunicacionesPortType getComunicacionesSOAP11(WebServiceFeature... features) {
        return super.getPort(ComunicacionesSOAP11, ComunicacionesPortType.class, features);
    }

}

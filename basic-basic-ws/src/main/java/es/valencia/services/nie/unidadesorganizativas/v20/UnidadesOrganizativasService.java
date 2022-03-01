package es.valencia.services.nie.unidadesorganizativas.v20;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-05-02T11:41:09.288+02:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "UnidadesOrganizativasService", 
                  wsdlLocation = "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/UnidadesOrganizativas_v2.0_concreto",
                  targetNamespace = "http://www.valencia.es/services/nie/UnidadesOrganizativas/v20") 
public class UnidadesOrganizativasService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas/v20", "UnidadesOrganizativasService");
    public final static QName UnidadesOrganizativasSOAP11 = new QName("http://www.valencia.es/services/nie/UnidadesOrganizativas/v20", "UnidadesOrganizativasSOAP11");
    static {
        URL url = null;
        try {
            url = new URL("http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/UnidadesOrganizativas_v2.0_concreto");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UnidadesOrganizativasService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://prebus.valencia.es:7011/sbresource?WSDL/NotasInterioresElectronicas-pruebas/Servicios/Comunicaciones/Proveedores/UnidadesOrganizativas_v2.0_concreto");
        }
        WSDL_LOCATION = url;
    }

    public UnidadesOrganizativasService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UnidadesOrganizativasService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UnidadesOrganizativasService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UnidadesOrganizativasService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UnidadesOrganizativasService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UnidadesOrganizativasService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns UnidadesOrganizativasPortType
     */
    @WebEndpoint(name = "UnidadesOrganizativasSOAP11")
    public UnidadesOrganizativasPortType getUnidadesOrganizativasSOAP11() {
        return super.getPort(UnidadesOrganizativasSOAP11, UnidadesOrganizativasPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UnidadesOrganizativasPortType
     */
    @WebEndpoint(name = "UnidadesOrganizativasSOAP11")
    public UnidadesOrganizativasPortType getUnidadesOrganizativasSOAP11(WebServiceFeature... features) {
        return super.getPort(UnidadesOrganizativasSOAP11, UnidadesOrganizativasPortType.class, features);
    }

}

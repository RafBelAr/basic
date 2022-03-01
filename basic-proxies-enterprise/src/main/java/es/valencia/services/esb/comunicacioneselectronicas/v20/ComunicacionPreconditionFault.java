
package es.valencia.services.esb.comunicacioneselectronicas.v20;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-08-11T12:27:45.080+02:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "ComunicacionPreconditionFault", targetNamespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20")
public class ComunicacionPreconditionFault extends Exception {
    
	private static final long serialVersionUID = -3269242647406179342L;
	
	private es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10 comunicacionPreconditionFault;

    public ComunicacionPreconditionFault() {
        super();
    }
    
    public ComunicacionPreconditionFault(String message) {
        super(message);
    }
    
    public ComunicacionPreconditionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ComunicacionPreconditionFault(String message, es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10 comunicacionPreconditionFault) {
        super(message);
        this.comunicacionPreconditionFault = comunicacionPreconditionFault;
    }

    public ComunicacionPreconditionFault(String message, es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10 comunicacionPreconditionFault, Throwable cause) {
        super(message, cause);
        this.comunicacionPreconditionFault = comunicacionPreconditionFault;
    }

    public es.valencia.services.nie.comunicaciones.ComunicacionPreconditionFaultMessageTypeV10 getFaultInfo() {
        return this.comunicacionPreconditionFault;
    }
}

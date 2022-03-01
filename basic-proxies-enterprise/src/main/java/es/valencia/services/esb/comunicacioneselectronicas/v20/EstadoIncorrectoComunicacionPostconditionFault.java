
package es.valencia.services.esb.comunicacioneselectronicas.v20;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-08-11T12:27:45.090+02:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "EstadoIncorrectoComunicacionPostconditionFault", targetNamespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20")
public class EstadoIncorrectoComunicacionPostconditionFault extends Exception {
    
	private static final long serialVersionUID = -7866019854252192906L;
	
	private es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 estadoIncorrectoComunicacionPostconditionFault;

    public EstadoIncorrectoComunicacionPostconditionFault() {
        super();
    }
    
    public EstadoIncorrectoComunicacionPostconditionFault(String message) {
        super(message);
    }
    
    public EstadoIncorrectoComunicacionPostconditionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public EstadoIncorrectoComunicacionPostconditionFault(String message, es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 estadoIncorrectoComunicacionPostconditionFault) {
        super(message);
        this.estadoIncorrectoComunicacionPostconditionFault = estadoIncorrectoComunicacionPostconditionFault;
    }

    public EstadoIncorrectoComunicacionPostconditionFault(String message, es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 estadoIncorrectoComunicacionPostconditionFault, Throwable cause) {
        super(message, cause);
        this.estadoIncorrectoComunicacionPostconditionFault = estadoIncorrectoComunicacionPostconditionFault;
    }

    public es.valencia.services.nie.comunicaciones.EstadoIncorrectoComunicacionPostconditionFaultMessageTypeV10 getFaultInfo() {
        return this.estadoIncorrectoComunicacionPostconditionFault;
    }
}

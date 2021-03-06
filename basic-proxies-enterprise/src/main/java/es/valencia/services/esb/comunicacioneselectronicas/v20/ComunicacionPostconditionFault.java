
package es.valencia.services.esb.comunicacioneselectronicas.v20;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-08-11T12:27:45.100+02:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "ComunicacionPostconditionFault", targetNamespace = "http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20")
public class ComunicacionPostconditionFault extends Exception {

	private static final long serialVersionUID = -1518160105312082869L;
	
	private es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10 comunicacionPostconditionFault;

    public ComunicacionPostconditionFault() {
        super();
    }
    
    public ComunicacionPostconditionFault(String message) {
        super(message);
    }
    
    public ComunicacionPostconditionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public ComunicacionPostconditionFault(String message, es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10 comunicacionPostconditionFault) {
        super(message);
        this.comunicacionPostconditionFault = comunicacionPostconditionFault;
    }

    public ComunicacionPostconditionFault(String message, es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10 comunicacionPostconditionFault, Throwable cause) {
        super(message, cause);
        this.comunicacionPostconditionFault = comunicacionPostconditionFault;
    }

    public es.valencia.services.nie.comunicaciones.ComunicacionPostconditionFaultMessageTypeV10 getFaultInfo() {
        return this.comunicacionPostconditionFault;
    }
}


package es.valencia.services.nie.comunicaciones.v20;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-05-02T11:41:07.936+02:00
 * Generated source version: 2.7.18
 */

@WebFault(name = "UidNoExistePreconditionFault", targetNamespace = "http://www.valencia.es/services/nie/Comunicaciones/v20")
public class UidNoExistePreconditionFault extends Exception {

	private static final long serialVersionUID = 8148405138903309160L;

	private es.valencia.services.nie.comunicaciones.UidNoExistePreconditionFaultMessageTypeV10 uidNoExistePreconditionFault;

    public UidNoExistePreconditionFault() {
        super();
    }

    public UidNoExistePreconditionFault(String message) {
        super(message);
    }

    public UidNoExistePreconditionFault(String message, Throwable cause) {
        super(message, cause);
    }

    public UidNoExistePreconditionFault(String message, es.valencia.services.nie.comunicaciones.UidNoExistePreconditionFaultMessageTypeV10 uidNoExistePreconditionFault) {
        super(message);
        this.uidNoExistePreconditionFault = uidNoExistePreconditionFault;
    }

    public UidNoExistePreconditionFault(String message, es.valencia.services.nie.comunicaciones.UidNoExistePreconditionFaultMessageTypeV10 uidNoExistePreconditionFault, Throwable cause) {
        super(message, cause);
        this.uidNoExistePreconditionFault = uidNoExistePreconditionFault;
    }

    public es.valencia.services.nie.comunicaciones.UidNoExistePreconditionFaultMessageTypeV10 getFaultInfo() {
        return uidNoExistePreconditionFault;
    }
}


package es.valencia.services.esb.comunicacioneselectronicas.v20;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2016-08-11T12:27:45.018+02:00
 * Generated source version: 2.7.18
 * 
 */
public final class ComunicacionesElectronicasPortType_ComunicacionesElectronicasSOAP11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.valencia.es/services/esb/ComunicacionesElectronicas/v20", "ComunicacionesElectronicasService");

    private ComunicacionesElectronicasPortType_ComunicacionesElectronicasSOAP11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ComunicacionesElectronicasService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ComunicacionesElectronicasService ss = new ComunicacionesElectronicasService(wsdlURL, SERVICE_NAME);
        ComunicacionesElectronicasPortType port = ss.getComunicacionesElectronicasSOAP11();  
        
        {
        System.out.println("Invoking createOrUpdateComunicacion...");
        es.valencia.services.esb.comunicacioneselectronicas.CreateOrUpdateComunicacionRequestTypeV10 _createOrUpdateComunicacion_request = null;
        try {
            es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 _createOrUpdateComunicacion__return = port.createOrUpdateComunicacion(_createOrUpdateComunicacion_request);
            System.out.println("createOrUpdateComunicacion.result=" + _createOrUpdateComunicacion__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking deleteComunicacion...");
        es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10 _deleteComunicacion_request = null;
        try {
            es.valencia.services.nie.comunicaciones.CodigoComunicacionResponseTypeV10 _deleteComunicacion__return = port.deleteComunicacion(_deleteComunicacion_request);
            System.out.println("deleteComunicacion.result=" + _deleteComunicacion__return);

        } catch (EstadoIncorrectoComunicacionPostconditionFault e) { 
            System.out.println("Expected exception: EstadoIncorrectoComunicacionPostconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking findComunicaciones...");
        es.valencia.services.nie.comunicaciones.FindComunicacionesRequestTypeV10 _findComunicaciones_request = null;
        es.valencia.services.nie.comunicaciones.FindComunicacionesResponseTypeV11 _findComunicaciones__return = port.findComunicaciones(_findComunicaciones_request);
        System.out.println("findComunicaciones.result=" + _findComunicaciones__return);


        }
        {
        System.out.println("Invoking addOrUpdateAdjunto...");
        es.valencia.services.niedomain.comunicaciones.AddOrUpdateAdjuntoRequestTypeV10 _addOrUpdateAdjunto_request = null;
        try {
            es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 _addOrUpdateAdjunto__return = port.addOrUpdateAdjunto(_addOrUpdateAdjunto_request);
            System.out.println("addOrUpdateAdjunto.result=" + _addOrUpdateAdjunto__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking removeAdjunto...");
        es.valencia.services.nie.comunicaciones.RemoveAdjuntoRequestTypeV10 _removeAdjunto_request = null;
        try {
            es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 _removeAdjunto__return = port.removeAdjunto(_removeAdjunto_request);
            System.out.println("removeAdjunto.result=" + _removeAdjunto__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getComunicacion...");
        es.valencia.services.niedomain.comunicaciones.GetComunicacionRequestTypeV10 _getComunicacion_request = null;
        try {
            es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 _getComunicacion__return = port.getComunicacion(_getComunicacion_request);
            System.out.println("getComunicacion.result=" + _getComunicacion__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking finalizarComunicacion...");
        es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10 _finalizarComunicacion_request = null;
        try {
            es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 _finalizarComunicacion__return = port.finalizarComunicacion(_finalizarComunicacion_request);
            System.out.println("finalizarComunicacion.result=" + _finalizarComunicacion__return);

        } catch (ComunicacionPostconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPostconditionFault has occurred.");
            System.out.println(e.toString());
        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking getNI...");
        es.valencia.services.niedomain.comunicaciones.GetNIRequestTypeV10 _getNI_request = null;
        try {
            es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 _getNI__return = port.getNI(_getNI_request);
            System.out.println("getNI.result=" + _getNI__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking aportarAExpediente...");
        es.valencia.services.esb.comunicacioneselectronicas.AportarAExpedienteRequestTypeV20 _aportarAExpediente_response = null;
        try {
            es.valencia.services.esb.comunicacioneselectronicas.AportarAExpedienteResponseTypeV20 _aportarAExpediente__return = port.aportarAExpediente(_aportarAExpediente_response);
            System.out.println("aportarAExpediente.result=" + _aportarAExpediente__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking cancelarComunicacion...");
        es.valencia.services.niedomain.comunicaciones.CancelarComunicacionRequestTypeV10 _cancelarComunicacion_request = null;
        try {
            es.valencia.services.niedomain.comunicaciones.ComunicacionResponseTypeV12 _cancelarComunicacion__return = port.cancelarComunicacion(_cancelarComunicacion_request);
            System.out.println("cancelarComunicacion.result=" + _cancelarComunicacion__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking recepcionarNI...");
        es.valencia.services.nie.comunicaciones.RecepcionarNIRequestTypeV10 _recepcionarNI_request = null;
        try {
            es.valencia.services.nie.comunicaciones.NIResponseTypeV12 _recepcionarNI__return = port.recepcionarNI(_recepcionarNI_request);
            System.out.println("recepcionarNI.result=" + _recepcionarNI__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }
        {
        System.out.println("Invoking toEnRedaccion...");
        es.valencia.services.nie.comunicaciones.CodigoComunicacionRequestTypeV10 _toEnRedaccion_request = null;
        try {
            es.valencia.services.nie.comunicaciones.ComunicacionResponseTypeV12 _toEnRedaccion__return = port.toEnRedaccion(_toEnRedaccion_request);
            System.out.println("toEnRedaccion.result=" + _toEnRedaccion__return);

        } catch (ComunicacionPreconditionFault e) { 
            System.out.println("Expected exception: ComunicacionPreconditionFault has occurred.");
            System.out.println(e.toString());
        }
            }

        System.exit(0);
    }

}

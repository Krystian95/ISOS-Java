
package org.camunda.bpm.acme.generated.gestione_ordini;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ACMEGestioneOrdini", targetNamespace = "mytest.test.com.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ACMEGestioneOrdini {


    /**
     * 
     * @param body
     * @return
     *     returns org.camunda.bpm.acme.generated.gestione_ordini.NotificaCustomizzazioniNonRealizzabiliResponse
     */
    @WebMethod(action = "notificaCustomizzazioniNonRealizzabili")
    @WebResult(name = "notificaCustomizzazioniNonRealizzabiliResponse", targetNamespace = "mytest.test.com.xsd", partName = "body")
    public NotificaCustomizzazioniNonRealizzabiliResponse notificaCustomizzazioniNonRealizzabili(
        @WebParam(name = "notificaCustomizzazioniNonRealizzabili", targetNamespace = "mytest.test.com.xsd", partName = "body")
        NotificaCustomizzazioniNonRealizzabili body);

    /**
     * 
     * @param body
     * @return
     *     returns org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMPResponse
     */
    @WebMethod(action = "prenotazioneMaterialiPresentiMP")
    @WebResult(name = "prenotazioneMaterialiPresentiMPResponse", targetNamespace = "mytest.test.com.xsd", partName = "body")
    public PrenotazioneMaterialiPresentiMPResponse prenotazioneMaterialiPresentiMP(
        @WebParam(name = "prenotazioneMaterialiPresentiMP", targetNamespace = "mytest.test.com.xsd", partName = "body")
        PrenotazioneMaterialiPresentiMP body);

    /**
     * 
     * @param body
     * @return
     *     returns org.camunda.bpm.acme.generated.gestione_ordini.VerificaCustomizzazioni
     */
    @WebMethod(action = "getIdOrdine")
    @WebResult(name = "verificaCustomizzazioni", targetNamespace = "mytest.test.com.xsd", partName = "body")
    public VerificaCustomizzazioni getIdOrdine(
        @WebParam(name = "getIdOrdine", targetNamespace = "mytest.test.com.xsd", partName = "body")
        GetIdOrdine body);

    /**
     * 
     * @param body
     * @return
     *     returns org.camunda.bpm.acme.generated.gestione_ordini.VerificaCustomizzazioniResponse
     */
    @WebMethod(action = "verificaCustomizzazioni")
    @WebResult(name = "verificaCustomizzazioniResponse", targetNamespace = "mytest.test.com.xsd", partName = "body")
    public VerificaCustomizzazioniResponse verificaCustomizzazioni(
        @WebParam(name = "verificaCustomizzazioni", targetNamespace = "mytest.test.com.xsd", partName = "body")
        VerificaCustomizzazioni body);

    /**
     * 
     * @param body
     * @return
     *     returns org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditoreResponse
     */
    @WebMethod(action = "getIdRivenditore")
    @WebResult(name = "getIdRivenditoreResponse", targetNamespace = "mytest.test.com.xsd", partName = "body")
    public GetIdRivenditoreResponse getIdRivenditore(
        @WebParam(name = "getIdRivenditore", targetNamespace = "mytest.test.com.xsd", partName = "body")
        GetIdRivenditore body);

}

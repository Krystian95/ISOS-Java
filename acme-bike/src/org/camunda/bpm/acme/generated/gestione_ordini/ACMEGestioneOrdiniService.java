
package org.camunda.bpm.acme.generated.gestione_ordini;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ACMEGestioneOrdiniService", targetNamespace = "mytest.test.com.wsdl", wsdlLocation = "file:/C:/Users/andre/Documents/Progetti/ISOS-Java/acme-bike/wsdlACMEGestioneOrdini.wsdl")
public class ACMEGestioneOrdiniService
    extends Service
{

    private final static URL ACMEGESTIONEORDINISERVICE_WSDL_LOCATION;
    private final static WebServiceException ACMEGESTIONEORDINISERVICE_EXCEPTION;
    private final static QName ACMEGESTIONEORDINISERVICE_QNAME = new QName("mytest.test.com.wsdl", "ACMEGestioneOrdiniService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/andre/Documents/Progetti/ISOS-Java/acme-bike/wsdlACMEGestioneOrdini.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ACMEGESTIONEORDINISERVICE_WSDL_LOCATION = url;
        ACMEGESTIONEORDINISERVICE_EXCEPTION = e;
    }

    public ACMEGestioneOrdiniService() {
        super(__getWsdlLocation(), ACMEGESTIONEORDINISERVICE_QNAME);
    }

    public ACMEGestioneOrdiniService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ACMEGESTIONEORDINISERVICE_QNAME, features);
    }

    public ACMEGestioneOrdiniService(URL wsdlLocation) {
        super(wsdlLocation, ACMEGESTIONEORDINISERVICE_QNAME);
    }

    public ACMEGestioneOrdiniService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ACMEGESTIONEORDINISERVICE_QNAME, features);
    }

    public ACMEGestioneOrdiniService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ACMEGestioneOrdiniService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ACMEGestioneOrdini
     */
    @WebEndpoint(name = "ACMEGestioneOrdiniServicePort")
    public ACMEGestioneOrdini getACMEGestioneOrdiniServicePort() {
        return super.getPort(new QName("mytest.test.com.wsdl", "ACMEGestioneOrdiniServicePort"), ACMEGestioneOrdini.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ACMEGestioneOrdini
     */
    @WebEndpoint(name = "ACMEGestioneOrdiniServicePort")
    public ACMEGestioneOrdini getACMEGestioneOrdiniServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("mytest.test.com.wsdl", "ACMEGestioneOrdiniServicePort"), ACMEGestioneOrdini.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ACMEGESTIONEORDINISERVICE_EXCEPTION!= null) {
            throw ACMEGESTIONEORDINISERVICE_EXCEPTION;
        }
        return ACMEGESTIONEORDINISERVICE_WSDL_LOCATION;
    }

}

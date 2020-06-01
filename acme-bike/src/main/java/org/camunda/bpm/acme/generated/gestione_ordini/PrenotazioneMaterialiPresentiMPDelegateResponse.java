
package org.camunda.bpm.acme.generated.gestione_ordini;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tuttiMaterialiRichiestiPresentiMP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response",
    "tuttiMaterialiRichiestiPresentiMP"
})
@XmlRootElement(name = "prenotazioneMaterialiPresentiMPDelegateResponse")
public class PrenotazioneMaterialiPresentiMPDelegateResponse {

    @XmlElement(required = true)
    protected String response;
    protected boolean tuttiMaterialiRichiestiPresentiMP;

    /**
     * Recupera il valore della proprietà response.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponse() {
        return response;
    }

    /**
     * Imposta il valore della proprietà response.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponse(String value) {
        this.response = value;
    }

    /**
     * Recupera il valore della proprietà tuttiMaterialiRichiestiPresentiMP.
     * 
     */
    public boolean isTuttiMaterialiRichiestiPresentiMP() {
        return tuttiMaterialiRichiestiPresentiMP;
    }

    /**
     * Imposta il valore della proprietà tuttiMaterialiRichiestiPresentiMP.
     * 
     */
    public void setTuttiMaterialiRichiestiPresentiMP(boolean value) {
        this.tuttiMaterialiRichiestiPresentiMP = value;
    }

}

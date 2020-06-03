
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
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "message",
    "tuttiMaterialiRichiestiPresentiMP"
})
@XmlRootElement(name = "prenotazioneMaterialiPresentiMPResponse")
public class PrenotazioneMaterialiPresentiMPResponse {

    @XmlElement(required = true)
    protected String message;
    protected boolean tuttiMaterialiRichiestiPresentiMP;

    /**
     * Recupera il valore della proprietà message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Imposta il valore della proprietà message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
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

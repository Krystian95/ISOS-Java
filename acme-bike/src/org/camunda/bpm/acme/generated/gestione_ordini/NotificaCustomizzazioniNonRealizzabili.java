
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
 *         &lt;element name="idRivenditore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idOrdine" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "idRivenditore",
    "idOrdine"
})
@XmlRootElement(name = "notificaCustomizzazioniNonRealizzabili")
public class NotificaCustomizzazioniNonRealizzabili {

    @XmlElement(required = true)
    protected String idRivenditore;
    @XmlElement(required = true)
    protected String idOrdine;

    /**
     * Recupera il valore della proprietÓ idRivenditore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRivenditore() {
        return idRivenditore;
    }

    /**
     * Imposta il valore della proprietÓ idRivenditore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRivenditore(String value) {
        this.idRivenditore = value;
    }

    /**
     * Recupera il valore della proprietÓ idOrdine.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOrdine() {
        return idOrdine;
    }

    /**
     * Imposta il valore della proprietÓ idOrdine.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOrdine(String value) {
        this.idOrdine = value;
    }

}

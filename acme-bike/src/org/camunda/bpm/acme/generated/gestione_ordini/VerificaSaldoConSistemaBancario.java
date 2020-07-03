
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
 *         &lt;element name="transactionToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "transactionToken",
    "idOrdine"
})
@XmlRootElement(name = "verificaSaldoConSistemaBancario")
public class VerificaSaldoConSistemaBancario {

    @XmlElement(required = true)
    protected String transactionToken;
    @XmlElement(required = true)
    protected String idOrdine;

    /**
     * Recupera il valore della propriet� transactionToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionToken() {
        return transactionToken;
    }

    /**
     * Imposta il valore della propriet� transactionToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionToken(String value) {
        this.transactionToken = value;
    }

    /**
     * Recupera il valore della propriet� idOrdine.
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
     * Imposta il valore della propriet� idOrdine.
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

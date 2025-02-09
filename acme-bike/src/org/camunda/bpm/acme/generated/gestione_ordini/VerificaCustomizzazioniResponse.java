
package org.camunda.bpm.acme.generated.gestione_ordini;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ordineContieneAccessoriDaNonAssemblare" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customizzazioniPossibili" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ordineContieneComponentiAccessoriDaAssemblare" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ordineContieneAccessoriDaNonAssemblare",
    "customizzazioniPossibili",
    "ordineContieneComponentiAccessoriDaAssemblare"
})
@XmlRootElement(name = "verificaCustomizzazioniResponse")
public class VerificaCustomizzazioniResponse {

    protected boolean ordineContieneAccessoriDaNonAssemblare;
    protected boolean customizzazioniPossibili;
    protected boolean ordineContieneComponentiAccessoriDaAssemblare;

    /**
     * Recupera il valore della proprietÓ ordineContieneAccessoriDaNonAssemblare.
     * 
     */
    public boolean isOrdineContieneAccessoriDaNonAssemblare() {
        return ordineContieneAccessoriDaNonAssemblare;
    }

    /**
     * Imposta il valore della proprietÓ ordineContieneAccessoriDaNonAssemblare.
     * 
     */
    public void setOrdineContieneAccessoriDaNonAssemblare(boolean value) {
        this.ordineContieneAccessoriDaNonAssemblare = value;
    }

    /**
     * Recupera il valore della proprietÓ customizzazioniPossibili.
     * 
     */
    public boolean isCustomizzazioniPossibili() {
        return customizzazioniPossibili;
    }

    /**
     * Imposta il valore della proprietÓ customizzazioniPossibili.
     * 
     */
    public void setCustomizzazioniPossibili(boolean value) {
        this.customizzazioniPossibili = value;
    }

    /**
     * Recupera il valore della proprietÓ ordineContieneComponentiAccessoriDaAssemblare.
     * 
     */
    public boolean isOrdineContieneComponentiAccessoriDaAssemblare() {
        return ordineContieneComponentiAccessoriDaAssemblare;
    }

    /**
     * Imposta il valore della proprietÓ ordineContieneComponentiAccessoriDaAssemblare.
     * 
     */
    public void setOrdineContieneComponentiAccessoriDaAssemblare(boolean value) {
        this.ordineContieneComponentiAccessoriDaAssemblare = value;
    }

}

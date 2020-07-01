
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
 *         &lt;element name="ordineContieneMaterialiDaOrdinareDaFornitore" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tuttiAccessoriPresentiNeiMagazzini" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ordineContieneMaterialiPrenotatiMP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ordineContieneMaterialiPrenotatiMS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "ordineContieneMaterialiDaOrdinareDaFornitore",
    "tuttiAccessoriPresentiNeiMagazzini",
    "ordineContieneMaterialiPrenotatiMP",
    "ordineContieneMaterialiPrenotatiMS"
})
@XmlRootElement(name = "recuperoVariabiliSessioneResponse")
public class RecuperoVariabiliSessioneResponse {

    protected boolean ordineContieneAccessoriDaNonAssemblare;
    protected boolean ordineContieneMaterialiDaOrdinareDaFornitore;
    protected boolean tuttiAccessoriPresentiNeiMagazzini;
    protected boolean ordineContieneMaterialiPrenotatiMP;
    protected boolean ordineContieneMaterialiPrenotatiMS;

    /**
     * Recupera il valore della propriet� ordineContieneAccessoriDaNonAssemblare.
     * 
     */
    public boolean isOrdineContieneAccessoriDaNonAssemblare() {
        return ordineContieneAccessoriDaNonAssemblare;
    }

    /**
     * Imposta il valore della propriet� ordineContieneAccessoriDaNonAssemblare.
     * 
     */
    public void setOrdineContieneAccessoriDaNonAssemblare(boolean value) {
        this.ordineContieneAccessoriDaNonAssemblare = value;
    }

    /**
     * Recupera il valore della propriet� ordineContieneMaterialiDaOrdinareDaFornitore.
     * 
     */
    public boolean isOrdineContieneMaterialiDaOrdinareDaFornitore() {
        return ordineContieneMaterialiDaOrdinareDaFornitore;
    }

    /**
     * Imposta il valore della propriet� ordineContieneMaterialiDaOrdinareDaFornitore.
     * 
     */
    public void setOrdineContieneMaterialiDaOrdinareDaFornitore(boolean value) {
        this.ordineContieneMaterialiDaOrdinareDaFornitore = value;
    }

    /**
     * Recupera il valore della propriet� tuttiAccessoriPresentiNeiMagazzini.
     * 
     */
    public boolean isTuttiAccessoriPresentiNeiMagazzini() {
        return tuttiAccessoriPresentiNeiMagazzini;
    }

    /**
     * Imposta il valore della propriet� tuttiAccessoriPresentiNeiMagazzini.
     * 
     */
    public void setTuttiAccessoriPresentiNeiMagazzini(boolean value) {
        this.tuttiAccessoriPresentiNeiMagazzini = value;
    }

    /**
     * Recupera il valore della propriet� ordineContieneMaterialiPrenotatiMP.
     * 
     */
    public boolean isOrdineContieneMaterialiPrenotatiMP() {
        return ordineContieneMaterialiPrenotatiMP;
    }

    /**
     * Imposta il valore della propriet� ordineContieneMaterialiPrenotatiMP.
     * 
     */
    public void setOrdineContieneMaterialiPrenotatiMP(boolean value) {
        this.ordineContieneMaterialiPrenotatiMP = value;
    }

    /**
     * Recupera il valore della propriet� ordineContieneMaterialiPrenotatiMS.
     * 
     */
    public boolean isOrdineContieneMaterialiPrenotatiMS() {
        return ordineContieneMaterialiPrenotatiMS;
    }

    /**
     * Imposta il valore della propriet� ordineContieneMaterialiPrenotatiMS.
     * 
     */
    public void setOrdineContieneMaterialiPrenotatiMS(boolean value) {
        this.ordineContieneMaterialiPrenotatiMS = value;
    }

}

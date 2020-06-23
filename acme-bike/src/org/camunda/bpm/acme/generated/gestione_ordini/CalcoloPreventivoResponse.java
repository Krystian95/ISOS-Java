
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
 *         &lt;element name="totaleCicli" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sogliaSconto" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="spedizioniComponenti" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="spedizioniAccessori" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totaleCustomizzazioni" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totalePreventivo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totaleAccessori" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="totaleCorriere" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "totaleCicli",
    "sogliaSconto",
    "spedizioniComponenti",
    "spedizioniAccessori",
    "totaleCustomizzazioni",
    "totalePreventivo",
    "totaleAccessori",
    "totaleCorriere"
})
@XmlRootElement(name = "calcoloPreventivoResponse")
public class CalcoloPreventivoResponse {

    protected double totaleCicli;
    protected double sogliaSconto;
    protected double spedizioniComponenti;
    protected double spedizioniAccessori;
    protected double totaleCustomizzazioni;
    protected double totalePreventivo;
    protected double totaleAccessori;
    protected double totaleCorriere;

    /**
     * Recupera il valore della proprietà totaleCicli.
     * 
     */
    public double getTotaleCicli() {
        return totaleCicli;
    }

    /**
     * Imposta il valore della proprietà totaleCicli.
     * 
     */
    public void setTotaleCicli(double value) {
        this.totaleCicli = value;
    }

    /**
     * Recupera il valore della proprietà sogliaSconto.
     * 
     */
    public double getSogliaSconto() {
        return sogliaSconto;
    }

    /**
     * Imposta il valore della proprietà sogliaSconto.
     * 
     */
    public void setSogliaSconto(double value) {
        this.sogliaSconto = value;
    }

    /**
     * Recupera il valore della proprietà spedizioniComponenti.
     * 
     */
    public double getSpedizioniComponenti() {
        return spedizioniComponenti;
    }

    /**
     * Imposta il valore della proprietà spedizioniComponenti.
     * 
     */
    public void setSpedizioniComponenti(double value) {
        this.spedizioniComponenti = value;
    }

    /**
     * Recupera il valore della proprietà spedizioniAccessori.
     * 
     */
    public double getSpedizioniAccessori() {
        return spedizioniAccessori;
    }

    /**
     * Imposta il valore della proprietà spedizioniAccessori.
     * 
     */
    public void setSpedizioniAccessori(double value) {
        this.spedizioniAccessori = value;
    }

    /**
     * Recupera il valore della proprietà totaleCustomizzazioni.
     * 
     */
    public double getTotaleCustomizzazioni() {
        return totaleCustomizzazioni;
    }

    /**
     * Imposta il valore della proprietà totaleCustomizzazioni.
     * 
     */
    public void setTotaleCustomizzazioni(double value) {
        this.totaleCustomizzazioni = value;
    }

    /**
     * Recupera il valore della proprietà totalePreventivo.
     * 
     */
    public double getTotalePreventivo() {
        return totalePreventivo;
    }

    /**
     * Imposta il valore della proprietà totalePreventivo.
     * 
     */
    public void setTotalePreventivo(double value) {
        this.totalePreventivo = value;
    }

    /**
     * Recupera il valore della proprietà totaleAccessori.
     * 
     */
    public double getTotaleAccessori() {
        return totaleAccessori;
    }

    /**
     * Imposta il valore della proprietà totaleAccessori.
     * 
     */
    public void setTotaleAccessori(double value) {
        this.totaleAccessori = value;
    }

    /**
     * Recupera il valore della proprietà totaleCorriere.
     * 
     */
    public double getTotaleCorriere() {
        return totaleCorriere;
    }

    /**
     * Imposta il valore della proprietà totaleCorriere.
     * 
     */
    public void setTotaleCorriere(double value) {
        this.totaleCorriere = value;
    }

}

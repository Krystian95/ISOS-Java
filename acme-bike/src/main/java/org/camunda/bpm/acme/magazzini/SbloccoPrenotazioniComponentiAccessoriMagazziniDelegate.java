package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.SbloccoPrenotazioniComponentiAccessoriMagazzini;
import org.camunda.bpm.acme.generated.gestione_ordini.SbloccoPrenotazioniComponentiAccessoriMagazziniResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SbloccoPrenotazioniComponentiAccessoriMagazziniDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MS - Dopo aver ricevuto il rifiuto del preventivo, sblocco i materiali precedentemente bloccati.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();
		
		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[SbloccoPrenotazioniComponentiAccessoriMagazziniDelegate] idOrdine = " + idOrdine);

		SbloccoPrenotazioniComponentiAccessoriMagazzini bodySbloccoPrenotazioniComponentiAccessoriMagazzini = new SbloccoPrenotazioniComponentiAccessoriMagazzini();
		bodySbloccoPrenotazioniComponentiAccessoriMagazzini.setIdOrdine(idOrdine);

		SbloccoPrenotazioniComponentiAccessoriMagazziniResponse SbloccoPrenotazioniComponentiAccessoriMagazzini = acmeGestioneOrdini
				.sbloccoPrenotazioniComponentiAccessoriMagazzini(bodySbloccoPrenotazioniComponentiAccessoriMagazzini);	
		LOGGER.info("[SbloccoPrenotazioniComponentiAccessoriMagazziniDelegate] Message= "+ SbloccoPrenotazioniComponentiAccessoriMagazzini.getMessage());
	}

}
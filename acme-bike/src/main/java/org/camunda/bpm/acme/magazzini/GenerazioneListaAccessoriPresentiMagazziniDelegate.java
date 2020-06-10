package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GenerazioneListaAccessoriPresentiMagazzini;
import org.camunda.bpm.acme.generated.gestione_ordini.GenerazioneListaAccessoriPresentiMagazziniResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GenerazioneListaAccessoriPresentiMagazziniDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MAGAZZINI - Genero la lista degli accessori presenti nei MAGAZZINI.");
	  
	  ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

	  GenerazioneListaAccessoriPresentiMagazzini body = new GenerazioneListaAccessoriPresentiMagazzini();
		String idOrdine = (String) execution.getVariable("idOrdine");
		body.setIdOrdine(idOrdine);

		GenerazioneListaAccessoriPresentiMagazziniResponse GenerazioneListaAccessoriPresentiMagazzini = acmeGestioneOrdini
				.generazioneListaAccessoriPresentiMagazzini(body);

		LOGGER.info("[GenerazioneListaAccessoriPresentiMagazzini] Message= " + GenerazioneListaAccessoriPresentiMagazzini.getMessage());
	  
	  execution.setVariable("esisteAlmenoUnAccessorioInMagazzino", false);
  }

}
package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GenerazioneListaAccessoriPresentiMagazzini;
import org.camunda.bpm.acme.generated.gestione_ordini.GenerazioneListaAccessoriPresentiMagazziniResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GenerazioneListaAccessoriPresentiMagazziniDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MAGAZZINI - Genero la lista degli accessori presenti nei MAGAZZINI.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GenerazioneListaAccessoriPresentiMagazzini bodyGenerazioneListaAccessoriPresentiMagazzini = new GenerazioneListaAccessoriPresentiMagazzini();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[GenerazioneListaAccessoriPresentiMagazziniDelegate] idOrdine = " + idOrdine);

		GenerazioneListaAccessoriPresentiMagazziniResponse GenerazioneListaAccessoriPresentiMagazzini = acmeGestioneOrdini
				.generazioneListaAccessoriPresentiMagazzini(bodyGenerazioneListaAccessoriPresentiMagazzini);

		LOGGER.info("[GenerazioneListaAccessoriPresentiMagazziniDelegate] Message= "
				+ GenerazioneListaAccessoriPresentiMagazzini.getMessage());

		execution.setVariable("esisteAlmenoUnAccessorioInMagazzino", false);
	}

}
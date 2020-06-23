package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.ApplicazioneSconto;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioPreventivoDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
	String preventivo;

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Invio il preventivo.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		ApplicazioneSconto bodySconto = new ApplicazioneSconto();
		bodySconto.setIdOrdine((String) execution.getVariable("idOrdine"));
		bodySconto.setPercentualeSconto((String) execution.getVariable("percentualeSconto"));

		LOGGER.info("GESTIONE ORDINI - Applico sconto.");
		acmeGestioneOrdini.applicazioneSconto(bodySconto);
	}

}
package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.ApplicazioneSconto;
import org.camunda.bpm.acme.generated.gestione_ordini.ApplicazioneScontoResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ApplicazioneScontoDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
	boolean anticipoVerificato;

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Applico lo sconto.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[ApplicazioneScontoDelegate] idOrdine = " + idOrdine);
		
		ApplicazioneSconto bodyApplicazioneSconto = new ApplicazioneSconto();
		bodyApplicazioneSconto.setIdOrdine(idOrdine);
		bodyApplicazioneSconto.setPercentualeSconto((String) execution.getVariable("percentualeSconto"));

		ApplicazioneScontoResponse ApplicazioneSconto = acmeGestioneOrdini.applicazioneSconto(bodyApplicazioneSconto);
		LOGGER.info("[ApplicazioneScontoDelegate] Message= "+ ApplicazioneSconto.getMessage());
		
	}

}
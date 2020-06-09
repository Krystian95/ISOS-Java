package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMS;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMSResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrenotazioneMaterialiPresentiMSDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MS - Prenoto i materiali disponibili nel MS.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		PrenotazioneMaterialiPresentiMS body = new PrenotazioneMaterialiPresentiMS();
		String idOrdine = (String) execution.getVariable("idOrdine");
		body.setIdOrdine(idOrdine);

		PrenotazioneMaterialiPresentiMSResponse prenotazioneMaterialiPresentiMS = acmeGestioneOrdini
				.prenotazioneMaterialiPresentiMS(body);

		LOGGER.info("[PrenotazioneMaterialiPresentiMS] Message= " + prenotazioneMaterialiPresentiMS.getMessage());
	}

}
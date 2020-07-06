package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMS;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMSResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrenotazioneMaterialiPresentiMSDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MS - Prenoto i materiali disponibili nel MS.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		PrenotazioneMaterialiPresentiMS bodyPrenotazioneMaterialiPresentiMS = new PrenotazioneMaterialiPresentiMS();
		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[PrenotazioneMaterialiPresentiMSDelegate] idOrdine = " + idOrdine);
		bodyPrenotazioneMaterialiPresentiMS.setIdOrdine(idOrdine);

		PrenotazioneMaterialiPresentiMSResponse prenotazioneMaterialiPresentiMS = acmeGestioneOrdini
				.prenotazioneMaterialiPresentiMS(bodyPrenotazioneMaterialiPresentiMS);

		LOGGER.info(
				"[PrenotazioneMaterialiPresentiMSDelegate] Message= " + prenotazioneMaterialiPresentiMS.getMessage());
	}

}
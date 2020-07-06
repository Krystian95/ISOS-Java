package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMP;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMPResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrenotazioneMaterialiPresentiMPDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MP - Prenoto i materiali disponibili nel MP.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		PrenotazioneMaterialiPresentiMP bodyPrenotazioneMaterialiPresentiMP = new PrenotazioneMaterialiPresentiMP();
		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[PrenotazioneMaterialiPresentiMPDelegate] idOrdine = " + idOrdine);
		bodyPrenotazioneMaterialiPresentiMP.setIdOrdine(idOrdine);

		PrenotazioneMaterialiPresentiMPResponse prenotazioneMaterialiPresentiMP = acmeGestioneOrdini
				.prenotazioneMaterialiPresentiMP(bodyPrenotazioneMaterialiPresentiMP);
		LOGGER.info("[PrenotazioneMaterialiPresentiMPDelegate] tuttiMaterialiRichiestiPresentiMP = "
				+ prenotazioneMaterialiPresentiMP.isTuttiMaterialiRichiestiPresentiMP());

		execution.setVariable("tuttiMaterialiRichiestiPresentiMP",
				prenotazioneMaterialiPresentiMP.isTuttiMaterialiRichiestiPresentiMP());
		LOGGER.info(
				"[PrenotazioneMaterialiPresentiMPDelegate] Message= " + prenotazioneMaterialiPresentiMP.getMessage());
	}

}
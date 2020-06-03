package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMP;
import org.camunda.bpm.acme.generated.gestione_ordini.PrenotazioneMaterialiPresentiMPResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class PrenotazioneMaterialiPresentiMPDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MP - Prenoto i materiali disponibili nel MP.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		PrenotazioneMaterialiPresentiMP body = new PrenotazioneMaterialiPresentiMP();
		String idOrdine = (String) execution.getVariable("idOrdine");
		body.setIdOrdine(idOrdine);

		PrenotazioneMaterialiPresentiMPResponse prenotazioneMaterialiPresentiMP = acmeGestioneOrdini
				.prenotazioneMaterialiPresentiMP(body);

		LOGGER.info("[PrenotazioneMaterialiPresentiMP] tuttiMaterialiRichiestiPresentiMP = "
				+ prenotazioneMaterialiPresentiMP.isTuttiMaterialiRichiestiPresentiMP());

		execution.setVariable("tuttiMaterialiRichiestiPresentiMP",
				prenotazioneMaterialiPresentiMP.isTuttiMaterialiRichiestiPresentiMP());

		LOGGER.info("[PrenotazioneMaterialiPresentiMP] Message= " + prenotazioneMaterialiPresentiMP.getMessage());
	}

}
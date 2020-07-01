package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditore;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditoreResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.RecuperoVariabiliSessione;
import org.camunda.bpm.acme.generated.gestione_ordini.RecuperoVariabiliSessioneResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RecuperoVariabiliSessioneDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Recupero le variabili di sessione.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[RecuperoVariabiliSessioneDelegate] idOrdine = " + idOrdine);

		RecuperoVariabiliSessione bodyRecuperoVariabiliSessione = new RecuperoVariabiliSessione();
		bodyRecuperoVariabiliSessione.setIdOrdine(idOrdine);
		execution.setVariable("idOrdine", idOrdine);

		String idRivenditore = null;
		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);
		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);
		idRivenditore = getIdRivenditore.getIdRivenditore();
		execution.setVariable("idRivenditore", idRivenditore);

		RecuperoVariabiliSessioneResponse RecuperoVariabiliSessione = acmeGestioneOrdini.recuperoVariabiliSessione(bodyRecuperoVariabiliSessione);

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= idOrdine: " + execution.getVariable("idOrdine"));

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= idRivenditore: "
				+ execution.getVariable("idRivenditore"));

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= OrdineContieneMaterialiDaOrdinareDaFornitore: "
				+ RecuperoVariabiliSessione.isOrdineContieneMaterialiDaOrdinareDaFornitore());
		execution.setVariable("OrdineContieneMaterialiDaOrdinareDaFornitore",
				RecuperoVariabiliSessione.isOrdineContieneMaterialiDaOrdinareDaFornitore());

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= OrdineContieneAccessoriDaNonAssemblare: "
				+ RecuperoVariabiliSessione.isOrdineContieneAccessoriDaNonAssemblare());
		execution.setVariable("OrdineContieneAccessoriDaNonAssemblare",
				RecuperoVariabiliSessione.isOrdineContieneAccessoriDaNonAssemblare());

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= OrdineContieneMaterialiPrenotatiMP: "
				+ RecuperoVariabiliSessione.isOrdineContieneMaterialiPrenotatiMP());
		execution.setVariable("OrdineContieneMaterialiPrenotatiMP",
				RecuperoVariabiliSessione.isOrdineContieneMaterialiPrenotatiMP());

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= OrdineContieneMaterialiPrenotatiMS: "
				+ RecuperoVariabiliSessione.isOrdineContieneMaterialiPrenotatiMS());
		execution.setVariable("OrdineContieneMaterialiPrenotatiMS",
				RecuperoVariabiliSessione.isOrdineContieneMaterialiPrenotatiMS());

		LOGGER.info("[RecuperoVariabiliSessioneDelegate] Message= TuttiAccessoriPresentiNeiMagazzini: "
				+ RecuperoVariabiliSessione.isTuttiAccessoriPresentiNeiMagazzini());
		execution.setVariable("TuttiAccessoriPresentiNeiMagazzini",
				RecuperoVariabiliSessione.isTuttiAccessoriPresentiNeiMagazzini());
	}

}
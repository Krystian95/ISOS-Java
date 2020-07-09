package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.CalcoloPreventivo;
import org.camunda.bpm.acme.generated.gestione_ordini.CalcoloPreventivoResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditore;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditoreResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalcoloPreventivoDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Calcolo il preventivo.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[CalcoloPreventivoDelegate] idOrdine = " + idOrdine);

		CalcoloPreventivo bodyCalcoloPreventivo = new CalcoloPreventivo();
		bodyCalcoloPreventivo.setIdOrdine(idOrdine);

		String idRivenditore = null;
		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);
		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);
		idRivenditore = getIdRivenditore.getIdRivenditore();
		bodyCalcoloPreventivo.setIdRivenditore(idRivenditore);
		execution.setVariable("idRivenditore", idRivenditore);

		CalcoloPreventivoResponse CalcoloPreventivo = acmeGestioneOrdini.calcoloPreventivo(bodyCalcoloPreventivo);

		execution.setVariable("totalePreventivo", CalcoloPreventivo.getTotalePreventivo());
		execution.setVariable("sogliaSconto", CalcoloPreventivo.getSogliaSconto());

		LOGGER.info("[CalcoloPreventivoDelegate] Message= Calcolo preventivo effettuato. Totale: "
				+ CalcoloPreventivo.getTotalePreventivo() + ", soglia sconto: " + CalcoloPreventivo.getSogliaSconto());

		execution.setVariable("ordineContieneMaterialiPrenotatiMP",
				CalcoloPreventivo.isOrdineContieneMaterialiPrenotatiMP());
		execution.setVariable("ordineContieneMaterialiPrenotatiMS",
				CalcoloPreventivo.isOrdineContieneMaterialiPrenotatiMS());
		execution.setVariable("ordineContieneMaterialiDaOrdinareDaFornitore",
				CalcoloPreventivo.isOrdineContieneMaterialiDaOrdinareDaFornitore());
		execution.setVariable("tuttiAccessoriPresentiNeiMagazzini", CalcoloPreventivo.isTuttiAccessoriPresentiNeiMagazzini());
	}

}
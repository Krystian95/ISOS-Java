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

		CalcoloPreventivo body = new CalcoloPreventivo();
		String idOrdine = (String) execution.getVariable("idOrdine");
		String idRivenditore = null;

		body.setIdOrdine(idOrdine);

		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);

		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);

		idRivenditore = getIdRivenditore.getIdRivenditore();
		body.setIdRivenditore(idRivenditore);
		execution.setVariable("idRivenditore", idRivenditore);
		
		//LOGGER.info("VEDI QUA ID ORDINE: "+idOrdine);
		//LOGGER.info("VEDI QUA ID RIVENDITORE: "+idRivenditore);

		CalcoloPreventivoResponse CalcoloPreventivo = acmeGestioneOrdini.calcoloPreventivo(body);

		execution.setVariable("totalePreventivo", CalcoloPreventivo.getTotalePreventivo());
		execution.setVariable("sogliaSconto", CalcoloPreventivo.getSogliaSconto());

		LOGGER.info("[CalcoloPreventivo] Message= Calcolo preventivo effettuato. Totale: "
				+ CalcoloPreventivo.getTotalePreventivo() + ", soglia sconto: " + CalcoloPreventivo.getSogliaSconto());

		//execution.setVariable("totalePreventivo", 1200.00);
		execution.setVariable("ordineContieneMaterialiPrenotatiMP", true);
		execution.setVariable("ordineContieneMaterialiDaOrdinareDaFornitore", true);
		execution.setVariable("ordineContieneMaterialiPrenotatiMS", true);
	}

}
package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditore;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditoreResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioPreventivo;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioPreventivoResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioPreventivoDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
	String preventivo;

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Invio il preventivo.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[InvioPreventivoDelegate] idOrdine = " + idOrdine);

		InvioPreventivo bodyInvioPreventivo = new InvioPreventivo();
		bodyInvioPreventivo.setIdOrdine(idOrdine);

		String idRivenditore = null;
		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);
		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);
		idRivenditore = getIdRivenditore.getIdRivenditore();
		bodyInvioPreventivo.setIdRivenditore(idRivenditore);

		InvioPreventivoResponse InvioPreventivo = acmeGestioneOrdini.invioPreventivo(bodyInvioPreventivo);
		LOGGER.info("[InvioPreventivoDelegate] Message= " + InvioPreventivo.getMessage());
	}

}
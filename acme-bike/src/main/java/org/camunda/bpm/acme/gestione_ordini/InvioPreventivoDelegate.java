package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.ApplicazioneSconto;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
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
		
		InvioPreventivo body = new InvioPreventivo();
		
		String idOrdine = (String) execution.getVariable("idOrdine");
		String idRivenditore = null;

		body.setIdOrdine(idOrdine);

		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);

		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);

		idRivenditore = getIdRivenditore.getIdRivenditore();
		body.setIdRivenditore(idRivenditore);
		
		InvioPreventivoResponse InvioPreventivo = acmeGestioneOrdini.invioPreventivo(body);
		LOGGER.info("[InvioPreventivo] Message= "+ InvioPreventivo.getMessage());
	}

}
package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditore;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdRivenditoreResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.NotificaCustomizzazioniNonRealizzabili;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioNotificaCustomizzazioniNonRealizzabiliDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
	// String notificaCustomizzazioniNonRealizzabili;

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Invio la notifica delle customizzazioni non realizzabili.");
		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		String idRivenditore = null;

		GetIdRivenditore bodyGetIdRivenditore = new GetIdRivenditore();
		bodyGetIdRivenditore.setIdOrdine(idOrdine);

		GetIdRivenditoreResponse getIdRivenditore = acmeGestioneOrdini.getIdRivenditore(bodyGetIdRivenditore);

		idRivenditore = getIdRivenditore.getIdRivenditore();

		LOGGER.info("[InvioNotificaCustomizzazioniNonRealizzabili] idRivenditore = " + idRivenditore);

		execution.setVariable("idRivenditore", idRivenditore);

		NotificaCustomizzazioniNonRealizzabili notificaCustomizzazioniNonRealizzabili = new NotificaCustomizzazioniNonRealizzabili();

		notificaCustomizzazioniNonRealizzabili.setIdOrdine(idOrdine);

		notificaCustomizzazioniNonRealizzabili.setIdRivenditore(idRivenditore);

		acmeGestioneOrdini.notificaCustomizzazioniNonRealizzabili(notificaCustomizzazioniNonRealizzabili);
	}

}
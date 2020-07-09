package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineCorriere;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineCorriereResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InviaOrdineCorriereDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MS - Invio l'ordine al corriere.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[InviaOrdineCorriereDelegate] idOrdine = " + idOrdine);

		InvioOrdineCorriere bodyInviaOrdineCorriere = new InvioOrdineCorriere();
		bodyInviaOrdineCorriere.setIdOrdine(idOrdine);

		InvioOrdineCorriereResponse InviaOrdineCorriere = acmeGestioneOrdini
				.invioOrdineCorriere(bodyInviaOrdineCorriere);
		LOGGER.info("[InviaOrdineCorriereDelegate] Message = " + InviaOrdineCorriere.getMessage());
	}

}
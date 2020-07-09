package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineAccessoriFornitore;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineAccessoriFornitoreResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InviaOrdineAccessorioFornitoreDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info(
				"MS - Invio l'ordine al fornitore di procurarmi l'accessorio mancante presso il MS piu' vicino al cliente (selezionato precedentemente).");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[InviaOrdineAccessorioFornitoreDelegate] idOrdine = " + idOrdine);

		InvioOrdineAccessoriFornitore bodyInviaOrdineAccessorioFornitoreDelegate = new InvioOrdineAccessoriFornitore();
		bodyInviaOrdineAccessorioFornitoreDelegate.setIdOrdine(idOrdine);

		InvioOrdineAccessoriFornitoreResponse InviaOrdineAccessoriFornitore = acmeGestioneOrdini
				.invioOrdineAccessoriFornitore(bodyInviaOrdineAccessorioFornitoreDelegate);
		LOGGER.info("[InviaOrdineAccessorioFornitoreDelegate] Message = " + InviaOrdineAccessoriFornitore.getMessage());

	}

}
package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineMaterialiNonPresentiFornitore;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineMaterialiNonPresentiFornitoreResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioOrdineMaterialiNonPresentiFornitoreDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info(
				"ASSEMBLAGGIO - Invio la lista dei materiali non presenti nè nel MP nè nei MS. Invio quindi l'ordine al fornitore.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[InvioOrdineMaterialiNonPresentiFornitoreDelegate] idOrdine = " + idOrdine);

		InvioOrdineMaterialiNonPresentiFornitore bodyInvioOrdineMaterialiNonPresentiFornitore = new InvioOrdineMaterialiNonPresentiFornitore();
		bodyInvioOrdineMaterialiNonPresentiFornitore.setIdOrdine(idOrdine);

		InvioOrdineMaterialiNonPresentiFornitoreResponse InvioOrdineMaterialiNonPresentiFornitore = acmeGestioneOrdini
				.invioOrdineMaterialiNonPresentiFornitore(bodyInvioOrdineMaterialiNonPresentiFornitore);
		LOGGER.info("[InvioOrdineMaterialiNonPresentiFornitoreDelegate] Message = "
				+ InvioOrdineMaterialiNonPresentiFornitore.getMessage());

	}

}
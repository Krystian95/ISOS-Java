package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineCorriere;
import org.camunda.bpm.acme.generated.gestione_ordini.InvioOrdineCorriereResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioOrdineCorriereDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("ASSEMBLAGGIO - Invio l'ordine di spedizione del ciclo/accessorio assemblato al corriere.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		execution.setVariable("idOrdine", idOrdine);
		LOGGER.info("[InvioOrdineCorriereDelegate] idOrdine = " + idOrdine);
		
		InvioOrdineCorriere bodyInvioOrdineCorriere= new InvioOrdineCorriere();
		bodyInvioOrdineCorriere.setIdOrdine(idOrdine);
		
		InvioOrdineCorriereResponse InvioOrdineCorriere = acmeGestioneOrdini.invioOrdineCorriere(bodyInvioOrdineCorriere);
		LOGGER.info("[InvioOrdineCorriereDelegate] Message = "
				+ InvioOrdineCorriere.getMessage());
	}

}
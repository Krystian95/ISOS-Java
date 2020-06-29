package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaCustomizzazioni;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaCustomizzazioniResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaCustomizzazioniDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
	boolean customizzazioniPossibili;

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("GESTIONE ORDINI - Verifico le customizzazioni disponibili.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		LOGGER.info("[VerificaCustomizzazioniDelegate] 1");
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		LOGGER.info("[VerificaCustomizzazioniDelegate] 2");
		String idOrdine = idOrdineResponse.getIdOrdine();
		
		//OLD
		//GetIdOrdine body = null;
		//VerificaCustomizzazioni idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		

		LOGGER.info("[VerificaCustomizzazioniDelegate] idOrdineResponse = " + idOrdine);

		VerificaCustomizzazioni bodyVerificaCustomizzazioni = new VerificaCustomizzazioni();
		bodyVerificaCustomizzazioni.setIdOrdine(idOrdine);

		VerificaCustomizzazioniResponse verificaCustomizzazioni = acmeGestioneOrdini
				.verificaCustomizzazioni(idOrdineResponse);
	
		LOGGER.info("[VerificaCustomizzazioniDelegate] customizzazioniPossibili = "
				+ verificaCustomizzazioni.isCustomizzazioniPossibili());

		execution.setVariable("idOrdine", idOrdine);
		execution.setVariable("customizzazioniPossibili", verificaCustomizzazioni.isCustomizzazioniPossibili());
		execution.setVariable("ordineContieneComponentiAccessoriDaAssemblare",
				verificaCustomizzazioni.isOrdineContieneComponentiAccessoriDaAssemblare());
		execution.setVariable("ordineContieneAccessoriDaNonAssemblare",
				verificaCustomizzazioni.isOrdineContieneAccessoriDaNonAssemblare());
	}

}
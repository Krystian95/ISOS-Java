package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.RichiestaTrasferimentoMP;
import org.camunda.bpm.acme.generated.gestione_ordini.RichiestaTrasferimentoMPResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RichiestaTrasferimentoMPDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("ASSEMBLAGGIO - Mando la richiesta per trasferire i materiali disponibili nel MP in assemblaggio.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		GetIdOrdine body = null;
		GetIdOrdineResponse idOrdineResponse = acmeGestioneOrdini.getIdOrdine(body);
		String idOrdine = idOrdineResponse.getIdOrdine();
		LOGGER.info("[RichiestaTrasferimentoMPDelegate] idOrdine = " + idOrdine);

		RichiestaTrasferimentoMP bodyRichiestaTrasferimentoMP = new RichiestaTrasferimentoMP();
		bodyRichiestaTrasferimentoMP.setIdOrdine(idOrdine);

		RichiestaTrasferimentoMPResponse RichiestaTrasferimentoMP = acmeGestioneOrdini
				.richiestaTrasferimentoMP(bodyRichiestaTrasferimentoMP);
		LOGGER.info("[RichiestaTrasferimentoMPDelegate] Message= " + RichiestaTrasferimentoMP.getMessage());

	}

}
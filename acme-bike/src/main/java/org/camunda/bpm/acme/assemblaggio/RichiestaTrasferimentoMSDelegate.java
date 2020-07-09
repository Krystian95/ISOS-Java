package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdine;
import org.camunda.bpm.acme.generated.gestione_ordini.GetIdOrdineResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.RichiestaTrasferimentoMS;
import org.camunda.bpm.acme.generated.gestione_ordini.RichiestaTrasferimentoMSResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RichiestaTrasferimentoMSDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("ASSEMBLAGGIO - Mando la richiesta per trasferire i materiali disponibili nel MS in assemblaggio.");

		ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();

		String idOrdine = (String) execution.getVariable("idOrdine");
		LOGGER.info("[RichiestaTrasferimentoMSDelegate] idOrdine = " + idOrdine);

		RichiestaTrasferimentoMS bodyRichiestaTrasferimentoMS = new RichiestaTrasferimentoMS();
		bodyRichiestaTrasferimentoMS.setIdOrdine(idOrdine);

		RichiestaTrasferimentoMSResponse RichiestaTrasferimentoMS = acmeGestioneOrdini
				.richiestaTrasferimentoMS(bodyRichiestaTrasferimentoMS);
		LOGGER.info("[RichiestaTrasferimentoMSDelegate] Message= Richiesta trasferimento dal MS effettuata."
				+ RichiestaTrasferimentoMS.getMessage());
	}

}
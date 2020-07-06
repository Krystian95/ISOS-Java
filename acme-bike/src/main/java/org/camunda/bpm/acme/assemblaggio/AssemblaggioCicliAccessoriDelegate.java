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

public class AssemblaggioCicliAccessoriDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("ASSEMBLAGGIO - Assemblaggio cicli/accessori.");
	}

}
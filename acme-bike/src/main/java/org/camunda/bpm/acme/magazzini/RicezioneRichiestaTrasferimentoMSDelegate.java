package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RicezioneRichiestaTrasferimentoMSDelegate implements JavaDelegate {

	private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");

	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info("MS - Ricevo la richiesta di trasferimento del materiale disponibile nel MS.");
	}

}
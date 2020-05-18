package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ContrassegnoIlMaterialeComeNonPresenteMPDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MP - Ho verificato la mancanza del materiale nel MP e lo contrassegno come non presente.");
  }
}
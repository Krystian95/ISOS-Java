package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioMaterialiMPDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MP - Invio i materiali disponibili nel MP.");
  }

}
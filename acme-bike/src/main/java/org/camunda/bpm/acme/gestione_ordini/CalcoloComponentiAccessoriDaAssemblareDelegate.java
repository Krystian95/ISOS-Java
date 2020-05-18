package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalcoloComponentiAccessoriDaAssemblareDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  boolean esistonoComponentiAccessoriDaAssemblare;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Calcolo la presenza di componenti/accessori da assemblare.");
  }

}
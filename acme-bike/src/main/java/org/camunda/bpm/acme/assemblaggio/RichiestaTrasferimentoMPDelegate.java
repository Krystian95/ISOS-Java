package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RichiestaTrasferimentoMPDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");
  int[] ElencoAccessoriComponentiNecessari;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("ASSEMBLAGGIO - Mando la richiesta per trasferire i materiali disponibili nel MP in assemblaggio.");
  }

}
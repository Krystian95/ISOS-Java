package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class RichiestaVerificaMaterialiMSDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("ASSEMBLAGGIO - Mando la richiesta per verificare la presenza dei materiali nei MS.");
  }

}
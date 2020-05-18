package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaPresenzaTuttiMaterialiNecessariDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");
  boolean tuttiMaterialiNecessariPresenti;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("ASSEMBLAGGIO - Verifico di aver ricevuto tutti i materiali richiesti.");
  }

}
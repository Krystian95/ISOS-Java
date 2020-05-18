package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaMaterialePresenteMSDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  boolean singoloMaterialePresenteNelMS;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MS - Verifico la presenza del materiale nel MS.");
  }

}
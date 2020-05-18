package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaDisponibilitaComponentiAccessoriMPDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  boolean materialiPresentiNelMP;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MP - Verifico disponibilità di componenti/accessori nel MP.");
  }

}
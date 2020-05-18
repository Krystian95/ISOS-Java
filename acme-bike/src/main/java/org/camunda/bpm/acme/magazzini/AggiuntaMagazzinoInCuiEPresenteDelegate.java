package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AggiuntaMagazzinoInCuiEPresenteDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  boolean accessorioPresenteNelMagazzino;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MS - Ho trovato l'accessorio nel MS e aggiungo tale magazzino alla lista dei magazzini dov'è presente.");
  }

}
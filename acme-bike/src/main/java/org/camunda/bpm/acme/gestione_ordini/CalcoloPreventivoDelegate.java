package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CalcoloPreventivoDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  double totaleOrdine;
  double sogliaSconto;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Calcolo il preventivo.");
	  execution.setVariable("totaleOrdine", 10.0);
	  execution.setVariable("sogliaSconto", 5.0);
  }

}
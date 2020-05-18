package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioRichiestaOrdinamentoListaMagazziniDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MS - Invio la richiesta a GIS di ordinamento dei magazzini in base alla distanza geografica dal cliente.");
  }

}
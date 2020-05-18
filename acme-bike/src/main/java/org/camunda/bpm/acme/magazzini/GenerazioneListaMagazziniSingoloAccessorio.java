package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GenerazioneListaMagazziniSingoloAccessorio implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  int[] listaMagazziniSingoloAccessorio;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MS - Genero la lista completa dei magazzini dove il singolo accessorio è presente.");
  }

}
package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class GenerazioneListeMaterialiPresentiENonPresentiMPDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  int[] listaMaterialiNonPresentiMP;
  int[] listaMaterialiPresentiMP;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MP - Genero due liste: la prima con i materiali presenti nel MP e la seconda con i materiali non presenti nel MP.");
  }

}
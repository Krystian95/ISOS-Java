package org.camunda.bpm.acme.assemblaggio;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class CreazioneListaMaterialiNonPresentiMSDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("ASSEMBLAGGIO");
  int[] listaSpedizioniMaterialiNonPresentiMS;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("ASSEMBLAGGIO - Creo la lista contenente i materiali non disponibili nei MS.");
  }

}
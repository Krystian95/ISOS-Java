package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaAnticipoConSistemaBancarioDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  boolean anticipoVerificato;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Verifico l'avvenuto pagamento della quota d'anticipo con il sistema bancario.");
  }

}
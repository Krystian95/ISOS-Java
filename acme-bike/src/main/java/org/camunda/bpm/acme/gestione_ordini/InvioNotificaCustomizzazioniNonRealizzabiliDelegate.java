package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InvioNotificaCustomizzazioniNonRealizzabiliDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  String notificaCustomizzazioniNonRealizzabili;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Invio la notifica delle customizzazioni non realizzabili.");
  }

}
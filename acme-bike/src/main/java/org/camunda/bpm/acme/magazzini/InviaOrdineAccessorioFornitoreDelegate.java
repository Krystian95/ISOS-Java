package org.camunda.bpm.acme.magazzini;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class InviaOrdineAccessorioFornitoreDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("MAGAZZINI");
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("MS - Invio l'ordine al fornitore di procurarmi l'accessorio mancante presso il MS più vicino al cliente (selezionato precedentemente).");
  }

}
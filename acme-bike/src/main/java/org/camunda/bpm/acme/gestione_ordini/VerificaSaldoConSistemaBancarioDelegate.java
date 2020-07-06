package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaSaldoConSistemaBancario;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaSaldoConSistemaBancarioResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaSaldoConSistemaBancarioDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  boolean saldoVerificato;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Verifico l'avvenuto pagamento del saldo finale con il sistema bancario.");
	  
	  ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();
	  
	  String idOrdine = (String) execution.getVariable("idOrdine");
	  LOGGER.info("[VerificaAnticipoConSistemaBancarioDelegate] idOrdine = " + idOrdine);
	  
	  VerificaSaldoConSistemaBancario bodyVerificaSaldoConSistemaBancario = new VerificaSaldoConSistemaBancario();
	  bodyVerificaSaldoConSistemaBancario.setIdOrdine(idOrdine);

	  VerificaSaldoConSistemaBancarioResponse VerificaSaldoConSistemaBancario = acmeGestioneOrdini.verificaSaldoConSistemaBancario(bodyVerificaSaldoConSistemaBancario);
	  LOGGER.info("[VerificaSaldoConSistemaBancarioDelegate] Message = " + VerificaSaldoConSistemaBancario.getMessage());
	  
	  LOGGER.info("[VerificaAnticipoConSistemaBancarioDelegate] SaldoVerificato = " + VerificaSaldoConSistemaBancario.isSaldoVerificato());
	  execution.setVariable("saldoVerificato", VerificaSaldoConSistemaBancario.isSaldoVerificato());
  }

}
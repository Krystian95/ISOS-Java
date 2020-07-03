package org.camunda.bpm.acme.gestione_ordini;

import java.util.logging.Logger;

import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdini;
import org.camunda.bpm.acme.generated.gestione_ordini.ACMEGestioneOrdiniService;
import org.camunda.bpm.acme.generated.gestione_ordini.GetTransactionTokenAnticipo;
import org.camunda.bpm.acme.generated.gestione_ordini.GetTransactionTokenAnticipoResponse;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaAnticipoConSistemaBancario;
import org.camunda.bpm.acme.generated.gestione_ordini.VerificaAnticipoConSistemaBancarioResponse;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class VerificaAnticipoConSistemaBancarioDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("GESTIONE ORDINI");
  boolean anticipoVerificato;
  
  public void execute(DelegateExecution execution) throws Exception {
	  LOGGER.info("GESTIONE ORDINI - Verifico l'avvenuto pagamento della quota d'anticipo con il sistema bancario.");
	  
	  ACMEGestioneOrdini acmeGestioneOrdini = new ACMEGestioneOrdiniService().getACMEGestioneOrdiniServicePort();
	  
	  String idOrdine = (String) execution.getVariable("idOrdine");
	  LOGGER.info("[VerificaAnticipoConSistemaBancarioDelegate] idOrdine = " + idOrdine);
	  
	  VerificaAnticipoConSistemaBancario bodyVerificaAnticipoConSistemaBancario = new VerificaAnticipoConSistemaBancario();
	  bodyVerificaAnticipoConSistemaBancario.setIdOrdine(idOrdine);
	  
	  GetTransactionTokenAnticipo bodyGetTransactionTokenAnticipo= new GetTransactionTokenAnticipo();
	  bodyGetTransactionTokenAnticipo.setIdOrdine(idOrdine);
	  GetTransactionTokenAnticipoResponse GetTransactionTokenAnticipo = acmeGestioneOrdini.getTransactionTokenAnticipo(bodyGetTransactionTokenAnticipo);
	  bodyVerificaAnticipoConSistemaBancario.setTransactionToken(GetTransactionTokenAnticipo.getTransactionToken());
	  
	  VerificaAnticipoConSistemaBancarioResponse VerificaAnticipoConSistemaBancario = acmeGestioneOrdini.verificaAnticipoConSistemaBancario(bodyVerificaAnticipoConSistemaBancario);
	  LOGGER.info("[VerificaAnticipoConSistemaBancarioDelegate] Message = " + VerificaAnticipoConSistemaBancario.getMessage());
	  
	  LOGGER.info("[VerificaAnticipoConSistemaBancarioDelegate] AnticipoVerificato = " + VerificaAnticipoConSistemaBancario.isAnticipoVerificato());
	  execution.setVariable("anticipoVerificato", VerificaAnticipoConSistemaBancario.isAnticipoVerificato());
  }

}
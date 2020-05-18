package org.camunda.bpm.getstarted.loanapproval;

import java.util.logging.Logger;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.BooleanValue;
import org.camunda.bpm.engine.variable.value.IntegerValue;

public class ChangeAmountDelegate implements JavaDelegate {

  private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

  public void execute(DelegateExecution execution) throws Exception {
	boolean value=false;
	if((Double)execution.getVariable("amount")>10) {
		value=true;
	}
	BooleanValue typedDiff = Variables.booleanValue(value);
	execution.setVariable("value", typedDiff);
    LOGGER.info("Processing request by '" + execution.getVariable("customerId") + "', with amount: " + execution.getVariable("amount"));
  }

}

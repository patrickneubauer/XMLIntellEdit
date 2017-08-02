package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Collections;
import java.util.List;

public class SimpleResult extends EvalResultBase {

	public SimpleResult(Object expression) {
		this.expression = expression;
	}
	
	@Override
	public List<EvalResult> getSubResults() {
		return Collections.emptyList();
	}

	@Override
	public String getName() {
		return "Simple";
	}
	
	private Object expression;

	@Override
	public Object getExpression() {
		return expression;
	}
	
	


}

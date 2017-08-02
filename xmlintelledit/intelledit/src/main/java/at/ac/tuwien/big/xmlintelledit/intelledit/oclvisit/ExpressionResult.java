package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators.PropagateBooleanChanges.OCLBooleanState;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class ExpressionResult extends EvalResultBase implements EvalResult {

	private List<EvalResult> subResults = new ArrayList<EvalResult>();
	private OCLExpression<?> curExpr;
	
	public ExpressionResult(OCLExpression<?> expr) {
		this.curExpr = expr;
	}
	
	public ExpressionResult(OCLExpression<?> expr, Object result) {
		super(result);
		this.curExpr = expr;
	}
	
	
	public void addSubResult(EvalResult sub) {
		subResults.add(sub);
		sub.setParent(this);
	}
	
	
	public OCLExpression<?> getExpression() {
		return curExpr;
	}
	
	public String getWriteName() {
		return String.valueOf(curExpr);
	}
	
	public List<EvalResult> getSubResults() {
		return subResults;
	}
	
	public OCLBooleanState getResultAsState() {
		return OCLBooleanState.fromObject(getResult());
	}
	
	public String getExpressionName() {
		if (curExpr instanceof OperationCallExp) {
			OperationCallExp ope = (OperationCallExp)curExpr;
			Object eopo = ope.getReferredOperation();
			if (eopo instanceof EOperation) {
				EOperation eop = (EOperation)eopo;
				String opName = eop.getName();
				return opName;
			}
		}/*In any case it's just the name
		if (curExpr instanceof IterateExp) {
			IterateExp ope = (IterateExp)curExpr;
			String opName = ope.getName();
			OCLExpressionManipulator ret = iterateManipulators.get(opName);
			if (ret != null) {
				return ret.manipulate(expr, state);
			}
		}
		if (curExpr instanceof IteratorExp) {
			IteratorExp ope = (IteratorExp)curExpr;
			String opName = ope.getName();
			OCLExpressionManipulator ret = iteratorManipulators.get(opName);
			if (ret != null) {
				return ret.manipulate(expr, state);
			}
		}*/
		return curExpr.getName();
	}
	

	
	public  List<OCLBooleanState> getSubBooleanStateIfExists() {
		List<OCLBooleanState> ret = new ArrayList<>();
		for (EvalResult res: subResults) {
			ret.add(OCLBooleanState.fromObject(res.getResult()));
		}
		return ret;
	} 
	
	public Object getSubResultValue(int index) {
		return getSubResults().get(index).getResult();
	}

	@Override
	public String getName() {
		return getExpressionName();
	}

	public Object getSourceResult() {
		return getSubResultValue(0);
	}
	
	public Collection getSourceResultAsCollection() {
		return MyEcoreUtil.asCollection(getSourceResult());
	}
	
	public Collection getResultAsCollection(int index) {
		return MyEcoreUtil.asCollection(getSubResultValue(index));
	}

	public Collection convertResultToCollection(int index) {
		return MyEcoreUtil.toCollection(getSubResultValue(index));
	}


}

package at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter;

import java.util.Arrays;
import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.EqualProbabilityScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper.EvalFunc;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class ConditionalScopeParameterType<CT extends ChangeType<CT,?>, PType> implements ParameterType<CT, PType> {
	
	private Class<PType> clazz;
	private EvalFunc<CT,List<PType>> evalFunc;
	private EqualProbabilityScope<PType> scope;
	

	public ConditionalScopeParameterType(Class<PType> clazz,
			EvalFunc<CT,List<PType>> eval) {
		this.clazz = clazz;
		this.evalFunc = eval;
		this.scope = EqualProbabilityScope.fromList(Arrays.asList());
	}


	@Override
	public ValueScope<PType, ?> getDefaultScope() {
		scope.setList(evalFunc.eval(null));
		return scope;
	}

	@Override
	public ValueScope<PType, ?> getCurScope(CT self) {
		scope.setList(evalFunc.eval(self));
		return scope;
	}

	@Override
	public Class<PType> getValueClass() {
		return clazz;
	}


	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		scope.transfer(transferFunc);
	}


}

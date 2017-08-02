package at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter;

import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.EqualProbabilityScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class StaticScopeParameterType<CT extends ChangeType<CT,?>, PType> implements ParameterType<CT, PType> {
	
	private Class<PType> clazz;
	private ValueScope<PType, ?> scope;
	
	public StaticScopeParameterType(Class<PType> clazz, ValueScope<PType, ?> scope) {
		this.clazz = clazz;
		this.scope = scope;
	}
	
	public String toString() {
		return String.valueOf(scope)+(clazz==null?"":(": "+clazz.getSimpleName()));
	}
	
	public static<T extends ChangeType<T,?>, PType> StaticScopeParameterType<T,PType> 
		fromEqualProbabilityList(Class<PType> cl, List<PType> list) {
		ValueScope<PType, ?> scope = EqualProbabilityScope.fromList(list);
		return new StaticScopeParameterType<T, PType>(cl, scope);
	}
	
	public static<T extends ChangeType<T,?>, PType> Parameter<T,PType> 
	fromEqualProbabilityList(Class<PType> cl, List<PType> list, String name, int index) {
		ValueScope<PType, ?> scope = EqualProbabilityScope.fromList(list);
		return SimpleParameter.fromType(new StaticScopeParameterType<T, PType>(cl, scope),name,index);
	}

	@Override
	public ValueScope<PType, ?> getDefaultScope() {
		return scope;
	}

	@Override
	public ValueScope<PType, ?> getCurScope(CT self) {
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

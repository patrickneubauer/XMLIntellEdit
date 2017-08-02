package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

/**Der Parameter wird auch für Änderungen vrwendet, die bei Scopes auftreten ?!*/
public interface Parameter<Type extends ChangeType<Type,?>,PType> {
	
	public default ValueScope<PType,?> getDefaultScope() {
		return getType().getDefaultScope();
	}
	
	public default ValueScope<PType,?> getCurScope(Type self) {
		return getType().getCurScope(self);
	}
	
	public default Class<PType> getValueClass() {
		return getType().getValueClass();
	}
	
	public ParameterType<Type,PType> getType();
	
	public default PType getRandom(Type self) {
		ValueScope<PType, ?> scope = getCurScope(self);
		return scope.sampled();
	}
	
	public String getName();
	
	public int getIndex();
	
	public void setName(String name);
	
	public void setIndex(int index);

	public void transfer(EcoreTransferFunction transferFunc);


}

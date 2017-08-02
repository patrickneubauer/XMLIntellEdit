package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

@SuppressWarnings({"unchecked", "rawtypes"})
public abstract class ParameterHolderChangeType<Self extends ChangeType<Self,Sub>,Sub extends Change<Sub>> 
	implements ChangeType<Self, Sub> {
	
	private Parameter<? super Self,?>[] parameters;
	private Object[] values;
	private boolean[] isBound;
	private Resource resource;
	
	public void initParameters(Parameter<? super Self,?>... parameters) {
		this.parameters = parameters;
		this.values = new Object[parameters.length];
		this.isBound = new boolean[parameters.length];
	}
	
	protected ParameterHolderChangeType(ParameterHolderChangeType<Self, Sub> other) {
		copyFrom(other);
	}
			
	
	protected ParameterHolderChangeType(Resource resource, Parameter<? super Self,?>[] parameters) {
		initParameters(parameters);
		this.resource = resource;
	}
	
	public void setParameter(int index, Parameter<? super Self, ?> par) {
		assert index == par.getIndex();
		parameters[index] = par;
	}

	public abstract Self clone();

	@Override
	public List<Parameter<? super Self, ?>> getParameter() {
		return Arrays.asList(parameters);
	}

	@Override
	public <T> void bind(Parameter<? super Self, T> par, T value) {
		int index = par.getIndex();
		isBound[index] = true;
		values[index] = value;
	}
	
	@Override
	public <T> void fakebind(Parameter<? super Self, T> par, T value) {
		int index = par.getIndex();
		values[index] = value;
	}

	@Override
	public void unbind(Parameter<? super Self, ?> par) {
		int index = par.getIndex();
		isBound[index] = false;
		values[index] = null;
	}
	


	@Override
	public <T> T get(Parameter<? super Self, T> par) {
		return (T)values[par.getIndex()];
	}
	
	protected void copyFrom(ParameterHolderChangeType<? super Self, ?> other) {
		for (int i = 0; i < parameters.length; ++i) {
			parameters[i] = other.parameters[i];
			values[i] = other.values[i];
			isBound[i] = other.isBound[i];
		}
		this.resource = other.resource;
	}

	@Override
	public boolean isBound(Parameter<? super Self, ?> par) {
		int index = par.getIndex();
		return isBound[index];
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		for (int i = 0; i < isBound.length; ++i) {
			parameters[i].transfer(transferFunc);
			values[i] = ETransferrable.transfer(values[i], transferFunc);
		}
		this.resource = transferFunc.other(resource);
	}

	@Override
	public Resource getResource() {
		return resource;
	}
	
	public String getBaseString() {
		StringBuilder ret = new StringBuilder();
		ret.append("{");
		{
			boolean first = true;
			for (int i = 0; i < parameters.length; ++i) {
				Parameter par = parameters[i];
				if (par != null) {
					String name = (par.getName());
					if (name == null) {name = "Parameter"+i;}
					if (first) {first = false;} else {ret.append(", ");}
					if (isBound(i)) {
						ret.append(name+": "+values[i]);
					} else {
						ret.append(name+" [unbound]: "+par.getType());
					}
				}
			}
		}
		ret.append("}");
		return ret.toString();
	}
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(this.getClass().getSimpleName()+": ");
		ret.append(getBaseString());
		return ret.toString();
	}
}

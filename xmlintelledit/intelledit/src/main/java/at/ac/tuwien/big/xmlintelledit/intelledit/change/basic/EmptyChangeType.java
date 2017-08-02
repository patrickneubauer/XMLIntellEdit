package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change.EmptyChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Parameter;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class EmptyChangeType implements ChangeType<EmptyChangeType, EmptyChange> {
	private Resource res;
	
	public EmptyChangeType(Resource res) {
		this.res = res;
	}

	@Override
	public EmptyChangeType clone() {
		return new EmptyChangeType(res);
	}

	@Override
	public EmptyChange compile() {
		return new Change.EmptyChange(res);
	}

	@Override
	public Resource getResource() {
		return res;
	}

	@Override
	public List<Parameter<? super EmptyChangeType, ?>> getParameter() {
		return Collections.emptyList();
	}

	@Override
	public <T> void bind(Parameter<? super EmptyChangeType, T> par, T value) {
		
	}

	@Override
	public <T> void fakebind(Parameter<? super EmptyChangeType, T> par, T value) {
		
	}

	@Override
	public <T> T get(Parameter<? super EmptyChangeType, T> par) {
		return null;
	}

	@Override
	public void unbind(Parameter<? super EmptyChangeType, ?> par) {
		
	}

	@Override
	public boolean isBound(Parameter<? super EmptyChangeType, ?> par) {
		return false;
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
		res = transferFunc.other(res);
	}

}

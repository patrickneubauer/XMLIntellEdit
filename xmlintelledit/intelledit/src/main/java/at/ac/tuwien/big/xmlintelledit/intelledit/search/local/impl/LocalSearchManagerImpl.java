package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.OCLExpression;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.ChangeQuickfix;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.LocalSearchManager;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.Processor;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class LocalSearchManagerImpl<U extends Comparable<U>> implements LocalSearchManager<U>{

	

	public Processor<Change<?>> changeProcessor() {
		
	}

	@Override
	public LocalSearchManager<U> clone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transfer(EcoreTransferFunction func) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyResource getResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void abort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abortFor(EObject obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void evaluate(Change<?> change) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<ChangeQuickfix<?, ?>> getAllQuickfixes(U minQuality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<ChangeQuickfix<?, ?>> getAllQuickfixes(EObject forObj, OCLExpression forExpr, U minQuality) {
		// TODO Auto-generated method stub
		return null;
	}
}

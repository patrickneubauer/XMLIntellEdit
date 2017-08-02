package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ecore.OCLExpression;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;

public interface LocalSearchManager<U extends Comparable<U>> extends ETransferrable<LocalSearchManager<U>> {
	
	public MyResource getResource();
	
	public void abort();
	
	public void abortFor(EObject obj);
	
	public void evaluate(Change<?> change);
	
	public Set<ChangeQuickfix<?,?>> getAllQuickfixes(U minQuality);
	
	public Set<ChangeQuickfix<?,?>> getAllQuickfixes(EObject forObj, OCLExpression forExpr, U minQuality);

}

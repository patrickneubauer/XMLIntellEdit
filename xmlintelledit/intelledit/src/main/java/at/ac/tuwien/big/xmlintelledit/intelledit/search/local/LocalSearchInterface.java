package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.SearchTask;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;

public interface LocalSearchInterface extends ETransferrable<LocalSearchInterface>, SearchTask {
	
	
	public void setNeighborhood(NeighborhoodProvider provider);
	
	public NeighborhoodProvider getNeighborhood();
	
	public EObject getContext();
	
	public SimpleStream<Change<?>> getStream();
	
	public void abortSearch();
	
	public void initSearch();
	
	public boolean doSomeSearch();
	
	public boolean isFinished();

	boolean isObsolete(Resource curResource);

	public void copyFrom(LocalSearchInterface localSearchInterface, boolean reuseResource);

	Evaluable<?,?> getOriginalEvaluable();
	
	

}

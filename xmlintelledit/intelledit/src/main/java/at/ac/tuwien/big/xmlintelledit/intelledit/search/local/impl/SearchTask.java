package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import org.eclipse.emf.ecore.resource.Resource;

public interface SearchTask extends Comparable<SearchTask> {
	
	@Override
	public default int compareTo(SearchTask o) {
		return -Double.compare(getQuality(),o.getQuality());
	}
	
	public double getQuality();
	
	public void interrupt();
	
	public boolean isFinished();
	
	public boolean isObsolete(Resource curResource);
	
	public void run();
	

}

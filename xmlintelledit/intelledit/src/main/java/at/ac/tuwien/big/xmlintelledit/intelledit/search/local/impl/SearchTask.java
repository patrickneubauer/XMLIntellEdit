package at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl;

import org.eclipse.emf.ecore.resource.Resource;

public interface SearchTask extends Comparable<SearchTask> {
	
	public void run();
	
	public boolean isFinished();
	
	public boolean isObsolete(Resource curResource);
	
	public double getQuality();
	
	public default int compareTo(SearchTask o) {
		return -Double.compare(getQuality(),o.getQuality());
	}
	

}

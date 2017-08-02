package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

public interface OCLExpressionState<U extends Comparable<U>> {
	
	public LocalSearchInterface getLocalSearch();
	
	public ChangeQuickfix<?,U> getQuickfixProvider();

}

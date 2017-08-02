package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;

public interface QuickfixReference extends Comparable<QuickfixReference> {
	
	public Change<?> getChange();
	
	public String getDescription();

	public String getName();
	
	public default String getImage() {
		return "notfound.png";
	}
}

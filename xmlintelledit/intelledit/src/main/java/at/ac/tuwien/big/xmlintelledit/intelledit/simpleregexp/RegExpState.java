package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import java.util.ArrayList;
import java.util.List;

public class RegExpState {
	
	private int curCosts = Integer.MAX_VALUE;
	private List<RegExpStateSource> sources = new ArrayList<>();
	
	public int getCurCosts() {
		return curCosts;
	}
	public void setCurCosts(int curCosts) {
		this.curCosts = curCosts;
	}
	
	public List<RegExpStateSource> getSources() {
		return sources;
	}

	public void addSource(RegExpStateSource src) {
		sources.add(src);
	}
	
	
	

}

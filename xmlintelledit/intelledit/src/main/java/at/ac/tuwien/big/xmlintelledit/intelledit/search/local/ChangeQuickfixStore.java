package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import java.util.SortedSet;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;

public interface ChangeQuickfixStore<U extends Comparable<U>> {
	
	public default SortedSet<ChangeQuickfix<?, U>> getQuickfixes(U minQuality) {
		return getAllQuickfixes().tailSet(new ChangeQuickfix() {
			public void setQuality(Comparable quality) {}
			public Change<?> getChange() {return null;}
			
			@Override
			public int compareTo(Object other) {
				//Why ??
				if (other instanceof ChangeQuickfix) {
					return ((Comparable)getQuality()).compareTo(((ChangeQuickfix)other).getQuality());
				}
				return 0;
			}

			@Override
			public U getQuality() {
				return minQuality;
			}});
	}
	
	public SortedSet<ChangeQuickfix<?, U>> getAllQuickfixes();

}

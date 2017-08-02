package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import java.util.ArrayList;
import java.util.List;

public class ListUndoer implements Undoer {
	
	private List<Undoer> sub;
	
	private ListUndoer(List<Undoer> sub) {
		this.sub = sub;
	}
	
	public static ListUndoer from(Iterable<Undoer> from) {
		if (from instanceof List) {
			return new ListUndoer((List)from);
		} else {
			List<Undoer> list = new ArrayList<Undoer>();
			for (Undoer ud: from) {
				list.add(ud);
			}
			return new ListUndoer(list);
		}
	}

	@Override
	public void undo() {
		for (int i = sub.size()-1; i >= 0; --i) {
			sub.get(i).undo();
		}
	}

}

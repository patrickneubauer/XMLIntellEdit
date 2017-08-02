package at.ac.tuwien.big.xmlintelledit.intelledit.change;

public interface Undoer {
	
	public void undo();
	
	public default boolean isEmpty() {
		return false;
	}
	
	public static final Undoer EMPTY = new Undoer() {

		@Override
		public void undo() {			
		}
		
		@Override
		public boolean isEmpty() {
			return true;
		}
	
	};

}

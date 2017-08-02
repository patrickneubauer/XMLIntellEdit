package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public interface BasicChange<Type extends BasicChange<Type>> extends Change<Type> {

	@Override
	public default Iterable<BasicChange<?>> getBaseChanges() {
		return Collections.singleton(this);
	}
	
	public Undoer execute();
	
	@Override
	public default Iterable<? extends Change<?>> getSubChanges() {
		return Collections.emptySet();
	}
	
	public EObject forObject();
	
	public void normalizeMap(EObjectChangeMap changeMap);
	
	@Override
	public default void removeNonretained(Set<Change<?>> retained, Set<Change<?>> remove) {
		
	}
}

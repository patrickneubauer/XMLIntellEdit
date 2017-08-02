package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

public class FixAttemptReferenceImpl implements FixAttemptReference {
	
	private boolean isComplete;
	
	public FixAttemptReferenceImpl(EObject forObject, boolean isComplete) {
		this.forObject = forObject;
		this.isComplete = isComplete;
	}
	
	public boolean isCompleteObject() {
		return isComplete;
	}
	
	private EObject forObject;

	@Override
	public EObject forObject() {
		return forObject;
	}
	
	public boolean equals(Object other) {
		return (other != null && other.getClass() == getClass() && ((FixAttemptReferenceImpl)other).forObject() == forObject  && isComplete == ((FixAttemptReferenceImpl)other).isComplete);
	}
	
	public int hashCode() {
		return Objects.hashCode(forObject)+(isComplete?2384:94);
	}
	
	public String toString() {
		return "For "+(isComplete?"complete ":"")+" Object " + forObject;
	}

}

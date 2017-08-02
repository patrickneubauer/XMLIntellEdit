package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class FixAttemptFeatureReferenceImpl extends FixAttemptReferenceImpl implements FixAttemptFeatureReference {
	
	
	
	public FixAttemptFeatureReferenceImpl(EObject forObject, EStructuralFeature feat) {
		super(forObject,false);
		this.feat = feat;
	}
			
	
	public FixAttemptFeatureReferenceImpl(EObject forObject, EStructuralFeature feat, int ind, Object value) {
		super(forObject,false);
		this.feat = feat;
		this.ind = ind;
		this.value = value;
	}
	
	public FixAttemptFeatureReferenceImpl(EObject forObject, EStructuralFeature feat, Object value) {
		super(forObject,false);
		this.feat = feat;
		this.ind = -1;
		this.value = value;
	}
	

	private EStructuralFeature feat;
	private int ind = -1;
	private Object value; 
	

	@Override
	public EStructuralFeature getFeature() {
		return feat;
	}

	@Override
	public int getValueIndex() {
		return ind;
	}

	@Override
	public Object getValue() {
		return value;
	}
	

	public int hashCode() {
		return Objects.hashCode(forObject())+77*Objects.hashCode(feat);
	}
	
	public boolean equals(Object other) {
		if (!super.equals(other)) {
			return false;
		}
		FixAttemptFeatureReferenceImpl otherR = (FixAttemptFeatureReferenceImpl)other;
		if (otherR.feat != feat) {
			return false;
		}
		boolean exactElement = ind != -1 || value != null;
		int myInd = ind;
		Object myValue = value;
		boolean otherExactElement = otherR.ind != -1 || otherR.value != null;
		if (otherExactElement == exactElement) {
			if (!exactElement) {
				return true;
			} else {
				if (myInd == -1 && otherR.ind == -1) {
					return Objects.equals(value, otherR.value);
				}
				if (myInd != -1) {
					List l = ((List)MyEcoreUtil.getAsCollection(forObject(), getFeature()));
					return l.size() > myInd && Objects.equals(l.get(myInd),otherR.value);
				}
				if (otherR.ind != -1) {
					List l = ((List)MyEcoreUtil.getAsCollection(otherR.forObject(), otherR.getFeature()));
					return l.size() > myInd && Objects.equals(l.get(myInd),value);
				}
				throw new RuntimeException();
			}
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(super.toString());
		ret.append(": Feature "+feat.getName());
		if (ind != -1) {
			ret.append(", index " + ind);
		}
		if (value != null) {
			ret.append(", value " + value);
		}
		return ret.toString();
	}

}

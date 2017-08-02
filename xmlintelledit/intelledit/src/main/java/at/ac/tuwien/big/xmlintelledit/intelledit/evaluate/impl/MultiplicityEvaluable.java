package at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;

public class MultiplicityEvaluable implements Evaluable<MultiplicityEvaluable, MultiplicityEvaluationState> {
	private EStructuralFeature feat;
	
	public MultiplicityEvaluable(EStructuralFeature feat) {
		this.feat = feat;
	}
	

	@Override
	public MultiplicityEvaluationState getState(MyResource res, EObject eobj) {
		return new MultiplicityEvaluationState(res,this,eobj);
	}
	
	public EStructuralFeature getFeature() {
		return feat;
	}
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		ret.append(feat.getName()+": ");
		boolean first = true;
		if (feat.getLowerBound() == feat.getUpperBound()) {
			ret.append("Exactly "+feat.getLowerBound());
		} else {
			if (feat.getLowerBound() > 0) {
				ret.append("At least "+feat.getLowerBound());
				first = false;
			}
			if (feat.getUpperBound() != -1) {
				if (first) {ret.append("At most");} else {ret.append(", at most ");}
				ret.append(""+feat.getLowerBound()+" ");
			}
		}
		ret.append("value");
		if (feat.isMany()) {
			ret.append("s");
		}
		return ret.toString();
	}
	
	public String getBoundStr() {
		int lb = feat.getLowerBound();
		int up = feat.getUpperBound();
		if (lb == up) {
			return String.valueOf(lb);
		} else {
			if (up == -1) {
				return lb+"..*";
			} else {
				return lb+".."+up;
			}
		}
	}


}

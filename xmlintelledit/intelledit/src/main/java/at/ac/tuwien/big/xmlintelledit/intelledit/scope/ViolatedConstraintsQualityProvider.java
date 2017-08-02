package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicAddConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicSetConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;

public class ViolatedConstraintsQualityProvider<Solution> implements QualityProvider<Solution, DoubleQuality> {
	private EObject eobj;
	private EStructuralFeature feat;
	//-1: set
	//-2: add at position 0 etc.
	private int index;
	private ViolatedConstraintsEvaluator eval;
	
	public ViolatedConstraintsQualityProvider(EObject eobj, EStructuralFeature feat, int index) {
		this.eobj = eobj;
		this.feat = feat;
		this.index = index;
		this.eval = new ViolatedConstraintsEvaluator();
	}

	@Override
	public DoubleQuality provide(Solution sol) {
		Change<?> ch;
		if (index >= 0) {
			ch = new BasicSetConstantChange(eobj.eResource(), eobj, feat, index, sol);
		} else if (index == -1) {
			ch = new BasicSetConstantChange(eobj.eResource(), eobj, feat, sol);
		} else {
			int addPos = -2-index;
			ch = new BasicAddConstantChange(eobj.eResource(), eobj, feat, addPos, sol);
		}
		double[] dv = eval.evaluate(ch, new Evaluation());
		return new DoubleQuality(dv);
	}
	
	

}

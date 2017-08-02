package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.expressions.PropertyCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.OCLExpressionEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceAdder;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceInfo;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class PropertyCallAttemptReferenceAdder  extends AbstractSelectiveEvaluator<PropertyCallExp, Object> implements FixAttemptReferenceAdder<PropertyCallExp, Object> {

	public static final PropertyCallAttemptReferenceAdder INSTANCE = new PropertyCallAttemptReferenceAdder();

	public PropertyCallAttemptReferenceAdder() {
		super(PropertyCallExp.class, Object.class, true, null);
	}

	@Override
	public void addFixAttemptReferences(MyResource myres, FixAttempt singleAttemptForThis, EvalResult baseRes,
			ExpressionResult res, PropertyCallExp expr, Object result, FixAttemptReferenceInfo info,
			RejectingFilterManager man) {
		if (singleAttemptForThis.isFulfilled(result)) {
			return;
		}
		EStructuralFeature esf = (EStructuralFeature)expr.getReferredProperty();
		Collection srcCol = MyEcoreUtil.asCollection(res.getSubResultValue(0));
		if (singleAttemptForThis instanceof SetRemove) {
			Object toRemove = ((SetRemove)singleAttemptForThis).border();
			List<Integer> objInd = new ArrayList<>();
			
			
			for (Object obj: srcCol) {
				if (!(obj instanceof EObject)) {
					System.err.println("Property-Call to non-Object!?");
					continue;
				}
				EObject eobj = (EObject)obj;
				Collection target = MyEcoreUtil.getAsCollection(eobj,esf);
				int i = 0;
				for (Object o: target) {
					if (Objects.equals(toRemove, o)) {
						info.addFixAttemptReference(new FixAttemptFeatureReferenceImpl(eobj, esf, i, o), 
								new EvaluableReferenceImpl(new OCLExpressionEvaluable(expr,null)), singleAttemptForThis);
					}
					++i;
				}
			}
			
		} else {			
			for (Object obj: srcCol) {
				if (!(obj instanceof EObject)) {
					System.err.println("Property-Call to non-Object!?");
					continue;
				}
				EObject eobj = (EObject)obj;
				info.addFixAttemptReference(new FixAttemptFeatureReferenceImpl(eobj, esf), new EvaluableReferenceImpl(new OCLExpressionEvaluable(expr,null)),
						singleAttemptForThis);
			}
		}
	}

}

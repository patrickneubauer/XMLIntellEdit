package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.expressions.OperationCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.EvaluableReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.impl.OCLExpressionEvaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptFeatureReferenceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceAdder;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixAttemptReferenceInfo;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.RejectingFilterManager;

public class AllInstancesAttemptReferenceAdder extends AbstractSelectiveEvaluator<OperationCallExp, Collection> implements FixAttemptReferenceAdder<OperationCallExp, Collection> {

	public static final AllInstancesAttemptReferenceAdder INSTANCE = new AllInstancesAttemptReferenceAdder();

	public AllInstancesAttemptReferenceAdder() {
		super(OperationCallExp.class, Collection.class, false, "allInstances");
	}

	@Override
	public void addFixAttemptReferences(MyResource myres, FixAttempt singleAttemptForThis, EvalResult baseRes, ExpressionResult res,
			OperationCallExp expr, Collection result, FixAttemptReferenceInfo info, RejectingFilterManager man) {
		if (!singleAttemptForThis.isFulfilled(result)) {
			//Add to all containers of this object
			EClass cl = myres.getAllInstancesType((OperationCallExp)res.getExpression());
			if (cl == null) {
				return;
			}
			Collection<EStructuralFeature> features = myres.getContainersFor(cl);
			Set<EClass> sourceClasses = new HashSet<EClass>();
			for (EStructuralFeature feat: features) {
				sourceClasses.add(feat.getEContainingClass());
			}
			Set<EObject> sourceObjects = new HashSet<EObject>();
			for (EClass scl: sourceClasses) {
				sourceObjects.addAll(myres.getAllInstances(scl));
			}
			for (EObject obj: sourceObjects) {
				for (EStructuralFeature feat: features) {
					if (feat.getEContainingClass().isSuperTypeOf(obj.eClass())) {
						info.addFixAttemptReference(new FixAttemptFeatureReferenceImpl(obj,
								feat),new EvaluableReferenceImpl<>(new OCLExpressionEvaluable(expr,null)),singleAttemptForThis);	
					}
				}
			}
		}
	}
	
}

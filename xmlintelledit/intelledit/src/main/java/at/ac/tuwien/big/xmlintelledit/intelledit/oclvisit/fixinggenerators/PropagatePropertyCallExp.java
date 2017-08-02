package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.fixinggenerators;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.ocl.ecore.PropertyCallExp;

import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Decrease;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.FixAttempt;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.Increase;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeDifferent;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeEqual;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeFalse;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.MakeTrue;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAdd;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetAddAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemove;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.SetRemoveAny;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.ChangeSomethingImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetAddAnyImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetRemoveAnyImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.fixer.impl.SetRemoveImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.AbstractSelectiveEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.ExpressionResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.FixingGenerator;

public class PropagatePropertyCallExp   extends AbstractSelectiveEvaluator<PropertyCallExp, Object> 
	implements FixingGenerator<PropertyCallExp, Object>  {


	public PropagatePropertyCallExp() {
		super(PropertyCallExp.class, null, true, null);
	}

	public static PropagatePropertyCallExp INSTANCE = new PropagatePropertyCallExp();
	
	@Override
	public boolean addFixingPossibilitiesLocal(FixAttempt singleAttemptForThis, ExpressionResult res, PropertyCallExp expr,
			Object result, Collection<FixAttempt>[] fixAttemptsPerSub) {
		if (singleAttemptForThis instanceof SetRemove || singleAttemptForThis instanceof SetRemoveAny
				 || singleAttemptForThis instanceof SetAdd || singleAttemptForThis instanceof SetAddAny) {
			if (singleAttemptForThis instanceof SetAddAny) {
				for (int i = 0; i < fixAttemptsPerSub.length; ++i) {
					fixAttemptsPerSub[i].add(new SetAddAnyImpl(Integer.MAX_VALUE));
				}
			} else if (singleAttemptForThis instanceof SetRemoveAny) {
				for (int i = 0; i < fixAttemptsPerSub.length; ++i) {
					fixAttemptsPerSub[i].add(new SetRemoveAnyImpl(0));
				}
			}  else if (singleAttemptForThis instanceof SetAdd || singleAttemptForThis instanceof SetRemove) {
				boolean propertySuccess = false;
				{
					if (singleAttemptForThis instanceof SetRemove) {
						//Remove property giving that
						SetRemove sr = (SetRemove)singleAttemptForThis;
						Map<Object,Set<Object>> relevantProperties = new HashMap<>();
						EvalResult source = res.getSubResults().get(0);
						if (source.getResult() instanceof Collection) {
							List<Object> baseSource = new ArrayList<>((Collection)source.getResult());
							if (baseSource.size() != res.getSubResults().size()-1) {
								System.err.println("This doesn't work like I want");
							} else {
								for (int i = 1; i < res.getSubResults().size(); ++i) {
									Object sresult = res.getSubResults().get(i).getResult();
									Set<Object> cur = relevantProperties.get(sresult);
									if (cur == null) {
										relevantProperties.put(sresult, cur = new HashSet<Object>());
									}
									cur.add(baseSource.get(i));
								}
								Set<Object> relevant = relevantProperties.get(sr.border());
								if (relevant != null && !relevant.isEmpty()) {
									for (Object o: relevant) {
										fixAttemptsPerSub[0].add(new SetRemoveImpl(o));
									}
									propertySuccess = true;
								}
							}
						}
						  
						
					}
				} 
				if (!propertySuccess) {
					if (singleAttemptForThis instanceof SetAdd) {
						fixAttemptsPerSub[0].add(new SetAddAnyImpl(0));	
					} else {
						fixAttemptsPerSub[0].add(new SetRemoveAnyImpl(0));
					}
				}
				for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
					fixAttemptsPerSub[i].add(singleAttemptForThis);
				}
			}
			return true;
		}
		//TODO: Many und man versucht Set differences auszugleichen
		if (!expr.getReferredProperty().isMany()) {
			if (singleAttemptForThis instanceof Increase || singleAttemptForThis instanceof Decrease
					|| singleAttemptForThis instanceof MakeEqual || singleAttemptForThis instanceof MakeTrue
					|| singleAttemptForThis instanceof MakeFalse || singleAttemptForThis instanceof MakeDifferent) {
				fixAttemptsPerSub[0].add(new ChangeSomethingImpl());
				for (int i = 1; i < fixAttemptsPerSub.length; ++i) {
					//TODO: Es sollte relativ sein
					fixAttemptsPerSub[i].add(singleAttemptForThis);
				}
				return true;
			}
		}
		return false;
	}

}

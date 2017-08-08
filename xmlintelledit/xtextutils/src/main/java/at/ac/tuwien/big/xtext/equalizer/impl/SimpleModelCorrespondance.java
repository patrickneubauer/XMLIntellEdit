package at.ac.tuwien.big.xtext.equalizer.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;

public class SimpleModelCorrespondance implements ModelCorrespondance {
	
	private Map<EObject, EObject> rightToLeft = new HashMap<EObject, EObject>();
	private Map<EObject, EObject> leftToRight = new HashMap<EObject, EObject>();
	

	public Set<Entry<EObject,EObject>> getEntriesL2R() {
		return leftToRight.entrySet();
	}
	
	public Set<Entry<EObject,EObject>> getEntriesR2L() {
		return rightToLeft.entrySet();
	}
	

	@Override
	public EObject getLeftObject(EObject right) {
		return rightToLeft.get(right);
	}

	@Override
	public EObject getRightObject(EObject leftObject) {
		return leftToRight.get(leftObject);
	}
	
	public void putCorrespondence(EObject thingWhichChange, EObject thingWhichShouldBeSynchronized) {
		leftToRight.put(thingWhichChange, thingWhichShouldBeSynchronized);
		rightToLeft.put(thingWhichShouldBeSynchronized, thingWhichChange);
	}
	
	@Override
	public void clear(){
		 rightToLeft.clear();
		 leftToRight.clear();
	}

	public static SimpleModelCorrespondance fromEmfCompare(Resource xmiRes, Resource state) {
		SimpleModelCorrespondance ret = new SimpleModelCorrespondance();
		boolean resetXmiURI = false;
		if (xmiRes.getURI() == null) {
			xmiRes.setURI(URI.createURI("http://tempURI1"));
			resetXmiURI = true;
		}
		boolean resetStateUri = false;
		if (state.getURI() == null) {
			state.setURI(URI.createURI("http://tempURI2"));
			resetStateUri = true;
		}
		Comparison compare = EMFCompare.builder().build().compare(
				new DefaultComparisonScope(xmiRes, state, null));
		for (Match match: compare.getMatches()) {
			if (match.getLeft() != null && match.getRight() != null) {
				ret.putCorrespondence(match.getLeft(), match.getRight());
			}
			for (Match sub: match.getAllSubmatches()) {
				ret.putCorrespondence(sub.getLeft(), sub.getRight());
			}
		}
		if (resetXmiURI) {
			xmiRes.setURI(null);
		}
		if (resetStateUri) {
			state.setURI(null);
		}
		return ret;
	}

	public void removeResourceLess() {
		Set<EObject> remove = new HashSet<EObject>();
		for (Map<EObject,EObject> map: Arrays.asList(leftToRight,rightToLeft)) {
			for (Entry<EObject,EObject> entr: map.entrySet()) {
				EObject left = entr.getKey();
				if (left != null && left.eResource() == null) {
					remove.add(entr.getKey());
					remove.add(entr.getValue());
				}
				EObject right = entr.getValue();
				if (right != null && right.eResource() == null) {
					remove.add(entr.getKey());
					remove.add(entr.getValue());	
				}
			}
		}
		leftToRight.keySet().removeAll(remove);
		rightToLeft.keySet().removeAll(remove);
	}


}

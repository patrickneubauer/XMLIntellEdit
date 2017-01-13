package at.ac.tuwien.big.xtext.equalizer.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;

public class SimpleModelCorrespondance implements ModelCorrespondance {
	
	private Map<EObject, EObject> rightToLeft = new HashMap<EObject, EObject>();
	private Map<EObject, EObject> leftToRight = new HashMap<EObject, EObject>();

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

}

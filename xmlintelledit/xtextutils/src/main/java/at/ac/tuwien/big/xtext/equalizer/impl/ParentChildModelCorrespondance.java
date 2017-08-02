package at.ac.tuwien.big.xtext.equalizer.impl;

import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xtext.equalizer.ModelCorrespondance;

public class ParentChildModelCorrespondance implements ModelCorrespondance {
	
	private ModelCorrespondance parent;
	private ModelCorrespondance child;
	
	public ParentChildModelCorrespondance(ModelCorrespondance parent, ModelCorrespondance child) {
		this.parent = parent;
		this.child = child;
	}
	
	@Override
	public EObject getLeftObject(EObject right) {
		EObject ret = child.getLeftObject(right);
		if (ret == null) {
			ret = parent.getLeftObject(right);
		}
		return ret;
	}
	@Override
	public EObject getRightObject(EObject left) {
		EObject ret = child.getRightObject(left);
		if (ret == null) {
			ret = parent.getRightObject(left);
		}
		return ret;
	}
	@Override
	public void clear() {
		parent.clear();
		child.clear();
	}

}

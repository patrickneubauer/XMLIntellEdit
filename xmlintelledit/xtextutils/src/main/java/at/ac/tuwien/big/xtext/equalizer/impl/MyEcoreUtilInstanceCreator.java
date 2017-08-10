package at.ac.tuwien.big.xtext.equalizer.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.ac.tuwien.big.xtext.equalizer.InstanceCreator;
import at.ac.tuwien.big.xtext.util.MyEcoreUtil;

public class MyEcoreUtilInstanceCreator implements InstanceCreator {

	@Override
	public EObject createInstance(EObject cont, EClass cl) {
		return MyEcoreUtil.newInstance(cl);
	}

}

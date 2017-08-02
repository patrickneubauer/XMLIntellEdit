package at.ac.tuwien.big.xmlintelledit.intelledit.modelgen;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public abstract class EcoreModelgeneratorState {
	private MyResource curRes;
	
	public EcoreModelgeneratorState(MyResource curRes) {
		this.curRes = curRes;
	}
	
	public MyResource getCurRes() {
		return curRes;
	}
	
	public abstract void augment();

}

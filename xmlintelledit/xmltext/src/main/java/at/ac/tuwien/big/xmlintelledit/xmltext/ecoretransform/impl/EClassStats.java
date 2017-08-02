package at.ac.tuwien.big.xmlintelledit.xmltext.ecoretransform.impl;

import org.eclipse.emf.ecore.EClass;

public class EClassStats {
	private EClass c;

	private long instanceCount;
	
	public EClassStats(EClass c) {
		this.instanceCount = 0;
		this.c = c; 
	}

	public void increment () {
		++ instanceCount; 
	}
	
	public void increment (long count) {
		instanceCount += count; 
	}
	
	public long getInstanceCount (){
		return instanceCount;
	}
	
	public long getFeatureCount (){
		return c.getFeatureCount(); 
	}
	
	public long getFeatureLoad (){
		return getFeatureCount() * getInstanceCount(); 
	}
	
	@Override
	public String toString() {
		return Long.toString(instanceCount) + " " + Long.toString (getFeatureCount()); 
	}

	public String getName() {
		return c.getName();
	}
}

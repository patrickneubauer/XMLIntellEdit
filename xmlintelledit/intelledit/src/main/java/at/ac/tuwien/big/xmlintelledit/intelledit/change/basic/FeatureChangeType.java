package at.ac.tuwien.big.xmlintelledit.intelledit.change.basic;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.BasicChangeType;

public interface FeatureChangeType<Self extends FeatureChangeType<Self,BC>, BC extends FeatureChange<BC>> 
	extends BasicChangeType<Self,BC> {

}

package at.ac.tuwien.big.xtext.equalizer;

import org.eclipse.emf.ecore.EObject;

public interface ModelCorrespondance {
	
	//Left: The thing where some thing has changed and you want to propagate it to the right
	public EObject getLeftObject(EObject right);
	
	public EObject getRightObject(EObject left);

	public void clear();
	
	public default ModelCorrespondance inverse() {
		ModelCorrespondance $This = this;
		return new ModelCorrespondance() {
			
			@Override
			public EObject getRightObject(EObject left) {
				return $This.getLeftObject(left);
			}
			
			@Override
			public EObject getLeftObject(EObject right) {
				return $This.getRightObject(right);
			}
			
			@Override
			public void clear() {
				$This.clear();
			}
			
			@Override
			public ModelCorrespondance inverse() {
				return $This;
			}
		};
	}
	
}

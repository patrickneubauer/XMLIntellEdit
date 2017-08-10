package at.ac.tuwien.big.xtext.equalizer;

import org.eclipse.emf.ecore.EObject;

public interface ModelCorrespondance {
	
	ModelCorrespondance IDENTITY = new ModelCorrespondance() {
		
		@Override
		public EObject getRightObject(EObject left) {
			return left;
		}
		
		@Override
		public EObject getLeftObject(EObject right) {
			return right;
		}
		
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
	};

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
	
	public default ModelCorrespondance transitive(ModelCorrespondance other) {
		ModelCorrespondance $This = this;
		return new ModelCorrespondance() {

			@Override
			public EObject getLeftObject(EObject right) {
				return $This.getLeftObject(other.getLeftObject(right));
			}

			@Override
			public EObject getRightObject(EObject left) {
				return other.getRightObject(this.getRightObject(left));
			}

			@Override
			public void clear() {
				$This.clear();
				other.clear();
			}
			
		};
	}
	
}

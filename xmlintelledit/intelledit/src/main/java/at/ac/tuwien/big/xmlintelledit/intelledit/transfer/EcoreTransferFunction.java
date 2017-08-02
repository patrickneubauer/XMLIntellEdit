package at.ac.tuwien.big.xmlintelledit.intelledit.transfer;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;

public interface EcoreTransferFunction extends TransferFunction<EObject> {
	
		
	public Resource forwardResource();
	
	public Resource backResource();

	public default Resource other(Resource notThis) {
		Resource first = forwardResource();
		if (first == notThis) {
			return backResource();
		}
		if (backResource() == notThis) {
			return first;
		}
		System.err.println("Dual resource " + notThis+ " VS "+forwardResource()+" and "+backResource());
		return notThis;
	}
	
	public default MyResource other(MyResource notThis) {
		return MyResource.get(other(notThis.getResource()));
	}
	
	@Override
	public default EcoreTransferFunction inverse() {
		return new EcoreTransferFunction() {

			@Override
			public EObject forward(EObject from) {
				//Das funktioniert und ruft tatsächlich die "obere" TransferFunction auf ...
				return EcoreTransferFunction.this.back(from);
			}

			@Override
			public EObject back(EObject to) {
				return EcoreTransferFunction.this.forward(to);
			}

			@Override
			public Resource forwardResource() {
				return EcoreTransferFunction.this.backResource();
			}

			@Override
			public Resource backResource() {
				return EcoreTransferFunction.this.forwardResource();
			}

			@Override
			public EObject weakChangeResource(EObject base, Resource target) {
				return EcoreTransferFunction.this.weakChangeResource(base,target);
			}


			
		};
	}

	public default Object transfer(Object value) {
		return ETransferrable.transfer(value, this);
	}

	public default EObject weakChangeResource(EObject base) {
		return weakChangeResource(base,forwardResource());
	}
	
	public EObject weakChangeResource(EObject base, Resource target);
}

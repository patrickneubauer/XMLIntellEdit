package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public interface ScopePerValue<T> {
	
	public ValueScope<T, ?> getScope(T curValue);
	
	public  default<U extends Comparable<U>> ValueScope<T, U> getDynamicScope(EObject eobj, EStructuralFeature feat) {
		return new ValueScope<T,U>() {

			@Override
			public boolean contains(T sol) {
				return getScope((T)eobj.eGet(feat)).contains(sol);
			}

			@Override
			public U getQuality(T sol) {
				return (U)getScope((T)eobj.eGet(feat)).getQuality(sol);
			}

			@Override
			public Iterator<T> iterator() {
				return getScope((T)eobj.eGet(feat)).iterator();
			}

			@Override
			public boolean isFinite() {
				return getScope((T)eobj.eGet(feat)).isFinite();
			}

			@Override
			public Iterator<T> sample() {
				return getScope((T)eobj.eGet(feat)).sample();
			}

			@Override
			public void transfer(EcoreTransferFunction transferFunc) {
				getScope((T)eobj.eGet(feat)).transfer(transferFunc);
			}
			
		};
	}
	
	public static<T> ScopePerValue<T> staticScopePerValue(ValueScope<T,?> scope) {
		return (x)->scope;
	}

}

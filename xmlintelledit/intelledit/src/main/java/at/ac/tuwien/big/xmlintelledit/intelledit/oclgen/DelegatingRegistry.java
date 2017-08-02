package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EValidator.Registry;

public class DelegatingRegistry implements EValidator.Registry {

	private final EValidator.Registry delegate;

	public DelegatingRegistry(Registry delegate) {
		this.delegate = delegate;
	}

	public void clear() {
		delegate.clear();
	}

	public boolean containsKey(Object key) {
		return delegate.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return delegate.containsValue(value);
	}

	public Set<java.util.Map.Entry<EPackage, Object>> entrySet() {
		return delegate.entrySet();
	}

	public Object get(Object key) {
		return delegate.get(key);
	}

	public EValidator getEValidator(EPackage ePackage) {
		return delegate.getEValidator(ePackage);
	}

	public boolean isEmpty() {
		return delegate.isEmpty();
	}

	public Set<EPackage> keySet() {
		return delegate.keySet();
	}

	public Object put(EPackage key, Object value) {
		return delegate.put(key, value);
	}

	public void putAll(Map<? extends EPackage, ? extends Object> m) {
		delegate.putAll(m);
	}

	public Object remove(Object key) {
		return delegate.remove(key);
	}

	public int size() {
		return delegate.size();
	}

	public Collection<Object> values() {
		return delegate.values();
	}
}

package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import com.google.inject.matcher.Matcher;
import com.google.inject.spi.InjectionListener;
import com.google.inject.spi.TypeEncounter;
import com.google.inject.spi.TypeListener;

@Singleton
public class CustomRegistry extends DelegatingRegistry implements Matcher<TypeLiteral<?>>, TypeListener, InjectionListener<CustomRegistry> {

	public static final CustomRegistry INSTANCE = new CustomRegistry();

	private final Map<String, String> customPackages = new ConcurrentHashMap<String, String>();
	private final Map<String, EValidator> custom = new ConcurrentHashMap<String, EValidator>();

	@Inject
	private Provider<CustomCompositeEValidator> compositeProvider;
	
	public CustomRegistry() {
		super(EValidator.Registry.INSTANCE);
	}
	
	@Override
	public boolean matches(TypeLiteral<?> t) {
		return CustomRegistry.class == t.getRawType();
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Matcher<TypeLiteral<?>> and(Matcher<? super TypeLiteral<?>> other) {
	    return (Matcher<TypeLiteral<?>>) other.and((Matcher) this);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Matcher<TypeLiteral<?>> or(Matcher<? super TypeLiteral<?>> other) {
	    return (Matcher<TypeLiteral<?>>) other.or((Matcher) this);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public <I> void hear(TypeLiteral<I> type, TypeEncounter<I> encounter) {
		encounter.register((InjectionListener) this);
	}
	
	@Override
	public void afterInjection(CustomRegistry injectee) {
		injectee.init();
	}

	@PostConstruct
	private void init() {
		for (Map.Entry<String, String> entry : customPackages.entrySet()) {
			if (!custom.containsKey(entry.getKey())) {
				CustomCompositeEValidator validator = compositeProvider.get();
				validator.setAllowedPackagePrefix(entry.getValue());
				custom.put(entry.getKey(), validator);
			}
		}
	}
	
	public void registerCustom(String nsUri, String packagePrefix) {
		if (!customPackages.containsKey(nsUri)) {
			customPackages.put(nsUri, packagePrefix);
		}
	}

	@Override
	public void clear() {
		custom.clear();
		super.clear();
	}
	
	private String key(Object key) {
		return ((EPackage) key).getNsURI();
	}

	@Override
	public boolean containsKey(Object key) {
		return custom.containsKey(key(key)) || super.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return custom.containsValue(value) || super.containsValue(value);
	}

	@Override
	public Object get(Object key) {
		Object o = custom.get(key(key));
		if (o != null || custom.containsKey(key(key))) {
			return o;
		} else {
			return super.get(key);
		}
	}

	@Override
	public EValidator getEValidator(EPackage ePackage) {
		EValidator o = custom.get(key(ePackage));
		if (o != null || custom.containsKey(key(ePackage))) {
			return o;
		} else {
			return super.getEValidator(ePackage);
		}
	}

	@Override
	public Object put(EPackage key, Object value) {
		if (custom.containsKey(key(key))) {
			return custom.put(key(key), (EValidator) value);
		} else {
			return super.put(key, value);
		}
	}

	@Override
	public void putAll(Map<? extends EPackage, ? extends Object> m) {
		for (Map.Entry<? extends EPackage, ? extends Object> entry : m.entrySet()) {
			put(entry.getKey(), entry.getValue());
		}
	}

	@Override
	public Object remove(Object key) {
		if (custom.containsKey(key(key))) {
			return custom.remove(key(key));
		} else {
			return super.remove(key);
		}
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public int size() {
		int size = super.size();
		
		for (EPackage p : super.keySet()) {
			if (custom.containsKey(key(p))) {
				size--;
			}
		}
		
		return custom.size() + size;
	}

	@Override
	public Set<java.util.Map.Entry<EPackage, Object>> entrySet() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public Set<EPackage> keySet() {
		throw new UnsupportedOperationException("Not implemented!");
	}

	@Override
	public Collection<Object> values() {
		throw new UnsupportedOperationException("Not implemented!");
	}

}

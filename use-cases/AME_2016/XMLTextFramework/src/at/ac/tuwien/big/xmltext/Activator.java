package at.ac.tuwien.big.xmltext;

import java.util.Collections;
import java.util.Map;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class Activator implements BundleActivator {

	private static BundleContext context;
//	private static Activator INSTANCE;
//	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));


//	static BundleContext getContext() {
//		return context;
//	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	
//	public static Activator getInstance() {
//		return INSTANCE;
//	}
//	
//	public Injector getInjector(String language) {
//		synchronized (injectors) {
//			Injector injector = injectors.get(language);
//			if (injector == null) {
//				injectors.put(language, injector = createInjector(language));
//			}
//			return injector;
//		}
//	}
//
//	protected Injector createInjector(String language) {
//		try {
//			Module uiModule = getUiModule(language);
//			return Guice.createInjector(uiModule);
//		} catch (Exception e) {
//			System.out.println("Failed to create injector for " + language);
//			throw new RuntimeException("Failed to create injector for " + language, e);
//		}
//	}
//
//	protected Module getUiModule(String language) {
//		return new org.eclipse.xtext.ui.XtextUiModule(null);
//	}

}

/*
 * generated by Xtext
 */
package at.ac.tuwien.big.xmltext.library3;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class Library3UiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return at.ac.tuwien.big.xmltext.library3.ui.internal.Library3Activator.getInstance().getInjector("at.ac.tuwien.big.xmltext.library3.Library3");
	}
	
}
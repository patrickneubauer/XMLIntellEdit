package at.ac.tuwien.big.servicelang.quickfix;

import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.generator.IInheriting;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider;

public class DynamicQuickfixProviderFragment extends org.eclipse.xtext.ui.generator.quickfix.QuickfixProviderFragment {

	/**
	 * @since 2.4
	 */
	public String getQuickfixProviderSuperClassName(Grammar g) {
		return DynamicQuickfixProvider.class.getCanonicalName();
	}
	
	
}

package at.ac.tuwien.big.servicelang.quickfix;

import org.eclipse.xtext.ui.generator.contentAssist.ContentAssistFragment;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicProposalProvider;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicReferenceProposalProvider;

public class DynamicContentAssistFragment extends ContentAssistFragment {
	
	public String getSuperClassName() {
		return DynamicReferenceProposalProvider.class.getCanonicalName();				
	}


	
	public String getGenProposalProviderName() {
		return DynamicProposalProvider.class.getCanonicalName();
	}
}

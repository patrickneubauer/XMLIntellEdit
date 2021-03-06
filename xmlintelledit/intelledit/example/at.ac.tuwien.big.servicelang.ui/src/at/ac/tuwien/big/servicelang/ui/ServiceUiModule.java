/*
 * generated by Xtext
 */
package at.ac.tuwien.big.servicelang.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider;
import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickAssistProcessor;
import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicReferenceProposalProvider;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ServiceUiModule extends at.ac.tuwien.big.servicelang.ui.AbstractServiceUiModule {
	public ServiceUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	


	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider> bindIssueResolutionProvider() {
		return  at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider.class;
	}
	
	public Class<? extends AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator> bindAbstractJavaBasedContentProposalProvider$ReferenceProposalCreator() {
		return DynamicReferenceProposalProvider.class;
	}
	

	// Registers our own custom quick assist processor to support templates.
	public Class<? extends XtextQuickAssistProcessor> bindXtextQuickAssistProcessor() {
		return DynamicQuickAssistProcessor.class;
	}

	// contributed by org.eclipse.xtext.generator.builder.BuilderIntegrationFragment
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return NatureAddingAndChangingCallback.class;
	}
	
	public Class<? extends org.eclipse.xtext.ui.editor.XtextEditor> bindXtextEditor() {
		return MyXtextEditor.class;
	}
}

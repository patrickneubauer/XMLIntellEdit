package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.XtextQuickAssistProcessor;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider.ChangeIModification;

public class DynamicQuickAssistProcessor extends XtextQuickAssistProcessor {
	
	protected void sortQuickfixes(List<ICompletionProposal> quickFixes) {
		Collections.sort(quickFixes, new Comparator<ICompletionProposal>() {
			public int compare(ICompletionProposal o1, ICompletionProposal o2) {
				if (o1 instanceof ConfigurableCompletionProposal && o2 instanceof ConfigurableCompletionProposal) {
					ConfigurableCompletionProposal c1 = (ConfigurableCompletionProposal)o1;
					ConfigurableCompletionProposal c2 = (ConfigurableCompletionProposal)o2;
					Object co1 = c1.getAdditionalData("index");
					Object co2 = c2.getAdditionalData("index");
					if (co1 instanceof Integer && co2 instanceof Integer) {
						return ((Integer)co1).compareTo((Integer)co2);
					}
				}
				if (o1 instanceof PositionedQuickAssistCompletionProposal && o2 instanceof PositionedQuickAssistCompletionProposal) {
					return ((PositionedQuickAssistCompletionProposal)o1).compareTo((PositionedQuickAssistCompletionProposal)o2);
				}
				return 0;
			}
		});
	}
	
	@Override
	protected ICompletionProposal create(Position posisition, IssueResolution resolution) {
		IModification mod = resolution.getModification();
		if (mod instanceof ChangeIModification) {
			return new PositionedQuickAssistCompletionProposal((ChangeIModification)mod, posisition, resolution, getImage(resolution));
		} else {
			return super.create(posisition, resolution);
		}
	}

}

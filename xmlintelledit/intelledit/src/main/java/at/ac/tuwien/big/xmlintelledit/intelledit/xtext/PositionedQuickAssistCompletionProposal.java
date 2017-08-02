package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import org.eclipse.jface.text.Position;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.ui.editor.quickfix.QuickAssistCompletionProposal;

import at.ac.tuwien.big.xmlintelledit.intelledit.xtext.DynamicQuickfixProvider.ChangeIModification;

public class PositionedQuickAssistCompletionProposal extends QuickAssistCompletionProposal implements Comparable<PositionedQuickAssistCompletionProposal> {
	
	private int index;
	private ChangeIModification mod;

	public PositionedQuickAssistCompletionProposal(ChangeIModification mod, Position pos, IssueResolution resolution, Image image) {
		super(pos, resolution, image);
		this.mod = mod;
	}
	
	public int getIndex() {
		return index;
	}

	@Override
	public int compareTo(PositionedQuickAssistCompletionProposal o) {
		return mod.compareTo(o.mod);
	}
	

}

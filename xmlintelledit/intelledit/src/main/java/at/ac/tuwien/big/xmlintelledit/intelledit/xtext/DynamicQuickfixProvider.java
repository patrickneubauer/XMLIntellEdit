package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
//import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.AbstractDeclarativeQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolution;
import org.eclipse.xtext.validation.Issue;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xtext.util.DocumentChanger;

public class DynamicQuickfixProvider extends org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider {
	
	
	
//	private Set<QuickfixReference,Long> providedFixes = 
	
	public boolean displayChange(Change<?> ch) {
		return true;
	}
	
	

	
	  public static void modify(IXtextDocument doc, Change<?> ch) {
		  	DocumentChanger.modify(doc.get(),doc,()->ch.execute(),ch.forResource());
	  }
	  
	  
	  public static class ChangeIModification implements IModification, Comparable<ChangeIModification> {
		  public QuickfixReference ref;
		  
		  public ChangeIModification(QuickfixReference ref) {
			  this.ref = ref;
		 }
	
			@Override
			public void apply(IModificationContext context) throws Exception {
				Change<?> ch = ref.getChange();
				/*if (element.eResource() != ch.forResource()) {
					ch = ch.clone();
					ch.transfer(new URIBasedEcoreTransferFunction(ch.forResource(),element.eResource()));
				}*/
				
				modify(context.getXtextDocument(), ch);
			}

			@Override
			public int compareTo(ChangeIModification o) {
				return ref.compareTo(o.ref);
			}
		   
	  }
	  
	@Override
	public List<IssueResolution> getResolutions(final Issue issue) {
		if (issue.getData().length != 3) {
			return Collections.emptyList();
		}
		DynamicValidator validator = DynamicValidator.getValidator(issue.getData()[0]);
		if (validator == null) {
			return Collections.emptyList();
		}
		boolean knowIssue = validator.knowIssue(issue);
		ExpressionQuickfixInfo<?> qi = validator.getQuickfixes(issue.getData()[1]);;
		List<QuickfixReference> curQuickfixes = qi.getQuickfix(issue.getData()[2],issue.getUriToProblem().toString());
		List<IssueResolution> resList = new ArrayList<IssueResolution>(curQuickfixes.size());
		boolean displayed = false;
		for (QuickfixReference ref: curQuickfixes) {
			
			displayed = true;
			if (validator.displayedReferences().put(ref, true) != null) {
				continue;
			}
			if (!displayChange(ref.getChange())) {
				continue;
			}
			IModificationContext context = getModificationContextFactory().createModificationContext(issue);
			/*ISemanticModification smod = new ISemanticModification() {
				
				@Override
				public void apply(EObject element, IModificationContext context) throws Exception {
					
					Change<?> ch = ref.getChange();
					if (element.eResource() != ch.forResource()) {
						ch = ch.clone();
						ch.transfer(new URIBasedEcoreTransferFunction(ch.forResource(),element.eResource()));
					}
					ch.execute();
					
					
				}
				
				write class to have value things ...
			};
			SemanticModificationWrapper modificationWrapper = new SemanticModificationWrapper(issue.getUriToProblem(), smod);*/
			IModification modification = new ChangeIModification(ref);
			//Ich hoffe, wenn ich das übreschreibe passt es
			IssueResolution res = new IssueResolution(ref.getName(), 
					ref.getDescription(), ref.getImage(), context,  modification);	
			resList.add(res);
		}
		if (!displayed) {
			//resList.add(new EmptyQuickfixReference());
		}
		return resList;
	}
	
	public Iterable<Method> collectMethods(Class<? extends AbstractDeclarativeQuickfixProvider> cl, String issueCode) {
		
		return super.collectMethods(cl, issueCode);
	}


	@Override
	public boolean hasResolutionFor(String issueCode) {
		//TODO: Stimmt natürlich nicht immer, hängt vom Issue ab ...
		return (issueCode != null && issueCode.startsWith("DYNISSUE_")) || super.hasResolutionFor(issueCode);
	}
	
	@Fix(value = "")
	public List<IssueResolution> fixSomething(Issue issue) {
		return getResolutions(issue);
	}

	

}

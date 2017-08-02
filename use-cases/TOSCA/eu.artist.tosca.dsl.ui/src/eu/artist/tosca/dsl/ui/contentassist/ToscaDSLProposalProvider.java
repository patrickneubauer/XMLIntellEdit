package eu.artist.tosca.dsl.ui.contentassist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.inject.Inject;

public class ToscaDSLProposalProvider extends
		AbstractToscaDSLProposalProvider {

	@Inject
	private ITypesProposalProvider typeProposalProvider;
	
	@Override
	public void complete_IDREF(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {

		List<String> identifierAttributeList = new ArrayList<String>();
		
		EObject rootModel = context.getRootModel();
		List<EObject> rootModelList = new ArrayList<EObject>();
		rootModelList.add(rootModel);
		
		// iterate model tree to find identifiers
		for(TreeIterator<?> iter = EcoreUtil2.getAllProperContents(rootModelList, true); iter.hasNext();) {
			EObject eObject = (EObject) iter.next();
		
			for (EAttribute eAttr : eObject.eClass().getEAllAttributes()) {
				if (eAttr.getEType().getName().equals("ID") && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().equals("[]") && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().equals("null") && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().contains(" ")) {
					identifierAttributeList.add((String)eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())));
					System.out.println("ID found --> " + eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())));
				}
			}			
		}
		
		// add list of identifier names to acceptor (could be done immediately above..)
		for (Iterator<String> iter = identifierAttributeList.iterator(); iter.hasNext();) {
			String identifierName = iter.next();			
			ICompletionProposal tempCompletionProposal = createCompletionProposal(identifierName, context);
			acceptor.accept(tempCompletionProposal);
			System.out.println("ID added --> " + identifierName);
		}
	}
	
//	public void complete_QName(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		List<String> stringProposalList = new ArrayList<String>();
//		
//		EObject rootModel = context.getRootModel();
//		List<EObject> rootModelList = new ArrayList<EObject>();
//		rootModelList.add(rootModel);
//		
//		// iterate model tree to find identifiers
//		for(TreeIterator<?> iter = EcoreUtil2.getAllProperContents(rootModelList, true); iter.hasNext();) {
//			EObject eObject = (EObject) iter.next();
//		
//			for (EAttribute eAttr : eObject.eClass().getEAllAttributes()) {
//				if (eAttr.getEType().getName().equals("QName") /* && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().equals("[]") && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().equals("null") && !eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())).toString().contains(" ")*/) {
//					stringProposalList.add((String)eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())));
//					System.out.println("QName found --> " + eObject.eGet(eObject.eClass().getEStructuralFeature(eAttr.getName())));
//				}
//			}			 
//		}
//		
//		// add list of identifier names to acceptor (could be done immediately above..)
//		for (Iterator<String> iter = stringProposalList.iterator(); iter.hasNext();) {
//			String identifierName = iter.next();			
//			ICompletionProposal tempCompletionProposal = createCompletionProposal(identifierName, context);
//			acceptor.accept(tempCompletionProposal);
//			System.out.println("QName added --> " + identifierName);
//		}
//	}
	
}

package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.common.ui.contentassist.TerminalsProposalProvider;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ParameterType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.Undoer;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.AbstractFixedFeatureChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicAddConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicSetConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedAddConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedReplaceConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.FixedSetConstantChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.Evaluable;
import at.ac.tuwien.big.xmlintelledit.intelledit.evaluate.EvaluationState;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreMapTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;
import at.ac.tuwien.big.xtext.util.IteratorUtils;

public class DynamicProposalProvider extends TerminalsProposalProvider {
	
	public static final int MAX_ASSIGNMENTS = 20;
	
	public static final int MAX_VALUE_FULLTRIES = 100;
	public static final int MAX_VALUE_TRIES = 200;
	
	
	@Override
	public void completeAssignment(Assignment assignment, ContentAssistContext contentAssistContext,
			ICompletionProposalAcceptor acceptor) {
		Resource res = contentAssistContext.getResource();
		MyResource myRes = MyResource.get(res);
		EObject curObj = contentAssistContext.getCurrentModel();
		if (curObj == null || curObj.eClass() == null) {
			super.completeAssignment(assignment, contentAssistContext, acceptor);
			return;
		}
		String featureName = assignment.getFeature();
		EStructuralFeature feat = curObj.eClass().getEStructuralFeature(featureName);
		if (feat == null || !(feat instanceof EAttribute)) {
			super.completeAssignment(assignment, contentAssistContext, acceptor);
			return;
		}
		
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		MyResource originalRes = myRes;
		Resource clonedRes = originalRes.clone(copier);
		EObject context = copier.get(curObj);
		EcoreTransferFunction transferFunc = new EcoreMapTransferFunction(originalRes.getResource(),
				clonedRes, copier);
		ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
		
		EAttribute attr = (EAttribute)feat;
		
		
		INode prevNode = contentAssistContext.getCurrentNode();
		List<INode> inodes = NodeModelUtils.findNodesForFeature(curObj, feat);;
		
		int myIndex = inodes.indexOf(prevNode);
		boolean haveQuotes = false;
		boolean haveEndQuotes = false;
		String prefix = contentAssistContext.getPrefix();
		if (prefix.startsWith("\"")) {
			haveQuotes = true;
			if (prefix.endsWith("\"") && prefix.length()>1) {
				haveEndQuotes = true;
				prefix = prefix.substring(1,prefix.length()-1);
			} else {
				prefix = prefix.substring(1);
			}
		}
		
		ParameterType par = (feat.isMany() || curObj == null)?myRes.defaultGenerator(feat):myRes.defaultModifier(feat, curObj);
		
		int allValueTries = 0;
		int fullValueTries = 0;
		Evaluation wr = new Evaluation();
		Map<Object, double[]> map = new HashMap<>();
		
		//First try something ...
		{
			List<ChangeType<?, ?>> directFixing = new ArrayList<ChangeType<?,?>>();
			Undoer undoer = null;
			try {
				if (myIndex == -1) {
					//Add
					undoer = new BasicAddConstantChange(clonedRes, context, attr, par.getDefaultScope().iterator().next()).execute();
				}
				MyResource myCloned = MyResource.get(clonedRes);
				
				Set<ChangeType<?, ?>> directFixingA = new HashSet<>();
				//Check things
				for (Evaluable ev: myRes.getApplicableEvaluators(curObj)) {
					EvaluationState state = ev.getState(myCloned, context);
					state.initParam();
					Object evBasic = state.evaluateBasic();
					if (state.getQuality() >= 1.0) {continue;}
					state.evaluateFull();
					EvalResult result = state.getResult();
					directFixingA.addAll(result.getAllDirectFixingActions());
				}
				for (ChangeType<?, ?> type: directFixingA) {
					if (type instanceof AbstractFixedFeatureChangeType) {
						AbstractFixedFeatureChangeType fct = (AbstractFixedFeatureChangeType)type;
						if (fct instanceof FixedReplaceConstantChangeType || fct instanceof FixedSetConstantChangeType
								|| (fct instanceof FixedAddConstantChangeType && myIndex == -1)
								) {
							if (attr == fct.getFeature()) {
								directFixing.add(fct);
							}
						}
					}
				}
				Iterator<Change<?>> iter = IteratorUtils.balancedIterate(directFixing.iterator(), (x)->x.iterateWithMissing());
				
				for (Change<?> ch: (Iterable<Change<?>>)()->iter) {
					if (++allValueTries > MAX_VALUE_TRIES) {
						break;
					}
					if (ch instanceof BasicSetConstantChange) {
						BasicSetConstantChange bsc = (BasicSetConstantChange)ch;
						String str = String.valueOf(bsc.getValue());
						if (!str.startsWith(prefix)) {
							continue;
						}
						if (++fullValueTries > MAX_VALUE_FULLTRIES) {
							break;
						}
						double quality[] = eval.evaluate(ch,wr);
						String val = String.valueOf(bsc.getValue());
						if (haveQuotes) {
							val = "\""+val.replace("\\", "\\\\").replace("\"", "\\\"")+(haveEndQuotes?"\"":"");
						}
						map.put(val,quality);
						
					}
				}
				allValueTries = 0;
			} finally {
				if (undoer != null) {	
					undoer.undo();
				}
			}
			
		}
		
		
		if (par != null && par.getDefaultScope() != null) {
			for (Object o: par.getDefaultScope()) {
				if (++allValueTries > MAX_VALUE_TRIES) {
					break;
				}
				String str = String.valueOf(o);
				if (!str.startsWith(prefix)) {
					continue;
				}
				if (++fullValueTries > MAX_VALUE_FULLTRIES) {
					break;
				}
				double quality[] = eval.evaluate(new BasicSetConstantChange(clonedRes,context,attr,myIndex,o),wr);
				String val = String.valueOf(str);
				if (haveQuotes) {
					val = "\""+val.replace("\\", "\\\\").replace("\"", "\\\"")+(haveEndQuotes?"\"":"");
				}
				map.put(val,quality);
			}
		} else {
			System.err.println("Could not provide proposals for "+attr);
		}
		List<Object> possible = new ArrayList<>();
		possible.addAll(map.keySet());
		Collections.sort(possible, new Comparator<Object>() {

			@Override
			public int compare(Object o1, Object o2) {
				double[] o1d = map.get(o1);
				double[] o2d = map.get(o2);
				int ret = -Double.compare(o1d[2],o2d[2]);
				if (ret == 0) {
					ret = -Double.compare(o1d[0],o2d[0]);
				}
				if (ret == 0) {
					ret = Double.compare(o1d[1],o2d[1]);
				}
				return ret;
			}
		});
		int curAssignments = 0;
		for (Object o: possible) {
			String proposalText = String.valueOf(o);
			double[] dv = map.get(o);
			String displayTextNoCost = proposalText + " - " + featureName + " - quality " +dv[0]+", cost "+dv[1];
			String displayTextCost = Change.costToInvisible(curAssignments, true)+displayTextNoCost;
			ICompletionProposal proposal = createCompletionProposal(proposalText, displayTextNoCost, null, contentAssistContext);
			if (proposal instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal configurable = (ConfigurableCompletionProposal) proposal;
				configurable.setSelectionStart(configurable.getReplacementOffset());
				configurable.setSelectionLength(proposalText.length());
				configurable.setAutoInsertable(false);
				configurable.setSimpleLinkedMode(contentAssistContext.getViewer(), '\t', ' ');
				configurable.setAdditionalData("quality", dv[0]);
				configurable.setAdditionalData("cost", dv[1]);
				configurable.setAdditionalData("index", curAssignments);
				configurable.setDisplayString(displayTextNoCost);
				configurable.setPriority(9999-curAssignments);
			}
			acceptor.accept(proposal);
			if (++curAssignments > MAX_ASSIGNMENTS) {
				break;
			}
		}
		if (possible.isEmpty()) {
			super.completeAssignment(assignment, contentAssistContext, acceptor);
		}
	}
	
	
	//lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
	
	
	

}

package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.AbstractJavaBasedContentProposalProvider;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.basic.BasicAddConstantChange;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.Evaluation;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.ViolatedConstraintsEvaluator;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreMapTransferFunction;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class DynamicReferenceProposalProvider extends AbstractJavaBasedContentProposalProvider.ReferenceProposalCreator {
	
	
	public void lookupCrossReference(IScope scope, EObject model, EReference reference,
			ICompletionProposalAcceptor acceptor, Predicate<IEObjectDescription> filter,
			Function<IEObjectDescription, ICompletionProposal> proposalFactory) {
		Function<IEObjectDescription, ICompletionProposal> wrappedFactory = getWrappedFactory(model, reference, proposalFactory);
		Iterable<IEObjectDescription> candidates = queryScope(scope, model, reference, filter);
		EcoreUtil.Copier copier = new EcoreUtil.Copier();
		MyResource originalRes = MyResource.get(model.eResource());
		Resource clonedRes = originalRes.clone(copier);
		EObject context = copier.get(model);
		EcoreTransferFunction transferFunc = new EcoreMapTransferFunction(originalRes.getResource(),
				clonedRes, copier);
		ViolatedConstraintsEvaluator eval = new ViolatedConstraintsEvaluator();
		Map<IEObjectDescription, double[]> quality = new HashMap<IEObjectDescription, double[]>();
		Evaluation wr = new Evaluation();
		for (IEObjectDescription candidate : candidates) {
			if (!filter.apply(candidate)) {
				continue;
			}
			EObject eobj = candidate.getEObjectOrProxy();
			quality.put(candidate,eval.evaluate(new BasicAddConstantChange(clonedRes,
					context, reference, copier.get(eobj)), wr));
		}
		List<IEObjectDescription> allObjs = new ArrayList<IEObjectDescription>(quality.keySet());
		allObjs.sort(new Comparator<IEObjectDescription>() {

			@Override
			public int compare(IEObjectDescription o1, IEObjectDescription o2) {
				double[] o1d = quality.get(o1);
				double[] o2d = quality.get(o2);
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
		int ind = 0;
		for (IEObjectDescription candidate: allObjs) {
			if (!acceptor.canAcceptMoreProposals())
				return;
			ICompletionProposal prop = wrappedFactory.apply(candidate);
			if (prop instanceof ConfigurableCompletionProposal) {
				ConfigurableCompletionProposal conf = (ConfigurableCompletionProposal)prop;
				conf.setAdditionalData("index", ind);
				conf.setDisplayString(conf.getDisplayString()+" - Quality " + quality.get(candidate)[0]+", Cost "+quality.get(candidate)[1]+"");
				conf.setPriority(9999-ind);
			}
			acceptor.accept(prop);
			++ind;
		}
	}
}

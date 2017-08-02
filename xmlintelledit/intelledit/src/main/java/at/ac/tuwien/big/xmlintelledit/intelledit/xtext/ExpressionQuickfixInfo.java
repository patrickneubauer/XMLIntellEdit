package at.ac.tuwien.big.xmlintelledit.intelledit.xtext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.Proposal.Source;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.ProposalList;
import at.ac.tuwien.big.xmlintelledit.intelledit.proposal.impl.ProposalListImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.LocalSearchInterface;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.LocalSearchInterfaceImpl;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.URIBasedEcoreTransferFunction;

public  class ExpressionQuickfixInfo<T extends Comparable<T>> {
	private String exprid;
	private Map<String,ProposalList<T,?>> subIdToChangeMap = new WeakHashMap<>();
	private DynamicValidatorIFace valid;

	public ExpressionQuickfixInfo(DynamicValidatorIFace valid, String id) {
		this.exprid = id;
		this.valid = valid;
	}
	 
	public synchronized ProposalList<T,?> getChanges(String subId) {
		return subIdToChangeMap.getOrDefault(subId,new ProposalListImpl());
	}
	
	public synchronized List<QuickfixReference> getQuickfix(String subId, String contextUri) {
		ProposalList<T,?> changes = getChanges(subId);
		List<QuickfixReference> ret = new ArrayList<QuickfixReference>();
		
		for (Proposal<T,?> prop: changes) {
			Change<?> change = prop.getChange();
			
			if (!prop.getChange().forResource().equals(valid.getMainResource())) {
				URIBasedEcoreTransferFunction tf = new URIBasedEcoreTransferFunction(prop.getChange().forResource(), valid.getMainResource());
				change = change.transfered(tf);
			}
			
			String str = "";
			/*if (prop.getQuality() instanceof Number) {
				str = Change.costToInvisible(((Number)prop.getQuality()).doubleValue(), false);
			}
			String invisibleString = Change.costToInvisible(prop.getCurQuality(), false)+str+Change.costToInvisible(prop.getCosts(),true);*/
			String imageStr = prop.getSource()==Source.LOCAL?QuickfixReferenceImpl.LOCAL_IMAGE:QuickfixReferenceImpl.GENETIC_IMAGE;
			ret.add(new QuickfixReferenceImpl(change.getName(contextUri),
				change.toString(contextUri)+", \n\t\tLocal-Score: " + prop.getCurQuality()+", Score: " + prop.getQuality()+", Cost "+prop.getCosts(), change,
				new double[]{-prop.getCurQuality(),-(Double)prop.getQuality(),prop.getCosts()},imageStr));
		}
		return ret;
	}
	
	public synchronized void addChange(String id, Proposal<T,?> prop) {
		ProposalList<T,?> cur = subIdToChangeMap.get(id);
		if (cur == null) {
			subIdToChangeMap.put(id, cur = new ProposalListImpl());
		}
		((ProposalList)cur).addProposal(prop);
	}
	
	public String getId() {
		return exprid;
	}	

	public synchronized void clear() {
		subIdToChangeMap.clear();
	}

	
	private LocalSearchInterface[] searches = new LocalSearchInterfaceImpl[0];
	
	public LocalSearchInterface[] getSearches() {
		return searches;
	}
	
	public boolean[] resetOrReeinit(Resource curResource, LocalSearchInterface... newSearches) {
		if (searches.length < newSearches.length) {
			searches = Arrays.copyOf(searches, newSearches.length);
		}
		boolean[] ret = new boolean[searches.length];
		for (int i = 0; i < Math.min(searches.length,newSearches.length); ++i) {
			if (searches[i] == null) {
				searches[i]  = newSearches[i];
				ret[i] = true;
			} else if (searches[i].isObsolete(curResource)) {
				searches[i].abortSearch();
				searches[i]  = newSearches[i];
				newSearches[i].copyFrom(searches[i],false);
				ret[i] = true;
			} else {
				searches[i].abortSearch();
				searches[i]  = newSearches[i];
				newSearches[i].copyFrom(searches[i],true);
				ret[i] = true;
			}
		}
		return ret;
	}
	
	public void finalize() throws Throwable {
		super.finalize();
		for (int i = 0; i < searches.length; ++i) {
			if (searches[i] != null) {
				searches[i].abortSearch();
			}
		}
	}

	public boolean hasAnyChanges() {
		boolean ret = false;
		for (ProposalList list: subIdToChangeMap.values()) {
			ret|= list.iterator().hasNext();
		}
		return ret;
	}

	public void removeProposal(Proposal p) {
		for (ProposalList pl: subIdToChangeMap.values()) {
			pl.removeProposal(p);
		}
	}

}

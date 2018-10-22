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

	private LocalSearchInterface[] searches = new LocalSearchInterfaceImpl[0];
	 
	public ExpressionQuickfixInfo(DynamicValidatorIFace valid, String id) {
		this.exprid = id;
		this.valid = valid;
	}
	
	public synchronized void addChange(String id, Proposal<T,?> prop) {
		System.out.println("Add change: "+this.exprid+"::"+id+": "+prop);
		ProposalList<T,?> cur = this.subIdToChangeMap.get(id);
		if (cur == null) {
			this.subIdToChangeMap.put(id, cur = new ProposalListImpl());
		}
		((ProposalList)cur).addProposal(prop);
	}
	
	public synchronized void clear() {
		this.subIdToChangeMap.clear();
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		for (int i = 0; i < this.searches.length; ++i) {
			if (this.searches[i] != null) {
				this.searches[i].abortSearch();
			}
		}
	}	

	public synchronized ProposalList<T,?> getChanges(String subId) {
		return this.subIdToChangeMap.getOrDefault(subId,new ProposalListImpl());
	}

	
	public String getId() {
		return this.exprid;
	}
	
	public synchronized List<QuickfixReference> getQuickfix(String subId, String contextUri) {
		ProposalList<T,?> changes = getChanges(subId);
		List<QuickfixReference> ret = new ArrayList<>();
		
		for (Proposal<T,?> prop: changes) {
			Change<?> change = prop.getChange();
			
			if (!prop.getChange().forResource().equals(this.valid.getMainResource())) {
				URIBasedEcoreTransferFunction tf = new URIBasedEcoreTransferFunction(prop.getChange().forResource(), this.valid.getMainResource());
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
	
	public LocalSearchInterface[] getSearches() {
		return this.searches;
	}
	
	public boolean hasAnyChanges() {
		boolean ret = false;
		for (ProposalList list: this.subIdToChangeMap.values()) {
			ret|= list.iterator().hasNext();
		}
		return ret;
	}

	public void removeProposal(Proposal p) {
		for (ProposalList pl: this.subIdToChangeMap.values()) {
			pl.removeProposal(p);
		}
	}

	public boolean[] resetOrReeinit(Resource curResource, LocalSearchInterface... newSearches) {
		if (this.searches.length < newSearches.length) {
			this.searches = Arrays.copyOf(this.searches, newSearches.length);
		}
		boolean[] ret = new boolean[this.searches.length];
		for (int i = 0; i < Math.min(this.searches.length,newSearches.length); ++i) {
			if (this.searches[i] == null) {
				this.searches[i]  = newSearches[i];
				ret[i] = true;
			} else if (this.searches[i].isObsolete(curResource)) {
				this.searches[i].abortSearch();
				this.searches[i]  = newSearches[i];
				newSearches[i].copyFrom(this.searches[i],false);
				ret[i] = true;
			} else {
				this.searches[i].abortSearch();
				this.searches[i]  = newSearches[i];
				newSearches[i].copyFrom(this.searches[i],true);
				ret[i] = true;
			}
		}
		return ret;
	}

}

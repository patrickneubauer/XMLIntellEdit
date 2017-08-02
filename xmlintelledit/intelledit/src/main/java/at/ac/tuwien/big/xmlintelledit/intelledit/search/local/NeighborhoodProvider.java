package at.ac.tuwien.big.xmlintelledit.intelledit.search.local;

import static at.ac.tuwien.big.xmlintelledit.intelledit.search.local.NeighborhoodProvider.randomize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit.EvalResult;
import at.ac.tuwien.big.xmlintelledit.intelledit.search.local.impl.LocalSearchPartialSolution;
import at.ac.tuwien.big.xtext.util.IteratorUtils;
import at.ac.tuwien.big.xtext.util.IteratorUtils.SimpleFunction;

public interface NeighborhoodProvider {

	public static<T> List<T> randomize(Collection<T> from) {
		List<T> ret = new ArrayList<T>(from);
		Collections.shuffle(ret);
		return ret;
	}
	
	static NeighborhoodProvider DEFAULT_DIRECTFIX = new NeighborhoodProvider() {
		
		@Override
		public Iterable<? extends Change<?>> getNeighbours(LocalSearchPartialSolution x) {
			Iterator<ChangeType<?,? extends Change<?>>> ctIter = x.getDirectFixes().iterator();
			SimpleFunction<ChangeType<?,? extends Change<?>>, Iterator<? extends Change<?>>> iterateFunc = new SimpleFunction<ChangeType<?,? extends Change<?>>,  Iterator<? extends Change<?>>>() {

				@Override
				public Iterator<? extends Change<?>> applyTo(ChangeType<?, ? extends Change<?>> x) {
					return x.iterateWithMissing();
				}
			};
			return ()->IteratorUtils.<ChangeType<?,?>,Change<?>>balancedIterate(x.getDirectFixes().iterator(),iterateFunc);
		}
		@Override
		public Iterable<? extends Change<?>> sampleNeighbours(LocalSearchPartialSolution x) {
			SimpleFunction<ChangeType<?,? extends Change<?>>, Iterator<? extends Change<?>>> iterateFunc = new SimpleFunction<ChangeType<?,? extends Change<?>>,  Iterator<? extends Change<?>>>() {

				@Override
				public Iterator<? extends Change<?>> applyTo(ChangeType<?, ? extends Change<?>> x) {
					return x.sampleWithMissing();
				}
			};
			return ()->IteratorUtils.<ChangeType<?,?>,Change<?>>balancedIterate(randomize(x.getDirectFixes()).iterator(),iterateFunc);
		}
		
		@Override
		public List<ChangeType<?,? extends Change<?>>> getBaseFixes(EvalResult res) {
			return res.getAllDirectFixingActions();
		}
	};
	
	static NeighborhoodProvider DEFAULT_LOCALSEARCH = new NeighborhoodProvider() {
		
		@Override
		public Iterable<? extends Change<?>> getNeighbours(LocalSearchPartialSolution x) {
			Iterator<Change<?>> iter = IteratorUtils.<ChangeType<?,?>,Change<?>>balancedIterate(x.getDirectFixes().iterator(), (y)->y.sampleWithMissing());
			return ()->(Iterator)iter;
		}
		

		@Override
		public Iterable<? extends Change<?>> sampleNeighbours(LocalSearchPartialSolution x) {
			
			Iterator<Change<?>> iter = IteratorUtils.<ChangeType<?,?>,Change<?>>balancedIterate(randomize(x.getDirectFixes()).iterator(), (y)->y.sampleWithMissing());
			return ()->(Iterator)iter;
		}
		
		@Override
		public List<ChangeType<?,? extends Change<?>>> getBaseFixes(EvalResult res) {
			return res.getAllFixingActions();
		}
	};
	

	public Iterable<? extends Change<?>> getNeighbours(LocalSearchPartialSolution curSol);
	
	public Iterable<? extends Change<?>> sampleNeighbours(LocalSearchPartialSolution curSol);
	
	public List<ChangeType<?,? extends Change<?>>> getBaseFixes(EvalResult res);
}

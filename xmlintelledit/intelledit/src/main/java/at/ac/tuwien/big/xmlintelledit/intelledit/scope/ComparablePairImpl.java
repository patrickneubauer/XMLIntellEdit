package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class ComparablePairImpl<T,U extends Comparable<U>> implements ComparablePair<T, U> {
	private T solution;
	private U quality;
	
	public ComparablePairImpl(T solution, U quality) {
		this.solution = solution;
		this.quality = quality;
	}


	@Override
	public T getSolution() {
		return solution;
	}

	@Override
	public U getQuality() {
		return quality;
	}


	@Override
	public ComparablePairImpl<T,U> clone() {
		return new ComparablePairImpl<>(solution, quality);
	}


	@Override
	public void transfer(EcoreTransferFunction func) {
		solution = (T)ETransferrable.transfer(solution, func);
		quality = (U)ETransferrable.transfer(quality, func);
		
	}

}

package at.ac.tuwien.big.xmlintelledit.intelledit.global;

import java.util.Iterator;
import java.util.Random;

import org.moeaframework.core.Variable;

import com.google.common.base.Objects;

import at.ac.tuwien.big.xmlintelledit.intelledit.change.Change;
import at.ac.tuwien.big.xmlintelledit.intelledit.change.ChangeType;
import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class MOEAChangeVariable implements Variable {
	
	private ChangeType<?, ?> curChangeType;
	private Iterator<?> sampler;
	private Change<?> curChange;
	private Random random = new Random();
	private GlobalSearch search;
	
	public boolean equals(Object o) {
		if (o instanceof MOEAChangeVariable) {
			return Objects.equal(curChange, ((MOEAChangeVariable) o).curChange);
		}
		return false;
	}
	
	public MOEAChangeVariable(GlobalSearch search) {
		this.search = search;
		randomize();
	}
	
	public MOEAChangeVariable(GlobalSearch search, ChangeType<?,?> curChangeType, Change<?> curChange) {
		this.search = search;
		this.curChangeType = curChangeType;
		this.curChange = curChange;
		this.sampler = (curChangeType!=null)?curChangeType.sampleWithMissing():null;
	}
	

	@Override
	public Variable copy() {
		MOEAChangeVariable ret = new MOEAChangeVariable(search, curChangeType, (curChange==null)?null:curChange.clone());
		if (ret.getCurChange() != null) {
			ret.getCurChange().checkChange();
		}
		return ret;
	}

	@Override
	public void randomize() {
		randomChange(null);
	}
	
	public void randomChange(EcoreTransferFunction tf) {
		if (random.nextInt(3) == 0) {
			curChange = null;
			return;
		}
		if (sampler != null && random.nextBoolean()) { //randomly just change the change
			curChange = (Change<?>)sampler.next();
		} else { //Define a new change
			curChangeType = null;
			curChange = null;
			sampler = null;
			if (random.nextBoolean()) {
				//It is an already existing quickfix
				curChange = search.randomQuickfix(random);
			} 
			//Just a random change
			if (curChange == null) {
				if (tf == null) {
					curChangeType = MyResource.get(search.getResource()).randomChange(random);
				} else {
					curChangeType = MyResource.get(search.getResource()).randomChange(random);
					/*curChangeType = MyResource.get(tf.forwardResource()).randomChange(random);
					curChangeType.transfer(tf.inverse());*/
				}
				curChange = curChangeType.compileWithMissing();
				sampler = curChangeType.sampleWithMissing();
			}
			if (curChange == null) {
				curChange = Change.empty(search.getResource());
			}
		}
	}
	
	public Change<?> getCurChange() {
		return curChange;
	}

}

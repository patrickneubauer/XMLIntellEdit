package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.Iterator;
import java.util.WeakHashMap;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.RandomSampler;
import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class EnumScope implements ValueScope<EEnumLiteral, Boolean> {
	
	private EEnum value;


	private EnumScope(EEnum value) {
		this.value = value;
	}
	
	private static WeakHashMap<EEnum, EnumScope> cache = new WeakHashMap<>();
	
	public static EnumScope getScope(EEnum eenum) {
		EnumScope ret = cache.get(eenum);
		if (ret == null) {
			cache.put(eenum, ret = new EnumScope(eenum));
		}
		return ret;
	}
	
	@Override
	public boolean contains(EEnumLiteral sol) {
		return value.equals(sol.getEEnum());
	}

	@Override
	public Boolean getQuality(EEnumLiteral sol) {
		return value.equals(sol.getEEnum());
	}

	@Override
	public Iterator<EEnumLiteral> iterator() {
		return value.getELiterals().iterator();
	}

	@Override
	public boolean isFinite() {
		return true;
	}

	@Override
	public Iterator<EEnumLiteral> sample() {
		return new RandomSampler<EEnumLiteral>(value.getELiterals());
	}
	
	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}

}

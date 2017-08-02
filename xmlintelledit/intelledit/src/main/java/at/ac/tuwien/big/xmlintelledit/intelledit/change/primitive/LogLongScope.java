package at.ac.tuwien.big.xmlintelledit.intelledit.change.primitive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import at.ac.tuwien.big.xmlintelledit.intelledit.scope.ValueScope;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public class LogLongScope implements ValueScope<Long, Boolean>{

	public static final LogLongScope INSTANCE  =new LogLongScope(); 
	
	@Override
	public boolean contains(Long sol) {
		return true;
	}

	@Override
	public Boolean getQuality(Long sol) {
		return true;
	}

	@Override
	public Iterator<Long> iterator() {
		return new Iterator<Long>() {
			private long cur = 0;

			@Override
			public boolean hasNext() {
				return cur != Long.MIN_VALUE;
			}

			@Override
			public Long next() {
				long ret = cur;
				if (cur <= 0) {
					cur = -cur;
					++cur;
				} else {
					cur = -cur;
				}
				return ret;				
			}
		};
	}

	@Override
	public boolean isFinite() {
		//Eigentlich schon, aber "praktisch unenedlich"
		return false;
	}
	
	private static final Random random = new Random();
	
	private int probabilityDenom = 10;
	private int probabilityNom = 1;
	private int probabilityDenomDiff;
	private double denomDiff = 0.0;
	private double minRandomValue;
	private double randomValueDiff;
	private double lnainv;
	private double denomMax;
	private double mult;
	private int negativeProbabilityNom = 0;
	private int negativeProbabilityDenom = 3;
	private double probabilityNext;
	private double aExp;

	
	public void setNegativeProbability(int nom, int denom) {
		this.negativeProbabilityNom = nom;
		this.negativeProbabilityDenom = denom;
	}
	
	/**Sets the probability of reaching the next decimal to this value*/
	public void setNextDecimalProbability(int nom, int denom) {
		double r = ((double)nom)/denom;
		aExp = Math.log(r)/10;
		double fakeExp = Math.pow(r,0.1);
		lnainv = 1.0/aExp;
		this.probabilityNom = nom;
		this.probabilityDenom = denom;
		this.minRandomValue = 1.0;
		this.randomValueDiff = r-minRandomValue;
		probabilityDenomDiff = probabilityDenom-probabilityNom;
		probabilityNext = 1.0-(1.0-r)/(1.0-fakeExp);
		System.out.println("Probabiltiy Next: " + probabilityNext);
		denomMax = Math.E*denom/nom;
		denomDiff = denomMax-Math.E;
		mult = -9/Math.log(((double)denom)/nom);
	}
	
	{
		setNextDecimalProbability(1, 10);
	}

	//TODO: Einzelbits setzen wäre wohl deutlich effizienter ...
	
	@Override
	public Iterator<Long> sample() {
		return new Iterator<Long>() {
			public Long next() {
				boolean isPositive = random.nextInt(negativeProbabilityDenom)>=negativeProbabilityNom;
				//Ein wert kann halt nicht erreicht werden, aber mutlich wegen der Double-Genauigkeit sowieso nicht
				long max = Long.MAX_VALUE-1;
				//should be 1 ... 9.999999
				double firstNumber = Math.log(minRandomValue+randomValueDiff*random.nextDouble())*lnainv;
				//System.out.println("FirstNumber: " + firstNumber);
				//probability to have another step is 10%?
				while (firstNumber+10 < max && random.nextInt(probabilityDenom)<probabilityNom) {
					firstNumber+=10;
				}
				if (isPositive) {
					return (long)firstNumber;
				} else {
					return (long)-firstNumber;
				}
			}
			
			public boolean hasNext() {
				return true;
			}
		};
		
	}
	
	public static void main(String[] args) {
		LogLongScope scope = new LogLongScope();
		Iterator<Long> iter = scope.sample();
		List<Long> list = new ArrayList<>();
		Map<Long,Integer> sampler = new TreeMap<Long,Integer>(); 
		int COUNT = 10000000;
		for (int i = 0; i < COUNT; ++i) {
			Long next = iter.next();
			sampler.put(next, sampler.getOrDefault(next,0)+1);
		}
		double gesamt = 1.0/(1.0-Math.exp(Math.log(0.1)/10));
		for (Entry<Long,Integer> entry: sampler.entrySet()) {
			double expected = Math.pow(Math.exp(Math.log(0.1)/10),entry.getKey())/gesamt*COUNT;
			System.out.println(entry.getKey()+": "+ entry.getValue()+" Expected "+expected);
		}
	}

	@Override
	public void transfer(EcoreTransferFunction transferFunc) {
	}
}

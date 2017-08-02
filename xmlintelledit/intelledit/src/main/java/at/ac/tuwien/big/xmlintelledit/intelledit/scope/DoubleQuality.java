package at.ac.tuwien.big.xmlintelledit.intelledit.scope;

public class DoubleQuality implements Comparable<DoubleQuality>{
	
	private double[] ar;
	
	public DoubleQuality(double[] ar) {
		this.ar = ar;
	}

	@Override
	public int compareTo(DoubleQuality o) {
		int ret = Double.compare(ar[2], o.ar[2]);
		if (ret == 0) {
			ret = Double.compare(ar[0], o.ar[0]);
		}
		if (ret == 0) {
			ret = -Double.compare(ar[1], o.ar[1]);
		}
		return ret;
	}

}

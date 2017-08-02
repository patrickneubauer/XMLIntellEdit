package at.ac.tuwien.big.xmlintelledit.intelledit.fixer;


//Der einfachheit halber auch für sets ...
public interface Increase extends FixAttempt {
	
	public Object border();
	
	public boolean exclusive();
	
	public default Object getAboveBorderOrNull() {
		return BorderGeneratorUtil.getAboveOrNull(border());
	}
	
	public default Object getAcceptableValueOrNull() {
		return exclusive()?getAboveBorderOrNull():border();
	}
	

	@Override
	public default boolean isFulfilled(Object obj) {
		if (obj instanceof Number && border() instanceof Number) {
			double firstD = ((Number)obj).doubleValue();
			double secondD = ((Number)border()).doubleValue();
			if (exclusive()) {
				return firstD > secondD;
			} else {
				return firstD >= secondD;
			}
		} else if (obj instanceof Comparable && border() instanceof Comparable && obj.getClass() == border().getClass()) {
			int res = ((Comparable)obj).compareTo(border());
			return exclusive()?res>0:res>=0;
		}
		return false;
	}

}

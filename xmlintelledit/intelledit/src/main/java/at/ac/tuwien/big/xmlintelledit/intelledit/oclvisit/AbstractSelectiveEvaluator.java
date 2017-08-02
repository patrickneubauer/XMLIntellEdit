package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

public class AbstractSelectiveEvaluator<T,U> implements SelectiveEvaluator<T, U> {
	
	private final Class<T> filterClass;
	private final Class<U> resultClass;
	private final boolean acceptNullResult;
	private final String requiredName;
	
	public AbstractSelectiveEvaluator(Class<T> filterClass, Class<U> resultClass, boolean acceptNullResult, String requiredName) {
		this.filterClass = filterClass;
		this.resultClass = resultClass;
		this.acceptNullResult = acceptNullResult;
		this.requiredName = requiredName;
	}

	@Override
	public Class<T> getFilterClass() {
		return filterClass;
	}

	@Override
	public Class<U> getResultClass() {
		return resultClass;
	}

	@Override
	public boolean acceptNullResult() {
		return acceptNullResult;
	}

	@Override
	public String getRequiredName() {
		return requiredName;
	}

}

package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

public interface SelectiveEvaluator<T,U> {
	
	public Class<T> getFilterClass();

	public Class<U> getResultClass();
	
	public boolean acceptNullResult();
	
	/**Can be null if any name is supported
	 * This is only relevant for OperationCallExp, IterateExpr etc.
	 */
	public String getRequiredName();

}

package at.ac.tuwien.big.xmlintelledit.intelledit.oclvisit;

import java.util.Objects;

import org.eclipse.ocl.expressions.OCLExpression;


public class OCLReferenceImpl implements OCLReference {
	
	private OCLExpression expr;
	
	public OCLReferenceImpl(OCLExpression expr) {
		this.expr = expr;
	}

	@Override
	public OCLExpression getExpr() {
		return expr;
	}
	
	public boolean equals(Object other) {
		return (other instanceof OCLReferenceImpl) && Objects.equals(expr,((OCLReferenceImpl)other).expr);
	}
	
	public int hashCode() {
		return Objects.hashCode(expr);
	}

	public String toString() {
		return String.valueOf(expr);
	}
}

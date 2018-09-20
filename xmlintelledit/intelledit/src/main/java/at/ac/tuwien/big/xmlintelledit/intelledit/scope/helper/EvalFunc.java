package at.ac.tuwien.big.xmlintelledit.intelledit.scope.helper;

import java.util.function.Function;

public interface EvalFunc<X,Y> extends Function<X,Y>{ 
	@Override
	public default Y apply(X x){
		return eval(x);
	}
	
	public Y eval(X t);

}

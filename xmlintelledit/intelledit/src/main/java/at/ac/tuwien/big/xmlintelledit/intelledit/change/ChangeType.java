package at.ac.tuwien.big.xmlintelledit.intelledit.change;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;

import at.ac.tuwien.big.xmlintelledit.intelledit.ecore.util.MyResource;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.ETransferrable;
import at.ac.tuwien.big.xmlintelledit.intelledit.transfer.EcoreTransferFunction;

public interface ChangeType<Self extends ChangeType<Self,Sub>,Sub extends Change<Sub>> extends ETransferrable<Self> {

	public Sub compile();
	
	public default Undoer apply() {
		Sub sub = compileWithMissing();
		return sub.execute();
	}
	
	public Resource getResource();
	
	public default MyResource getMyResource() {
		return MyResource.get(getResource());
	}
	
	public default Sub compileWithMissing() {
		synchronized(this) {
			List<ParameterType<? super Self,?>> unbound = new ArrayList<>();
			for (Parameter<? super Self,?> par: getParameter()) {
				if (!isBound(par)) {
					Object obj = par.getRandom((Self)this);
					if (obj == null) {
						return null;
					}
					fakebind((Parameter)par,obj);
				}
			}
			return compile();
		}
	}
	
	public default Iterator<Sub> sampleWithMissing() {
		return new Iterator<Sub>() {
			
			boolean hasNext = compileWithMissing()!=null;

			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public Sub next() {
				return compileWithMissing();
			}
		};
		
	}
	
	public default Iterator<Sub> iterateWithMissing() {
		return new Iterator<Sub>() {
			
			private Iterator<?>[] parIterators = new Iterator<?>[getParameter().size()];
			private boolean hasNext = false;
			private Sub next;
			
			public void initBind() {
				synchronized(ChangeType.this) {
					List<Parameter<? super Self, ?>> parameters = getParameter();
					for (int i = 0; i < parameters.size(); ++i) {
						Parameter par = parameters.get(i);
						if (par != null && !isBound(par)) {
							parIterators[i] = par.getCurScope((Self)ChangeType.this).iterator();
							if (parIterators[i].hasNext()) {
								fakebind((Parameter)par,parIterators[i].next());
							} else {
								nextBind();
								return;
							}
						}
					}
				}
				next = compile();
				hasNext = true;
			}
			
			{
				initBind();
			}
			
			private void nextBind() {
				for (int i = parIterators.length-1; i >= 0; --i) {
					if (parIterators[i] != null && parIterators[i].hasNext()) {
						fakebind((Parameter)getParameter().get(i),parIterators[i].next());
						List<Parameter<? super Self, ?>> parameters = getParameter();
						for (int j = i+1; j < parameters.size(); ++j) {
							Parameter par = parameters.get(j);
							if (par != null && !isBound(par)) {
								parIterators[i] = par.getCurScope((Self)ChangeType.this).iterator();
								if (parIterators[i].hasNext()) {
									fakebind((Parameter)par,parIterators[i].next());
								} else {
									nextBind();
									return;
								}
							}
						}
						next = compile();
						hasNext = true;
						return;
					}
				}
				hasNext = false;
			}

			@Override
			public boolean hasNext() {
				return hasNext;
			}

			@Override
			public Sub next() {
				synchronized(ChangeType.this) {
					Sub ret = next;
					nextBind();
					return ret;
				}
			}
		};
	}
	
	public List<Parameter<? super Self,?>> getParameter();
	
	/**You can always assume parameters are set in order, i.e. a scope of parameter 3 may access the values of 2 and 1*/
	public<T> void bind(Parameter<? super Self,T> par, T value);
	
	public<T> void fakebind(Parameter<? super Self,T> par, T value);
	
	public default void bind(int index, Object value) {
		bind(((Parameter)getParameter().get(index)),value);
	}
	
	public default void fakebind(int index, Object value) {
		fakebind(((Parameter)getParameter().get(index)),value);
	}
	
	public<T> T get(Parameter<? super Self,T> par);
	
	public default<T> T get(int index) {
		return (T)get(getParameter().get(index));
	}
	
	public void unbind(Parameter<? super Self,?> par);
	
	public default void unbind(int index) {
		unbind(getParameter().get(index));
	}
	
	public boolean isBound(Parameter<? super Self,?> par);
	
	public default boolean isBound(int index) {
		return isBound(getParameter().get(index));
	}
	
	public void transfer(EcoreTransferFunction transferFunc);
}

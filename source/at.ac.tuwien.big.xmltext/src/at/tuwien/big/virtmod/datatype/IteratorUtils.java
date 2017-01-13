package at.tuwien.big.virtmod.datatype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;


import java.util.Map.Entry;

public class IteratorUtils {
	
	public interface SimpleFunction<X,Y> {
		public Y applyTo(X x);
	}
	
	public static<T> List<T> readList(Iterator<T> iterator) {
		List<T> ret = new ArrayList<T>();
		while (iterator.hasNext()) {
			ret.add(iterator.next());
		}
		return ret;
	}
	
	public static<T> List<T> readList(Iterable<T> iterable) {
		List<T> ret = new ArrayList<>();
		for (T obj: iterable) {
			ret.add(obj);
		}
		return ret;
	}
	
	public static<T> Set<T> readSet(Iterator<T> iterator) {
		Set<T> ret = new HashSet<>();
		while (iterator.hasNext()) {
			ret.add(iterator.next());
		}
		return ret;
	}
	
	public static<T> Set<T> readSet(Iterable<T> iterable) {
		Set<T> ret = new HashSet<>();
		for (T obj: iterable) {
			ret.add(obj);
		}
		return ret;
	}
	
	public static<X,Y> Iterable<Y> convert(Iterable<X> x, SimpleFunction<X, Y> func) {
		return ()->convert(x.iterator(),func);
	}
	
	public static<X,Y> Iterator<Y> balancedIterate(Iterator<? extends X> x, SimpleFunction<? super X,? extends Iterator<? extends Y>> func) {
		return new Iterator<Y>() {
			List<Iterator<? extends Y>> allIters = new ArrayList<>();
			private boolean onceIterated = false;
			private int curIndex;
			private Y next = null;
			
			private void getNext() {
				if (!onceIterated) {
					while (x.hasNext()) {
						Iterator<? extends Y> nextIter = func.applyTo(x.next());
						if (nextIter.hasNext()) {
							next = nextIter.next();
							allIters.add(nextIter);
							return;
						}
					}
				}
				int oldIndex = curIndex;
				for (int newIndex = curIndex; newIndex < allIters.size(); ++newIndex ) {
					Iterator<? extends Y> iter = allIters.get(newIndex);
					if (!iter.hasNext()) {
						allIters.remove(newIndex);
						--newIndex;
						continue;
					} else {
						next = iter.next();
						curIndex = newIndex+1%allIters.size();
						return;
					}
				}
				if (curIndex >= allIters.size()) {
					curIndex = allIters.size()-1;
				}
				for (int newIndex = 0; newIndex < curIndex; ++newIndex) {
					Iterator<? extends Y> iter = allIters.get(newIndex);
					if (!iter.hasNext()) {
						allIters.remove(newIndex);
						--newIndex;
						continue;
					} else {
						next = iter.next();
						curIndex = newIndex+1%allIters.size();
						return;
					}
				}
			}

			@Override
			public boolean hasNext() {
				if (next == null) {
					getNext();
				}
				return next!=null;
			}

			@Override
			public Y next() {
				try {
					if (next == null) {
						getNext();
					}
					return next;
				} finally {
					next = null;
				}
			}
		};
	}
	
	public static<X,Y> Iterator<Y> convert(Iterator<? extends X> x, SimpleFunction<? super X, ? extends Y> func) {
		return new Iterator<Y>() {

			@Override
			public boolean hasNext() {
				return x.hasNext();
			}

			@Override
			public Y next() {
				return func.applyTo(x.next());
			}
			
			@Override
			public void remove() {
				x.remove();
			}
		};
	}
	
	public static<X,Y> Iterator<X> keyIterator(Iterator<Entry<X,Y>> entry) {
		return convert(entry,x->x.getKey());
	}
	
	public static<X,Y> Iterator<X> keySetIterator(Iterator<Entry<X,Y>>... entry) {
		return convert(multiSetIterator(entry),x->x.getKey());
	}
	
	public static<X,Y> Iterator<X> valuesIterator(Iterator<Entry<Y,X>> entry) {
		return convert(entry,x->x.getValue());
	}
	
	public static<X,Y> Iterator<X> valuesSetIterator(Iterator<Entry<Y,X>>... entry) {
		return convert(multiSetIterator(entry),x->x.getValue());
	}
	
	public static<X> Iterator<X> multiIterator(Iterator<? extends X>... iterable) {
		return multiIterator(Arrays.asList(iterable));
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterator<? extends X>... iterable) {
		return multiSetIterator(Arrays.asList(iterable));
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterator<? extends Iterator<? extends X>> iterable) {
		return new Iterator<X>() {

			Iterator<? extends X> curIter = null;
			Set<X> ret = new HashSet<>();
			boolean haveNext = false;
			X next = null;
			
			@Override
			public boolean hasNext() {
				if (haveNext) {
					return true;
				}
				while (curIter.hasNext()) {
					if (ret.add(next = curIter.next())) {
						haveNext = true;
						return true;
					}
				}
				while (iterable.hasNext()) {
					curIter = iterable.next();
					if (curIter == null) {
						continue;
					}
					while (curIter.hasNext()) {
						if (ret.add(next = curIter.next())) {
							haveNext = true;
							return true;
						}
					}
				}
				return false;
			}

			@Override
			public X next() {
				if (hasNext()) {
					haveNext = false;
					return next;
				}
				throw new NoSuchElementException();
			}
		};
	}
	
	public static<X> Iterator<X> multiIteratorIt(Iterator<? extends Iterator<? extends X>> iterable) {
		return multiIterator(iterable);
	}
	
	public static<X> Iterator<X> multiIterator(Iterator<? extends Iterator<? extends X>> iterable) {
		return new Iterator<X>() {

			Iterator<? extends X> curIter = null;
			
			@Override
			public boolean hasNext() {
				while ((curIter == null || !curIter.hasNext()) && iterable.hasNext()) {
					while (iterable.hasNext()) {
						curIter = iterable.next();
						break;
					}
					
				}
				return curIter != null && curIter.hasNext();
			}

			@Override
			public X next() {
				if (curIter == null) {
					throw new NoSuchElementException();
				}
				return curIter.next();
			}
		};
	}
	
	public static<X> Iterator<X> multiIterator(Iterable<? extends Iterator<? extends X>> iterable) {
		return multiIterator(iterable.iterator());
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterable<? extends Iterator<? extends X>> iterable) {
		return multiSetIterator(iterable.iterator());
	}
	
	public static<X> Iterable<X> shallowUnionObject(Iterable<? extends X> base, X... and) {
		return shallowUnion(base,Arrays.asList(and));
	}
	
	public static<X> Iterable<X> shallowUnion(Iterable<? extends X>... iterables) {
		return ()->{
			Iterator<? extends X>[] iters = new Iterator[iterables.length];
			for (int i = 0; i < iters.length; ++i) {
				iters[i] = iterables[i].iterator();
			}
			return multiIterator(iters);
		};
	}
	


	public static<X> Iterable<X> shallowUnionCol(Collection<List<X>> values) {
		return shallowUnion(new ArrayList<>(values).toArray(new List[]{}));
	}

	public static<T, U extends T> Iterator<U> filterType(Iterator<? extends T> allContents, Class<U> class1) {
		return (Iterator<U>) filterType(allContents,(x)->(x != null && class1.isAssignableFrom(x.getClass())));
	}
	
	public interface Filter<T> {
		boolean matches(T obj);
	}
	
	public static<T> Iterator<T> filterType(Iterator<? extends T> allContents, Filter<T> filter) {
		return new Iterator<T>() {
			T nextFiltered = null;
			boolean hasNext = false;

			@Override
			public boolean hasNext() {
				if (!hasNext) {
					while (allContents.hasNext()) {
						T next = allContents.next();
						if (filter.matches(next)) {
							hasNext = true;
							nextFiltered = next;
							break;
						}
					}
				}
				return hasNext;
			}

			@Override
			public T next() {
				if (hasNext()) {
					hasNext = false;
					return nextFiltered;
				}
				throw new NoSuchElementException();
			}
		};
	}

}
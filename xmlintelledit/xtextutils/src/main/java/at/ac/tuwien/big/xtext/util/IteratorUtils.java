package at.ac.tuwien.big.xtext.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;


@SuppressWarnings({ "unchecked", "unused" })
public class IteratorUtils {
	
	public static abstract class CalculatingIterator<T> implements Iterator<T> {
		
		protected T next;
		
		public abstract void calculateNext();
		
		@Override
		public boolean hasNext() {
			if (this.next == null) {
				calculateNext();
			}
			return this.next != null;
		}
		
		@Override
		public T next() {
			if (hasNext()) {
				try {
					return this.next;
				} finally {
					this.next = null;
				}
			}
			throw new NoSuchElementException();
		}
		
	}
	
	public interface Filter<T> extends Predicate<T> {
		boolean matches(T obj);
		
		@Override
		public default boolean test(T obj) {
			return matches(obj);
		}
		
	}
	
	public interface SimpleFunction<X,Y> {
		public Y applyTo(X x);
	}
	
	public static<X,Y> Iterator<Y> balancedIterate(Iterator<? extends X> x, SimpleFunction<? super X,? extends Iterator<? extends Y>> func) {
		return new Iterator<Y>() {
			List<Iterator<? extends Y>> allIters = new ArrayList<>();
			private boolean onceIterated = false;
			private int curIndex;
			private Y next = null;
			
			private void getNext() {
				if (!this.onceIterated) {
					while (x.hasNext()) {
						Iterator<? extends Y> nextIter = func.applyTo(x.next());
						if (nextIter.hasNext()) {
							this.next = nextIter.next();
							this.allIters.add(nextIter);
							return;
						}
					}
				}
				int oldIndex = this.curIndex;
				for (int newIndex = this.curIndex; newIndex < this.allIters.size(); ++newIndex ) {
					if (newIndex < 0) {continue;}
					Iterator<? extends Y> iter = this.allIters.get(newIndex);
					if (!iter.hasNext()) {
						this.allIters.remove(newIndex);
						--newIndex;
						continue;
					} else {
						this.next = iter.next();
						this.curIndex = (newIndex+1)%this.allIters.size();
						return;
					}
				}
				if (this.curIndex >= this.allIters.size()) {
					this.curIndex = this.allIters.size()-1;
				}
				for (int newIndex = 0; newIndex < this.curIndex; ++newIndex) {
					if (newIndex < 0) {continue;}
					Iterator<? extends Y> iter = this.allIters.get(newIndex);
					if (!iter.hasNext()) {
						this.allIters.remove(newIndex);
						--newIndex;
						continue;
					} else {
						this.next = iter.next();
						this.curIndex = (newIndex+1)%this.allIters.size();
						return;
					}
				}
			}

			@Override
			public boolean hasNext() {
				if (this.next == null) {
					getNext();
				}
				return this.next!=null;
			}

			@Override
			public Y next() {
				try {
					if (this.next == null) {
						getNext();
					}
					return this.next;
				} finally {
					this.next = null;
				}
			}
		};
	}
	
	public static<T> List<T> buildList(Iterator<T> iterator, int maxLength) {
		if (maxLength == -1) {
			List<T> ret = new ArrayList<>();
			while (iterator.hasNext()) {
				ret.add(iterator.next());
			}
			return ret;
		} else {
			List<T> ret = new ArrayList<>(maxLength);
			while (iterator.hasNext() && maxLength > 0) {
				ret.add(iterator.next());
				--maxLength;
			}
			return ret;
		}
	}
	
	public static<T> String buildString(Iterable<T> values, Function<T, String> object, String first, String last,
			String middle) {
		StringBuilder ret = new StringBuilder();
		ret.append(first);
		boolean isFirst = true;
		for (T val: values) {
			if (isFirst) {isFirst = false;} else {ret.append(middle);}
			ret.append(object.apply(val));
		}
		ret.append(last);
		return ret.toString();
	}
	
	public static<T> String concat(Iterable<T> iterable, SimpleFunction<T, ?> stringBuilding) {
		return concat(iterable,stringBuilding,"",", ","");
	}
	
	public static<T> String concat(Iterable<T> iterable, SimpleFunction<T, ?> stringBuilding, String middle) {
		return concat(iterable,stringBuilding,"",middle,"");
	}
	
	public static<T> String concat(Iterable<T> iterable, SimpleFunction<T, ?> stringBuilding,  String start, String middle,String end) {
		StringBuilder ret = new StringBuilder();
		ret.append(start);
		boolean first = true;
		for (T t: iterable) {
			if (!first) {
				ret.append(middle);
			} else {
				first = false;
			}
			ret.append(stringBuilding.applyTo(t));
		}
		ret.append(end);
		return ret.toString();
	}
	
	public static<X,Y> Iterable<Y> convert(Iterable<? extends X> x, SimpleFunction<X, Y> func) {
		return ()->convert(x.iterator(),func);
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
	
	public static<T> List<T> convert(List<T> start, Map<T,T> map) {
		List<T> ret = new ArrayList<>();
		for (T t: start) {
			ret.add(map.getOrDefault(t, t));
		}
		return ret;
	}
	
	public static<T> Collection<T> ensureCollection(Iterable<T> chars) {
		if (chars instanceof Collection) {
			return (Collection<T>)chars;
		}
		Collection<T> ret = new ArrayList<>();
		for (T t: chars) {
			ret.add(t);
		}
		return ret;
	}
	
	public static<T> Iterable<T> filter(Iterable<? extends T> allContents, Predicate<? super T> filter) {
		return ()->filter(allContents.iterator(),filter);
	}
	
	public static<T> Iterator<T> filter(Iterator<? extends T> allContents, Predicate<? super T> filter) {
		return new Iterator<T>() {
			T nextFiltered = null;
			boolean hasNext = false;

			@Override
			public boolean hasNext() {
				if (!this.hasNext) {
					while (allContents.hasNext()) {
						T next = allContents.next();
						if (filter.test(next)) {
							this.hasNext = true;
							this.nextFiltered = next;
							break;
						}
					}
				}
				return this.hasNext;
			}

			@Override
			public T next() {
				if (hasNext()) {
					this.hasNext = false;
					return this.nextFiltered;
				}
				throw new NoSuchElementException();
			}
		};
	}
	
	public static<T> Iterator<T> filterByFunc(Iterator<? extends T> allContents, Function<? super T, Boolean> filter) {
		return filterType(allContents, (x)->{Boolean ret = filter.apply(x); return ret != null && ret;});
	}
	
	public static<T, U extends T> Iterator<U> filterType(Iterator<? extends T> allContents, Class<U> class1) {
		return (Iterator<U>) filterType(allContents,(x)->(x != null && class1.isAssignableFrom(x.getClass())));
	}
	
	public static<T> Iterator<T> filterType(Iterator<? extends T> allContents, Predicate<? super T> filter) {
		return filter(allContents, filter);
	}
	
	public static<X,Y> Iterable<Y> flatten(Iterable<? extends X> x, SimpleFunction<? super X, ? extends Iterable<Y>> func) {
		return IteratorUtils.shallowUnionCol(IteratorUtils.convert(x, (y)->func.applyTo(y)));
	}
	
	public static<X,Y> Iterator<Y> flatten(Iterator<? extends X> x, SimpleFunction<? super X, ? extends Iterator<Y>> func) {
		return IteratorUtils.shallowUnionColIter(IteratorUtils.convert(x, (y)->func.applyTo(y))).iterator();
	}
	
	public static<X,Y> Iterable<? extends Y> flattenUnknown(Iterable<? extends X> x, SimpleFunction<? super X, ? extends Iterable<? extends Y>> func) {
		return IteratorUtils.shallowUnionCol(IteratorUtils.convert(x, (y)->func.applyTo(y)));
	}
	
	public static<X,Y> Iterator<X> keyIterator(Iterator<Entry<X,Y>> entry) {
		return convert(entry,x->x.getKey());
	}
	
	public static<X,Y> Iterator<X> keySetIterator(Iterator<Entry<X,Y>>... entry) {
		return convert(multiSetIterator(entry),x->x.getKey());
	}
	
	public static<X> Iterator<X> multiIterator(Iterable<? extends Iterator<? extends X>> iterable) {
		return multiIterator(iterable.iterator());
	}
	
	public static<X> Iterator<X> multiIterator(Iterator<? extends Iterator<? extends X>> iterable) {
		return new Iterator<X>() {

			Iterator<? extends X> curIter = null;
			
			@Override
			public boolean hasNext() {
				while ((this.curIter == null || !this.curIter.hasNext()) && iterable.hasNext()) {
					while (iterable.hasNext()) {
						this.curIter = iterable.next();
						break;
					}
					
				}
				return this.curIter != null && this.curIter.hasNext();
			}

			@Override
			public X next() {
				if (this.curIter == null) {
					throw new NoSuchElementException();
				}
				return this.curIter.next();
			}
		};
	}
	
	public static<X> Iterator<X> multiIterator(Iterator<? extends X>... iterable) {
		return multiIterator(Arrays.asList(iterable));
	}
	
	public static<X> Iterator<X> multiIteratorIt(Iterator<? extends Iterator<? extends X>> iterable) {
		return multiIterator(iterable);
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterable<? extends Iterator<? extends X>> iterable) {
		return multiSetIterator(iterable.iterator());
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterator<? extends Iterator<? extends X>> iterable) {
		return new Iterator<X>() {

			Iterator<? extends X> curIter = null;
			Set<X> ret = new HashSet<>();
			boolean haveNext = false;
			X next = null;
			
			@Override
			public boolean hasNext() {
				if (this.haveNext) {
					return true;
				}
				while (this.curIter != null && this.curIter.hasNext()) {
					if (this.ret.add(this.next = this.curIter.next())) {
						this.haveNext = true;
						return true;
					}
				}
				while (iterable.hasNext()) {
					this.curIter = iterable.next();
					if (this.curIter == null) {
						continue;
					}
					while (this.curIter.hasNext()) {
						if (this.ret.add(this.next = this.curIter.next())) {
							this.haveNext = true;
							return true;
						}
					}
				}
				return false;
			}

			@Override
			public X next() {
				if (hasNext()) {
					this.haveNext = false;
					return this.next;
				}
				throw new NoSuchElementException();
			}
		};
	}
	
	public static<X> Iterator<X> multiSetIterator(Iterator<? extends X>... iterable) {
		return multiSetIterator(Arrays.asList(iterable));
	}
	
	public static<T> List<T> readList(Iterable<T> iterable) {
		List<T> ret = new ArrayList<>();
		for (T obj: iterable) {
			ret.add(obj);
		}
		return ret;
	}
	
	public static<T> List<T> readList(Iterator<T> iterator) {
		List<T> ret = new ArrayList<>();
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
	
	public static<T> Set<T> readSet(Iterator<T> iterator) {
		Set<T> ret = new HashSet<>();
		while (iterator.hasNext()) {
			ret.add(iterator.next());
		}
		return ret;
	}


	public static<T,U> Map<U,T> reverseHashMap(Map<? extends T,? extends U> map) {
		Map<U,T> ret = new HashMap<>(map.size());
		for (Entry<? extends T,? extends U> entr: map.entrySet()) {
			ret.put(entr.getValue(), entr.getKey());
		}
		return ret;
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
	
	public static<X> Iterable<X> shallowUnionCol(Iterable<? extends Iterable<? extends X>> values) {
		return ()->multiIterator(IteratorUtils.convert(values, x->x.iterator()));
	}

	public static<X> Iterable<X> shallowUnionColIter(Iterator<? extends Iterator<? extends X>> values) {
		return ()->multiIterator(values);
	}

	public static<X> Iterable<X> shallowUnionObject(Iterable<? extends X> base, X... and) {
		return shallowUnion(base,Arrays.asList(and));
	}

	public static<X,Y> Iterator<X> valuesIterator(Iterator<Entry<Y,X>> entry) {
		return convert(entry,x->x.getValue());
	}
	
	public static<X,Y> Iterator<X> valuesSetIterator(Iterator<Entry<Y,X>>... entry) {
		return convert(multiSetIterator(entry),x->x.getValue());
	}

}

package at.ac.tuwien.big.xmlintelledit.intelledit.oclgen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.eclipse.ocl.util.CollectionUtil;

public final class OCL2JavaSupport {
	
	private static final Object OBJECT = new Object();

	private OCL2JavaSupport() {
		
	}

	
	public static boolean equals(Object o1, Object o2) {
		if (o1 == null) {
			return o2 == null;
		}
		return o1.equals(o2);
	}
	
	public static <E> boolean forAll(Collection<E> c, Predicate<E> function) {
		for (E e : c) {
			if (!function.test(e)) {
				return false;
			}
		}
		
		return true;
	}

	public static <E> boolean forAll(Collection<E> c, int count, Predicate<List<E>> function) {
		return permutateAll(c, count, Boolean.FALSE, e -> {
			if (!function.test(e)) {
				return Boolean.FALSE;
			}

			return Boolean.TRUE;
		});
	}
	
	public static <E> Collection<E> select(Collection<E> c, Predicate<E> function) {
		Set<E> results = new LinkedHashSet<E>();
		
		for (E e : c) {
			if (function.test(e)) {
				results.add(e);
			}
		}
		
		return results;
	}
	
	public static Collection<Object> selectByKind(Collection<?> sourceColl, Predicate<Object> function) {
		Collection<Object> newElements = CollectionUtil.createNewCollectionOfSameKind(sourceColl);
        for (Iterator<?> it = sourceColl.iterator(); it.hasNext();) {
        	Object object = it.next();
			if ((object != null) && function.test(object)) {
	        	newElements.add(object);
			}
        }
        return newElements;
	}
	
	public static <E> Collection<E> select(Collection<E> c, int count, Predicate<List<E>> function) {
		Set<E> results = new LinkedHashSet<E>();
		
		permutateAll(c, count, e -> {
			if (function.test(e)) {
				// TODO: Not sure what a select means in this case
				results.addAll(e);
			}
		});
		
		return results;
	}
	
	public static <E> Collection<E> closure(Collection<E> initial, Function<E, E> function) {
		int size = initial.size();
		Set<E> elements = new LinkedHashSet<E>(size);
		List<E> remaining = new ArrayList<E>(size);
		
		for (E e : initial) {
			remaining.add(--size, e);
		}
		
		while (remaining.size() > 0) {
			E e = remaining.remove(remaining.size() - 1);
			elements.add(e);
			E newE = function.apply(e);
			if (newE != null) {
				remaining.add(newE);
			}
		}
		
		return elements;
	}
	
	public static <E> Collection<E> closureCollection(Collection<E> initial, Function<E, Collection<E>> function) {
		int size = initial.size();
		Set<E> elements = new LinkedHashSet<E>(size);
		List<E> remaining = new ArrayList<E>(size);
		
		for (E e : initial) {
			remaining.add(--size, e);
		}
		
		while (remaining.size() > 0) {
			E e = remaining.remove(remaining.size() - 1);
			elements.add(e);
			remaining.addAll(function.apply(e));
		}
		
		return elements;
	}

	public static <E, R> Collection<R> collect(Collection<E> initial, Function<E, R> function) {
		List<R> result = new ArrayList<R>(initial.size());
		
		for (E e : initial) {
			result.add(function.apply(e));
		}

		return result;
	}
	
	public static <E, R> Collection<R> collectCollection(Collection<E> initial, Function<E, Collection<R>> function) {
		List<R> result = new ArrayList<R>(initial.size());
		
		for (E e : initial) {
			Collection<R> c = function.apply(e);
			
			if (c == null) {
				continue;
			}
			
			for (R r : c) {
				result.add(r);
			}
		}

		return result;
	}
	
	public static <E> void permutateAll(Collection<E> c, int count, Consumer<List<E>> consumer) {
		permutateAll(c, count, OBJECT, l -> {
			consumer.accept(l);
			return null;
		});
	}
	
	@SuppressWarnings("unchecked")
	public static <E, S> S permutateAll(Collection<E> c, int count, S stop, Function<List<E>, S> function) {
		final int elementsLastIdx = c.size() - 1;
		final int[] indexes = new int[count];
		final E[] element = (E[]) new Object[count];
		final E[] elements = (E[]) c.toArray();
		final List<E> list = Arrays.asList(element);

		// Initialize the array with the first element
		for (int i = 0; i < count; i++) {
			element[i] = elements[0];
		}

		while (true) {
			final S r = function.apply(list);
			
			if (r == stop) {
				return r;
			}
			
			final int indexValue = indexes[elementsLastIdx];
			
			if (indexValue == elementsLastIdx) {
				indexes[elementsLastIdx] = 0;
				element[elementsLastIdx] = elements[0];

				int currentIdx = elementsLastIdx - 1;
				while (currentIdx != -1) {
					final int nextIndexValue = indexes[currentIdx];
					if (nextIndexValue == elementsLastIdx) {
						indexes[currentIdx] = 0;
						element[currentIdx] = elements[0];
						currentIdx--;
					} else {
						final int newIndexValue = indexes[currentIdx] = nextIndexValue + 1;
						element[currentIdx] = elements[newIndexValue];
						break;
					}
				}
				
				if (currentIdx == -1) {
					return r;
				}
			} else {
				final int newIndexValue = indexes[elementsLastIdx] = indexValue + 1;
				element[elementsLastIdx] = elements[newIndexValue];
			}
		}
	}
}

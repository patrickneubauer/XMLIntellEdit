package at.ac.tuwien.big.xmlintelledit.intelledit.change.parameter;

import java.util.Collection;
import java.util.List;

public class SimpleTest {

	public static class Test<A,B> {}
	
	public static<U> Test<Collection<U>, List<U>> test() {
		return new Test<Collection<U>, List<U>>() {};
	}
	
	Test<Collection<Integer>,List<Integer>> t =  (Test<Collection<Integer>,List<Integer>>)(SimpleTest.<Integer>test());
}

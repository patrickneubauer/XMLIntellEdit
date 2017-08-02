package at.ac.tuwien.big.xmlintelledit.intelledit.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ListEqualsTest {
	
	public static class FakeInt {
		public FakeInt(int i) {
			this.i = i;
		}
		public int i;
		public boolean equals(Object o) {
			return o instanceof FakeInt && ((FakeInt)o).i==i;
		}
		
		public int hashCode() {
			return i;
		}
	}
	
	
	
	public static void main(String[] args) {
		Set<List<FakeInt>> fakeIntSet = new HashSet<>();
		Set<List<FakeInt>> fakeIntSetB = new HashSet<>();
		Stack<FakeInt> first = new Stack<>();
		first.add(new FakeInt(1));
		first.add(new FakeInt(3));
		fakeIntSet.add(first);
		
		List<FakeInt> second = new ArrayList<ListEqualsTest.FakeInt>();
		second.add(new FakeInt(1));
		second.add(new FakeInt(3));
		fakeIntSetB.add(second);
		
		System.out.println("A->B: "+fakeIntSet.contains(second)+", B->A: "+fakeIntSetB.contains(first));
		fakeIntSet.add(second);
		fakeIntSetB.add(first);
		System.out.println("Size A: "+fakeIntSet.size()+", Size B: "+fakeIntSetB.size());
	}

}

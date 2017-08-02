package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Edge {
	
	private Node target;
	
	public Edge(Node target) {
		this.target = target;
	}
	
	public Edge(Node target, char...  chars) {
		this(target);
		addAcceptable(chars);
	}

	private Set<Character> acceptableChars = new HashSet<Character>();
	
	public void addAcceptable(char... chars) {
		for (char c: chars) {
			acceptableChars.add(c);
		}
	}
	
	public boolean contains(char c) {
		return acceptableChars.contains(c);
	}

	public void addAcceptable(Set<Character> characters) {
		acceptableChars.addAll(characters);
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		TreeSet<Character> allChars = new TreeSet<Character>();
		allChars.addAll(acceptableChars);
		for (Character c: allChars) {
			builder.append(c);
		}
		return target.getIndex()+" via "+builder.toString();
	}

}

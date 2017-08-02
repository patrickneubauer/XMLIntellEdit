package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private boolean isFinal;
	private int index;
	
	private List<Edge> validEdges = new ArrayList<>();
	private List<Node> directNeighbors = new ArrayList<Node>();
	
	public Node(boolean isFinal, int index) {
		this.isFinal = isFinal;
		this.index = index;
	}
	
	public void addDirectNeighbor(Node neighbor) {
		this.directNeighbors.add(neighbor);
	}
	
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	public void addEdge(Edge edge) {
		validEdges.add(edge);
	}
	
	public void addEdge(Node target, char... chars) {
		validEdges.add(new Edge(target,chars));
	}
	
	public List<Edge> getValidEdges() {
		return validEdges;
	}
	
	public List<Node> getDirectNodes() {
		return directNeighbors;
	}
	
	public int getIndex() {
		return index;
	}
	
	public String toString() {
		StringBuilder ret = new StringBuilder();
		if (isFinal) {
			ret.append("Final ");
		}
		ret.append("Node "+index+":\n");
		if (!directNeighbors.isEmpty()) {
			ret.append("\tDirect neighbors: ");
			boolean first = true;
			for (Node n: directNeighbors) {
				if (first) {first = false;} else {ret.append(", ");}
				ret.append(n.getIndex());
			}
			ret.append("\n");
		}
		for (Edge edge: validEdges) {
			ret.append("\t"+edge);
		}
		return ret.toString();
	}
}

package at.ac.tuwien.big.xmlintelledit.intelledit.simpleregexp;

import java.util.ArrayList;
import java.util.List;



public class ParseStateManager {

	private List<Node> allNodes = new ArrayList<>();
	
	private Node currentNode;
	
	public void setCurrentNode(Node currentNode) {
		this.currentNode = currentNode;
	}
	
	public Node getCurrentNode() {
		return currentNode;
	}
	
	public Node newNode(boolean isFinal) {
		Node ret = new Node(isFinal, allNodes.size());
		allNodes.add(ret);
		return ret;
	}
}

package at.ac.tuwien.big.generalutil;

public class Pair<A,B> {

	public A a;
	public B b;
	
	public Pair(A a, B b) {
		this.a = a; 
		this.b = b;
	}
	
	public A getFirst() {
		return a;
	}
	
	public A getA() {
		return a;
	}
	
	public B getSecond() {
		return b;
	}
	
	public B getB() {
		return b;
	}
	
	public Pair<A,B> clone() {
		return new Pair<>(a,b);
	}
	
	public void setA(A a) {
		this.a = a;
	}
	
	public void setB(B b) {
		this.b = b;
	}
	 
 }

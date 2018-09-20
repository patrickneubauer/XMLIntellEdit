package at.ac.tuwien.big.generalutil;

import java.util.Objects;

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
	
	public String toString() {
		return "(" + a + ", "+ b + ")";
	}
	 
	public int hashCode() {
		return Objects.hash(a,b);
	}
	
	public boolean equals(Object o) {
		if (o instanceof Pair) {
			Pair op = (Pair)o;
			return Objects.equals(a, op.a) && Objects.equals(b, op.b);
		}
		return false;
	}
 }

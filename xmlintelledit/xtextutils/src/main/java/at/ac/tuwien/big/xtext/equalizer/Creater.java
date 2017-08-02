package at.ac.tuwien.big.xtext.equalizer;

public interface Creater<T,U> {
	
	public T create(U forValue);

}

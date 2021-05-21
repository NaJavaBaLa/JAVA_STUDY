package chapter11;

public class DeepClone implements Cloneable {
	
	public int[] scores;
	public Car car;

	public DeepClone(int[] scores, Car car) {
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		//1. 얕
		
		
		return super.clone();
	}
	
	
	

}

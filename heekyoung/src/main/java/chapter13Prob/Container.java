package chapter13Prob;

public class Container<T, M> {
	private T key;
	private M value;
	
	public T getKey() {
		return key;
	}


	public M getValue() {
		return value;
	}


	public void set(T name, M job) {
		this.key = name;
		this.value = job;
	}
}

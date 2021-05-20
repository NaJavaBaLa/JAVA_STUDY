package chapter8.prob3;

public class Dog implements Soundable{
	private String sound = "멍멍";
	
	@Override
	public String sound() {
		return sound;
	}
	
}

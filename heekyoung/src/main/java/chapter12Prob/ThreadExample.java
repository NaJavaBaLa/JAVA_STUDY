package chapter12Prob;

public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			thread1.interrupt();
		}
		
	}
}

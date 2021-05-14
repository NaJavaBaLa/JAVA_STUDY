package chapter06;

public class SingletonExample {

	public static void main(String[] args) {

		
		// 컴파일 에
//		Singleton obj1 = new Singleton.getInstance();
//		Singleton obj1 = new Singleton.getInstance();
		
		
		
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		
		if(obj1 == obj2) {
			System.out.println("같은 싱글톤 객체입니다.");
			
		} else
		{
			System.out.println("다른 싱글톤 객체입니다. ");
		}
		
	}

}

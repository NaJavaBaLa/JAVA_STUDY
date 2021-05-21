package chapter11;
// 복제할 수 있는 클래스 선언 
// Object 의 clone() 메소드 

// 클론이 가능하다는 클래스 개발자의 허락의 의미로 Cloneable을 구현해야한다.

// 단!, 참조 타입 필드는 번지만 복제되기 때문에 같은 객체를 참조한다.
// 값의 변경이 일어나면 원본 객체도 변경된 객체를 가지게 된다. 
// 이를 해결하기 위해 깊은 복제가 있다. >>
// 깊은 복제는 clone() 오버라이드가  해줘야 한다. 


public class Clone implements Cloneable {
	public String id;
	public String password;
	
	public Clone(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public Clone getClone() {
		Clone cloned = null;
		try {
			// clone 객체를 cloned라는 Clone객체 변수에 넣는다.
			// clone() 메소드의 리턴 타입은 Obj이므로 Clone타입으로 캐스팅해야한다.
			cloned=(Clone) clone();
			
			//cloen()메소드는 CloneNotSupportedException 으로 예외처리를 해주어야 한다.
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}

}

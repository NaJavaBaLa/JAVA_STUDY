**1. 인터페이스에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 인터페이스는 객체 사용 설명서 역할을 한다.<br>
2) 구현 클래스가 인터페이스의 추상 메소드에 대한 실체 메소드를 가지고 있지 않으면 추상 클래스가 된다.<br>
3) 인터페이스는 인스턴스 필드를 가질 수 있다.<br>
4) 구현 객체는 인터페이스 타입으로 자동 변환된다.<br>

답 : 3번<br>
인터페이스는 인스턴스 필드를 가질 수 없음<br>
상수와 메소드만 가질 수 있음<br>

**2. 인터페이스의 다형성과 거리가 먼 것은?** <br>
1) 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.<br>
2) 매개 변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.<br>
3) 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장 할 수 있다.<br>
4) 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다.<br>

답 : 4번<br>
구현 객체를 인터페이스 타입으려 변환하면 자동 타입 변환이 됨<br>

**3. 다음은 Soundable 인터페이스입니다. sound() 추상 메소드는 객체의 소리를 리턴합니다.** <br>

```java
public interface Soundable{
	String sound();
}
```

**SoundableExample 클래스에서 printSound() 메소드는 Soundable 인터페이스 타입의 매개 변수를 가지고 있습니다. main() 메소드에서 printSound()를 호출 할 때 Cat과 Dong 객체를 주고 실행하면 각각 "야옹"과 "멍멍"이 출력되도록 Cat과 Dog 클래스를 작성해보세요.**

```java
public class SoundableExample{
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
```

답 :<br>

Cat.class

```java
public class Cat implements Soundable {
	@Override
	public String sound() {
		return "야옹";
	}
}
```

Dog.class

```java
public class Dog implements Soundable {
	@Override
	public String sound() {
		return "멍멍";
	}
}
```

**4. DaoExample 클래스의 main()메소드에서 dbWork() 메소드를 호출할 때 OracleDao와 MySqlDao 객체를 매개값으로 주고 호출했습니다. dbWork() 메소드는 두 객체를 모두 매개값으로 받기 위해 DataAccessObject 타입의 매개 변수를 가지고 있습니다. 실행 결과를 보고 DataAccessObject 인터페이스와 OracleDao, MySqlDao 구현 클래스를 각각 작성해보세요.** <br>
답 :

DaoExample.java

```java
public class DaoExample {
	
	public static void doWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		doWork(new OracleDao());
		doWork(new MySqlDao());
	}

}
```

DataAccessObject.java

```java
public interface DataAccessObject {
	void select();
	void insert();
	void update();
	void delete();
}

```

OracleDao.java

```java
public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
	}

}

```

MySqlDao.java

```java
public class MySqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}

	@Override
	public void insert() {
		System.out.println("MySql DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySql DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySql DB에서 삭제");
	}

}
```

**5. 다음은 Action 인터페이스 입니다. work() 추상메소드는 객체의 작업을 시작시킵니다.** <br>
답<br>
Action.java

```java
public interface Action{
	void work();
}
```

**ActionExample 클래스의 main() 메소드에서 Action의 익명 구현 객체를 만들어 다음과 같은 실행 결과가 나올 수 있도록 박스 안에 들어갈 코드를 작성해보세요.**<br>

ActionExample.java

```java
package chaper08Prob;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}
```
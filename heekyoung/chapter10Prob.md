**1. 예외에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그래밍 오류를 말한다.<br>
2) RuntimeException의 하위 예외는 컴파일러가 예외 처리코드를 체크하지 않는다.<br>
3) 예외는 try-catch 블록을 사용해서 처리된다.<br>
4) 자바 표준 예외만 프로그램에서 처리할 수 있다.<br>

답 : 4번<br>


**2.try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) try{ } 블록에는 예외가 발생할 수 있는 코드를 작성한다.<br>
2) catch{} 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.<br>
3) try {} 블록에서 return 문을 사용하면 finally{ } 블록은 실행되지 않는다.<br>
4) catch{ } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.<br>

답 : 3번<br>
finally는 항상 실행됨


**3. throws에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.<br>
2) throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.<br>
3) 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성할 수 있다.<br>
4) 새로운 예외를 발생시키기 위해 사용한다.<br>

답 : 4번<br>
새로운 예외를 발생시키는 것은 throw임

**4. throw에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 예외를 최초로 발생시키는 코드이다<br>
2) 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다.<br>
3) throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.<br>
4) throw 키워드 뒤에는 예외 객체 생성 코드가 온다.<br>

답 : 2번<br>
예외를 떠넘기는 것은 throws임


**5. 다음과 같은 메소드가 잇을 때 예외를 잘못 처리한 것은 무엇입니까?.** <br>

```java
public void method1() throws NumberFormatException, ClassNotFoundException { }
```

1) try { method1(); } catch (Exception e) { }<br>
2) void method2() throws Exception {method1(); } <br>
3) try { method1(); } catch (Exception e) { } catch (CalssNotFOundException e) { }<br>
4) try { method1(); } catch (ClassNotFoundException e) { } catch (NumberFormatException e ) { }.<br>

답 : 3번<br>
상위 클래스는 하위 클래스보다 아래에 있어야함


**6. 다음 코드가 실행되었을 때 출력 결과는 무엇입니까? ** <br>

```java
public class TryCatchFinallyExample{
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for (int i = 0; i <= 2; i++ ) {
			try {
				value = Integer.ParseInt(strArray[i]);;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.prinln(value);
			}
		}
	}
}
```

답 : 10<br>
숫자로 반환할 수 없음<br>
10<br>
인덱스를 초과했음<br>
10


**7. 로그인 기능을 Member 클래스의 login() 메소드에서 구현하려고 합니다. 존재하지 않는 ID를 입력했을 경우 NotExistIDException을 발생시키고, 잘못된 패스워드를 입력했을 경우 WrongPasswordException을 발생시키려고 합니다. LoginExample의 실행 결과를 보고 빈칸을 채워보세요.** <br>

답<br>

NotExistIDException.java

```java
package chapter10Prob;

public class NotExistIDException extends Exception {
	public NotExistIDException() { }
	
	public NotExistIDException(String message) {
		super(message);
	}

}
```

WrongPasswordException.java

```java
package chapter10Prob;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}

	public WrongPasswordException(String message) {
		super(message);
	}

}
```

LoginExample.java

```java
package chapter10Prob;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	private static void login(String id, String password) throws Exception {
		
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스 워드가 틀립니다.");
		}
	}
}

```
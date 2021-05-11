**1. 객체와 클래스에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 클래스는 객체를 생성하기 위한 설계도(청사진)와 같은 것이다.<br>
2) new 연산자로 클래스의 생성자를 호출함으로써 객체가 생성된다.<br>
3) 하나의 클래스로 하나의 객체만 생성할 수 있다.<br>
4) 객체는 클래스의 인스턴스이다.<br>

답 : 3번<br>
하나의 클래스로 여러개의 객체를 생성 할 수 있음<br>

**2. 클래스의 구성 멤버가 아닌 것은 무엇입니까?** <br>
1) 필드(field)<br>
2) 생성자(constructor)<br>
3) 메소드(method)<br>
4) 로컬 변수(local variable)<br>

답 : 4번<br>
클래스는 필드, 생성자, 메소드로 구성되어 있음<br>

**3. 필드, 생성자, 메소드에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 필드는 객체의 데이터를 저장한다.<br>
2) 생성자는 객체의 초기화를 담당한다.<br>
3) 메소드는 객체의 동작 부분으로, 실행 코드를 가지고 있는 블록이다.<br>
4) 클래스는 반드시 필드와 메소드를 가져야 한다.<br>

답 : 4번<br>
필드나 메소드는 생략할 수 있음<br>

**4. 필드에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 필드는 메소드에서 사용할 수 잇다.<br>
2) 인스턴스 필드 초기화는 생성자에서 할 수 있다.<br>
3) 필드는 반드시 생성자 선언 전에 선언되어야 한다.<br>
4) 필드는 초기값을 주지 않더라도 기본 값으로 자동 초기화 된다.<br>

답 : 3번<br>
필드는 클래스 중괄호 어디서든 선언 가능함<br>

**5. 생성자에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 객체를 생성하려면 생성자 호출이 반드시 필요한 것은 아니다.<br>
2) 생성자는 다른 생성자를 호출하기 위해 this()를 사용할 수 있다.<br>
3) 생성자가 선언되지 않으면 컴파일러가 기본 생성자를 추가한다.<br>
4) 외부에서 객체를 생성할 수 없도록 생성자에 private 접근 제한자를 붙일 수 있다.<br>

답 : 1번<br>
객체를 생성하기 위해서는 생성자 호출이 반드시 필요함<br>

**6. 메소드에 대한 설명으로 틀린 것은 무엇입니까?**<br>
1) 리턴 값이 없는 메소드는 리턴 타입을 void로 해야 한다.<br>
2) 리턴 타입이 있는 메소드는 리턴값을 지정하기 위해 반드시 return 문이 있어야 한다.<br>
3) 매개값의 수를 모를 경우 "..."을 이용해서 매개 변수를 선언할 수 잇다.<br>
4) 메소드의 이름은 중복해서 선언할 수 없다.<br>

답 : 4번 <br>
메소드 오버로딩을 하면 같은 이름을 중복해서 사용 가능함<br>
3번의 경우 ...을 사용해서 선언하면 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용 됨<br>

**7. 메소드 오버로딩에 대한 설명으로 틀린 것은 무엇입니까?**<br>
1) 동일한 이름의 메소드를 여러 개 선언하는 것을 말한다.<br>
2) 반드시 리턴 타입이 달라야 한다.<br>
3) 매개 변수의 타입, 수, 순서를 다르게 선언해야 한다.<br>
4) 매개값의 타입 및 수에 따라 호출될 메소드가 선택된다.<br>

답 : 2번 <br>
메소드 오버로딩은 변수 타입과 수, 순서로 정해짐 리턴타입은 상관없음

**8 인스턴스 멤버와 정적 멤버에 댛나 설명으로 틀린 것은 무엇입니까?**<br>
1) 정적 멤버는 static으로 선언된 필드와 메소드를 말한다.<br>
2) 인스턴스 필드는 생성자 및 정적 블록에서 초기화 될 수 있다.<br>
3) 정적 필드와 정적 메소드는 객체 생성 없이 클래스를 통해 접근할 수 있다.<br>
4) 인스턴스 필드와 메소드는 객체를 생성하고 사용해야 한다.<br>

답 : 2번<br>
정적 메소드와 필드는 객체가 없어도 실행된다는 특징이 있기 때문에 객체를 생성해서 사용해야 하는 생성자 및 정적 블록에서 초기화 할 수 없음

**9. final 필드와 상수(static final)에 대한 설명으로 틀린 것은 무엇입니까?**<br>
1) final 필드와 상수는 초기값이 저장되면 값을 변경할 수 없다.<br>
2) final 필드와 상수는 생성자에서 초기화 될 수 있다.<br>
3) 상수의 이름은 대문자로 작성하는 것이 관례이다.<br>
4) 상수는 객체생성없이 클래스를 통해 사용할 수 있다.<br>

답 : 2번<br>
선언과 동시에 초기 값을 주는 것이 일반적이지만 정적 블록을 사용해 초기값을 주는 것도 가능 함


**10. 패키지에 대한 설명으로 틀린 것은 무엇입니까?**<br>
1) 패키지는 클래스들을 그룹화시키는 기능을 한다.<br>
2) 클래스가 패키지에 소속되려면 패키지 선언을 반드시 해야 한다.<br>
3) import문은 다른 패키지의 클래스를 사용할 때 필요하다.<br>
4) mycompany 패키지에 소속된 클래스는 yourcompany에 옮겨 놓아도 작동한다.<br>

답 : 4번<br>
클래스만 따로 복사해서 다른 곳으로 이동하면 클래스는 사용 불가능함

**11. 접근 제한에 대한 설명으로 틀린 것은 무엇입니까?**<br>
1) 접근 제한자는 클래스, 필드, 생성자, 메소드의 사용을 제한한다.<br>
2) public 접근 제한은 아무런 제한 없이 해당 요소를 사용할 수 있게 한다.<br>
3) default 접근 제한은 해당 클래스 내부에서만 사용을 허가한다.<br>
4) 외부에서 접근하지 못하도록 하려면 private 접근 제한을 해야 한다.<br>

답 : 3번<br>
default는 같은 패키지 내에 있는 클래스는 사용 가능함

**12. 다음 클래스에서 해당 멤버가 필드, 생성자, 메소드 중 어떤 것인지 빈칸을 채우세요.**<br>

```java
public class Member{
	private STring name; //필드
	public Member(String name); { } //생성자
	public void setName(String name); { ) //메소드
}
```

**13. 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드 나이가 있습니다. 이 데이터들을 가지는 Member 클래스를 선언해보세요.** <br>

```java
public class Member{
	String name; //데이터 이름
	String id; //아이디
	String password; //패스워드
	int age; //나이
}
```

**14. 위에서 작성한 Member 클래스에 생성자를 추가하려고 합니다. 다음과 같이 Member 객체를 생성할 때 name 필드와 id 필드를 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 합니까?**<br>

```java
public class Member {
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}
```

**15. MemberService 클래스에 login() 메소드와 logout()메소드를 선언하려고 합니다. login() 메소드를 호출 할 때에는 매개값으로 id와 password를 제공하고, logout() 메소드는 id만 매개값으로 제공합니다. MemberService 클래스와 login(), logout() 메소드를 선언해 보세요.**<br>
1) login() 메소드는 매개값 id가 "hong", 매개값 password가 "12345"일 경우에만 true로 리턴하고 그 이외의 값일 경우에는 false를 리턴하도록 하세요.<br>
2) logout() 메소드의 내용은 "로그아웃 되었습니다."가 출력되도록 하세요.<br>

MemberService class

```java
package chaper06Prob;

public class MemberService {
	private String id = "hong";
	private String password = "12345";

	public boolean login(String id, String password) {
		if (this.id.equals(id) && this.password.equals(password)) {
			return true;
		} else {
			return false;
		}
	}

	public void logout(String string) {
		System.out.println("로그아웃 되었습니다.");
	}
}
```

MemberServiceExample

```java
package chaper06Prob;

public class MemberServiceExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		
		if (result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}
```

**16.PrinterExample 클래스에서 Printer 객체를 생성하고 println() 메소드를 호출해서 매개값을 콘솔에 출력하려고 합니다. println() 메소드의 매개값으로는 int, boolean, double, String 값을 줄 수 있습니다. Printer 클래스에서 println() 메소드를 선언해보세요. **

```java
package chaper06Prob;

public class Printer {

	public void println(int x) {
		System.out.println(x);
	}

	public void println(boolean flag) {
		System.out.println(flag);
	}
	
	public void println(double x) {
		System.out.println(x);
	}
	
	public void println(String result) {
		System.out.println(result);
	}

}
```

```java
package chaper06Prob;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
```

**17. 16번 문제에서 Printer 객체를 생성하고 println()메소드를 생성했습니다. Printer 객체를 생성하지 않고 PrinterExample 클래스에서 다음과 같이 호출하려면 Printer 클래스를 어떻게 수정하면 될까요?**

```java
package chaper06Prob;

public class Printer {

	public static void println(int x) {
		System.out.println(x);
	}

	public static void println(boolean flag) {
		System.out.println(flag);
	}
	
	public static void println(double x) {
		System.out.println(x);
	}
	
	public static void println(String result) {
		System.out.println(result);
	}

}
```

```java
package chaper06Prob;

public class PrinterExample {

	public static void main(String[] args) {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");
	}
}
```

**18. ShopService 객체를 싱글톤으로 만들고 싶습니다. ShopServiceExample 클래스에서 ShopService의 GetInstance() 메소드로 싱글톤을 얻을 수 있도록 ShopService 클래스를 작성해보세요. ** <br>

```java
package chaper06Prob;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}

	}

}
```

```
package chaper06Prob;

public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
	}
	
	static ShopService getInstance() {
		return shopService;
	}

}
```

**19. 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있습니다. balance 필드는 음수값이 될 수 없고, 최대 백만 원까지만 저장할 수 있습니다. 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고, 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래스를 작성해보세요.** <br>
1) Setter와 Getter를 이용하세요. <br>
2) 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용하세요.<br>
3) Setter의 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지하세요.

```java
package chaper06Prob;

public class Account {
	private int balance;
	private static int MIN_BALANCE = 0;
	private static int MAX_BALANCE = 1000000;

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		if (balance < MIN_BALANCE || this.balance + balance > MAX_BALANCE) {
			return;
		}
		
		this.balance += balance;
	}

}
```

```java
package chaper06Prob;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
	}
}
```

**20. 다음은 키보드로부터 계좌 정보를 입력받아서, 계좌를 관리하는 프로그램입니다. 실행 결과를 보고, 알맞게 BankApplication 클래스의 메소드를 작성해보세요.**

```java
package chaper06Prob;

import java.util.Iterator;
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int num = 0;
	private static String name;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	//출금하기
	private static void withdraw() {
		System.out.println("------");
		System.out.println("출금");
		System.out.println("------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("출금액:");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance()-balance);
		System.out.println("결과: 출금이 성공되었습니다.");
	}

	//예금하기
	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		System.out.print("계좌번호:");
		String ano = scanner.next();
		System.out.print("예금액:");
		int balance = scanner.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance()+balance);
		System.out.println("결과: 예금이 성공되었습니다.");
	}

	//계좌 목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");

		for (int i = 0; i < num; i++) {
			System.out.println(accountArray[i].getAno()+"\t" + accountArray[i].getOwner() +"\t" + accountArray[i].getBalance());
		}
	}

	//계좌 생성하기
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = scanner.next();
		System.out.print("계좌주:");
		String name = scanner.next();
		System.out.print("초기입금액 :");
		int balance = scanner.nextInt();
		accountArray[num] = new Account(ano, name, balance);
		num++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	//Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		Account account = null;

		for (int i = 0; i < num; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				account = accountArray[i];
				break;
			}
		}
		return account;
	}
}
```

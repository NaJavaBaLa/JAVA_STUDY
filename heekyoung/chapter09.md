# Chatper09. 중첩 클래스와 중첩 인터페이스
<hr/>

## 9.1 중첩 클래스와 중첩 인터페이스란?
중첩 클래스(Nested Class) : 클래스 내부에 선언한 클래스

```java
class ClassName{
	class NestedClassName{
	}
}
```

인터페이스도 클래스 내부에 선언할 수 있음 => 중첩 인터페이스

```java
class ClassNae{
	interface NestedInterfaceName{
	}
}
```

## 9.2 중첩 클래스
멤버 클래스 : 클래스의 멤버로서 선언되는 중첩 클래스<br>
로컬 클래스 : 메소드 내부에서 선언되는 중첩 클래스<br>
멤버 클래스는 클래스나 객체가 사용중이라면 언제든 재사용 가능하지만 로컬 클래스는 메소드 실행시에만 사용되고 종료되면 없어짐

### 9.2.1 인스턴스 멤버 클래스
인스턴스 멤버 클래스 : static 키워드 없이 선언된 클래스<br>
=> 인스턴스 필드와 메소드만 선언 가능하고 정적 필드와 메소드는 선언 불가능

### 9.2.2 정적 멤버 클래스
정적 멤버 클래스 : static 키워드로 선언된 클래스<br>
모든 종류의 필드와 메소드 선언 가능

### 9.2.3 로컬 클래스
중첩 클래스는 메소드 내에서도 선언 가능 => 로컬 클래스<br>
로컬 클래스에는 접근 제한자(public, private) 및 static을 붙일 수 없음<br>
로컬 클래스 내부에는 인스턴스 필드와 메소드만 선언 가능하고 정적 필드와 메소드는 선언 불가능

## 9.3 중첩 클래스의 접근 제한
### 9.3.1 바깥 필드와 메소드에서 사용 제한

```java
public class A{
	//인스턴스 필드
	B field1 = new B(); //가능
	C field2 = new C(); //가능
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B(); //가능
		C var2 = new C(); //가능
	}
	
	//정적 필드 초기화
	//static B field3 = new B(); 불가능
	static C field4 = new C(); //가능
	
	//정적 메소드
	static void method2() {
	//B var1 = new B(); 불가능
	C var2 = new C(); //가능
	}
	
	//인스턴스 멤버 클래스
	clas B {}
	
	//정적 멤버 클래스
	static class C {}
}
```

### 9.3.2 멤버 클래스에서 사용 제한
- 멤버 클래스가 인스턴스 또는 정적으로 선언됨에 따라 멤버 클래스 내부에서 바깥 클래스의 필드와 메소드를 접근할 때에도 제한이 따름
- 인스턴스 멤버 클래스 C 안에서는 바깥 클래스의 모든 필드와 모든 메소드를 접근할 수 있지만, 정적 멤버 클래스 C 안에서는 바깥 클래스의 정적필드(field2)와 메소드 method2에만 접근 가능하고 인스턴스 필드 field1과 메소드 method1은 접근 불가능

```java
public class A{
	int field1;
	void method1() { }
	
	static int field2;
	static void method2() { }
	
	//모든 필드와 메소드에 접근 가능함
	class B{
		void method() {
		field1 = 10;
		method1();
		
		field2 = 10;
		method2();
	}
	
	//인스턴스 필드와 메소드는 접근 불가능
	static class C{
		void method(){
			//field1 = 10;
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
```

### 9.3.3 로컬 클래스에서 사용 제한
- 로컬 클래스 내부에서는 바깥 클래스의 필드나 메소드를 제한없이 사용할 수 있다.
- 로컬 클래스에 사용된 매개 변수와 로컬 변수는 모두 final 특성을 가짐

```java
public class Outter{
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; 불가능
		//localVariable = 100; 불가능
		
		class Inner{
			public void method(){
				int result = arg + localVariable;
			}
		}
		
	}
}
```

### 9.3.4 중첩 클래스에서 바깥 클래스 참조 얻기
- 클래스 내부에서 this는 객체 자신의 참조
- 중첩 클래스에서 this 사용시 바깥 클래스의 객체 참조가 아니라 중첩 클래스의 객체가 참조 됨
- 바깥 클래스의 객체 참조를 얻으려면 바깥 클래스의 이름을 this앞에 붙여줌

```java
public class Outter{
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class nested {
		String field = "Nested-field";
		void metohd() {
			System.out.println("Nested-method");
		}
	}
	void print() {
		//중첩 객체 참조
		System.out.println(this.field);
		this.method();
		
		//바깥 객체 참조
		System.out.println(Outter.this.field);
		Outter.field.metohd();
	}
}
```

## 9.4 중첩 인터페이스
- 중첩 인터페이스 : 클래스의 멤버로 선언된 인터페이스

## 9.5 익명 객체
- 익명(anonymous) 객체 : 이름 없는 객체
- 단독으로 생성 불가능하고 클래스를 상속하거나 인터페이스를 구현해야만 생성 가능

### 9.5.1 익명 자식 객체 생성
- 필드와 변수의 초기값으로만 사용할 경우라면 익명 자식 객체를 생성해서 초기값으로 대입하는 것이 좋은 방법임
- 실행문 끝에 반드시 세미콜론을 붙여야 함

필드를 선언할 대 초기값으로 익명 자식 객체를 생성해서 대입함

```java
class A{
	//A 클래스 필드 선언
	Parent field = new Parent(){
		int childField;
		void childMethod() { }
		
		//Parent 메소드를 오버라이딩
		@Override
		void parentMethod() { }
	}
}
```

메소드 내에서 로컬 변수를 선언할 때 초기값으로 익명 자식 객체를 생성해서 대입

```java
class A{
	void method(){
		Parent localVar = new Parent() {
			int childField;
			void childMethod() { }
			
			//Parent의 메소드를 오버라이딩
			@Override
			void parentMethod() { }
		};
	}
}
```

- 익명 자식 객체에 새롭게 정의된 필드와 메소드는 익명 자식 객체 내부에서만 사용되고 외부에서 접근 불가능
 => 익명 자식 객체는 부모 타입 변수에 대입되므로 부모 타입에 선언된 것만 사용 가능
 
 
 ### 9.5.2 익명 구현 객체 생성
 - 해당 필드와 변수의 초기값으로만 사용하는 경우라면 익명 구현 객체를 초기값으로 대입하는 것이 좋음

 필드를 선언할 때 초기값으로 익명 구현 객체를 생성해서 대입
 
 ```java
 class A{
 	//클래스 A의 필드 선언
 	RemoteControl field = new RemoteConrol() {
 	//RemoteControl 인터페이스의 추상 메소드에 대한 실체 메소드
 	@Override
 	void trunOn(){ }
 	};
 }
 ```
 
 메소드 내에서 로컬 변수를 선언 할 때 초기값으로 익명 구현 객체를 생성해서 대입
 
 ```java
 void method() {
 	//로컬 변수 선언
 	RetmoteControl localVar = new RemoteConrol() {
 	//RetmoteControl 인터페이스의 추상 메소드에 대한 실체 메소드
 	@Override
 	void turnOn() { }
 	};
 }
 ```
 
 메소드의 매개 변수가 인터페이스 타입일 경우 메소드 호출 코드에서 익명 구현 객체를 생성해서 매개값으로 대입할 수 있음
 
 ```java
 class A{
 	void method1(RemoteControl rc) { }
 	
 	//method1 호출
 	void method2() {
	 	//method1()의 매개값으로 익명 구현 객체 대입
 		method1(
 			new RemoteConrol(){
 			@Override
 			void turnOn(){ }
 			}
 		};
 	}
 }
 ```
 
 ### 9.5.3 익명 객체의 로컬 변수 사용
 - 익명 객체 내부에서는 바깥 클래스의 필드나 메소드는 제한없이 사용 가능
 - 익명 객체 내부에서 메소드의 매개 변수나 로컬 변수를 사용할 경우, final 특성을 가져야 함
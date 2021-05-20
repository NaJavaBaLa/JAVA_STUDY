# Chatper10. 인터페이스
<hr/>

## 10.1 예외와 예외 클래스
- 예외 : 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 발생하는 프로그램 오류
- 예외 처리(Exception Handling)을 통해 프로그램을 종료하지 않고 정상 실행 상태가 유지되도록 할 수 있음
- 일반 예외(Exception)와 실행 예외 (Runtime Exception)
- 자바에서는 예외를 클래스로 관리 함
- JVM 은 프로그램을 실행하는 도중 예외가 발생하면 예외 클래스로 객체 생성
- java.lang.Exception 클래스를 상속 받음
- 일반 예외는 Exception을 상속받지만 Runtime Exception을 상속받지 않음
- 실행예외는 RuntimeException을 상속받음

## 10.2 실행 예외
- 오로지 개발자의 경험에 의해서 예외 처리 코드를 삽입해야 함 => 코드를 넣지 않으면 프로그램 곧바로 종료

### 10.2.1 NullPointerException
- java.lang.NullPointerException 실행 예외
- 객체 참조가 없는 상태 => Null 값을 갖는 참조 변수로 객체 접근 연산자인 도트를 사용했을 때 발생
- 객체가 없는데 객체를 사용하려고 해서 생긴 예외

### 10.2.2 ArrayIndexOutOfBoundsException
- 배열에서 인덱스 범위를 초과하여 사용할 경우 java.lang.ArrayIndexOutOfBoundsException이 실행 예외 발생

### 10.2.3 NumberFormatException
- int 반환 타입 : Integer.parseInt(String s) : 문자열을 정수로 반환해서 리턴
- double 반환 타입 : Double.parseDouble(String s) : 문자열을 실수로 변환해서 리턴
- 숫자로 변환 될 수 없는 문자가 포함되면 NumberFormatException 발생

### 10.2.4 ClassCastException
- 억지로 타입 변환을 할 경우 ClassCastException 발생
- classCastException을 발생시키지 않으려면 타입 변환전에 instanceof 연산자로 확인해보는 것이 좋음

## 10.3 예외 처리 코드
- 예외 처리 코드 : 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드
- try-catch- finally 블록을 이용함
- try : 예외 발생 가능 코드
 => 예외 발생 없이 정상 실행되면 catch 블록의 코드는 실행되지 않고 finally 블록 코드를 실행
    예외가 발생하면 즉시 멈추고 catch 블록으로 이동하여 예외 처리 코드 실행하고 finally 블록은 항상 실행
 
## 10.4 예외 종류에 따른 처리 코드
### 10.4.1 다중 catch
- catch 블록이 여러개라도 하나의 catch만 실행 됨
- 동시 다발적으로 예외가 발생하지 않고 하나의 예외가 발생하면 즉시 실행을 멈추고 해당 catch로 이동하기 때문에

### 10.4.2 catch 순서
- 상위 예외 클래스가 하위 예외 클래스보다 아래쪽에 위치해야 함


### 10.4.3 멀티 catch
- 하나의 catch문 안에서 여러 개의 예외를 처리할 수 있도록 multi catch 기능을 추가
- catch 괄호 안에 동일하게 처리하고 싶은 예외를 |로 연결한다

## 10.5 자동 리소스 닫기
- try-with-resources를 사용하면 예외 발생 여부와 상관없이 사용했던 리소스 객체(각종 입출력 스트림, 서버 소켓, 소켓, 각종 채널)의 close() 메소드 호출

## 10.6 예외 떠넘기기
- 경우에 따라서 메소드를 호출한 곳으로 예외를 떠넘길 수 있다.
- throws를 키워드를 사용함
- throws 키워드는 메소드 선언부 끝에 작성되어 메소드에 처리하지 않은 예외를 호출한 곳으로 떠넘김

## 10.7 사용자 정의 예외와 예외 발생
- 애플리케이션 예외(Application Exception) : 애플리케이션 서비스와 관련된 예외, 개발자가 직접 정의해서 만들어야 함

### 10.7.1 사용자 정의 예외 클래스 선언
- 컴파일러가 체크하는 일반 예외나 체크하지 않는 실행 예외로 선언 가능
- 일반 예외로 선언할 경우 Exception 상속, 실행 예외로 선언할 경우 RuntimeException 상속하면 됨
- 사용자 정의 예외 클래스도 필드, 생성자, 메소드 선언을 할 수 있지만 대부분 생성자 선언만 포함
- 생성자는 두개를 선언하는 것이 일반적
  => 하나는 매개 변수가 없는 기본 생성자, 다른 하나는 예외 발생 원인(예외 메시지)를 전달하기 위한 String 타입의 매개변수를 갖는 생성자
  
### 10.7.2 예외 발생시키기
- 예외 객체를 생성할 때는 기본 생성자 또는 예외 메시지를 갖는 생성자 중 아무거나 사용해도 됨
- throw new XXXException을 이용해 예외 발생

## 10.8 예외 정보 얻기
- 예외가 발생하면 예외 객체는 catch 블록의 매개 변수에서 참조하게 되므로 매개 변수를 이용하면 예외 객체의 정보를 알 수 있다.
- 모든 예외 객체는 Exception 클래스를 상속하기 때문에 Exception이 가지고 있는 메소드들은 모든 예외 객체에서 호출 가능
- 많이 사용하는 메소드는 getMessage(), printStackTrac()
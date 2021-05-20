# Chatper11. 기본 API 클래스
<hr/>

## 11.1 자바 API 도큐먼트
- API(Application Programming Interface) : 라이브러리
- 프로그램 개발에 자주 사용되는 클래스 및 인터페이스의 모음

## 11.2 java.lang과 java.util 패키지
### 11.2.1 java.lang 패키지
- 자바 프로그램의 기본적인 클래스를 담고 있는 패키지
- java.lang 패키지에 있는 클래스와 인터페이스는 import 없이 사용 가능

**java.lang 패키지 주요 클래스와 용도** <br>
- Object : 자바 클래스의 최상위 클래스<br>
- System : 표준 입력 장치로부터 데이터를 입력받을 때 사용 <br> 표준 출력 장치모니터로 출력하기 위해 사용<br> 자바 가상 기계를 종료시킬 때 <br> 쓰레기 수집기를 실행 요청할 때 사용
- Class : 클래스를 메모리로 로딩할 때 사용
- String : 문자열을 저장하고 여러가지 정보를 얻을 때 사용
- StringBuffer, StringBuilder : 문자열을 저장하고 내부 문자열을 조작할 때 사용
- Math : 수학 함수를 이용할 때
- Wrapper(Byte, Short, Character, Integer, Float, Double, Boolean, Long) : 기본 타입의 데이터를 갖는 객체를 만들 때 사용 <br> 문자열을 기본 타입으로 반활 할 때 사용 <br> 입력값 검사에 사용


### 11.2.2 java.util 패키지
- 컬렉션 클래스들이 대부분
- Arrays : 배열을 조작(비교, 복사, 정렬, 찾기) 할 때 사용
- Calendar : 운영 체제의 날짜와 시간을 얻을 때
- Date : 날짜와 시간 정보를 저장하는 클래스
- Objects : 객체 비교, 널 여부등을 조사할 때 사용
- StringTokenizer : 특정문자로 구분된 문자열을 뽑아낼 때 사용
- Random : 난수를 얻을 때


## 11.3 Object 클래스
- extends로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상속함
- Object 클래스는 필드가 없고 메소드로만 구성

### 11.3.1 객체 비교(equals())

```java
public boolean equals(Object obj) { }
```

- 매개 타입은 Object => 모든 객체가 매개값으로 대입가능 함 => Object는 최상위 타입이므로 모든 객체는 Object 타입으로 자동 타입 변환 가능하기 때문에
- 비교 연산자인 == 과 동일한 결과를 리턴함
- 객체를 비교해서 논리적으로 동등하면 true 리턴 아니면 false 리턴

### 11.3.2 객체 해시코드(hashCode())
- 객체 해시코드 : 식별할 하나의 정수값
- Object의 hashCode() 메소드는 객체의 메모리 번지를 이용해서 해시코드를 만들어 리턴하기 때문에 객체마다 다른 값을 가짐
- hashcode 값이 다르면 다른 객체로 판단하고 같으면 equals() 메소드로 비교 => equals로 비교 했을 때 다르면 다른 객체가 됨

### 11.3.3 객체 문자 정보(toString())
- toString() 메소드는 객체의 문자 정보 리턴 
 
### 11.3.4 객체 복제(clone())
- 객체 복제 : 원본 객체의 필드값과 동일한 값을 가지는 새로운 객체를 생성하는 것
=> 원본 객체를 안전하게 보호하기 위해서 <br>

**얕은 복제(thin clone)**<br>
- 얕은 복제 : 필드값을 복사해서 객체를 복제하는 것
=> 필드값만 복제하기 때문에 필드가 기본 타입일 경우에 값 복사가 일어나고 필드가 참도 타입일 경우에는 객체의 번지가 복사 됨
- clone() 메소드를 구현하려면 원본 객체는 반드시 java.lang.Cloneable 인터페이스를 구현하고 있어야 함

**깊은 복제(deep clone)**
- 깊은 복제 : 참조하고 있는 객체도 복제함
- 얕은 복제는 참조 타입 필드 번지만 복제되기 때문에 원본 객체의 필드와 복제 객체의 필드는 같은 객체를 참조함
=> 복제 객체에서 참조 객체를 변경하면 원본 객체도 변경된 객체를 가지는 것이 단점임 !<br>
 하지만 깊은 복제는 참조하고 있는 배열 객체도 복제해버림
 - clone() 메소드를 재정의해서 참조 객체를 복제하는 코드를 직접 작성해야 함

### 11.3.5 객체 소멸자(finalize())
- 참조하지 않는 배열이나 객체는 쓰레기 수집기(Garbage Collector)가 힙 영역에서 자동 소멸 시킴
- 쓰레기 수집기는 소멸 직전에 마지막으로 객체의 소멸자(finalize())를 실행
- 무작위로 소멸 시킴
- 메모리의 상태를 보고 일부만 소멸 시킴
- finalize() 호출 시점은 명확하지 않음


## 11.4 Objects 클래스
- java.util.Objects 클래스는 객체 비교, 해시코드 생성, null 여부, 객체 문자열 리턴 등의 연산을 수행하는 정적 메소들로 구성된 Object의 유틸리티 클래스


### 11.4.1 객체 비교 (compare(T a, T b, Comparator<T> c0)
- 두 객체를 비교자 (Comparator)로 비교해서 int 값을 리턴
- java.util.Comparator<T>는 제네릭 인터페이스 타입으로 두 객체를 비교하는 compare(T a, T b) 메소드가 정의
- a가 b보다 작으면 음수, 같으면 0, 크면 양수를 리턴하도록 구현 클래스를 만들어야 함
  
### 11.4.2 동등 비교(equals()와 deepEquals())
- Objects.equals(Object a, Object b)는 두 객체의 동등을 비교 함
- a와 b가 모두 null일 경우 true를 리턴
- a와 b가 null이 아닌 경우는 a.equals(b)의 결과를 리턴함
- Objects.deepEquals(Object a, Object b)는 두 객체의 동등을 비교
- a와 b가 서로 다른 배열일 경우, 항목 값이 모두 같다면 true 리턴

### 11.4.3 해시코드 생성(hash(), hashCode())
- Objects.hash(Object values) 메소드는 매개값으로 주어진 값들을 이용해서 해시코드를 생성함
- 주어진 매개값들로 배열을 생성하고 Arrays.hashCode(Object[])를 호출해서 해시코드를 얻고 이 값을 리턴 함
- 클래스가 hashCode()를 재정의 할 때 리턴 값을 생성하기 위해 사용하면 좋음
- 클래스가 여러가지 필드를 가지고 있을 때 이필드들로부터 해시코드를 생성하게 되면 동일한 필드값을 가지는 객체는 동일한 해시코드를 가질 수 있음

### 11.4.4 널 여부 조사(isNull(), nonNull(), requireNonNull())
- Objects.isNull(Object obj)는 매개값이 null일 경우 true 리턴
- nonNull(Ojbect obj)는 매개값이 not null일 경우 true를 리턴

### 11.4.5 객체 문자 정보(toString())
- Objects.toString()은 객체의 문자 정보를 리턴
- 첫번째 매개값이 not null이면 toString()으로 얻은 값을 리턴하고 null이면 "null" 또는 두번째 매개값인 nullDefault를 리턴


## 11.5 System 클래스
- System 클래스의 모든 필드와 메소드는 정적(static) 필드와 정적(static) 메소드로 구성

### 11.5.1 프로그램 종료(exit())
- 강제적으로 JVM을 종료 시킬 때 사용, 현재 실행하고 있는 프로세스를 강제 종료시키는 역할
- int 매개값을 지정하도록 되어 있음 => 종료 상태값
- 정상 종료일 경우 0 비정상 종료일 경우 0 이외의 값

### 11.5.2 쓰레기 수집기 실행(gc())
- 자바는 JVM 알아서 메모리를 자동으로 관리
- JVM은 메모리가 부족할 때와 CPU가 한가할 때에 쓰레기 수집기(Garbage Collector)를 실행시켜 사용하지 않는 객체를 자동 제거함
- System.gc() 메소드를 호출하면 JVM에게 가능한 빨리 실행해 달라고 요청 할 수 있음

### 11.5.3 현재 시각 읽기(currentTimeMillis(), nanoTime())
- System 클래스의 currentTimeMillis()의 메소드와 nanoTime() 메소드는 컴퓨터의 시계로부터 현재 시간을 읽어서 밀리 세컨드 단위와 나노 세컨드 단위로 long 값을 리턴


### 11.5.4 시스템 프로퍼티 읽기(getProperty())
- 시스템 프로퍼티(System Property) : JVM이 시작할 때 자동 설정되는 시스템의 속성값
- 키와 값으로 구성되어 있음

```java
String value = System.getProperty(String key);
```

- 시스템 프로퍼티의 키 이름을 매개값으로 받고 해당 키에 대한 값을 문자열로 리턴
- keySet() 메소드를 호출하면 키만으로 구성된 Set 객체를 얻을 수 있음


### 11.5.5 환경 변수 읽기(getenv())
- 환경 변수 : 프로그램 상의 변수가 아니라 운영체제에서 이름과 값으로 관리되는 문자열 정보


## 11.6 Class 클래스
### 11.6.1 Class 객체 얻기(getClass(), forName())
- getClass() : Class 객체를 얻기 위해서 Object 클래스가 가지고 있는 메소드
- 해당 클래스로 객체를 생성했을 때만 사용 가능
- 객체를 생성하기 전에 직접 class 객체를 얻을 수 있다.
- Class는 생성자를 감추고 있기 때문에 new 연산자로 객체를 만들 수 없고 정적 메소드인 forName()을 이용해야 함

### 11.6.2 리플렉션(getDeclaredConstructors(), getDeclaredFields(), getDeclaredMethods())
- 리플렉션 : Class 객체를 이용하면 클래스의 생성자,필드, 메소드 정보를 알 수 있음
- Class 객체는 리플렉션을 위해 getDeclaredConstructors()와 getDeclaredFields(), getDeclaredMethods()를 제공
- 상속된 멤버도 얻고 싶다면 getFields(), getMethods()를 이용, 단 public 멤버만 가져온다

### 11.6.3 동적 객체 생성(newInstance())
- new 연산자를 사용하지 않아도 동적으로 객체 생성 가능
- 코드 작성시에 클래스 이름을 결정할 수 없고 런타임 시에 클래스 이름이 결정되는 경우 매우 유용
- newInstance() 메소드는 기본 생성자를 호출해서 객체를 생성하기 때문에 반드시 클래스에 기본 생성자가 존재해야 한다.
- 매개 변수가 있는 생성자를 호출하고 싶으면 리플렉션으로 Constructor 객체를 얻어 newInstance() 메소드를 호출하면 됨


## 11.7 String 클래스
### 11.7.1 String 생성자

### 11.7.2 String 메소드
**문자 추출(charAt())**
- 매개값으로 주어진 인덱스의 문자를 리턴

**문자열 비교(equals())**
- 문자열을 비교할 때에는 == 연산자를 이용하면 원하지 않는 결과가 나옴
- String 객체의 문자열만 비교하고 싶다면 equals()메소드를 사용

**바이트 배열로 변환(getBytes())**
- getBytes() 메소드 : 시스템의 기본  문자셋으로 인코딩된 바이트 배열을 리턴
- getBytes(Charset charset) 메소드 : 특정 문자셋으로 인코딩된 바이트 배열을 얻을 때 사용
- String(byte[] bytes) 생성자를 이용해서 디코딩하면 시스템의 기본 문자셋을 이용

**문자열 찾기(indexOf())**
- indexOf() 메소드는 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴
- 주어진 문자열이 없으면 -1 리턴

**문자열 길이(length())**
- 문자열의 길이나 문자의 수를 리턴

**문자열 대치(replace())**
- 첫번째 매개값인 문자열을 찾아 두번째 매개값인 문자열로 대치한 새로운 문자열을 생성하고 리턴

```java
String oldStr = "자바 프로그래밍";
String newStr = oldStr.replcae("자바", "JAVA");
```

- String 객체의 문자열은 변경이 불가능함 => replace() 메소드가 리턴하는 문자열은 완전히 새로운 문자열임

**문자열 잘라내기(substring())**
- 주어진 인덱스에서 문자열을 추출
- substring() 메소드는 매개값의 수에 따라 두가지 형태로 사용
- substring(int beginIndex, int endIndex) : 주어진 시작과 끝 인덱스 사이의 문자열 추출
- substring(int beginIndex) : 주어진 인덱스부터 끝까지 문자열을 추출

**알파벳 소대문자변경(to LowerCase(), toUpperCase())**
- toLowerCase() 메소드 : 문자열을 모두 소문자로 바꾼 새로운 문자열을 생성한 후 리턴
- toUpperCase() 메소드 : 문자열을 모두 대문자로 바꾼 새로운 문자열을 생성한 후 리턴

**문자열 앞뒤 공백 잘라내기(trim())**
- 문자열의 앞뒤 공백을 제거한 새로운 문자열을 생성하고 리턴
- 앞뒤 공백만 제거하지 중간 공백은 제거하지 않음

**문자열 변환(valueOf())**
- 기본 타입의 값을 문자열로 변환하는 기능

## 11.8 StringTokenizer 클래스
- 문자열이 특정 구분자(delimiter)로 연결되어 잇을 경우, 구분자를 기준으로 부분 문자열을 분리하기 위해서는 String의 split() 메소드를 이용하거나 StringTokenizer 사용
- split()은 정규 표현식으로 구분하고 StringTokenizer는 문자로 구분

### 11.8.1 split() 메소드
- 정규표현식을 구분자로 해서 문자열을 분리한 후 배열에 저장하고 리턴

### 11.8.2 StringTokenizer 클래스
- 문자열이 한 종류의 구분자로 연결되어 있을 경우, StringTokenizer를 사용하면 문자열을 쉽게 분리 할 수 있음
- StringTokenzier 객체를 생성 ㅎ라 때 첫번째 매개값으로 전체 문자열을 주고, 두번째 매개값으로 구분자를 줌
- 구분자를 생략하면 공백이 구분자가 됨
- nextToken() 메소드로 토큰을 하나 꺼내오면 StringTokenizer 객체에는 해당 토큰이 없어짐
- nextToken() 메소드 사용 전 hashMoreTokesn() 메소드로 꺼내올 토큰이 있는 조사 후 nextToken() 메소드를 호출하는 것이 좋음

## 11.9 StringBuffer, StringBuilder 클래스
- 문자열을 저장하는 String은 내부의 문자열을 수정할 수 없음 => 'a' + 'b' = 'ab'는 대치가 아니라 새로운 문자열이 생성되어서 리턴 된 것
- 문자열을 변경하는 작업이 많을 경우 StringBuffer나 StringBuilder를 사용하는 것이 좋음
- 이 두 클래스는 내부 버퍼에 문자열을 저장해 두고 그안에서 추가, 삭제 수정 작업을 할 수 있도록 설계 됨
- String처럼 새로운 객체를 만들지 않고 문자열 조작 가능
- StringBuffer는 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용되어 있어 스레드에 안전
- StringBuilder는 단인 스레드 환경에서만 사용하도록 설계

## 11.10 정규 표현식과 Pattern 클래스
### 11.10.1 정규 표현식 작성 방법
- [] : 한개의 문자
- \d : 한개의 숫자 [0-9]와 동일
- \s : 공백
- \w : 한개의 알파벳 또는 한개의 숫자
- ? : 없음 또는 한개
- * : 없음 또는 한개 이상
- + : 한 개 이상
- {n} : 정확히 n개
- {n,} : 최소한 n개
- {n,m} : n개에서부터 m개까지
- { } : 그룹핑

### 11.10.2 Pattern 클래스
- java.util.regex.Patter 클래스의 정적 메소드인 matches() 메소드가 정규 표현식으로 검증

## 11.11 Arrays 클래스
- Arrays 클래스는 배열 조작 기능 : 배열의 복사, 항목 정렬, 항목 검색과 같은 기능

### 11.11.1 배열 복사
- 배열 복사 : copyOf(원본배열, 복사할 길이), copyOfRange(원본 배열, 시작인덱스, 끝인덱스)
- copyOf() 메소드는 복사할 길이는 원본 배열의 길이보다 커도 되고 타겟 배열의 길이가 됨
- copyOfRange(원본배열, 시작 인덱스, 끝인덱스) : 시작 인덱스는 포함되지만 끝 인덱스는 포함되지 않음

### 11.11.2 배열 항목 비교
- Arrays의 equals()와 deepEquals()는 배열 항목을 비교
- equals()는 1차 항목의 값만 비교
- deepEquals()는 1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교

### 11.11.3 배열 항목 정렬
- Arrays.sort() 메소듸의 매개값으로 지정해주면 자동으로 오름차순으로 정렬
- 사용자 정의 클래스 타입일 경우 클래스가 Comparable 인터페이스를 구현하고 있어야 정렬 가능함
- comapreTo() 메소드의 리턴 값은 오름차순일 때 자신이 매개값보다 낮을 경우 음수, 같을 경우 0, 높을 경우 양수를 리턴
- 내림차순 일 때 자신이 매개값보다 낮을 경우 양수, 같을 경우 0, 높을 경우 음수를 리턴

### 11.11.4 배열 항목 검색
- 배열 검색 : 배열 항목에서 특정 값이 위치한 인덱스를 얻는 것
- Arrays.sort() 메소드로 항목을 오름차순으로 정렬한 후, Arrays.binarySearch() 메소드로 항목을 찾아야 함

## 11.12 Wrapper(포장) 클래스
- 포장(Wrapper) 객체 : 기본 타입의 값을 갖는 객체
=> 기본 타입의 값을 내부에 두고 포장하기 때문에

### 11.12.1 박싱(Boxing)과 언박싱(Unboxing)
- 박싱(Boxing) : 기본 타입의 값을 포장 객체로 만드는 과정
- 언박싱(Unboxin) : 포장 객체에서 기본 타입의 값을 얻어내는 과정

### 11.12.2 자동 박싱과 언박싱
- 자동 박싱은 포장 클래스 타입에 기본값이 대입될 경우 발생
- 자동 언박싱은 기본 타입에 포장 객체가 대입될 경우 발생

### 11.12.3 문자열을 기본 타입 값으로 변환
- 포장 클래스의 주요 용도
1) 기본 타입의 값을 박싱해서 포장 객체로 만드는 것 <br>
2) 문자열을 기본 타입 값으로 변환할 때에도 많이 사용

### 11.12.4 포장 값 비교
- 포장 객체는 값을 비교하기 위해 == 와 !=를 사용 할 수 없음
=> 이 연산자는 내부의 값을 비교하는 것이 아니라 포장 객체의 참조를 비교하기 때문에
- 직접 내부 값을 언박싱해서 비교하거나 equals() 메소드로 내부 값을 비교하는 것이 좋음

## 11.13 Math, Random 클래스
### 11.13.1 Math 클래스
- Math클래스가 제공하는 메소드는 모두 정적(static) 메소드이기 때문에 Math 클래스로 바로 사용 가능

### 11.13.2 Random 클래스
- Math.random() 메소드는 0.0에서 1사이의 double 난수를 얻는데만 사용
- Random 클래스는 boolean, int, long, float, double 난수를 얻을 수 있음, 종자값을 설정할 수 있음

## 11.14 Date, Calendar 클래스
- 날짜 프로그램에서 자주 사용되는 데이터

### 11.14.1 Date 클래스
- Date : 날짜를 표현하는 클래스
- 객체간의 날짜 정보를 주고 받을 때 주로 사용

### 11.14.2 Calendar 클래스
- 달력을 표현한 클래스
- 추상 클래스이기때문에 new 연산자를 이용해 인스턴스를 생성 할 수 없음
=> 날짜와 시간을 계산하는 방법이 지역과 문화, 나라에 따라 다르기 때문에
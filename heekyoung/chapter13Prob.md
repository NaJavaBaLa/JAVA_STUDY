**1. 제네릭에 대한 설명으로 틀린 것은 무엇입니까?** <br>
1) 컴파일 시 강한 타입 체크를 할 수 있다.<br>
2) 타입 변환(casting)을 제거한다.<br>
3) 제네릭 타입은 타입 파라미터를 가지는 제네릭 클래스와 인터페이스를 말한다.<br>
4) 제네릭 메소드는 리턴 타입으로 타입 파라미터를 가질 수 없다.<br>

답 : 4번<br>
리턴 타입으로 타입 파라미터를 가질 수 있음

**2. ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다. main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.** <br>
답 :

ContainerExample.java

```java
public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<Integer>();
		container2.set(6);
		int value = container2.get();
	}
}
```

Container.java

```java
public class Container<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}
```


**3. ContainerExample 클래스의 main() 메소드는 Container 제네릭 타입을 사용하고 있습니다. main() 메소드에서 사용하는 방법을 참고해서 Container 제네릭 타입을 선언해보세요.** <br>
답 :

ContainerExample.java

```java
public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		
		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		
	}
}
```

Container.java

```java
public class Container<T, M> {
	private T key;
	private M value;
	
	public T getKey() {
		return key;
	}

	public M getValue() {
		return value;
	}

	public void set(T name, M job) {
		this.key = name;
		this.value = job;
	}
}
```

**4. Util.getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고, 두번째 매개값으로 키값을 받습니다. 리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고, 일치하지 않으면 null을 리턴하도록 getValue() 제네릭 메소드를 정의해보세요.** <br>

답

UtilExample.java

```java
package chapter13Prob;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Util.getValue(pair, "홍길동");
		System.out.println(age);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Util.getValue(childPair, "홍삼순");
		System.out.println(childAge);
		
		/* OtherPair<Strin,Integer> otherPair = new OtherPair<>("홍삼원", 20);
		 * OtherPair는 Pair를 상속하지 않으므로 예외가 발생해야 합니다.
		 * itn otherAge = Util.getValue(otherPair, "홍삼원");
		 * System.out.println(otherAge);
		 */
	}

}
```

Pair.java

```java
public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
```

ChildPair.java

```java
package chapter13Prob;

public class ChildPair<K, V> extends Pair<K, V>{
	
	public ChildPair(K k, V v){
		super(k, v);
	}
}
```

OtherPair.java

```java
package chapter13Prob;

public class OtherPair<K, V> {
	private K key;
	private V value;
	
	public OtherPair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}
}
```

Util.java

```java
public class Util{

	public static <K, V> V getValue(Pair<K, V> pair, K k) {
		if (pair.getKey() == k) {
			return pair.getValue();
		} else {
			return null;
		}
	}
}
```
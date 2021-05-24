**1. 스레드에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 자바 애플리케이션은 메인(main) 스레드가 main() 메소드를 실행시킨다.<br>
2) 작업 스레드 클래스는 Thread 클래스를 상속해서 만들 수 있다.<br>
3) Runnable 객체는 스레드가 실행해야 할 코드를 가지고 있는 객체라고 볼 수 있다.<br>
4) 스레드 실행을 시작하려면 run() 메소드를 호출해야 한다.<br>

답 : 4번<br>
스레드를 실행하려면 start() 메소드를 호출해야 함

**2. 동영상과 음악을 재생하기 위해 두가지 스레드를 실행하려고 합니다. 비어있는 부분에 적당한 코드를 넣어 보세요.** <br>
답 :

ThreadExample.java

```java
public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
	}
}
```

MovieThread.java

```java
public class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("동영상을 재생합니다.");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
```

MusicRunnable.java

```java
public class MusicRunnable implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
```

**3. 스레드의 우선순위에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 우선순위가 높은 스레드가 실행 기회를 더 많이 가질 수 있다.<br>
2) 우선순위는 1부터 10까지 줄 수 있는데 디폴트는 5이다..<br>
3) Thread 클래스는 NORM_PRIORITY, MIN_PRIORITY, MAX_PRIORTY 상수를 제공한다.<br>
4) 1은 가장 높은 우선순위이기 때문에 다른 스레드보다 실행 기회를 더 많이 갖는다.<br>

답 : 4번<br>
1은 가장 낮은 우선순위


**4. 동기화 메소드와 동기화 블록에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 동기화 메소드와 동기화 블록은 싱글(단일) 스레드 환경에서는 필요 없다.<br>
2) 스레드가 동기화 메소드를 실행할 때 다른 스레드는 일반 메소드를 호출할 수 없다.<br>
3) 스레드가 동기화 메소드를 실행할 때 다른 스레드는 다른 동기화 메소드를 호출할 수 없다.<br>
4) 스레드가 동기화 블록을 실행할 때 다른 스레드는 다른 동기화 메소드를 호출 할 수 없다.<br>

답 : 2번<br>
스레드가 동기화 메소드를 실행할 때는 일반 메소드는 호출 할 수 있지만 다른 동기화 메소드는 호출 할 수 없다.


**5. 스레드 일시 정지 상태에 대한 설명 중 틀린 것은 무엇입니까?.** <br>
1) 일시 정지 상태는 BLOCKED, WAITING, TIMED_WAITING이 있다.<br>
2) 스레드가 동기화 메소드를 실행할 때 다른 스레드가 동기화 메소드를 호출하게 되면 BLOCKED 일시정지 상태가 된다.<br>
3) 동기화 메소드 내에서는 wait()를 호출하면 WAITING 일시 정지 상태가 된다.<br>
4) yield() 메소드를 호출하면 TIMED_WAITING 일시 정지 상태가 된다.<br>

답 : 4번<br>
yield() 메소드는 실행 대기 상태이고 sleep이 일시 정지 상태


**6. 스레드 상태 제어를 하는 메소드에 대한 설명 중 틀린 것은 무엇입니까? ** <br>
1) yield() 메소드를 호출한 스레드는 동일한 우선순위나 높은 우선순위의 스레드에게 실행 기회를 양보하고 자신을 실행 대기 상태가 된다.<br>
2) sleep() 메소드를 호출한 스레드는 주어진 시간 동안 일시 정지 상태가 된다.<br>
3) stop() 메소드는 스레드를 즉시 종료시키기 때문에 스레드 안전성에 좋지 못하다.<br>
4) join() 메소드를 호출한 스레드가 종료할 때까지 join() 메소드를 멤버로 가지는 스레드는 일시 정지 상태가 된다.<br>

답 : 4번<br>
join() 메소드를 호출한 스레드가 일시정지 됨


**7. interrupt() 메소드를 호출한 효과에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 일시정지 상태에서 InterruptedException을 발생시킨다.<br>
2) 스레드는 즉시 종료한다.<br>
3) 실행 대기 상태에서 호출되면 일시 정지 상태가 될 때 까지 InterruptedException이 발생하지 않는다.<br>
4) 아직 InterruptedException이 발생하지 않았다면 interrupted(), isInterrupted() 메소드는 true를 리턴한다.<br>

답: 2번<br>
stop() 메소드를 사용해야 스레드가 즉시 종료 됨


**8. 메인 스레드에서 1초 후 MovieThread의 interrupt() 메소드를 호출해서 MovieThread를 안전하게 종료하고 싶습니다. 비어 있는 부분에 적당한 코드를 작성해보세요.** <br>

```java
public class MovieThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
		}
		
	}
}
```

**9. wait()와 notify() 메소드에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 스레드가 wait()를 호출하면 일시 정지 상태가 된다.<br>
2) 스레드가 notify()를 호출하면 wait()로 일시 정지 상태에 있던 다른 스레드가 실행 대기 상태가 된다.<br>
3) wait()와 notify()는 동기화 메소드 또는 블록에서 호출할 필요가 없다.<br>
4) 스레드가 wait(long millis)를 호출하면 notify()가 호출되지 않아도 주어진 시간이 지나면 자동으로 실행 대기 상태가 된다.<br>

답: 4번<br>
notify()를 실행해야 실행대기 상태가 된다.

**10. 메인 스레드가 종료하면 MovieThread도 같이 종료되게 만들고 싶습니다. 비어있는 부분에 적당한 코드를 넣어 보세요.** <br>
답:

```java
public class ThreadExample {
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.setDaemon(true);
		thread1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	}
}
```

**11. while문으로 반복적인 작업을 하는 스레드를 종료시키는 방법에 대한 설명 중 최선의 방법이 아닌 것은?** <br>
1) stop() 메소드를 호출해서 즉시 종료시킨다.<br>
2) 조건식에 boolean 타입의 stop 플래그를 이용해서 while문을 빠져나가게 한다.<br>
3) 스레드가 반복적으로 일시 정지 상태가 된다면 InterruptedException을 발생시켜 예외 처리 코드에서 break문으로 while문을 빠져나가게 한다.<br>
4) 스레드가 일시 정지 상태로 가지 않는다면 isInterrupted()나 interrupted() 메소드의 리턴 값을 조사해서 true일 경우 break문으로 while문을 빠져나가게 한다.<br>

답: 1번<br>
바로 stop 메소드 호출 시 Exception 발생 할 수 있음

**12. 스레드풀에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) 갑작스러운 작업의 증가로 스레드의 폭증을 막기 위해 사용된다.<br>
2) ExecutorService 객체가 스레드풀이며 nexFixedThreadPool() 메소드로 얻을 수 있다.<br>
3) 작업은 Runnable 또는 Callable 인터페이스를 구현해서 정의한다.<br>
4) submit() 메소드로 작업 처리 요청을 하면 작업이 완료될 때 까지 블로킹된다.<br>

답: 4번<br>
submit() 메소드의 리턴 값인 Future의 get()메소드 호출 시 스레드가 작업 완료시까지 블로킹 됨


**13. Future 객체에 대한 설명 중 틀린 것은 무엇입니까?** <br>
1) Future는 스레드가 처리한 작업의 결과값을 가지고 있는 객체이다.<br>
2) submit() 메소드를 호출하면 즉시 리턴되는 객체이다.<br>
3) Future의 get() 메소드는 스레드가 작업을 완료하기 전까지 블로킹 된다.<br>
4) CompletionService를 이용하면 작업 완료된 순으로 Future을 얻을 수 있다.<br>

답: 1번<br>
Future는 결과값을 가지고 있는 객체가 아닌 지연 완료 객체임
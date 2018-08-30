# 멀티 스레드

참고자료 - 이것이 자바다
참고자료 - Java 8 in Acton

## Thread 생성과 실행

java.lang.THread 클래스로부터 작업 스레드 객체를 직접 생성하려면 Runnable 을 매개값으로 갖는 생성자를 호출해야 한다.
````java
Thread thread = new Thread(Runnable target);
````

Runnable은 인터페이스 타입이라서, 구현 객체를 만들어 대입해야 한다. Runnable 에는 run() 메서드 하나가 정의되어 있는데, 구현 클래스는 run()을 재정의해서 작업 스레드가 실행할 코드를 작성해야 한다. 

> Runnable 인터페이스는 run() 메서드 하나만 정의되거 있기 때문에, 함수적 인터페이스이다.

Runnable 구현 객체를 생성한 후, 이것을 매개값으로 해서 Thread 생성자를 호출하면 비로소 작업 스레드가 생성된다. 

````java
//방법 1
class Task implements Runnable{
	public void run(){
	//실행 코드
	}
}

Runnable task = new Task();
Thread thread = new Thread(task);

//방법 2 - 익명 구현 객체
Thread thread = new Thread(new Runnable() {
	public void run(){
		//실행 코드
	}
});

//방법3 - 람다식
Thread thread = new Thread(() -> {
	//실행 코드
});
````

````java
thread.start();
````

샘플코드 - 01

작업 쓰레드가 실행할 작업을 Runnable 로 만들지 않고, Thread 하위 클래스로 작업 스레드를 정의하면서 작업 내용을 포함시킬 수도 있다. 

샘플코드 - 02

## Thread 우선순위

- 동시성 : 멀티 작업을 위해 하나의 코어에서 멀티 스레드가 번갈아가며 실행하는 성질
- 병렬성 :  멀티 작업을 위해 멀티 코어에서 개별 쓰레드를 동시에 실행하는 성질

쓰레드의 개수가 코어의 수보다 많을 경우, 쓰레드를 어떤 순서에 의해 동시성으로 실행할 것인가를 결정해야 한다. 쓰레드 스케쥴링이라 한다. 쓰레드 우선순위는 1이 가장 낮고, 10이 가장 높은데 기본적으로 5가 할당된다. 

````java
thread.setPriority(우선순위);
````

## 동기화 메소드와 동기화 블록

쓰레드가 사용 중인 객체를 다른 쓰레드가 변경할 수 없도록 하려면, 작업이 끝날 때 까지 객체에 잠금을 걸어 놓을 수 있다. 동기화(synchronized)메소드와 동기화 블록을 제공한다. 

#### 동기화 메소드
````java
public synchronized void method(){
	...
}
````

#### 동기화 블록
만약 일부 내용만 잠금으로 하고 싶다면, synchronized 블록을 만들면 된다. 

````java
public void method(){
	//여러 쓰레드가 실행 가능한 영역
	synchronized(공유객체) {
		//단 하나의 쓰레드만 실행	
	}
	
}
````

샘플코드 - 03




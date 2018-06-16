# Overview

람다에 대해서 스터디 및 정리한다.  참고 자료는 아래와 같다.

- Java 8 in Action
- Java Note Professional
- 이것이 자바다


# Lambda 
## 람다식이란?

람다 표현식은 메서드로 전달할 수 있는 익명 함수를 단순화한 것이다. 람다식은 익명 함수를 생성하기 위한 식으로 객체지향 언어보다는 함수 지향 언어에 가깝다. 자바에서 람다식을 사용하면 자바 코드가 매우 간결해지고, 컬렉션의 요소를 필터링하거나 매핑해서 원하는 결과를 쉽게 집계할 수 있다. 

람다의 특징은 아래와 같다. 

- 익명 : 이름이 없다. 
- 함수 : 람다는 메서드처럼 특정 클래스에 종속되지 않으므로 함수라고 부른다. 
- 전달 : 람다 표현식을 메서드 인수로 전달하거나 변수로 저장할수 있다. 
- 간결성

람다식의 형태는 매개 변수를 가진 코드 블록이지만, 런타임 시에는 익명 구현 객체를 생성한다. 

```java
Runnable runnable = new Runnable() {
	public void run() {
		생략...
	}
}
```

익명 구현 객체를 람다식으로 표현하면 아래와 같다.

```java
Rummable runnable = () -> {...};
```

람다는 세 부분으로 이루어진다. 

- 파라미터 리스트(매개변수)
- 화살표
- 람다의 바디(실행 코드)

```java
(Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

//람다 파라미터(매개변수)    화살표    람다 바디(실행 코드)
``` 



## 람다 기본 문법

(타입 매개변수, ...) -> { 실행코드 }

타입은 런타임 시에 대입되는 값에 따라 자동으로 인식될 수 있기 때문에 람다식에서는 매개 변수의 타입을 명시적으로 작성하지 않아도 된다. 하나의 매개 변수만 있다면 괄호 () 를 생략할 수 있고, 하나의 실행문만 있다면 중괄호 {} 도 생략할 수 있다. 

```java
(a) -> { System.out.println(a); }
//두 코드는 같다.
a -> System.out.println(a);
```

하지만 만약 매개변수가 없다면 람다식에서 매개변수 자리가 없어지므로 아래와 같이 빈 괄호를 반드시 사용해야 한다.

```java
() -> { 실행문... }   //매개변수가 없는 경우
```
#### Functional Interface

람다식의 타겟 타입으로는 Function Interface 만 가능하다. 즉, 하나의 추상 메소드가 선언된 인터페이스만이 람다식의 타겟 타입이 될 수 있다. 

Functional Interface fi = 람다표현식;

Functional Interface 를 작성할 때 두 개 이상의 추상 메서드가 선언되지 않도록 컴파일러에서 체크할 수 있는데, @FunctionalInterface 어노테이션을 선언하는 것이다. Runnable 인터페이스의 코드를 보자. 

```java
@FunctionalInterface
public  interface  Runnable {
	public  abstract  void  run();
}
```

람다식은 타겟 타입인 Functional Interface 가 가지고 있는 추상메서드의 선언 형태에 따라서 작성 방법이 달라진다. 

Functional Interface 에 대해서는 아래 링크를 참고하자. 
https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.8


#### 매개 변수와 리턴값이 없는 람다식

```java
@FunctionalInterface
public interface MyFunctionalInterface {
	public void method();
}

MyfunctionalInterface f1 = () -> {...}
f1.method();
//람다식에 매개변수가 없는 이유는, method()가 매개 변수를 가지지 않기 때문
```

샘플 예시이다. 

```java
FuntionalAction  fi;
fi = () -> {
	String  str  =  "method call";
	System.out.println(str);
};
fi.action();

fi = () -> { System.out.println("method call2");};
fi.action();

fi = () ->  System.out.println("method call3");
fi.action();


@FunctionalInterface
public  interface  FuntionalAction {
	public  void  action();
}
```

#### 매개 변수가 있는 람다식

```java
MyfunctionalInterface fi = (x) -> {...} 
//또는
MyfunctionalInterface fi = x -> {...} 

fi.method(2)
```

#### 리턴값이 있는 람다식

리턴 타입이 있기 때문에 중괄호 {} 에는 return 문이 있어야 한다.

```java
public  interface  FunctionActionWithReturn {
public  String  action(String  name);
}

FunctionActionWithReturn functionActionWithReturn;
functionActionWithReturn = (x) -> {
	return "6.리턴값이 있는 람다, 리턴값은 " + x;
};
System.out.println(functionActionWithReturn.action("Eddy"));
```
리턴문 뒤에 연산식이나 메서드 호출이 오는 경우라면 아래와 같이 작성할 수 있다. 

```java
MyfunctionInterface fi = (x, y) -> {
	return x + y;
}
//두 코드는 같다.
Myfunction fi = (x, y) -> x + y;
```


## Sort a Collection

```java
List people = ... 
Collections.sort( 
	people, 
	new Comparator() { 
		public int compare(Person p1, Person p2){ 
			return p1.getFirstName().compareTo(p2.getFirstName()); 		
		} 		
	} 
);


Collections.sort( 
	people, 
	(p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()) 
);
```

#### 이중 콜론 연산자

위 코드는 좀 더 간결하게 아래와 같이 작성할 수 있다.  double colon 연산자인데, 이중 콜론 연산자라고 부르게싿. 
```java
Collections.sort( 
	people, 
	Comparator.comparing(Person::getFirstName) 
);
```
참고 링크
http://www.baeldung.com/java-8-double-colon-operator

이중 콜론 연산자는 Method Reference를 사용할 때, 타겟 레퍼런스는 :: 앞에 놓고 메소드명은 :: 뒤에 작성한다. 

우리는 Person라는 클래스에 정의된 getFirstName 메소드에 대한 Method Reference를 찾고 그 Method Reference를 이용해 실행시킨다.

다양한 경우에 이중 콜론 연산자를 사용할수 있다. 





























































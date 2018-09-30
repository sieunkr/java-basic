# Generic(제네릭)
Generic에 대해서 기초적인 내용을 정리한다.

1. Generic 이란?
2. 멀티 타입 파라미터
3. Generic 메서드


### 1.Generic이란?
타입을 파라미터로 가지는 클래스 또는 인터페이스이다. <> 부호가 붙고, 사이에 파라미터가 위치한다.  
Generic를 사용하면 잘못된 타입이 사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있다.

```java
//Generic 사용하지 않은 예
List list = new ArrayList();
list.add("안녕");
String str = (String)list.get(0);
System.out.println(str);
```

아래와 같이 Generic으로 String 타입으로 제한하고, 타입 변환을 하지 않아도 된다.

```java
//Generic 사용 예
List<String> list = new ArrayList<String>();
list.add("안녕");
String str = list.get(0);
System.out.println(str);
```

타입 파라미터는 일반적으로 한 글자로 작성한다. 

```java
public class 클래스<T> { ... }
public interface 인터페이스<T> { ... }
```

### 2.멀티 타입 파라미터
Generic 타입은 두 개 이상의 멀티 타입 파라미터를 사용할 수 있다. 

```java
public class Coffee<B, P> {  
	private B brand;  
	private P price;  
  
	public B getBrand() {  
	    return brand;  
	}  
  
	public void setBrand(B brand) {  
		this.brand = brand;  
	}  

	public P getPrice() {  
		return price;  
	}  

	public void setPrice(P price) {  
		this.price = price;  
	}  
}
```

### 3.Generic 메서드

제네릭 메서드는 매개 타입과 리턴 타입으로 타입 파라미터를 갖는다.
```java
public <타입파라미터> 리턴타입 메서드명(매개변수) { ... }
```
다음 take() 메서드는 T 라는 타입파라미터를 기술하여, 매개 변수 타입으로 T를 사용하고, 리턴 타입은 Coffee<T> 를 사용한다.
```java
public <T> Coffee<T> take(T t) {...}
```
Coffee() 메서드를 호출하는 코드이다.
```java
Coffee<String> coffee = <String>take("모카");
Coffee<String> coffee = take("모카"); //타입 파라미터를 String 으로 추정
```

다음 예제는 take() 메서드를 호출하는 코드이다.
```java
//Coffee.java
public class Coffee<T> {  
    private T t;  
  
	public T getT() {  
	    return t;  
	}  

	public void setT(T t) {  
	    this.t = t;  
	}  
}
```

```java
//Util.java
public class Util {  
	public static <T> Coffee<T> take(T t){  
	    Coffee<T> coffee = new Coffee<T>();  
		coffee.setT(t);  
		return coffee;  
	}  
}
```

```java
//main.java
Coffee<String> coffee = Util.<String>take("모카");  
System.out.println(coffee.getT());
```


### 4.제한된 타입 파라미터(T extends 상위타입)

타입 파라미터에 구체적인 타입을 제한하는 경우 사용한다. 

````java
public <T extends 상위타입> 리턴타입 메서드(매개변수,..) { .. }
````

상위 타입은 클래스, 인터페이스 둘다 가능하다. 

#### 샘플 코드
````java
public class Util {

    public static <T extends Number> int sum(T t1, T t2){
        Integer value01 = t1.intValue();
        Integer value02 = t2.intValue();
        return value01 + value02;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Util.<Integer>sum(10, 15));
        System.out.println(Util.<Double>sum(12.5, 14.7));
    }
}
````


### 5.와일드 카드

- <?>
- <? extends 상위타입>
- <? super 하위타입>


### 6.<> 다이아몬드(?)

````java
List<String> list = new LinkedList<String>();

자바7 이상부터는 타입파라미터 생략 가능
List<String> list = new LinkedList<>();
````

단, 익명 클래스에서 제네릭을 사용하는 경우에는 타입 파라미터를 꼭 추가해야 한다. 

````java
Comparator<String> caseInsensitiveComparator = new Comparator<String>() {
 @Override
 public int compare(String s1, String s2) {
 return s1.compareToIgnoreCase(s2);
 }
};
````



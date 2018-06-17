스터디 정리 중. 


# 스트림

참고
이것이 자바다
Java 8 in Action


## 스트림
스트림은 자바8부터 추가된 컬렉션의 저장 요소를 하나씩 참조해서 람다식으로 처리할 수 있도록 해주는 반복자이다. 

#### 스트림이란>

```java
List<String> strings  =  Arrays.asList("모카, 라떼, 아메리카노");

/*
Iterator<String> iterator = strings.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next());
}
*/

Stream<String> stream  =  strings.stream();
stream.forEach(coffee ->  System.out.println(coffee));
```
컬렉션의 stream() 메서드로 스트림 객체를 얻고 나서 stream.forEach(람다식) 를 통해 컬렉션의 요소를 하나씩 람다식을 수행한다. forEach() 메서드는 Consumer Functional Interface 타입의 매개값을 가지므로 컬렉션의 요소를 소비할 코드를 람다식으로 기술할 수 있다. Stream 클래스의 forEach 메서드를 보자. 

```java
void  forEach(Consumer<?  super  T> action);
```

참고로 Consumer 에 대해서는 이것이자바다 689page 를 참고하자. 중요!! (다시 정리 필요)

#### 람다식으로 요소 처리 코드를 제공한다.
Stream이 제공하는 대부분의 요소 처리 메서드는 Functional Interface매개 타입을 가지기 때문에 람다식 또는 메서드 레퍼런스를 이용해서 요소 처리 내용을 매개값으로 전달할 수 있다. 

```java
List<Coffee> coffees  =  Arrays.asList(new  Coffee("모카", 1200), new  Coffee("라떼", 1000), new  Coffee("아메리카노", 900));

Stream<Coffee> coffeeStream  =  coffees.stream();
coffeeStream.forEach( coffee -> {
	String  name  =  coffee.getName();
	int  price  =  coffee.getPrice();
	System.out.println(name +  "의 가격은"  + price);
});
```
컬렉션에 저장된 커피를 하나씩 출력하는 예시인데, forEach() 메서드의 매개값으로 람다식을 주었다. 


#### 병렬 처리가 쉽다.

```java
System.out.println("#3.병렬 처리");
List<String> str  =  Arrays.asList("핫초코", "차이티라떼", "콜드블루", "아메리카노");
/*
Stream<String> stream03 = str.stream();
stream03.forEach(c -> System.out.println(c));
*/
Stream<String> stream04  =  str.parallelStream();
stream04.forEach(c ->  System.out.println(c));
```

병렬 처리에 대한 설명은, 이것이 자바다 785~786page 참고! 

#### 중간 처리와 최종 처리를 할 수 있다.

```java
System.out.println("#4.average");
Stream<Coffee> coffeeStream02  =  coffees.stream();

double  agePrice  =  coffeeStream02
	.mapToInt(Coffee :: getPrice)
	.average()
	.getAsDouble();
	
System.out.println("평균 가격은"  + agePrice);
```

mapToInt 는 ToIntFunction 이라는 Functional Interface 를 매개변수를 받고, IntStream 를 리턴한다. 
```java
IntStream  mapToInt(ToIntFunction<?  super  T> mapper);
```

스트림에는 BaseStream 인터페이스를 부모로 해서 Stream, IntStream, LongStream, DoubleStream 등이 종류가 있다. 



## 스트림의 종류
위에 작성했듯이 스트림에는 Stream, IntStream, LongStream, DoubleStream 등이 있다. BaseStream 인터페이스는 모든 스트림에서 사용할 수 있는 공통 메서드들이 정의되어 있다. Stream 은 객체 요소를 처리하는 스트림이고, IntStream, LongStream, DoubleStream 는 각각 int, long, double 요소를 처리하는 스트림이다. 

#### 컬렉션으로부터 스트림 얻기 
생략

#### 배열에서 스트림 얻기
생략

#### 숫자 범위로 부터 스트림 얻기
생략

#### 파일로 부터 스트림 얻기
생략

#### 디렉토리로부터 스트림 얻기
생략

이것이 자바다 ~794page


## 필터

필터링은 중간 처리 기능으로 요소를 걸러내는 역할을 한다. distinct() 와 filter() 메서드는 모든 스트림이 가지고 있는 공통 메서드이다. 

```java
System.out.println("#5.distinct, 중복제거");
List<String> str02  =  Arrays.asList("핫초코", "차이티라떼", "콜드블루", "아메리카노", "핫초코", "아메리카노");
str02.stream()
	.distinct()
	.forEach(c ->  System.out.println(c));

System.out.println("#6.filter, 필터링");
List<String> str03  =  Arrays.asList("핫초코", "카페라떼", "차이티라떼", "콜드블루", "아메리카노", "핫초코", "아메리카노");
str03.stream()
	.filter(c ->  c.endsWith("라떼"))
	.forEach(c ->  System.out.println(c));
```

- distinct() 메서드는 중복을 제거한다. 
- filter() 메서드는 매개값으로 주어진 Predicate가 true 를 리ㄴ턴하는 요소만 필터링 한다.

## 매핑
매핑은 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 작업이다. 

공부 중...





























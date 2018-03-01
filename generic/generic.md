# Generic(제네릭)
Generic에 대해서 기초적인 내용을 정리한다.

### Generic이란?
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

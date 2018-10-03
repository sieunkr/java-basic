# Chapter 2  
  
## Item 1 : Consider static factory methods insted of constructors  
  
생성자 대신 static factory method 를 사용해서 객체를 생성해라.  
  
#### _static factory method_ 사용할 때 장점  
  
1. 이름이 있다.  
2. 새로운 객체를 생성할 필요가 없다.  
3. 반환값 자료형의 하위 자료형 객체를 반환할 수 있다.  
4. 형인자 자료형 객체를 생성할 때 유용하다.  
  
  
#### 1.이름이 있다.  
  
- 가독성이 높아진다.   
  
#### 2.새로운 객체를 생성할 필요가 없다.  
  
- 싱글톤 패턴으로 구현할 수 있다.  
- 객체 생성이 불가능한 클래스를 만들 수 있다.  
- 두 개의 같은 객체가 존재하지 못하도록 할 수 있다.   
  
#### 3.반환값 자료형의 하위 자료형 객체를 반환할 수 있다.  
  
?  
  
#### 4. 형인자 자료형 객체를 생성할 때 유용하다.  
  
?   
  
#### _static factory method_ 사용할 때 단점  
  
1.하위 클래스를 만들 수 없다.  
2.정적 팩토리 메서드가 다른 정적 메서드와 구분이 어렵다.  
  
  
> 디자인 패턴 에서의 Factory Method 개념과는 상관없다.






# Chapter 4  
  
## Item 15 : Minimize mutability

변경 불가능 클래스는 설계하기 쉽고, 구현하기 쉽고, 사용하기도 쉽다. 아래 규칙을 따른다. 

#### 규칙 (Effective Java)  
1. 객체 상태를 변경하는 메서드를 제공하지 않는다.
2. 상속 받을  수 없도록 한다.
3. 모든 필드를 final 로 선언한다.
4. 모든 필드를 private 로 선언한다.
5. Ensure exclusive access to any mutable components.  

#### 규칙 (Java Notes For Professionals)  
1. Don't provide "setter" methods - methods that modify ﬁelds or objects referred to by ﬁelds.
2. Make all ﬁelds ﬁnal and private.  
3. Don't allow subclasses to override methods. The simplest way to do this is to declare the class as ﬁnal. A more sophisticated approach is to make the constructor private and construct instances in factory methods. 
4. If the instance ﬁelds include references to mutable objects, don't allow those objects to be changed:  
5. Don't provide methods that modify the mutable objects.  
6. Don't share references to the mutable objects. Never store references to external, mutable objects passed to the constructor; if necessary, create copies, and store references to the copies. Similarly, create copies of your internal mutable objects when necessary to avoid returning the originals in your methods.  

#### 장점   
아래와 같은 장점

1. 변경 불가능한 객체는 단순하다.
2. Thread-Safe 하다. 어떤 동기화도 필요 없다.
3. 변경 불가능한 객체는 자유롭게 공유할 수 있다. 
4. 변경 불가능한 객체는 그 내부도 공유할 수 있다.
5. 변경 불가능한 객체는 다른 객체의 구성요소로도 훌륭하다.

#### 단점  
1. 별도의 객체를 만들어야 한다. 객체 생성 비용이 높다.

> 만약, 변경 불가능한 클래스를 만들 수 없다면 변경 가능성을 최대한 제한하고, 모든 필드는 final 로 선언하라. 

#### Types 라는 이름의 객체 생성 불가능 클래스

인터페이스는 정적 메서드를 가질 수 없으므로, (참고로, 1.8 부터는 가능) 반환값 자료형이 Type이라는 이름의 인터페이스인 정적 팩터리 메서드는 Types 라는 이름의 객체 생성 불가능 클래스안에 둔다. 예를 들어서, 

- Collection 인터페이스는 Collections 라는 클래스에 정적 메서드
- Array 인터페이스는 Arrays 라는 클래스에 정적 메서드

물론, 1.8 부터는 정적 메서드 선언이 가능하기 때문에 굳이 Types 라는 관례를 앞으로 따를 필요는 없을 듯

#### Immutable 
Immutable 객체는 객체를 변경하느 ㄴ대신 새로운 객체를 만들어 반환한다. 대표적인 예로는 String, Boolean, Integer 등등 

- 장점 : 생성자, 접근 메서드에 대한 방어 복사가 필요 없다. Thread-Safe 하여 객체가 안전하다.
- 단점 : 매번 새로운 객체를 위한 영역, 즉 힙 메모리를 할당해야 한다. 

## Item 16 : Favor composition over inheritance

계승(상속?) 받는 대신, 구성(?)하라. 계승(상속) 이 안전한 경우는 아래와 같다.    
 
- 단일 패키지 안에서 상속
- 처음부터 상속을 고려해서 설계 되었고, 문서도 작성된 경우
- 상위 클래스와 하위 클래스 사이에 IS-A 관계가 있을 때만 사용

> 패키지 밖에서 계승(상속)을 시도하는 것은 위험하다. 

## Item 17: Design and document for inheritance or else prohibit it

#### 요약
- 재정의 가능 메서드를 내부적으로 어떻게 사용하는지 문서로 남겨야 한다. 
- 계승(상속)을 위해 설계한 클래스는 반드시 하위 클래스를 직접 만들어서 테스트 해야 한다.
- 생성자는 재정의 가능 메서드를 호출해서는 안된다. 
- 문서화하지 않은 클래스에 대한 하위 클래스는 만들지 않는다.

## Item 18: Prefer interfaces to abstract classes

추상 클래스 대신 인터페이스를 사용하자!!

#### 인터페이스는 비 계층적인 자료형 프레임워크를 만들 수 있도록 한다. 

인터페이스를 사용하지 않는다면, 필요한 속성 조합마다 별도의 클래스를 만들어 거대한 클래스 계층을 어렵게 만들어야 한다. 

#### 인터페이스를 사용하면 포장 클래스 숙어 사용

인터페이스를 사용하면 안전하면서도 강력한 기능 개선이 가능하다. 추상 클래스를 사용해 자료형을 정의하면 계승만 사용할 수 있는데, 강력하지도 않고, 깨지기 쉽다. 

#### 추상골격구현(?) 클래스

추상 골격 구현클래스 를 중요 인터페이스마다 두면, 인터페이스의 장점과 추상클래스의 장점을 결합할 수 있다. 인터페이스는 자료형을 정의하고, 구현하는 일은 골격 구현 클래스에 맡기면 된다. 관습적으로 AbstractInterface 라고 명명한다. 

- AbstractCollection
- AbstractSet

등등

#### 추상클래스가 좋은 경우
인터페이스보다는 추상클래스가 발전시키기가 쉽다. 신규로 새로운 메서드를 추가하고 싶은 경우, 추상클래스에 언제든지 추가할 수 있다. 해당 추상클래스를 계승(상속받는) 모든 클래스는 그 즉시 새로운 메서드를 제공할 수 있다. 

> 1.8 부터는 인터페이스에서도 디폴트 메서드를 통해서 새 메서드를 추가할 수 있다. 


#### 인터페이스는 Mixin 을 정의하는데 이상적이다.
예 - Comparable 인터페이스 



## Item 19: Use interfaces only to define types



## Item 20: Item 20: Prefer class hierarchies to tagged classes



## Item 21: Use function objects to represent strategies



## Item 22: Favor static member classes over nonstatic



# Chapter 5  

## 23. 새 코드에는 무인자 제네릭 자료형을 사용하지 마라.  
  
무인자 자료형을 쓰면 형 안전성이 사라지고, 제네릭의 장점 중 하나인 표현력(??) 측면에서 손해를 보게 된다.  
  
#### 예외  
  
- 클래스 리터럴에는 반드시 무인자 자료형을 사용해야 한다.  
- instanceof 연산자를 적용할 때... (page 156참고)  
  
## 24. 무점검 경고(??)를 제거하라  
  
모든 무점검 경고는, 가능하다면 없애야 한다. 제거할 수 없는 경고 메시지는 형 안전성이 확실할 때만 @SupressWarnings("unchecked") 어노테이션을 사용하자.  
  
#### 꼭 사용해야 한다면 아래 조건을 지키자  
  
- 가능한 작은 범위에 적용해라  
- 형 안전성을 위반하지 않는 이유를 주석을 남기자.  
  
## 25. 배열 대신 리스트  
  
배열은 공변 자료형이자 실체화 가능 자료형이다. 제네릭은 불변 자료형이며, 실행시간에 형인자의 정보는 삭제된다.(???) 따라서 배열은 컴파일 시간에 형 안전성을 보장하지 못하며, 제네릭은 그 반대다. 일반적으로 배열과 제네릭은 쉽게 혼용할 수 없다.  
  
## 26. 가능하면 제네릭 자료형으로!!  
  
제네릭 자료형은 안전하고 사용하기 쉽다. 새로운 자료형을 설계할 때는 형변환 없이도 사용할 수 있도록 하라.  
  
## 27. 가능하면 제네릭 메서드로!!


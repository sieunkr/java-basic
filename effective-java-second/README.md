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


## Item 16 : Favor composition over inheritance

계승(상속?) 받는 대신, 구성(?)하라. 계승(상속) 이 안전한 경우   
 
- 단일 패키지 안에서 상속
- 처음부터 상속을 고려해서 설계 되었고, 문서도 작성된 경우

> 패키지 밖에서 계승(상속)을 시도하는 것은 위험하다. 


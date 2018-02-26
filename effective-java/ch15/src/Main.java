//ch15. 변경 가능성을 최소화해라.
/*
 * 1. 객체 상태를 변경하는 메서드를 제공하지 않는다.
 * 2. 계승할 수 없도록 한다.
 * 3. 모든 필드를 final로 선언한다.
 * 4. 모든 필드를 private로 선언한다.
 * 5. 변경 가능 컴포넌트에 대한 독점적 접근권을 보장한다.
 *
 *
요약하자면 모든 get메서드마다 set메서드를 두는 것은 피해야 한다.
변경 가능한 클래스를 만들 타당한 이유가 없다면, 반드시 변경 불가능 클래스로 만들어야 한다.
변경 불가능 클래스의 public 변경 가능 동료 클래스(mutable companion class)를 제공하는 것은 만족스러운 성능을 얻을 수 있을 때 해야 한다.
변경 불가능한 클래스로 만들 수 없다면, 변경 가능성을 최대한 제한해라.
특별한 이유가 없다면 모든 필드는 final로 선언해라.
생성자는 완전히 초기화가 끝나서 불변식이 만족되는 객체를 만들어야 한다.
생성자 이외의 public 초기화 메서드나 정적 팩터리 메서드를 제공하지 말고
객체 상태를 다른 초기치로 바꿔서 재 초기화(reinitialize)메서드도 제공하지 마라.
 */

public class Main {

    public static void main(String[] args) {

    }
}

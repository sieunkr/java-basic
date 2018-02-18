//01.정적 팩토리 메서드 패턴

public class Main {

    public static void main(String[] args) {

        //Coffee coffeeByConstructor = new Coffee("아메리카노");

        //1.팩터리 메서드에는 이름이 있어서 가독성이 뛰어나다.
        Coffee latte = Coffee.newInstanceByName("라떼");
        System.out.println(latte.getName());

        Coffee mocha = Coffee.newInstanceByName("모카");
        System.out.println(mocha.getName());

        //2.싱글톤이기 때문에, 같은 객체를 반환할 수 있음
        Coffee coffee = Coffee.getInstance();
        System.out.println(coffee.getName());

        //3.반환값 자료형의 하위 자료형 객체를 반환할 수 있음
        Developer developer = Developer.getDeveloper("web");
        developer.programming();


        /* 단점
         * 1.하위 클래스를 만들 수 없다.
         * 2.정적 팩토리 메서드가 다른 정적 메서드와 구분이 어렵다.
         */

    }
}

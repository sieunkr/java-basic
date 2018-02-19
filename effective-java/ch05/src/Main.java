//05.불필요한 객체는 생성하지 말자, static initialization block(정적 초기화 블럭) 활용

import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Coffee(Date.valueOf("2018-01-05"));
        System.out.println(coffee.isNewCoffee());

    }
}

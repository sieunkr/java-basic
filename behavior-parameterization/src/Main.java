import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Java 8 in Action 을 공부하면서 작성한 코드 정리 - 2018.01.30


        List<Coffee> coffeeList = new ArrayList<Coffee>();
        coffeeList.add(new Coffee("mocha", 1200));
        coffeeList.add(new Coffee("mocha", 1200));
        coffeeList.add(new Coffee("latte", 1000));
        coffeeList.add(new Coffee("americano", 1000));

        //1.기본
        System.out.println("카페모카는 " + OrderCoffee.findMocha(coffeeList).size() + "잔 입니다.");

        //2.파라미터
        System.out.println("카페모카는 " + OrderCoffee.findCoffee(coffeeList, "mocha").size() + "잔 입니다.");

        //3.추상화
        System.out.println("카페모카는 " + OrderCoffee.findStrategyCoffee(coffeeList, new MochaStrategy()).size() + "잔 입니다.");

        




    }
}

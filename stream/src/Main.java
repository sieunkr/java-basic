import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //스트림, 아주 기본적인 샘플 예제, 2018.2.4 Eddy



        System.out.println("#1.기본 예제");

        List<String> strings = Arrays.asList("모카, 라떼, 아메리카노");
        /*
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */
        Stream<String> stream = strings.stream();
        stream.forEach(coffee -> System.out.println(coffee));

        System.out.println();

        System.out.println("#2.기본 예제");
        List<Coffee> coffees = Arrays.asList(new Coffee("모카", 1200), new Coffee("라떼", 1000), new Coffee("아메리카노", 900));

        Stream<Coffee> coffeeStream = coffees.stream();

        coffeeStream.forEach( coffee -> {
            String name = coffee.getName();
            int price = coffee.getPrice();
            System.out.println(name + "의 가격은" + price);
        });

        



    }
}

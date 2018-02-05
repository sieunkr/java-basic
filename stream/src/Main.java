import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //스트림, 아주 기본적인 샘플 예제, 2018.2.4~2.5 Eddy

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

        System.out.println();


        System.out.println("#3.병렬 처리");
        List<String> str = Arrays.asList("핫초코", "차이티라떼", "콜드블루", "아메리카노");
        /*
        Stream<String> stream03 = str.stream();
        stream03.forEach(c -> System.out.println(c));
        */
        Stream<String> stream04 = str.parallelStream();
        stream04.forEach(c -> System.out.println(c));



        System.out.println();


        System.out.println("#4.average");
        Stream<Coffee> coffeeStream02 = coffees.stream();
        double agePrice = coffeeStream02.mapToInt(Coffee :: getPrice).average().getAsDouble();
        System.out.println("평균 가격은" + agePrice);



        System.out.println();

        System.out.println("#5.distinct, 중복제거");
        List<String> str02 = Arrays.asList("핫초코", "차이티라떼", "콜드블루", "아메리카노", "핫초코", "아메리카노");
        str02.stream()
                .distinct()
                .forEach(c -> System.out.println(c));
        
        System.out.println();

        System.out.println("#6.filter, 필터링");
        List<String> str03 = Arrays.asList("핫초코", "카페라떼", "차이티라떼", "콜드블루", "아메리카노", "핫초코", "아메리카노");
        str03.stream()
                .filter(c -> c.endsWith("라떼"))
                .forEach(c -> System.out.println(c));














    }
}

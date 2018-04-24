import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1. 정렬 없이
        List<Coffee> coffeeList = Arrays.asList(
            new Coffee(33L,1200, "모카"),
            new Coffee(24L,1100, "라떼"),
            new Coffee(27L,900, "아메리카노"),
            new Coffee(23L,1300, "차이티라떼")
        );

        System.out.println(coffeeList);


        //2. 기본 정렬
        Collections.sort(coffeeList);
        System.out.println(coffeeList);


        //3. String 순으로 정렬
        Collections.sort(coffeeList, new Comparator<Coffee>() {
            @Override
            public int compare(Coffee o1, Coffee o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        /* 람다식으로 변경 1
        Collections.sort(coffeeList, (o1, o2) -> o1.name.compareTo(o2.name));
         */

        /* 람다식으로 변경 2
        Collections.sort(coffeeList, Comparator.comparing(o -> o.name));
         */

        System.out.println(coffeeList);


        LinkedList

    }
}

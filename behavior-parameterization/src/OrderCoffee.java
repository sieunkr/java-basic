import java.util.ArrayList;
import java.util.List;

public class OrderCoffee {


    /**
     * 필터링 1. 기본
     *
     * @author E
     */
    public static List<Coffee> findMocha(List<Coffee> coffeeList){
        List<Coffee> findMochaList = new ArrayList<>();
        for(Coffee coffee : coffeeList){
            if("mocha".equals(coffee.getName())){
                findMochaList.add(coffee);
            }
        }
        return findMochaList;
    }


    /**
     * 필터링 2. 파라미터화
     *
     * @author E
     */
    public static List<Coffee> findCoffee(List<Coffee> coffeeList, String name){
        List<Coffee> findCoffeeList = new ArrayList<>();
        for(Coffee coffee : coffeeList){
            if(name.equals(coffee.getName())){
                findCoffeeList.add(coffee);
            }
        }
        return findCoffeeList;
    }


    /**
     * 필터링 3. 추상화 활용
     *
     * @author E
     */
    public static List<Coffee> findStrategyCoffee(List<Coffee> coffeeList, Strategy strategy){

        List<Coffee> findCoffeeList = new ArrayList<>();

        for(Coffee coffee : coffeeList){
            if(strategy.filter(coffee)){
                findCoffeeList.add(coffee);
            }
        }
        return findCoffeeList;
    }

}

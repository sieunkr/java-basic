import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> maps = new HashMap<>();

        //추가
        maps.put(1, "김시은");
        maps.put(2, "이진우");
        maps.put(3, "김정우");

        //조회 - 이진우
        System.out.println(maps.get(2));

        //체크 - return true
        System.out.println(maps.containsKey(3));

        //forEach
        maps.forEach((key, value) -> System.out.println(key + value));

        //Iterating, Keys
        for(Integer key : maps.keySet()){
            System.out.println(key);
        }

        //Iterating, Values
        for(String value : maps.values()){
            System.out.println(value);
        }

        //Iterating, Entries
        for(Map.Entry<Integer, String> entry : maps.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}

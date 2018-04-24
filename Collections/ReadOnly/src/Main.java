import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> coffees = new ArrayList<>();
        coffees.addAll(Arrays.asList(new String[] { "라떼", "모카", "아메리카노"}));

        List<String> fixCoffees = Collections.unmodifiableList(coffees);

        //Exception
        fixCoffees.add("홍차");


    }
}

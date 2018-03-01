import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        List list = new ArrayList();
        list.add("안녕");
        String str = (String)list.get(0);
        System.out.println(str);

        List<String> list = new ArrayList<String>();
        list.add("안녕");
        String str = list.get(0);
        System.out.println(str);
        */

        Coffee<String> coffee = Util.<String>take("모카");
        System.out.println(coffee.getT());

    }
}

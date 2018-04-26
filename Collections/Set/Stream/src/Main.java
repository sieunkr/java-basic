import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("김시은");
        set.add("이진우");
        set.add("김정우");

        List<String> list = set.stream()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}

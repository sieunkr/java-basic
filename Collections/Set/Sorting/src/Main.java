import java.util.*;

public class Main {

    public static void main(String[] args) {


        //1. HashSet 랜덤 정렬
        Set<String> set1 = new HashSet<>();
        set1.add("이진우");
        set1.add("김정우");
        set1.add("김시은");
        System.out.println("HashSet_랜덤정렬_"+set1);

        //2. LinkedHashSet 입력 순서대로 정렬
        Set<String> set2 = new LinkedHashSet<>();
        set2.add("이진우");
        set2.add("김정우");
        set2.add("김시은");
        System.out.println("LinkedHashSet_입력순서대로_"+set2);


        //3. TreeSet Comparator에 의해서
        Set<String> set3 = new TreeSet<>(Comparator.reverseOrder());

        set3.add("이진우");
        set3.add("김정우");
        set3.add("김시은");
        System.out.println("TreeSet_Comparator_"+set3);

    }
}

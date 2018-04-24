import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> trackA = new ArrayList<>();
        List<String> trackB = new ArrayList<>();

        trackA.addAll(Arrays.asList(new String[] { "홍길동", "박찬호", "박지성"}));
        trackB.addAll(Arrays.asList(new String[] { "박지성"}));

        trackA.retainAll(trackB);

        System.out.println(trackA);


        /*
        List<Integer> numbersA = new ArrayList<>();
        List<Integer> numbersB = new ArrayList<>();
        numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2 }));
        numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 533, 3, 4, 2 }));
        System.out.println("A: " + numbersA);
        System.out.println("B: " + numbersB);
        List<Integer> numbersC = new ArrayList<>();
        numbersC.addAll(numbersA);
        numbersC.retainAll(numbersB);
        System.out.println("List A : " + numbersA);
        System.out.println("List B : " + numbersB);
        System.out.println("Common elements between A and B: " + numbersC);
        */

    }
}

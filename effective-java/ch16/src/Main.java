//ch16.계승하는 대신 구성하라 (class extends 인 경우에 한해서)
//인터페이스에 대해서는 적용X

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        InstrumentedHashSet<String> s = new InstrumentedHashSet<String>();

        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        //3을 예상했지만 6이 리턴 됨
        System.out.println(s.getAddCount());


    }
}

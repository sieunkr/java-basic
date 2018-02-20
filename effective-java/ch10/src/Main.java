//10.toString 은 항상 재정의하라
//가능하면 toString 메서드는 객체 내의 중요 정보를 전부 담아서 반환하며, 문자열의 형식을 명시하던 안하던, 어떤 의도인지는 문서에 분명하게 남겨야 한다.

public class Main {

    public static void main(String[] args) {

        Coffee latte = new Coffee("latte", 1200);
        System.out.println(latte.toString());

    }
}

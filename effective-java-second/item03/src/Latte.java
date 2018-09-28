public class Latte {

    private static final Latte INSTANCE = new Latte();

    private Latte(){
    }

    public static Latte getInstance(){
        return INSTANCE;
    }

    public void display(){
        System.out.println("정적 팩토리 메서드, 싱글턴");
    }

}

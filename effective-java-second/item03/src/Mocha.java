public class Mocha {

    public static final Mocha INSTANCE = new Mocha();

    private Mocha(){
    }

    public void display(){
        System.out.println("필드 선언, 싱글턴");
    }

}

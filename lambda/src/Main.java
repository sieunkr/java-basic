import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Java 8 in Action 을 공부하면서 작성한 코드 정리 - 2018.01.31

        Runnable r1 = () -> System.out.println("1.람다, Runnable");
        r1.run();

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("2.익명 클래스, Runnable");
            }
        };
        r2.run();

        FuntionalAction actionFuntional = () -> System.out.println("3.람다, 인터페이스");
        actionFuntional.action();

        FuntionalAction actionFuntional2 = new FuntionalAction() {
            @Override
            public void action() {
                System.out.println("4.익명 클래스, 인터페이스");
            }
        };
        actionFuntional2.action();


        FunctionActionWithParam functionActionWithParam = (x) -> {
            System.out.println("5.매개 변수가 있는 " + x);
        };
        functionActionWithParam.action("_Eddy");

        













    }
}

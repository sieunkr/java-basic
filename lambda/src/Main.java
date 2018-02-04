import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.rmi.server.ExportException;

public class Main {

    public static void main(String[] args) throws IOException{
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
            System.out.println("5.매개 변수가 있는 람다, 파라미터는 " + x);
        };
        functionActionWithParam.action("Eddy");


        FunctionActionWithReturn functionActionWithReturn;
        functionActionWithReturn = (x) -> {
          return "6.리턴값이 있는 람다, 리턴값은 " + x;
        };
        System.out.println(functionActionWithReturn.action("Eddy"));



        String oneLine = processString((FileInputStream f) -> f.read());
        System.out.println("7." + oneLine);

    }

    public static String processString(FunctionActionProcessor p) throws IOException{
        try(FileInputStream fs = new FileInputStream("Eddy")){
            return p.action(fs);
        }
    }

    public interface FunctionActionProcessor {
        public String action(FileInputStream f) throws IOException;
    }



}

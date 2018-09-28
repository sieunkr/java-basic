import java.sql.Date;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new Coffee(Date.valueOf("2018-01-05"));
        System.out.println(coffee.isNewCoffee());

    }
}

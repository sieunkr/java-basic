public class Main {

    public static void main(String[] args) {

        Latte latte = Latte.getInstance();
        latte.display();

        //Americano.INSTANCE.display();
        Americano americano = Americano.INSTANCE;
        americano.display();

        Mocha mocha = Mocha.INSTANCE;
        mocha.display();



    }
}

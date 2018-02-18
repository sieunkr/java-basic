//03.private 생성자는 싱글턴 패턴을 따르도록 설계

public class Main {

    public static void main(String[] args) {

        Mocha mocha = Mocha.INSTANCE;
        mocha.display();

        Latte latte = Latte.getInstance();
        latte.display();

        Americano americano = Americano.INSTANCE;
        americano.display();

    }
}

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Programmer programmer = new Programmer();
        programmer.setCalculator(calculator);
        programmer.start();

        Designer designer = new Designer();
        designer.setCalculator(calculator);
        designer.start();


    }
}

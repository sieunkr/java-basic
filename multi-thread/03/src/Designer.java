public class Designer extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("디자이너");
        this.calculator = calculator;
    }

    public void run(){
        try {
            calculator.setMemory(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

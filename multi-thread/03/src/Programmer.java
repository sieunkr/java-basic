public class Programmer extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("프로그래머"); //쓰레드 이름 설정
        this.calculator = calculator;
    }

    public void run(){
        try {
            calculator.setMemory(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

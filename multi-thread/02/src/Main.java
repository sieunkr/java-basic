public class Main {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

        System.out.println(Thread.currentThread().getName() + "-메인쓰레드");
    }
}

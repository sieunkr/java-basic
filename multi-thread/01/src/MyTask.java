public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("MyTask 쓰레드");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

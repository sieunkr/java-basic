public class MyThread extends Thread {

    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName() + "-MyThread 쓰레드");
    }
}

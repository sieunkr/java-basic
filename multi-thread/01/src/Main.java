public class Main {

    public static void main(String[] args) {

        /* 방법1
        Runnable myTask = new MyTask();
        Thread thread = new Thread(myTask);
        */

        /* 방법2. 익명 구현 객체
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("MyTask 쓰레드");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        */

        /* 방법3. 람다식 -  */
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("MyTask 쓰레드");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread.start();
        System.out.println("메인스레드");

    }
}

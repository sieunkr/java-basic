public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    /* 잘못된 값이 나오는 예
    public void setMemory(int memory) throws InterruptedException {
        this.memory = memory;

        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }
    */

    /*메소드 전체를 잠금한 예
    public synchronized void setMemory(int memory) throws InterruptedException {
        this.memory = memory;

        Thread.sleep(3000);
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }
    */

    //동기화 블록
    public void setMemory(int memory) throws InterruptedException {

        //this 는 공유객체인 Calculator의 참조(잠금 대상)
        synchronized (this){
            this.memory = memory;
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + ":" + this.memory);
        }

    }
}

package concurrent.thread;

public class ThreadTest {
    public static void main (String[] args) throws InterruptedException {
        Thread t = new Thread("aa");
        System.out.println(t.getName());
        Thread t1 =new JoinThread();
        t1.start();
        t1.interrupt();
        System.out.println("t1.interrupt_status:"+t1.isInterrupted());
        System.out.println("main thread end");



    }
}

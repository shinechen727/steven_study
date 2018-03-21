package concurrent.thread;

public class JoinThread extends Thread {
    public void run() {

            for (int i = 0; i < 100000; i++) {
                if(this.isInterrupted()){
                    break;
                }
                System.out.println("this is: " + i);
            }
        }
}

package concurrent.threadpool;

public class RunTask implements Runnable {
    public void run() {
        for(int i=0;i<10;i++){
            //System.out.println("this task's id is :"+i);
        }
    }
}

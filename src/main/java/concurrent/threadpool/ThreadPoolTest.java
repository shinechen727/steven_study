package concurrent.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest {
    public static void main (String[] args){
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        Long begin =System.currentTimeMillis();
        for(int i=0;i<100;i++){
            threadPoolExecutor.execute(new RunTask());
        }

        System.out.println(System.currentTimeMillis()-begin);
        threadPoolExecutor.shutdownNow();
    }
}

package concurrent.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo  {
    public static void main(String[] args){
        ExecutorService es = Executors.newCachedThreadPool();
        List<Future<String>> result = new ArrayList<Future<String>>();
        for(int i=0;i<10;i++){
            result.add(es.submit(new CallableTask(i)));
        }

        for(Future<String> future :result){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }finally {
                es.shutdown();
            }
        }
    }
}

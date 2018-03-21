package concurrent.threadpool;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {
    private int id;
    public CallableTask(int id){
        this.id = id;

    }

    public String call() throws Exception {
        return "this task result is : " + id;
    }
}

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args)
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        int i = 0;
        Task task = new Task("Task " + i);
        executor.execute(task);
        try {
            TimeUnit.SECONDS.sleep(10);
        }catch (InterruptedException e) {
            System.out.println("sleep");
        }
        task.kill();

        executor.shutdown();
    }
}

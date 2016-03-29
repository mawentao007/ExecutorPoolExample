import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by marvin on 16-3-29.
 */
class Task implements Runnable
{
    private String name;
    private Thread taskThread;

    public Task(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void kill(){
            System.out.println("i am killed");
            taskThread.interrupt();
    }

    @Override
    public void run()
    {
        taskThread = Thread.currentThread();
        int i = 0;
        ArrayList<Integer> a = new ArrayList<Integer>();
        try
        {
            while(true) {
                i++;
                a.add(i);
                Long duration = (long) (Math.random() * 10);
                System.out.println("Doing a task during : " + name);
                TimeUnit.SECONDS.sleep(duration);
            }
        }
        catch (InterruptedException e)
        {

            System.out.println(add(5,10));
            System.out.println("i am being interrupted,i is " + a.toString());
        }
    }

    private int add(int a,int b){
        return a * a + b * b;
    }
}

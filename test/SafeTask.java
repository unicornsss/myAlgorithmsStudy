package test;

/**
 * Created by 羊 on 2019/4/18.
 */
//public class SafeTask {
//}
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SafeTask implements Runnable {
//    线程局部变量。
    private static ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
        @Override
        protected Date initialValue() {
            return new Date();
        }
    };

    @Override
    public void run() {
        System.out.printf("Starting Thread: %s : %s\n", Thread.currentThread().getId(), startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int)Math.rint(Math.random()*10));
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.printf("Thread Finished: %s : %s\n", Thread.currentThread().getId(), startDate.get());
    }

    public static void main(String[] args){
        SafeTask st = new SafeTask();
        System.out.println(st.toString());
        try {
            for(int i=0;i<10;i++){
                Thread t = new Thread(st);
                t.start();
                TimeUnit.SECONDS.sleep(2);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
package futest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 羊 on 2019/5/12.
 */
//public class ThreadUnsafeExample {
//}
public class ThreadUnsafeExample {

    private int cnt = 0;

//    public synchronized void add() {
//进行操作的数据没有加上分布式锁，所以会有不安全。
    public void add(){
        cnt++;
    }

    public int get() {
        return cnt;
    }
    public static void main(String[] args) throws InterruptedException {
        final int threadSize = 1000;
        ThreadUnsafeExample example = new ThreadUnsafeExample();
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < threadSize; i++) {
            executorService.execute(() -> {
                example.add();
                countDownLatch.countDown();
                System.out.println("--"+example.get());
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println(example.get());
    }
}
package test;

/**
 * Created by 羊 on 2019/4/8.
 */
public class Mythread {
    public static void main(String[] args) {
        Multiple mymul = new Multiple(4);
        //不是start之后就会立即执行，必须要cpu对其进行调度，才会开始执行，比如在主函数中调用了这个start
        mymul.start();
        System.out.println("main thread ends");
    }
}
class Multiple extends Thread{
    private int num;

    public Multiple(int num) {
        this.num = num;
    }

    @Override
    public void run() {
//        super.run();
        int i = num;
        int result = 1;
        System.out.println("new thread started");
        while(i>0) {
            result*=i;
            i--;
        }
        System.out.println("The factorial of "+num+" is "+result);
        System.out.println("new thread ends");
    }
}

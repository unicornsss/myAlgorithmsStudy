package test;

/**
 * Created by 羊 on 2019/4/8.
 */
public class MythreadRunable {
    public static void main(String[] args) {
        Multiple2 mytest = new Multiple2(5);
        mytest.run();
    }
}
class Multiple2 implements Runnable{
    private int num;

    public Multiple2(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        //必须
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
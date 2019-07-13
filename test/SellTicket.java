package test;

/**
 * Created by 羊 on 2019/4/18.
 */
public class SellTicket {
    public static void main(String[] args) {
        //多个线程执行的代码相同，使用同一个runnable对象。
        Ticket t = new Ticket();
        new Thread(t).start();
        new Thread(t).start();
        new Thread(t).start();
    }
}
class Ticket implements Runnable{
    private int ticket=10;

    @Override
    public void run() {
        while(ticket>0){
            ticket--;
            System.out.println("当前票数为"+ticket);
        }
    }
}

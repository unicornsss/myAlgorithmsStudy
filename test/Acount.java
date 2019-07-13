package test;

/**
 * Created by 羊 on 2019/4/18.
 */
public class Acount {

    private int money;

    public Acount(int money) {
        this.money = money;
    }

    //加了同步锁
    public synchronized void getMoney(int money) {
        // 注意这个地方必须用while循环，因为即便再存入钱也有可能比取的要少
        while (this.money < money) {
            System.out.println("取款：" + money + " 余额：" + this.money
                    + " 余额不足，正在等待存款......");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.money = this.money - money;
        System.out.println("取出：" + money + " 还剩余：" + this.money);

    }

    public synchronized void setMoney(int money) {

        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        this.money = this.money + money;
        System.out.println("新存入：" + money + " 共计：" + this.money);
        notify();
    }

    public static void main(String args[]) {
        Acount Acount = new Acount(0);
        Bank b = new Bank(Acount);
        ConsumerMoney c = new ConsumerMoney(Acount);
        new Thread(b).start();
        new Thread(c).start();
    }
}

// 存款类
class Bank implements Runnable{
    Acount acount;

    public Bank(Acount acount) {
        this.acount = acount;
    }

    @Override
    public void run() {
        while(true){
            int t = (int) (Math.random()*1000);
            acount.setMoney(t);
        }
    }
}

class ConsumerMoney implements Runnable{

    Acount acount;

    public ConsumerMoney(Acount acount) {
        this.acount = acount;
    }

    @Override
    public void run() {
        while(true){
            int t = (int) (Math.random()*1000);
            acount.getMoney(t);
        }
    }
}

// 取款类
//class Consumer implements Runnable {
//    Acount Acount;
//
//    public Consumer(Acount Acount) {
//        this.Acount = Acount;
//    }
//
//    public void run() {
//        while (true) {
//            int temp = (int) (Math.random() * 1000);
//            Acount.getMoney(temp);
//        }
//    }
//}

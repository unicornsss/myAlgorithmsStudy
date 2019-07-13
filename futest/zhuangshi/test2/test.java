package futest.zhuangshi.test2;

/**
 * Created by 羊 on 2019/5/15.
 */
public class test {
    public static void main(String[] args) {
        TheGreatestSage sage = new Monkey();
        // 第一种写法  单层装饰
//        TheGreatestSage bird = new Bird(sage);
//        TheGreatestSage fish = new Fish(bird);
//        bird.move();
//        fish.move();
        // 第二种写法 双层装饰
//        TheGreatestSage fish = new Fish(new Bird(sage));
        TheGreatestSage fish = new Fish(new Bird(sage));
        fish.move();
    }
}

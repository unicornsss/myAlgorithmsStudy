package futest.zhuangshi;

/**
 * Created by 羊 on 2019/5/15.
 */
public class test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();//新建一个具体构建
        Component concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.testComponent();

//        TheGreatestSage sage = new Monkey();
//        // 第一种写法  单层装饰
//        TheGreatestSage bird = new Bird(sage);
//        TheGreatestSage fish = new Fish(bird);
//        // 第二种写法 双层装饰
//        //TheGreatestSage fish = new Fish(new Bird(sage));
//        fish.move();
    }
}

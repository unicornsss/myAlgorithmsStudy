package futest.zhuangshi;

/**
 * Created by 羊 on 2019/5/15.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
//        super(component);
    }

    @Override
    public void testComponent() {
//        super.testComponent();父类的方法。
        System.out.println("我是具体装饰角色");
    }
}

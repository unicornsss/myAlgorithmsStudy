package futest.zhuangshi;

/**
 * 具体构建：定义一个将要接收附加责任的类。
 * Created by 羊 on 2019/5/15.
 */
public class ConcreteComponent implements Component {

    @Override
    public void testComponent() {
        System.out.println("我是在具体构建里面的");
    }
}

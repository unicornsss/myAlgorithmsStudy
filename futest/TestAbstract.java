package futest;

/**
 * Created by 羊 on 2019/4/25.
 */
public class TestAbstract extends myAbstract {
    public TestAbstract(int x) {
        super(x);
    }

    @Override
    void func1() {
        System.out.println("func1");
    }

    @Override
    public void fun2() {
        System.out.println("func2");
    }

    public static void main(String[] args) {
        TestAbstract test = new TestAbstract(5);
        test.fun3();
        test.fun2();
        test.func1();
    }

}

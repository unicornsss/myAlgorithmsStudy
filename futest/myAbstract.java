package futest;

/**
 * Created by 羊 on 2019/4/25.
 */
abstract class myAbstract {
    private int x;

    public myAbstract(int x) {
        this.x = x;
    }

    abstract void func1();
    public abstract void fun2();
    public void fun3(){
        System.out.println(this.x);
    }
}

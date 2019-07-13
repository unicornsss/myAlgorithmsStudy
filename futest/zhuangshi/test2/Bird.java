package futest.zhuangshi.test2;

/**
 * Created by 羊 on 2019/5/15.
 */
public class Bird extends Change {

    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        // 代码
        System.out.println("Bird Move");
    }
}

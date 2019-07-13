package futest.zhuangshi.test2;

/**
 * Created by 羊 on 2019/5/15.
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage){
        this.sage = sage;
    }
    @Override
    public void move() {
        // 代码
        sage.move();
    }
}
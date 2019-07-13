package futest.zhuangshi;

/**
 * Created by 羊 on 2019/5/15.
 */
public class Decorator implements Component {

    Component component ;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void testComponent() {
        component.testComponent();
    }
}

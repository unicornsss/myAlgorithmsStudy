package futest.factory;

/**
 * Created by 羊 on 2019/4/28.
 */
public class RegisteredFactories {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(Part.createRandom());
        }
    }
}

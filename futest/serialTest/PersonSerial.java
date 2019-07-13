package futest.serialTest;

import java.io.Serializable;

/**
 * Created by 羊 on 2019/5/16.
 */
public class PersonSerial implements Serializable{
    private static final long serialVersionUID = 1561485697568125173L;
    private int age;
    private String name;
    private String xx;
    private String yy;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonSerial{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

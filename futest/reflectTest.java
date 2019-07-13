package futest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by 羊 on 2019/4/28.
 */
public class reflectTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> studentClass = Student.class;
        String get = String.valueOf(Class.forName("futest.Student"));
//        com.mysql.jdbc.Driver
        System.out.println(get);
//        private static
        Class<Student> userClass = Student.class;
        //构造器
        Constructor<?>[] constructors = userClass.getConstructors();//构造函数
        for (Constructor<?> i : constructors) {
            System.out.println(i);
        }
        Field fields[] = userClass.getDeclaredFields();//属性
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("----------------------------------methods");
        Method method[] = userClass.getMethods();
        for (Method mt : method) {
            System.out.println(mt);
        }
    }
}

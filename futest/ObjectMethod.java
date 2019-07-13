package futest;

/**
 * Created by 羊 on 2019/4/25.
 */
public class ObjectMethod {
    public static void tryClone() throws CloneNotSupportedException {
        Student test1 = new Student(19,"xiaoz");
        Student new1 = new Student();
        new1 = test1;
        Student test2 = new Student(19,"xiaoz");
        Student new12 = new Student();
        new12 = (Student) test1.clone();
        System.out.println(test1);
        System.out.println(new1);
        System.out.println(new12);
    }

    public static void tryEquals(){
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        tryEquals();
    }

}

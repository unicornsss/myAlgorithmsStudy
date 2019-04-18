package test;

/**
 * Created by 羊 on 2019/4/3.
 */
public class StringTest {
    public static void main(String[] args) {
//        String s1= new String("a");
//        String s2 = new String("a").intern();
//        String s3 = "a";
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//        System.out.println(s3 == s1);

//        String s1 = new String("1");    // 同时会生成堆中的对象 以及常量池中1的对象，但是此时s1是指向堆中的对象的
//        s1.intern();            // 常量池中的已经存在
//        String s2 = "1";
//        System.out.println(s1 == s2);    // false

//        String s3 = new String("1")+new String("1");
//        s3.intern();
//        String s4 = "11";//这个对象之前常量池中没有，所以intern之后是一个正确选项。
//        System.out.println(s3==s4);

//        String a = "1";
//        for (int i=0; i<10; i++) {
//            　　a += i;
//        }

//        String a = "1";
//        for (int i=0; i<10; i++) {
//            a += "1";
//        }

//        每次循环都建了一个StringBuilder对象，优化之后为。
        StringBuilder sb = new StringBuilder("1");
        for (int i=0; i<10; i++) {
            sb.append("1");
        }
    }
}

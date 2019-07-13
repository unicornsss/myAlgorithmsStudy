package test;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by 羊 on 2019/5/9.
 */
public class bigintTest {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        BigInteger num=new BigInteger("1");
        BigInteger flat=new BigInteger("1");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x = n/10;
        for (int i = 0; i < n; i++) {
//            if((i+1)%x == 0) {
//                System.out.println("x============"+ i);
            flat=flat.multiply(num);
//            System.out.println(flat);
            num=num.add(new BigInteger("1"));
            }
//            500 50 100
//            flat=flat.multiply(num);
//            System.out.println(flat);
//            num=num.add(new BigInteger("1"));
        System.out.println(n+"!="+flat);
        System.out.println("共"+flat.toString().length()+"位");
        long endTime=System.currentTimeMillis();
        System.out.println("计算"+n+"!一共用了"+(double)(endTime-startTime)/1000+"秒");

        }
}

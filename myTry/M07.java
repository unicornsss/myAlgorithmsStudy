package myTry;

import java.math.BigInteger;

/**
 * Created by 羊 on 2019/3/16.
 */
public class M07 {
    public static void main(String[] args) {
        M07 m = new M07();
//        long x = 9646324351;
//        System.out.println((9646324351 > Integer.MAX_VALUE)? 6 : 2);
        System.out.println(m.reverse(-2147483601));
//        System.out.println(res);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }
    public int reverse(int x) {
        //我的思路，将数字去掉符号，转化为字符串，再通过StringBuilder的reverse将其翻转，再将其字符串转化成int。
        //问题：9646324351 这样的超长数据， 在最后转化成为int中有问题。
        //最开始没有考虑到 输入后超限的可能，倒置后也超限的可能，以及 对于大数的比较。和对于去绝对值的限制（必须为intx型，超限制也不行）
        String mid;
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }
        int xx = Math.abs(x);
            StringBuffer ress = new StringBuffer(String.valueOf(xx)).reverse();

        if(x < 0){
            mid = "-"+ress.toString();
        }else {
            mid = ress.toString();
        }
            BigInteger res = BigInteger.valueOf(Long.parseLong(mid));
            if (res.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) == 1 ||
                    res.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) == -1) {
                return 0;
            }
            return res.intValue();
    }
}

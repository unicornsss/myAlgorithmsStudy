package others;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M07 {
    //Reverse Integer数字的内容。
    public static void main(String[] args) {
        M07 m = new M07();
        System.out.println(m.reverse(-2101));
    }
//    leetcode第一评论的方法
    public int reverse(int x) {
        int result = 0;
        while (x != 0)
        {
            //模运算 取最后一位数
            int tail = x % 10;
            //将末位的位置 转为顺位
            int newResult = result * 10 + tail;//可以去除 符号的影响，负号始终是负号，不会有影响。
//            下面这部分的判断 表示，如果数字太大，减去再除以，精度丢失了，不等于原来的数
//            if( ((result*10 + a) - a) / 10!= result ){ return 0;}
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
            //x的位数逐渐 减少，相当于倒置计算。
        }
        return result;
    }
    public int reverse2(int x) {
        if(x==Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        //先求绝对值
        int num = Math.abs(x);
        int res = 0;
        while(num!=0){
            if(res>(Integer.MAX_VALUE-num%10)/10)//非常巧妙的判断了越界问题
                return x > 0 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            res = res * 10 + num % 10;
            num /= 10;
        }
        return x>0?res:-res;
    }

    public int reverse3(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }
}

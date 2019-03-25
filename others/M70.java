package others;

/**
 * Created by 羊 on 2019/3/25.
 */
public class M70 {
//调用次数大大减少，将前两个计算的东西存放起来
//    2.不用迭代的代码，我们可以知道当前的楼梯步数是前一级楼梯步数加上前两级的楼梯步数之和于是我们可以用几个零食变量来存，
// 先将第一步的楼梯步数存在a里面，a=1; 再将第二步的楼梯步数存在b里面，b=2;
// 再将第三步的步数存在temp里面，temp=a+b; 然后我们知道
//    马上又把a的值抹掉，覆盖成b,a=b; 也把b的值抹掉覆盖成temp,b=temp; 等一下好接着用temp=a+b;
    public int climbStairs(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        int a = 1;
        int b = 2;
        int t = 0;
        for (int i = 3 ; i <= n; i++) {
            t = a+b;
            a = b;
            b = t;
        }
        return t;
    }
    public static void main(String[] args) {
        M70 m = new M70();
        System.out.println(m.climbStairs(15));
    }
}

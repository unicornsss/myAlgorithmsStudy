package myTry;

/**
 * Created by 羊 on 2019/3/25.
 */
public class M70 {
//    分析：n级台阶的走法 = 先走一级后，n-1级台阶的走法 + 先走两级后，n-2级台阶的走法。即 f(n) = f(n-1)+f(n-2)
    //具体通过递归的方法，实现了反复加上前两个的总和。
    // 运行结果 超时，因为计算重复的次数太多了，导致效率低下。
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int res = climbStairs(n-1)+climbStairs(n-2);
        return res;
    }
    public static void main(String[] args) {
        M70 m = new M70();
        System.out.println(m.climbStairs(4));
    }
}
//2 1 1
//3 111 12 21
//4 1111 112 121 211 22
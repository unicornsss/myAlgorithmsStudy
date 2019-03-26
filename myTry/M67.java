package myTry;

/**
 * Created by 羊 on 2019/3/26.
 */
public class M67 {
//    67. Add Binary
//    思路：先将二进制转成10进制，再相加之后转成2进制。 不是常规的计算。
//    计算有问题，过大的算不了，因为范围大小不一样
    public String addBinary(String a, String b) {

        int x = Integer.parseInt(Integer.valueOf(a,2).toString());
        int y = Integer.parseInt(Integer.valueOf(b,2).toString());
        return Integer.toBinaryString(x + y);
    }
    public String addBinary2(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int x = a.length()-1;
        int y = b.length()-1;
        int t = 0;
        while (x >= 0 || y >= 0){
            int sum = t;
            if(x >= 0) sum+=a.charAt(x)-'0';
            if(y >= 0) sum+=b.charAt(y)-'0';
            x--;y--;
            sb.append(sum%2);// 2%2 = 0;
            t = sum/2;// 2/2=1 1/2=0
        }
        if(t!=0)
            sb.append(t);
        return sb.reverse().toString();//逆序输出
    }
    public static void main(String[] args) {
        M67 m = new M67();
        System.out.println(m.addBinary2("1010","1011"));
    }
}

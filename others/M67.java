package others;

/**
 * Created by 羊 on 2019/3/26.
 */
public class M67 {
    //    67. Add Binary
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';//a从最后开始相加
            if (i >= 0) sum += a.charAt(i--) - '0';//b从最后开始相加
            sb.append(sum % 2);//处理相加位的数字
            carry = sum / 2;//如果有进位 该位保存进位的内容
        }
        if (carry != 0) sb.append(carry);//判断总体需不需要多一位
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        M67 m = new M67();
        System.out.println(m.addBinary("1010","1011"));
    }
}

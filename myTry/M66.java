package myTry;

/**
 * Created by 羊 on 2019/3/23.
 */
public class M66 {
//    public int[] plusOne(int[] digits) {
//        int[] res = new int[digits.length];
//        if(digits.length>0){
//            if(digits[digits.length-1] < 9){
////                digits[digits.length-1] = digits[digits.length-1]+1;
//                res[digits.length-1] = digits[digits.length-1]+1;
//            }else{
//                res[digits.length-1] = 0;
//                int mid[] = new int[digits.length-1];
//                for (int i = 0; i < digits.length-1; i++) {
//                    mid[i] = digits[i];
//                }
//                int get[] = plusOne(mid);
//                for (int i = 0; i < get.length; i++) {
//                    res[i] = get[i];
//                }
//            }
//        }
//        return res;
//    }

//  自己没想出来，看的别人的思路
    public int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return  digits;
            }
            //当为9时，将该位置为0，并且继续循环。
            digits[i] =0;
        }
        //当每一个位都进位时，则表示应该将位置多加1位，并且除最高位以外都应该是0
        int res[] = new int[digits.length+1];
        res[0] = 1;
        return res;
    }


    public static void main(String[] args) {
        M66 m = new M66();
        int n[] = {1,2,9};
        int res[] = m.plusOne(n);
        for (int re : res) {
            System.out.print(re+" ");
        }
    }
}

package myTry;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M09 {
    public static void main(String[] args) {
        M09 m = new M09();
        System.out.println(m.isPalindrome(1220));
    }
//    Palindrome Number 回文数 判断
    public boolean isPalindrome(int x) {
        //把数字当作字符串来处理。
        if(x < 0){
            return false;
        }else{
            String mid = String.valueOf(x);
            char[] ca = mid.toCharArray();
            for (int i = 0; i < mid.length()/2; i++) {
                if( ca[i] != ca[mid.length()-i - 1]){
                    return false;
                }
            }
            return true;
        }

    }
}

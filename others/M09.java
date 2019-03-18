package others;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M09 {
    public static void main(String[] args) {
        M09 m = new M09();
        System.out.println(m.isPalindrome(4325234));
    }
    public boolean isPalindrome(int x) {
        if(x < 0 || ( (x != 0) && (x % 10 == 0))) return false;
        int reverse = 0;
        //将后半部分翻转eg 4325234 变成  4325 与 432; 1221变成12 和12 相等
        while(x > reverse){
            reverse  = reverse * 10 + x % 10;
            x = x/10;
        }
        System.out.println("x"+x);
        System.out.println("reverse"+reverse);
        return (x == reverse || x ==reverse /10) ;
    }
}

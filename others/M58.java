package others;

/**
 * Created by 羊 on 2019/3/23.
 */
public class M58 {
    //    Length of Last Word
    public int lengthOfLastWord(String s) {
//        String mid = s.trim();
//        System.out.println(mid);
//        System.out.println(mid.length());
//        return 0;
//        trim()是去掉两边的空格，防止其他的影响，减去最后一个空格的位置
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
    public static void main(String[] args) {
        M58 m = new M58();
        System.out.println(m.lengthOfLastWord("hello world"));
    }
}

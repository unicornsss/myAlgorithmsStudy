package myTry;

/**
 * Created by 羊 on 2019/3/23.
 */
public class M58 {
//    Length of Last Word
//    第一次没有将mid长度为0的条件。
    public int lengthOfLastWord(String s) {
        String mid[] = s.split(" ");
        if(mid.length == 0){
            return 0;
        }else
            return mid[mid.length-1].length();
    }
    public static void main(String[] args) {
        M58 m = new M58();
        int res = m.lengthOfLastWord("");
        System.out.println(res);
    }
}

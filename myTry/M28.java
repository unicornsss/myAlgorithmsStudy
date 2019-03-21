package myTry;

/**
 * Created by 羊 on 2019/3/21.
 */
public class M28 {
//    Implement strStr()
    public int strStr(String haystack, String needle) {
//        for (int i = 0; i < haystack.length(); i++) {
//            if(haystack.charAt(i) == )
//        }
        int index = -1;
        boolean res = haystack.contains(needle);
        if(res){
            index = haystack.indexOf(needle);
        }
        return index;
    }
    public static void main(String[] args) {
        M28 m = new M28();
        int x = m.strStr("aaaaa","bba");
        System.out.println(x);
    }
}

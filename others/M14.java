package others;

/**
 * Created by 羊 on 2019/3/18.
 */
public class M14 {
    public String longestCommonPrefix(String[] strs) {
        //思路跟自己写的差不多，但是代码很精简。
        if( strs ==  null || strs.length == 0) return "";
        String res = new String();
        for (int i = 0; i < strs[0].length(); ++i) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if( i >= strs[j].length() || strs[j].charAt(i) != c){
                    return res;
                }
            }
            res += Character.toString(c);
        }
        return res;
    }
//    思路：pre是第一个的string，
    public String longestCommonPrefix1(String[] strs) {
        if( strs ==  null || strs.length == 0) return "";
        String pre = strs[0];
        int i = 1;
        while( i < strs.length){
            while( strs[i].indexOf(pre)!= 0){
                pre = pre.substring(0,pre.length()-1);
            }
            i++;
        }
        return pre;
    }

    public static void main(String[] args) {
        M14 m = new M14();
        String str[] = {"flower","flow","flooight"};
        String res = m.longestCommonPrefix1(str);
        System.out.println(res);
    }

}

package myTry;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M14 {
    public String longestCommonPrefix(String[] strs) {
        char mid ;
        boolean flag = false;
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                mid = strs[i].charAt(j);
                if(mid == strs[i+1].charAt(j)){
                    res = res + strs[i+1].charAt(j);
                    flag = true;
                }else{
                    flag = false;
                    return  "";
                }
            }
        }
        return "res";
    }

}

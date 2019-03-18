package myTry;

/**
 * Created by 羊 on 2019/3/17.
 */
public class M14 {
    public static void main(String[] args) {
        M14 m = new M14();
        String str[] = {"flower","flow","flooight"};
        String res = m.longestCommonPrefix(str);
        System.out.println(res+"===");
    }

    public String longestCommonPrefix(String[] strs) {
//        思路：找出最短的长度的字符串，将第一个字符串 的第一个字符开始取出，再通过循环比比较，
// 、如果都相同的时候，就给予true 并且将内容加入到结果集中。
//        运行出来不报错，但是leetcode上报错 索引0 超出范围
//        if( strs == null || strs.length == 0) return "";
        boolean flag = false;
        String res = "";
        int min = 0;
        for (int i = 0; i < strs.length -1; i++) {
            min = strs[i].length();
            if(min > strs[i+1].length()){
                min = strs[i+1].length();
            }
        }
        char xs ;
        for (int i = 0; i < min; i++) {
            xs = strs[0].charAt(i);
            System.out.println("xs"+xs);

            int j = 0;
            while(j < strs.length-1 ){
                System.out.println(strs[j+1].charAt(i)+"- -");
                if(xs == strs[j+1].charAt(i)){
                    //StringIndexOutOfBoundsException: string index out of range：0 此行报错。
                    flag = true;
                }else{
                    flag = false;
                }
                j++;
            }
//
            if(flag){
                res = res + strs[j].charAt(i);
//                System.out.println(res);
            }
        }
        return res;
    }
}

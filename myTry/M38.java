package myTry;

/**
 * Created by 羊 on 2019/3/22.
 */
public class M38 {
//    Count and Say
    public String countAndSay(int n) {
//        思路：本题重点在理解题意，每一个数字都是对上一个数字的内容进行解析，
//        比如 输入5，4的结果的1 2 1 1，所以5的结果是1 1 1 2 2 1意思就是一个一，一个二，二个一
//        解题思路 采用递归的方式，取到上一个的解，再对解的字符串进行分析
        String str = "";
            if(n == 1){
                str = "1";
            }else{
//                如果等于2 则要
                String mid = countAndSay(n-1);
//                String mid = "111221";
                int count = 1;
                if(mid.length() == 1){
                    return "11";
                }
                for (int i = 1; i < mid.length(); i++) {
                    if(mid.charAt(i) == mid.charAt(i-1)){
                        count++;
                        if(i+1 == mid.length()){
                            str = str+String.valueOf(count)+mid.charAt(i);
                        }
                    }else if (mid.charAt(i) != mid.charAt(i-1)){
                        if(count == 1){//没有重复的
                            str = str+"1"+mid.charAt(i-1);
                            if(i+1 == mid.length()){
                                str = str+"1"+mid.charAt(i);
                            }
                        }else {
                            str = str+String.valueOf(count)+mid.charAt(i-1);
                            count = 1;
                            if(i+1 == mid.length()){
                                str = str+"1"+mid.charAt(i);
                            }
                        }
                    }
                }
            }
        return str;
    }

    public static void main(String[] args) {
        M38 m = new M38();
        String res = m.countAndSay(8);
        System.out.println(res);
    }
}
package others;

/**
 * Created by 羊 on 2019/3/22.
 */
public class M38 {
//    Count and Say
//    思路：总体采用递归，将代码分离，功能更加完善
    public String countAndSay(int n) {
        String s = "1";
        for(int i = 1; i < n; i++){
            s = countIdx(s);
        }
        return s;
    }
    public String countIdx(String s){
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
            else
            {
                sb.append(count);//当数字不再重复的时候
                sb.append(c);
                c = s.charAt(i);//将本字符更新为比较字符
                count = 1;//重置计数器
            }
        }
        //将最后一个字符丢进去
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        M38 m = new M38();
        String res = m.countAndSay(8);
        System.out.println(res);
    }
}

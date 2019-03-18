package myTry;

import java.util.Stack;

/**
 * Created by 羊 on 2019/3/18.
 */
public class M20 {
    public boolean isValid(String s) {
//        思路： 遇见左括号就进栈右括号，遇见后括号就出栈。如果最后为empty就表示是匹配的
        if (s.length() == 0) return true;
        if( s.length() == 1) return false;
        Stack<Character> stack = new Stack<Character>();
        char mid[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if(mid[i] == '('){
                stack.push(')');
            }else if(mid[i] == '['){
                stack.push(']');
            }else if(mid[i] == '{'){
                stack.push('}');
            }else if(stack.isEmpty()){//表示只有右边的括号 但是 栈中没有内容 直接能判断错误。
                return false;
            }else{//剩下的情况都为右边括号
                char c = stack.pop();
                if(c != mid[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        M20 m = new M20();
        boolean res = m.isValid("{()}]");
        System.out.println(res);
    }
}

package others;

import java.util.Stack;

/**
 * Created by 羊 on 2019/3/18.
 */
public class M20 {
//    思路 本人是根据这个版本的代码，但是 这个代码语句优化很多。
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        M20 m = new M20();
        boolean res = m.isValid("{()}]");
        System.out.println(res);
    }
}

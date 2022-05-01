package Demo_2022_04_25;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 题目链接：https://leetcode-cn.com/problems/valid-parentheses/
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *           左括号必须用相同类型的右括号闭合。
 *           左括号必须以正确的顺序闭合。

 */
public class Demo01 {
   static HashMap<Character,Character> map = new HashMap<>();

   static {
       map.put('(',')');
       map.put('{','}');
       map.put('[',']');
   }

    public static void main(String[] args) {
        System.out.println(isValid2("[][][][][}"));
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                if (map.get(stack.pop()) != c){
                    return false;
                }
            }
        }
        /*如果只有一个标识符，并且是前面的，那么就存在只循环一次就跳出来了，就根本没有匹配右括号，因为他就一个左括号*/
        return stack.isEmpty();
    }
    public static boolean isValid1(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if (stack.isEmpty()){
                    return false;
                }
                Character left = stack.pop();
                if (left == '(' && c != ')'){
                    return false;
                }
                if (left == '[' && c != ']'){
                    return false;
                }
                if (left == '{' && c != '}'){
                    return false;
                }
            }
        }
        /*如果只有一个标识符，并且是前面的，那么就存在只循环一次就跳出来了，就根本没有匹配右括号，因为他就一个左括号*/
        return stack.isEmpty();
    }
}

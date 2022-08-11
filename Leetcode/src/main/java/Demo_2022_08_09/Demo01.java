package Demo_2022_08_09;

import java.util.LinkedList;
import java.util.Objects;

/**
 * @author 程世玉
 * @data 2022/8/9.
 * 1、题目链接：<a href="https://leetcode.cn/problems/8Zf90G/">...</a>
 * 2、题目描述：根据 逆波兰表示法，求该后缀表达式的计算结果。
 *
 * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 */
public class Demo01 {
    public static void main(String[] args) {
        String[] buf = {"4","13","5","/","+"};
        System.out.println(evalRPN(buf));
    }
    public static int evalRPN(String[] tokens) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (String token : tokens) {
            if (Objects.equals(token, "+") || Objects.equals(token, "-") || Objects.equals(token, "/") || Objects.equals(token, "*")){
                Integer a = Integer.parseInt(linkedList.removeLast());
                Integer b = Integer.valueOf(linkedList.removeLast());
                Integer sum = sum(b,a , token);
                linkedList.add(String.valueOf(sum));
            }else {
                linkedList.add(token);
            }
        }
        return Integer.parseInt(linkedList.get(0));
    }
    private static Integer sum(Integer a,Integer b,String opt){
        return switch (opt) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
    }
}

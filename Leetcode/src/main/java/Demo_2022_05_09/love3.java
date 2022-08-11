package Demo_2022_05_09;

/**
 * @author 程世玉
 * @data 2022/5/9.
 * 题目链接： https://leetcode.cn/problems/string-to-integer-atoi/
 * 请你来实现一个 myAtoi(string s) 函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 atoi 函数）。
 */
public class love3 {
    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));
    }
    public static int myAtoi(String s) {

        //
        char[] chars = s.toCharArray();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                    sb.append(chars[i]);
                    continue;
                case '-', '+':
                    sb.append(chars[i]);
                    continue;
                default:
                    break;
            }
        }
        String ss = sb.toString();
        /*进行溢出判断*/
        return Integer.parseInt(sb.toString());
    }

}

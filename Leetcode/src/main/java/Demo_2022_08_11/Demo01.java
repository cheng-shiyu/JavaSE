package Demo_2022_08_11;

/**
 * @author 程世玉
 * @data 2022/8/11.
 * 1、题目链接：<a href="https://leetcode.cn/problems/reformat-the-string/">...</a>
 * 2、题目描述：
 * 给你一个混合了数字和字母的字符串 s，其中的字母均为小写英文字母。
 * <p>
 * 请你将该字符串重新格式化，使得任意两个相邻字符的类型都不同。也就是说，字母后面应该跟着数字，而数字后面应该跟着字母。
 * <p>
 * 请你返回 重新格式化后 的字符串；如果无法按要求重新格式化，则返回一个 空字符串 。
 */
public class Demo01 {

    public static void main(String[] args) {
        reformat("a0b1c2");
    }

    public static String reformat(String s) {
        // abc123
        // a1b2c3
        // 怎么使用深度优先算法满足需求呢？

        // 将所有的数字拿出来
        // 所有的字母
        String letter = s.replaceAll("\\d", "");
        // 所有的数字
        String num = s.replaceAll("[a-z]", "");

        if (letter.length() - num.length() > 1 || letter.length() - num.length() < -1){
            return "";
        }

        // 满足需求，直接循环输出即可
        char[] letterChars = letter.toCharArray();
        char[] numChars = num.toCharArray();


        StringBuffer buffer = new StringBuffer();
        // 循环输出即可
        if (numChars.length > letterChars.length){
            buffer.append(numChars[0]);
            for (int i = 0; i < letterChars.length; i++){
                buffer.append(letterChars[i]).append(numChars[i+1]);
            }
        }else if (numChars.length < letterChars.length) {
            buffer.append(letterChars[0]);
            for (int i = 0; i < numChars.length; i++){
                buffer.append(numChars[i]).append(letterChars[i+1]);
            }
        }else {
            for (int i = 0; i < numChars.length; i++){
                buffer.append(numChars[i]).append(letterChars[i]);
            }
        }
        return buffer.toString();

    }
}

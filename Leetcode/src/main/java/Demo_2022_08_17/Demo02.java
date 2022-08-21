package Demo_2022_08_17;

/**
 * @author 程世玉
 * @data 2022/8/17.
 * 1、题目链接：<a href="https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/">...</a>
 * 2、题目描述：输入一个英文句子，翻转句子中单词的顺序，
 * 但单词内字符的顺序不变。为简单起见，标点符号和普通字
 * 母一样处理。例如输入字符串"I am a student. "，
 * 则输出"student. a am I"。
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s) {
        String trim = s.trim();
        String[] split = trim.split(" ");

        StringBuffer sb = new StringBuffer();

        for (int i = split.length - 1; i >= 0; i--){
            if (!split[i].equals("")){
                sb.append(split[i].trim()).append(" ");
            }
        }

        return sb.toString().trim();
    }
}

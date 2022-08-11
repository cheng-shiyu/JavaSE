package Demo_2022_08_04;

/**
 * @author 程世玉
 * @data 2022/8/5.
 * 1、题目链接：<a href="https://leetcode.cn/problems/break-a-palindrome/">...</a>
 * 2、详细描述：.  破坏回文串
 * 给你一个由小写英文字母组成的回文字符串 palindrome ，请你将其中 一个 字符用任意小写英文字母替换，使得结果字符串的 字典序最小 ，且 不是 回文串。
 *
 * 请你返回结果字符串。如果无法做到，则返回一个 空串 。
 *
 * 如果两个字符串长度相同，那么字符串 a 字典序比字符串 b 小可以这样定义：在 a 和 b 出现不同的第一个位置上，字符串 a 中的字符严格小于 b 中的对应字符。例如，"abcc” 字典序比 "abcd" 小，因为不同的第一个位置是在第四个字符，显然 'c' 比 'd' 小。
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(breakPalindrome("aabaa"));
    }

    public static String breakPalindrome(String palindrome) {

        // 让其为不是回文字符串
        /**
         * 1、能从头开始不要从结尾开始
         * 2、能选择小的字母的不要选择大的字母
         * 3、存在要在开头添加的字母非常的大，在结尾添加的字符非常小的时候
         * 4、从头开始，仅仅是在大家字母都相同的时候，添加到前面最好
         * 所以，我的思路是
         * 首先，要找到替换那一个字符串，可以让他不是回文字符串
         * 一步一步判断，从a开始判断，然后从b开始判断，然后从c开始判断
         * 从头开始判断，从结尾开始判断
         */
        char[] chars = palindrome.toCharArray();

        // 如果长度为1，则直接返回，一定没有回文数
        if (chars.length == 1){
            return "";
        }

        // 如果长度不为1，如果一半中，所有的字符都为a，则让最后的a变成b即可

        boolean flag = true;
        // 然后进行循环遍历，得到所有的数据就行
        for (int i = 0; i < chars.length / 2 ; i++){
            if (chars[i] != 'a'){
                chars[i] = 'a';
                flag = false;
                break;
            }
        }
        if (flag){
            chars[chars.length - 1] = 'b';
        }
        return new String(chars);
    }
}

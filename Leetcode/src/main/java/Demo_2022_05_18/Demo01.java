package Demo_2022_05_18;

/**
 * @author 程世玉
 * @data 2022/5/18.
 * 题目链接：https://leetcode.cn/problems/longest-common-prefix/
 * 最长公共前缀
 */
public class Demo01 {
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};

        String prefix = longestCommonPrefix(strs);

        System.out.println(prefix);

    }

    public static String longestCommonPrefix(String[] strs) {


        if (strs.length == 0) return "";

        String pre = strs[0];
        for (String str : strs) {
            while (!str.startsWith(pre)) {
                pre = pre.substring(0,pre.length() - 1);
            }
        }

        return pre;
    }
}

package Demo_2022_08_18;

/**
 * @author 程世玉
 * @data 2022/8/21.
 * 1、题目链接：<a href="https://leetcode.cn/problems/palindromic-substrings/">...</a>
 * 2、题目描述：回文子串
 */
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(countSubstrings1("abcbcbabc"));
    }
    /**
     * description: 思路就是从头到尾，一个一个检查，一个一个测试，一个一个遍历出来每一节的字符串中包含的回文数量
     * 我是硬编码，每一个字符串，都努力的进行一个判断
     * @author: 程世玉.
     */
    public static int countSubstrings(String s) {
        boolean[][] bp = new boolean[s.length()][s.length()];
        char[] chars = s.toCharArray();
        int len = chars.length;
        int m = 1;
        int num = 0;
        for (int i = 0; i < len;){
            StringBuffer sb = new StringBuffer();
            for (int j = i; j < m; j++){
                sb.append(chars[j]);
            }
            if (flagV1(sb.toString())) {
                num++;
            }
            sb = new StringBuffer();
            if (m < len){
                m++;
            }else {
                i++;
                m = i+1;
            }
        }
        return num;
    }


    // 判断一个字符串是否是回文字符串，这个看似菜，其实采用的是双指针的思想
    public static boolean flagV1(String s){
        char[] chars = s.toCharArray();
        int len = chars.length;
        for (int i = 0,j = len - 1; i < len / 2; i++,j--){
            if (chars[i] != chars[j]){
                return false;
            }
        }
        return true;
    }


    /**
     * description: 抄人家的思路,我想了想，其实跟我的思路是一样的，只不过人家算法更加优秀，我是硬算
     * 人家通过一个数组，记录之前记录的回文字符串,判断之前的是回文字符串不是，之前的是回文字符串，那么就直接起飞，她就是回文字符串
     * @author: 程世玉.
     */
    public static int countSubstrings1(String s) {

        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        int count = 0;//回文串的数量
        for (int j = 0; j < length; j++) {
            for (int i = 0; i <= j; i++) {
                //如果i和j指向的字符不一样，那么dp[i][j]就
                //不能构成回文字符串
                if (s.charAt(i) != s.charAt(j))
                    continue;
                dp[i][j] = j - i <= 2 || dp[i + 1][j - 1];
                //如果从i到j能构成回文串，count就加1
                if (dp[i][j])
                    count++;
            }
        }
        return count;

    }





    /**
     * description: 2022.08.22 重新编写
     * @author: 程世玉.
     * 面对这种情况，有时候两层的循环，其实可以放到一个循环里面
     * 双指针循环，也是可以放到一个循环里面
     * 对于走一步校验一步，可以走记录
     */
    public static int countSubstrings2(String s) {
        boolean[][] bl = new boolean[s.length()][s.length()];
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++){
                if (s.charAt(i) != s.charAt(j)) continue;
                bl[i][j] = i - j <= 2 || bl[i-1][j+1];
                if (bl[i][j]){
                    count++;
                }
            }
        }
        return count;
    }




}

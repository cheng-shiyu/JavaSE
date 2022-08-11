package Demo_2022_05_08;

/**
 * @author 程世玉
 * @data 2022/5/8.
 * 题目链接：https://leetcode-cn.com/problems/longest-palindromic-substring/
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class love1 {
    public static void main(String[] args) {
        String s = longestPalindrome("cbbd");
        System.out.println(s);
    }

    /*思路2，枚举法，每个字母，都当作中心，然后进行比对，看看是否能够找到最合适的*/
    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        int begin = 0;
        if (chars.length < 2) {
            return s;
        }
        for (int i = 0; i < chars.length - 1; i++){
            int oddLen = t1(chars, i, i);  // 奇数最长的
            int eveLen = t1(chars, i, i + 1); // 偶数最长的
            int cur = Math.max(oddLen, eveLen);
            if (max < cur){
                max =  cur;
                if (max % 2 == 0){
                    begin = i - max / 2;
                }else {
                    begin = i - (max - 1) / 2;
                }
                System.out.println("max = " + max);
                System.out.println("begin = "+begin);
            }
        }
        return s.substring(begin,begin + max + 1);
    }
    public static int t1(char[] c,int i , int j){
        while (i >= 0 && j < c.length){
            if (c[i] == c[j]){
                i--;
                j++;
            }else {
                break;
            }
        }

        return j - i - 2;
    }


//    // 第一种思路，暴力破解，比对相同的下标即可
//    public static String longestPalindrome(String s) {
//        int index1 = 0;
//        int max = 0;
//        int index2 = 0;
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < s.length() - 1; i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                if (s.charAt(i) == s.charAt(j)) {
//                    if (j - i > max && t1(chars,i,j)) {
//                        index1 = i;
//                        index2 = j;
//                        max = j - i;
//                    }
//                }
//            }
//        }
//        return s.substring(index1, index2 + 1);
//    }
//    // 判断是否是回文字串
//    public static boolean t1(char[] c, int i,int j){
//        while (i < j){
//            if (c[i] != c[j]){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
}

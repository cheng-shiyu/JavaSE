package Demo_2022_05_08;

/**
 * @author 程世玉
 * @data 2022/5/8.
 * 题目链接：https://leetcode-cn.com/problems/palindrome-number/
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 例如，121 是回文，而 123 不是。
 */
public class love3 {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        // 0 是回文数
        if (x == 0) return true;
        // 负数和除 0 以外以 0 结尾的数都不是回文数
        if (x < 0 || x % 10 == 0) return false;
        // 记录 x 后一半的翻转，如 x = 4334，reversed = 43；x = 54345，reversed = 54
        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        // x有偶数位和奇数位两种情况
        return reversed == x || reversed / 10 == x;
    }
}

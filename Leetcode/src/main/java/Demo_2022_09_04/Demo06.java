package Demo_2022_09_04;

/**
 * @author 程世玉
 * @data 2022/9/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/house-robber/">...</a>
 * 2、题目描述：打家劫舍
 */
public class Demo06 {
    /**
     * description: 找到一个区域内最大的数，然后以该数为中点，找到最大的一个总和
     * @author: 程世玉
     * @Date: 2022/9/4
     */
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // memo[i] 表示考虑抢劫 nums[i...n-1] 所能获得最大收益（不是说一定从 i 开始抢劫）
        int[] memo = new int[n];
        // 先考虑最简单的情况
        memo[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            // memo[i] 的取值在考虑抢劫 i 号房子和不考虑抢劫之间取最大值
            memo[i] = Math.max(nums[i] + (i + 2 >= n ? 0 : memo[i + 2]), nums[i + 1] + (i + 3 >= n ? 0 : memo[i + 3]));
        }
        return memo[0];
    }

}

package Demo_2022_09_04;

/**
 * @author 程世玉
 * @data 2022/9/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/climbing-stairs/">...</a>
 * 2、爬楼梯
 */
public class Demo02 {
    /**
     * description: 本题采用动态规划
     * @author: 程世玉
     * @Date: 2022/9/4
     * 1、
     */
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        // 楼梯是不断减少的，无论什么情况，要不走一步，要不走两步
        // 走一步，那就是之前走的情况 * 1
        // 走两步，那就是之前的情况*1
        // 因此，两个是相加的关系即可
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n;i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }
}

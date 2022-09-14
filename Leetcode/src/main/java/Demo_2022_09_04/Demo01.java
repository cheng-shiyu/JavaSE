package Demo_2022_09_04;

/**
 * @author 程世玉
 * @data 2022/9/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：把数字翻译成字符串
 */
public class Demo01 {

    public static void main(String[] args) {
        translateNum(25);
    }

    /**
     * description:
     * @author: 程世玉
     * @Date: 2022/9/4
     * 思路：
     * 1、26个英文字母，对应26个数字，也就是最多能够翻译的就是1-26
     * 2、一个数组，既能和前面的组合，也能和后面的组合，同时后面的还有可能进行一个组合
     * 3、这种解决方案，一定是递归
     * 4、分治的思想，拆分起来，一步一步的解决
     *
     * 本题目采用的是动态规划
     */
    public static int translateNum(int num) {
        String s = String.valueOf(num);
        // 抓换为一个字符数组
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[] dp = new int[len];
        dp[0] = 1;
        for (int i = 1; i < len;i++){
            dp[i] = dp[i - 1];
            int currentNum = 10 * Integer.parseInt(String.valueOf(arr[i - 1])) + Integer.parseInt(String.valueOf(arr[i]));
            if (currentNum > 9 && currentNum < 26){
                if (i - 2 < 0){
                    dp[i]++;
                }else {
                    dp[i] += dp[i - 2];
                }
            }
        }
        return dp[len - 1];
    }

    public void myTranslate(char[] arr){

    }


}

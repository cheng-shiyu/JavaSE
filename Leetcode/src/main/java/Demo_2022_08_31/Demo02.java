package Demo_2022_08_31;

/**
 * @author 程世玉
 * @data 2022/8/31.
 * 1、题目链接：<a href="https://leetcode.cn/problems/maximum-subarray/">...</a>
 * 2、题目描述：给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Demo02 {

    public static void main(String[] args) {
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray1(ints));
    }

    /**
     * description:
     * @author: 程世玉
     * @Date: 2022/8/31
     */
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int len = nums.length;
        for (int i = 0; i < len; i++){
            int sum = 0;
            for (int j = i; j < len;j++){
                sum += nums[j];
                max = Math.max(sum,max);
            }
        }
        return max;
    }


    public static int maxSubArray1(int[] nums){
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0)
                sum += num;
            else
                sum = num;
            res = Math.max(res, sum);
        }
        return res;

    }
}

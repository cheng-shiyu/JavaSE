package Demo_2022_08_04;

import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/8/5.
 * 1、题目链接：<a href="https://leetcode.cn/problems/minimize-maximum-pair-sum-in-array/">...</a>
 * 2、题目描述；
 * 一个数对(a,b)的 数对和等于a + b。最大数对和是一个数对数组中最大的数对和。
 *
 * 比方说，如果我们有数对(1,5)，(2,3)和(4,4)，最大数对和为max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8。
 * 给你一个长度为 偶数n的数组nums，请你将 nums中的元素分成 n / 2个数对，使得：
 *
 * nums中每个元素恰好在 一个数对中，且
 * 最大数对和的值 最小。
 * 请你在最优数对划分的方案下，返回最小的 最大数对和
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] ints = {3,5,4,2,4,6};
        int i = minPairSum(ints);
        System.out.println(i);
    }

    /**
     * description:
     * @author: 程世玉.
     */
    public static int minPairSum(int[] nums) {

        int[] newNum = new int[nums.length];

        int max = 0;

        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0;i < len / 2; i++){
            int temp = nums[i] + nums[len - 1 - i];
            if (max < temp){
                max = temp;
            }
        }

        return max;
    }
}

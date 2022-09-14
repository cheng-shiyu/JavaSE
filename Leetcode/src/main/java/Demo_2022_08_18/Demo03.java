package Demo_2022_08_18;

/**
 * @author 程世玉
 * @data 2022/8/21.
 * 1、题目链接：<a href="https://leetcode.cn/problems/rearrange-array-elements-by-sign/">...</a>
 * 2、题目描述：
 * 给你一个下标从 0 开始的整数数组 nums ，数组长度为 偶数 ，由数目相等的正整数和负整数组成。
 *
 * 你需要 重排 nums 中的元素，使修改后的数组满足下述条件：
 *
 * 任意连续 的两个整数 符号相反
 * 对于符号相同的所有整数，保留 它们在 nums 中的 顺序 。
 * 重排后数组以正整数开头。
 * 重排元素满足上述条件后，返回修改后的数组。
 */
public class Demo03 {
    public static void main(String[] args) {
    }


    /**
     * description: 思路很简单，就是一个循环，一直找到一个正数，一个负数，然后进行添加
     * 这个给我最大的启发，在于循环，其实是可以添加好多的呢，同时，我们循环里面，可以加判断，利用while的特性进行查找之类的
     * 这个方法，有点类似于快慢查询链表一样
     * @author: 程世玉.
     */
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0,j = 0,k = 0;i < n && j < n; i++,j++,k++){
            while (nums[i] < 0) i++;
            while (nums[j] > 0) j++;

            ans[k++] = nums[i];
            ans[k] = nums[j];
        }
        return ans;
    }
}

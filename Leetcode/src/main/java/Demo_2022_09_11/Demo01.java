package Demo_2022_09_11;

/**
 * @author 程世玉
 * @data 2022/9/11.
 * 1、题目链接：<a href="https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/">...</a>
 * 2、题目描述： 0～n-1中缺失的数字
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] ins = {0,1,3,4,5,6,7,8,9};
        missingNumber(ins);
    }

    /**
     * description: 本题采用这边查找的方式
     *
     * @author: 程世玉
     * @Date: 2022/9/11
     */
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int mid = len / 2, start = 0, end = len - 1;

        if (nums[0] != 0){
            return 0;
        }

        while (start < end) {
            if (nums[mid] <= mid) {
                // 如果mid == mid，则说明前面的排序没有问题，仅仅判断后面的
                start = mid;
                mid += (end - start) / 2;
            } else {
                // 这种情况,则说明前面的排序有问题，我们需要检查前面的
                end = mid;
                mid -= (end - start) / 2;

            }
            // 说明仅仅只有两个元素
            if (end - start == 1 || end - start == 0) {
                return nums[start] + 1 == nums[end] ? nums[end] + 1 : nums[start] + 1;
            }

        }

        return nums[0] == 0 ? 1 : 0;
    }
}

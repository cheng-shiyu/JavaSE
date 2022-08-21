package Demo_2022_08_17;

/**
 * @author 程世玉
 * @data 2022/8/17.
 * 1、题目链接：<a href="https://leetcode.cn/problems/que-shi-de-shu-zi-lcof/">...</a>
 * 2、题目要求：一个长度为n-1的递增排序数组中的所有数字都是唯一的，
 * 并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且
 * 只有一个数字不在该数组中，请找出这个数字。
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] ints = {0,1,2};
        System.out.println(missingNumber(ints));
    }

    /**
     * description: 思路一，折半查找
     * @author: 程世玉.
     */
    public static int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length;
        int mid = 0;
        while (left <= right){
            mid = (left + right) / 2;

            if (nums[0] != 0){
                return 0;
            }

            if (nums.length == 1 ){
                return nums[0] == 0 ? 1 : 0;
            }
            if (right - left == 3 ){
                if (nums[left] + 1 == nums[left + 1] && nums[left + 1] + 1 == nums[left + 2]){
                    return nums[left + 2] + 1;
                }
                return nums[left] + 1 == nums[left + 1] ? mid + 1 : nums[left] +1;
            }
            if ( right - left == 2){
                return  nums[left] + 1 == nums[left+1]  ? nums[left+1] + 1 : nums[left] + 1;
            }

            if (nums[mid] <= mid){
                left = mid;
            }else if (nums[mid] > mid){
                right = mid;
            }

        }
        return 0;
    }


}

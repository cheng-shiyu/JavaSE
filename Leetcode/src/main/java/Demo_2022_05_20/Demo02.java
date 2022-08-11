package Demo_2022_05_20;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 程世玉
 * @data 2022/5/20.
 * 题目链接：https://leetcode.cn/problems/3sum-closest/
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。
 * 请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * 返回这三个数的和。
 *
 * 假定每组输入只存在恰好一个解。
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] ints = {-1, 2, 1, -4};
        int i = threeSumClosest(ints, 1);
        System.out.println(i);

    }
    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int min = Integer.MAX_VALUE;

        /**
         * 不需要考虑重复的，我们使用只需要把不同的数字挑选出来即可，然后进行判断
         */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)){
                map.put(num,num);
            }
        }

        // 此刻map中存在所有不相同的数字，然后我们三成遍历，得到最小值即可
        for (int i = 0;  i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                int a = nums[i] + nums[j];
//                |a + b + c| < target;
//                target - |a + b + c| > 0;
//                |tmp + x| < |target|;
                Set<Integer> set = map.keySet();
                for (Integer integer : set) {
                    if (integer != nums[i] && integer != nums[j] && Math.pow(integer,2) + 2 * a * integer < Math.pow(target,2)- Math.pow(a,2)){
                        min = Math.min(nums[i] + nums[j] + integer,min);
                    }
                }
            }
        }
        return min;
    }
}

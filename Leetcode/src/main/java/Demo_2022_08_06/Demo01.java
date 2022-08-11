package Demo_2022_08_06;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 程世玉
 * @data 2022/8/6.
 * 1、题目链接：<a href="https://leetcode.cn/problems/single-number-ii/">...</a>
 * 2、题目概述：给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。请你找出并返回那个只出现了一次的元素。
 */
public class Demo01 {
    public static void main(String[] args) {
//        singleNumber()
        int[] nums = {2,2,3,2};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.merge(num, 1, Integer::sum);
        }
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            if (map.get(integer).equals(1)) {
                return integer;
            }

        }

        return 0;
    }
}

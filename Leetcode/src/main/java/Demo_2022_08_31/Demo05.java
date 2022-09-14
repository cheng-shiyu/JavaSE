package Demo_2022_08_31;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 程世玉
 * @data 2022/8/31.
 * 1、题目链接：<a href="https://leetcode.cn/problems/TVdhkn/">...</a>
 * 2、题目描述：所有子集
 *
 * 这个题不会，再想想
 */
public class Demo05 {

    public static void main(String[] args) {

    }


    // 方式一
    public static List<List<Integer>> subsets(int[] nums) {
return null;
    }
    public void print(int[] nums){

    }





    // 方式二
    static List<Integer> t = new ArrayList<Integer>();
    static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static List<List<Integer>> subsets1(int[] nums) {
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(new ArrayList<Integer>(t));
        }
        return ans;
    }
}

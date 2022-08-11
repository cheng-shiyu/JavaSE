package Demo_2022_08_09;

import java.util.HashMap;
import java.util.Set;

/**
 * @author 程世玉
 * @data 2022/8/9.
 * 1、题目链接：<a href="https://leetcode.cn/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/">...</a>
 * 2、题目描述：剑指 Offer 03. 数组中重复的数字
 */
public class Demo02 {

    /**
     * description: 过滤一遍，全部放入map中进行一个遍历
     * @author: 程世玉.
     */
    public int findRepeatNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            Integer i = map.get(num);
            if (i == null){
                i = 1;
                map.put(num,i);
            }else {
                i++;
                map.put(num,i);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            if (map.get(key) > 1){
                return key;
            }
        }
        return 0;
    }
}

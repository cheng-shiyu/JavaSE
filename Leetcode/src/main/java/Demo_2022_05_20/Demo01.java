package Demo_2022_05_20;

import java.util.*;

/**
 * @author 程世玉
 * @data 2022/5/20.
 * 题目链接：https://leetcode.cn/problems/3sum/
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] ints = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum(ints);
        for (List<Integer> integers : list) {
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        /**
         * 核心思想，三个循环，一次一次进行比对，然后进行获取数据
         * 优化，第三个数字，我们其实是可以放入到我们map中，进行比较，看看是否有这个数据，这样我们就可以不用遍历
         */
        // map的key代表不同数字，value里面的是list集合，list里面放的是我们的下标，因为要考虑到有重复的元素
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<List<Integer>> filter = new HashSet<>();
        for (int i = 0;i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            /*list里面存放我们的下标，同时，重复的元素，都是直接放入其中，并且，重复的元素，我们仅仅保存两次*/
            if (map.get(nums[i]).size() <= 2){
                /*此刻i就是我们的下标*/
                map.get(nums[i]).add(i);
            }
        }

        /*开始三层循环，一层循环一层循环的获得到我们的数据，*/
        for (int i = 0; i < nums.length - 2; i++){
            for (int j = i + 1; j < nums.length - 1; j++){
                int c = -(nums[i] + nums[j]);
                /*是否存在第三个数字，能够让三个数相加等于0*/
                if (map.containsKey(c)){
                    List<Integer> list = map.get(c);
                    // list里面放的是数字对应的下标.这个下标一定要大于i j，为什么呢？因为只有这样，才能保证不重复的组队
                    for (Integer index : list) {
                        if (index > i && index > j){
                            // 只有满足这个条件才是我们想要的数据
                            ArrayList<Integer> list1 = new ArrayList<>();
                            list1.add(nums[i]);
                            list1.add(nums[j]);
                            list1.add(c);

                            // 接下来核心就是去除重复的元素，去除重复的元素，我们可以采用set集合，但是采用set集合，我们一定要进行排序
                            Collections.sort(list1);
                            // set集合，然后将其放入其中即可
                            filter.add(list1);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(filter);
    }


}

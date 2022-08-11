package Demo_2022_05_18;

import java.util.*;

/**
 * @author 程世玉
 * @data 2022/5/18.
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] ints = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> lists =
                erase(ints);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        HashSet<List<Integer>> filter = new HashSet<>();


        if (nums.length < 3) {
            return list;
        }
        if (nums.length == 3) {
            if (nums[1] + nums[2] + nums[0] == 0) {
                ArrayList<Integer> list1 = new ArrayList<>();
                list1.add(nums[1]);
                list1.add(nums[2]);
                list1.add(nums[0]);
                list.add(list1);
                return list;
            }
        }

//        nums = [-1,0,1,2,-1,-4]

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int c = -(nums[i] + nums[j]);
                for (int m = j + 1; m < nums.length; m++) {
                    if (nums[m] == c) {
                        List<Integer> innerlist = new ArrayList<>();
                        innerlist.add(nums[i]);
                        innerlist.add(nums[j]);
                        innerlist.add(nums[m]);
                        Collections.sort(innerlist);
                        filter.add(innerlist);
                        break;
                    }
                }
            }
        }


        return new ArrayList<>(filter);
    }

    /**
     * 大致思路：
     *    三层套循环，一点一点进行循环
     * @param nums
     * @return
     */
    public static List<List<Integer>> erase(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        HashSet<List<Integer>> filter = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            if (map.get(nums[i]).size() <= 2) {
                // 优化，相当于下标
                map.get(nums[i]).add(i);
            }
        }
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (map.containsKey(-(nums[i] + nums[j]))) {
                    ArrayList<Integer> path = map.get(-(nums[i] + nums[j]));
                    for (Integer integer : path) {
                        if (integer > i && integer > j) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[integer]);
                            Collections.sort(temp);
                            filter.add(temp);
                            break;
                        }
                    }
                }
            }
        }
        return new ArrayList<>(filter);
    }


}

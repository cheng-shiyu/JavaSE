package Demo_2022_04_30;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 题目链接：https://leetcode-cn.com/problems/two-sum/
 * 两数之和
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] ints = new int[]{3,2,4};
        int[] sum = twoSum(ints, 6);
        for (int i : sum) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++){
            for (int j = i + 1; j < nums.length; j++){
                if (target == nums[i] + nums[j]){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}

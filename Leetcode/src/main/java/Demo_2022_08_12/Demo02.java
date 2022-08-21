package Demo_2022_08_12;

import java.util.ArrayList;

/**
 * @author 程世玉
 * @data 2022/8/12.
 */
public class Demo02 {

    public static void main(String[] args) {
        int[] arr = {1,-1};
        maxSlidingWindow(arr,1);
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length - k + 1;i++){
            int max = -100000;
            for (int j = i; j < i + k; j++){
                if (max < nums[j]) {
                    max = nums[j];
                }
            }
            list.add(max);
        }
        int[] max = new int[list.size()];
        for (int i = 0; i < list.size(); i++){
            max[i] = list.get(i);
            System.out.println(list.get(i));
        }
        return max;
    }
}

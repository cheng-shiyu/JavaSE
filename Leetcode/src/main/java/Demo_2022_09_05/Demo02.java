package Demo_2022_09_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 程世玉
 * @data 2022/9/5.
 * 1、题目链接：<a href="https://leetcode.cn/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/?favorite=xb9nqhhg">...</a>
 * 2、题目描述：把数组排成最小的数
 */
public class Demo02 {

    public static void main(String[] args) {
       int[] ins =  {3,30,34,5,9};
        t1(ins);
    }
    /**
     * description: 贪心算法，每次取到最小的数，只要不是一，就进行拼接
     * @author: 程世玉
     *
     * @Date: 2022/9/5
     */
    public static String minNumber(int[] nums) {
        StringBuffer sb = new StringBuffer();
        // 对数组进行一个排序
        Arrays.sort(nums);
        // 排序完毕之后 ，一个一个的进行添加到我们的StringBuffer中即可
        int sum = 0;
        for (int num : nums) {
            if (num == 0){
                sum++;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--){
            if (i == nums.length - 1){
                sb.append(nums[i]);
                while (sum != 0){
                    sb.append(0);
                    sum--;
                }
            }else{
                sb.append(nums[i]);
            }
        }

        return sb.toString();
    }

    private void sort(int[] nums,List<Integer> arrayList){
        int len = nums.length;
        String[] str = new String[nums.length];
        int max = 0;
        for (int i = 0; i < len;i++){
            for (int j = 0; j < len;j++){
                String s1 = str[i];
                String s2 = str[j];
                if (s1 == null){
                    s1 = String.valueOf(nums[i]);
                    str[i] = s1;
                }
                if (s2 == null){
                    s2 = String.valueOf(nums[j]);
                    str[j] = s2;
                }


            }
        }
    }

    public String compareTo(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int len1 = c1.length;
        int len2 = c2.length;

        if (len2 == len1){
            for (int i = 0; i < len2; i++){
                if (c1[i] > c2[i]) {
                    return s2;
                }
            }
        }else {
            for (int i = 0; i < (Math.min(len2, len1)); i++){
                if (c1[i] > c2[i]){
                    return s2;
                }
            }
        }
        return null;
    }



    // 上面方式，想了想，太费劲了，放弃,核心就是判断谁的数字大
    public static String t1(int[] nums){
        List<String> list = new ArrayList<>();
        for (int num : nums) {
            list.add(String.valueOf(num));
        }
        // 简单来说，这个就是用来比较两个字符串
        list.sort((o1, o2) -> (o1 + o2).compareTo(o2 + o1));
        return String.join("", list);
    }
}

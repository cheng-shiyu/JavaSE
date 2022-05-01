package Demo_2022_04_30;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 题目链接：https://leetcode-cn.com/problems/container-with-most-water/
 *
 * 盛最多水的容器
 *
 * 其实，就是找到最大
 * Java
 */
public class Demo02 {
    public static void main(String[] args) {
        int[] ints = new int[]{2,3,4,5,18,17,6};
        int i = maxArea(ints);
        System.out.println(i);
    }

//    public static int maxArea(int[] height) {
//        /*面积就是长×宽*/
//        int sum = 0;
//        for (int i = 0; i < height.length; i++){
//            for (int j = 0; j < height.length; j++){
//                int sum1 = Math.min(height[i],height[j]) * (j - i);
//                if (sum1 > sum) {
//                    sum = sum1;
//                }
//            }
//        }
//        return sum;
//    }

    /*采用双向链表的形式*/
    public static int maxArea(int[] height) {
        // 一个从后面移动，一个从前面移动，每次移动小的

        int size = height.length;

        int left = 0;
        int right = size - 1;
        int sum1 = 0;
        /*只要左边的一直比右边小，就一直进行比较*/
        while (left < right) {
            int leftNum = height[left];
            int rightNum = height[right];
            int sum = Math.min(leftNum, rightNum) * (right - left);
            if (sum > sum1) {
                sum1 = sum;
            }
            /*如果谁大，让另一边移动*/
            int i = leftNum > rightNum ? right-- : left++;
        }
        return sum1;
    }
}

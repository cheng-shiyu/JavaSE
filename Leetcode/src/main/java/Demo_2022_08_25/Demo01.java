package Demo_2022_08_25;

/**
 * @author 程世玉
 * @data 2022/8/25.
 * 1、题目链接：<a href="https://leetcode.cn/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof/">...</a>
 * 2、题目描述：旋转数组的最小数字
 */
public class Demo01 {

    public static void main(String[] args) {
        int[] ints = {3,3,1,3};
        minArray(ints);
    }

    /**
     * description: 其实思路上很简单，直接查询这个数组的最小数即可
     * 但是！其实人家这个题，是想让我们利用短暂有序性快速排查出来一个最小值
     * 利用有序性快速找出来一个最小值，那大概路利用的就是二分查找（折半查找）
     * 但是在这里，二分查找跟我们传统的二分查找不太一样，这里用的是她的一种思想
     * @author: 程世玉
     * @Date: 2022/8/25
     */
    public static int minArray(int[] numbers) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        int mid = (left + len) / 2;
        while (left < right){
            if (right - left == 1){
                if (numbers[left] > numbers[right]){
                    return numbers[right];
                }
                return numbers[left];
            }
            if (numbers[mid] == numbers[right]){
                right--;
            }else if (numbers[mid] < numbers[right]){
                right = mid;
            }else if (numbers[mid] > numbers[right]){
                left = mid + 1;
            }
            mid = (left + right + 1) / 2;
        }
        return numbers[left];
    }
}

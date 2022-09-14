package Demo_2022_08_25;

import java.util.ArrayList;

/**
 * @author 程世玉
 * @data 2022/8/26
 * 1、题目链接：<a href="https://leetcode.cn/problems/minimum-operations-to-reduce-x-to-zero/">...</a>
 * 2、题目描述：将 x 减到 0 的最小操作数
 */
public class Demo03 {
    public static void main(String[] args) {
//[3,2,20,1,1,3]
//        10
        int[] ints = {1,1};
        int i = minOp(ints, 3);
        System.out.println(i);
    }


    /**
     * description:  题目大致什么意思明白了
     *
     * @author: 程世玉
     * @Date: 2022/8/26
     * <p>
     * 如果按照题目的意思，其实并不是非常好做，-但是，如果换一种思路，就简单了一些
     * 我们找到所有不满足条件的，那么满足条件的即可完成
     * 不满足条件的，只要市连续的即可，哪怕在中间，也是没有关系的，因为满足条件的市在外面的
     */
    public static int minOperations(int[] nums, int x) {
        // 人家写的确实精妙无比，我要慢慢往人家靠，下面开始按照人家的思路走一遍


        // 转换成 最长滑动串口等于 x
        // 得到数组的长度
        int N = nums.length;

        int res = -1;
        int sum = 0;

        // 求出所有的和
        for (int i = 0; i < N; i++) sum += nums[i];

        // 总和减去目标值
        x = sum - x;
        // 如果刚刚好，可以直接减去，那么就算满足条件，直接出去即可
        if (x == 0) return N;

        // 滑动窗口的值
        int sumWin = 0;
        for (int i = 0, j = 0; i < N; i++) {
            sumWin += nums[i];

            if (sumWin == x) res = Math.max(res, i - j + 1);

            while (j < i && sumWin > x) {
                sumWin -= nums[j];
                j++;
                if (sumWin == x) res = Math.max(res, i - j + 1);
            }
        }

        return res == -1 ? -1 : N - res;
    }



    /**
     * description:  根据人家的思路，一点一点的解决出来了，最主要的就是一个思路的专门，那个不好求，反过来一般都好求一点
     * @author: 程世玉
     * @Date: 2022/8/27
     */
    public static int minOp(int[] nums, int x) {
        // 1、遍历所有的值，得到总和
        int sum = 0;
        for (int num : nums) sum += num;

        // 2、得到总和之后，减去目标值，得到需要不满足条件的值
        x = sum - x;

        // 3、判断，如果刚刚好满足我们条件，那么说明就是全部
        if (x == 0){
            return nums.length;
        }

        // 4、开始滑动窗口操作，找到最多的数加起来满足我们条件
        return sumWin(x,nums);
    }

    // 滑动窗口，找到连续的窗口的值为x
    public static int sumWin(int x,int[] nums){
        int sumwin = 0;
        ArrayList<Integer> sums = new ArrayList<>();
        int max = 0;

        for (int i = 0,j = 0;i < nums.length;){
            // 滑动窗口
            sums.add(nums[i]);
            // 最大值
            sumwin += nums[i];


            // 如果滑动窗口的值已经大于了，则去除
            while (sumwin > x && x >= 0){
                Integer remove = sums.remove(0);
                sumwin -= remove;
            }
            if (sumwin == x){
                max = Math.max(max,sums.size());
            }
            i++;
        }
        return max;
    }


}

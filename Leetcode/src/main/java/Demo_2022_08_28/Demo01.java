package Demo_2022_08_28;

/**
 * @author 程世玉
 * @data 2022/8/28.
 * 1、题目链接：<a href="https://leetcode.cn/problems/jian-sheng-zi-ii-lcof/">...</a>
 * 2、题目描述： II. 剪绳子 II
 */
public class Demo01 {
    /**
     * description: 题目大致明白什么意思了，我们这个，其实有点类似于滑动窗口，找到所有满足条件的，然后比较出最大的一个
     * @author: 程世玉
     * @Date: 2022/8/28
     * 其实，最终求解的是n1*n2*n3*n4....等
     * 最终，通过数学公式，可以推断出，每一段长度为3，最终乘机最大
     */
    public int cuttingRope(int n) {
        if(n < 4){
            return n - 1;
        }
        int m = n / 3;
        int y = n % 3;
        if (y == 1){
            double v = Math.pow(3, m - 1) * 2 * 2;
            return (int) v;
        }else if (y == 2){
            double v = Math.pow(3, m) * 2;
            return (int) v;
        }else {
            return (int) Math.pow(3,m);
        }
    }
}

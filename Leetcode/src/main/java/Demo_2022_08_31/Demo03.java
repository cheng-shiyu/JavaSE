package Demo_2022_08_31;

/**
 * @author 程世玉
 * @data 2022/8/31.
 * 1、题目链接：<a href="https://leetcode.cn/problems/minimum-moves-to-reach-target-score/">...</a>
 * 2、题目描述： 得到目标值的最少行动次数
 */
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(minMoves(10, 4));
    }


    public static int minMoves(int target, int maxDoubles) {
        int sum = 0;
        while (maxDoubles > 0){
            if (target == 1){
                break;
            }
            if (target % 2 == 1) {
                sum++;
            }
            target = target / 2;
            sum++;
            maxDoubles--;

        }
        sum += target -1;
        return sum;
    }
}

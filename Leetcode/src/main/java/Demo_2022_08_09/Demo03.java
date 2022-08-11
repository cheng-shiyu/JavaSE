package Demo_2022_08_09;

/**
 * @author 程世玉
 * @data 2022/8/9.
 * 1、题目链接：<a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/">...</a>
 * 2、题目描述：在一个 n * m 的二维数组中，
 * 每一行都按照从左到右递增的顺序排序，每一列
 * 都按照从上到下递增的顺序排序。请完成一个高
 * 效的函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class Demo03 {
    public static void main(String[] args) {
        int[][] ins = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(ins, 5));
    }


    /**
     * description: 得到每一组数据中最大的元素，然后进行判断是否小于这个值
     * @author: 程世玉.
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        // 判断行，目标值多少行
        // 判断列，判断最大的列是否大于这个值
        int row = 0;
        int size = matrix[0].length;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][0] <= target) {
                row++;
            }
        }
        for (int i = 0; i < row; i++){

            if (matrix[i][size - 1] >= target) {
                for (int a : matrix[i]) {
                    if (a == target){
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

package Demo_2022_09_04;

/**
 * @author 程世玉
 * @data 2022/9/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/minimum-path-sum/">...</a>
 * 2、题目描述：最小路径和
 */
public class Demo05 {
    public static void main(String[] args) {
        int[][] arr = {{1,3,1},{1,5,1},{4,2,1}};
        minPathSum(arr);
    }
    /**
     * description: 最小路径和
     * @author: 程世玉
     * @Date: 2022/9/4
     * 动态规划，每次找到最短的路径，然后将最短路径加起来就可以了
     */
    public static int minPathSum(int[][] grid) {
        int len1 = grid.length;
        int len2 = grid[0].length;
        int[][] arr = new int[len1][len2];
        for (int i = 0; i < len1;i++){
            for (int j = 0; j < len2; j++){
                arr[i][j] = grid[i][j];
                // 两个边界，上边
                if (i > 0 && j == 0){
                    arr[i][j] += arr[i - 1][j];
                    continue;
                }
                // 左边
                if (j > 0 && i == 0){
                    arr[i][j] += arr[i][j - 1];
                    continue;
                }
                if (i - 1 < 0){
                    continue;
                }
                // 找到两个最小的，加进去
                arr[i][j] += Math.min(arr[i - 1][j],arr[i][j - 1]);
            }
        }
        return arr[len1 - 1][len2 - 1];
    }
}

package Demo_2022_09_04;

/**
 * @author 程世玉
 * @data 2022/9/4.
 */
public class Demo04 {

    public static void main(String[] args) {
        int i = uniquePaths1(3, 7);
        System.out.println(i);
    }

    /**
     * description: 这道题还有一点信心，有点思路,我最终的解题思路就是DFS，暴力破解，但是超出时间显
     *
     * @author: 程世玉
     * @Date: 2022/9/4
     */
    static Integer sum = 0;

    public static int uniquePaths(int m, int n) {
        // 已经走过的路径，这个不需要，因为这个是需要进行全部进行递归的
        int[][] ints = new int[m][n];
        dfs(m, n, 0, 0);
        System.out.println(sum);
        return sum;
    }

    /**
     * description: 向右遍历，向下遍历即
     *
     * @author: 程世玉
     * @Date: 2022/9/4
     */
    public static void dfs(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1)
            ++sum;
        if (j + 1 < n)
            // 向右遍历
            dfs(m, n, i, j + 1);
        if (i + 1 < m)
            // 向下遍历
            dfs(m, n, i + 1, j);
    }

    /**
     * description: 使用动态规划来解决这个问题
     *
     * @author: 程世玉
     * @Date: 2022/9/4
     */
    public static int uniquePaths1(int m, int n) {


        // 初始化数组
        int[][] arr = new int[m][n];

        // 初始化数组，我们要统计每一个到该表格的路径数量
        arr[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    arr[0][j] = 1;
                    continue;
                }
                if (j == 0) {
                    arr[i][j] = 1;
                    continue;
                }

                arr[i][j] += arr[i - 1][j];
                arr[i][j] += arr[i][j - 1];
            }
        }


        return arr[m - 1][n - 1];
    }

}

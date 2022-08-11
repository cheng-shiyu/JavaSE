package Demo_2022_08_10;

/**
 * @author 程世玉
 * @data 2022/8/10.
 * 1、题目链接：<a href="https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/">...</a>
 * 2、地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
 * 一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），
 * 也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，
 * 因为3+5+3+7=18。但它不能进入方格 [35, 38]
 * ，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 * 
 * 案例
 * 输入：m = 3, n = 1, k = 0
 * 输出：1
 *
 * 采用的是深度优先算法，其本质就是来回的进行一个探索，然后记录我们已经探索过的数据
 *
 */
public class Demo02 {
    public int movingCount(int m, int n, int k) {
        // 已经走过的路
        boolean[][] visited = new boolean[m][n];

        // 开始进行深度优先算法
        return dfs(0,0,m,n,k,visited);
    }

    public int dfs(int i,int j,int m,int n,int k,boolean visited[][]){
        // dfs循环突破出
        if (i >= m || j >= n || visited[i][j] || (i % 10 + i / 10 + j % 10 + j / 10) >k){
            return 0;
        }

        visited[i][j] = true;
        return 1 + dfs(i + 1,j,m,n,k,visited) + dfs(i,j+1,m,n,k,visited);
    }
}

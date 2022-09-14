package Demo_2022_08_29;

import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/8/29.
 * 1、题目链接：<a href="https://leetcode.cn/problems/max-area-of-island/">...</a>
 * 2、题目描述：岛屿的最大面积
 */
public class Demo01 {



    public int maxAreaOfIsland(int[][] grid) {
        UnionFind unionFind = new UnionFind(grid);
        int len1 = grid.length;
        int len2 = grid[0].length;
        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){
                if (grid[i][j] == 0) continue;

                if (i - 1 >= 0 && grid[i - 1][j] == 1){
                    int temp = i * len2 + j;
                    unionFind.union(temp - len2,temp);
                }
                if (i + 1 < len1 && grid[i + 1][j] == 1){
                    int temp = i * len2 + j;
                    unionFind.union(temp + len2,temp);
                }
                if (j - 1 >= 0 && grid[i][j - 1] == 1){
                    int temp = i * len2 + j;
                    unionFind.union(temp - 1,temp);
                }
                if (j + 1 < len2 && grid[i][j + 1] == 1){
                    int temp = i * len2 + j;
                    unionFind.union(temp + 1,temp);
                }
            }
        }

        int max = 0;
        for (int i : unionFind.size) {
            if (max < i){
                max = i;
            }
        }
        return max;
    }

    /**
     * description: 并归集
     * @author: 程世玉
     * @Date: 2022/8/29
     */
    static class UnionFind{
        // 1、总数量
        int sum;
        // 2、每一个组的大小
        int[] size;
        // 3、父集合
        int[] parents;

        public UnionFind(int[][] grid){
            // 有多少行
            int len1 = grid.length;
            // 有多少列
            int len2 = grid[0].length;
            // 整个方格的长度
            this.sum = len2 * len1;
            size = new int[sum];
            // 每一组的大小
            Arrays.fill(size,0);
            // 初始化parents
            parents = new int[len1 * len2];

            for (int i = 0; i < len1; i++){
                for (int j = 0; j < len2; j++){
                    parents[i * len1 + j] = i * len1 + j;
                }
            }
        }


        public int getHead(int x){
            while (x != parents[x]){
                x = parents[x];
            }
            return x;
        }


        public void union(int x,int y){
            int Xhead = getHead(x);
            int Yhead = getHead(y);

            if (Xhead == Yhead) return;

            if (Xhead > Yhead){
                parents[Yhead] = Xhead;
                if (size[Yhead] == 0){
                    size[Yhead] = 1;
                }
                size[Xhead] += size[Yhead];
                sum--;
            }else {
                parents[Xhead] = Yhead;
                if (size[Xhead] == 0){
                    size[Xhead] = 1;
                }
                size[Yhead] += size[Xhead];
                sum--;
            }

        }
    }


}

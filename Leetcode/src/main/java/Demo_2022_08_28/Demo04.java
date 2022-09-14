package Demo_2022_08_28;

import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/8/28.
 * 1、题目链接：<a href="https://leetcode.cn/problems/number-of-provinces/">...</a>
 * 2、省份数量
 */
public class Demo04 {
    public static void main(String[] args) {
        // 二维数组定义方式1
        int[][] ins1 = new int[][]{{},{}};
        int[][] ins2 = {{1,1,0},{1,1,0},{0,0,1}};

        findCircleNum(ins2);
    }


    /**
     * description: 使用并查集来解决这种亲戚啊，合并什么东西的问题
     * @author: 程世玉
     * @Date: 2022/8/28
     */
    public static int findCircleNum(int[][] isConnected) {
        UnionFind unionFind = new UnionFind(isConnected);
        int len1 = isConnected.length;
        int len2 = isConnected[0].length;

        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2; j++){
                if (isConnected[i][j] == 1){
                    unionFind.union(i,j);
                }
            }
        }
        return unionFind.sum;
    }


    /**
     * description: 并集合类
     * @author: 程世玉
     * @Date: 2022/8/28
     */
    static class UnionFind{
        // 多少个组
        int sum;
        // 每一组的大小是多少
        int[] size;
        // 每一个元素的父节点是谁
        int[] parent;

        UnionFind(int[][] isConnected){
            int len = isConnected.length;
            this.sum = len;
            this.size = new int[len];
            Arrays.fill(size,1);
            parent = new int[len];
            for (int i = 0; i < len; i++){
                parent[i] = i;
            }
        }

        public int getHead(int x){
            while (x != parent[x]){
                x = parent[x];
            }
            return x;
        }

        public void union(int x,int y){
            int xHead = getHead(x);
            int yHead = getHead(y);

            if (xHead == yHead) return;;
            if (xHead > yHead){
                parent[yHead] = xHead;
                size[xHead] += size[yHead];
                sum--;
            }else {
                parent[xHead] = yHead;
                size[yHead] += size[xHead];
                sum--;
            }
        }
    }



}

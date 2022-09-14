package Demo_2022_08_30;

import java.util.ArrayList;

/**
 * @author 程世玉
 * @data 2022/8/30.
 * 1、题目链接：<a href="https://leetcode.cn/problems/surrounded-regions/">...</a>
 * 2、题目描述：
 */
public class Demo01 {

    public static void main(String[] args) {
        // 4 * 3
        /**
         * description:
         * @author: 程世玉
         * @Date: 2022/8/31
         *
         * 0 1 2
         * 3 4 5
         * 6 7 8
         * 9 10 11
         */
        System.out.println();
    }


    /**
     * description: 错误思路，也不算是错误思路，仅仅是没有走通罢了
     * @author: 程世玉
     * @Date: 2022/8/31
     */
    public void solve(char[][] board) {
        UnionFind unionFind = new UnionFind(board);
        int len1 = board.length;
        int len2 = board[0].length;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (board[i][j] == 0) continue;
                if (i - 1 >= 0 && board[i - 1][j] == 1) {
                    int temp = i * len2 + j;
                    unionFind.union(temp - len2, temp, len2, len1);
                }
                if (i + 1 < len1 && board[i + 1][j] == 1) {
                    int temp = i * len2 + j;
                    unionFind.union(temp + len2, temp, len2, len1);
                }
                if (j - 1 >= 0 && board[i][j - 1] == 1) {
                    int temp = i * len2 + j;
                    unionFind.union(temp - 1, temp, len2, len1);
                }
                if (j + 1 < len2 && board[i][j + 1] == 1) {
                    int temp = i * len2 + j;
                    unionFind.union(temp + 1, temp, len2, len1);
                }
            }
            ArrayList<Integer> integers = new ArrayList<>();
            int[] parents = unionFind.parents;
            int[] sizes = unionFind.size;
            for (int k = 0; k < len1 * len2; k++){
                int xHead = parents[k];
                int size = sizes[k];
                if (xHead < len2 && size != 0){
                    integers.add(k);
                }
                // 判断是否是最后一行数据
                if (xHead / len2 == len2 - 1 && size != 0){
                    integers.add(k);
                }
                if ((xHead+1) % len2 == 0 || xHead % len2 == 1 && size != 0){
                    integers.add(k);
                }
            }

            for (char[] chars : board) {
                for (char aChar : chars) {
                    aChar = 'X';
                }
            }

            // 遍历所有的集合，然后得到k，将k换算为x y ,将数组所有都编程X，然后将指定的xy编程O即可
            for (Integer s : integers) {
                if (s < len2){
                    board[0][s] = 'O';
                }else {
                    board[s / len2][s % len2] = 'O';
                }
            }
        }
    }
     class UnionFind {
        // 多少组数据
        int sum;
        // 每一组的大小
        int[] size;
        // 每一个组的父元素是谁
        int[] parents;

        int[] temp;

        static int m = 0;
        public UnionFind(char[][] board) {
            int len1 = board.length;
            int len2 = board.length;
            temp = new int[len1 * len2];
            size = new int[len1 * len2];
            parents = new int[len1 * len2];
            for (int i = 0; i < len1; i++) {
                for (int j = 0; j < len2; j++) {
                    parents[i * len2 + j] = i * len2 + j;
                    if (board[i][j] == 'O') size[i * len2 + j] = 1;
                    else size[i * len2 + j] = 0;
                }
            }
        }

        public int getHead(int x) {
            while (x != parents[x]) {
                x = parents[x];
            }
            return x;
        }


        public void union(int x, int y, int len2, int len1) {
            len1 = len1 - 1;
            len2 = len2 - 1;
            int xHead = getHead(x);
            int yHead = getHead(y);

            if (xHead == yHead) return;
            if (xHead < len2){
                parents[yHead] = xHead;
                size[xHead] += size[yHead];
                sum--;
            }
            if (yHead < len2){
                parents[xHead] = yHead;
                size[yHead] += size[xHead];
                sum--;
            }

            if ((xHead +1) % len2 == 0 || (xHead +1) % len2 == len2 - 1) {
                parents[yHead] = xHead;
                size[xHead] += size[yHead];
                sum--;
            }else if ((yHead+1) % len2 == 0 || (yHead+1) % len2 == 1) {
                parents[xHead] = yHead;
                size[yHead] += size[xHead];
                sum--;
            }else {
                parents[yHead] = xHead;
                size[xHead] += size[yHead];
                sum--;
            }

        }
    }







    static boolean arr[][];

    /**
     * description: 人家的思路
     * @author: 程世玉
     * @Date: 2022/8/31
     */
    public void solve1(char[][] board){
        int len1 = board.length;
        int len2 = board[0].length;

        arr = new boolean[len1][len2];

        for (int i = 0; i < len1; i++){
            // 第一列
            if (board[i][0] == 'O') unnion(board,i,0);
            // 最后一列
            if (board[i][len2 - 1] == 'O') unnion(board,i,len2-1);
        }

        for (int i = 0; i < len2;i++){
            // 第一行
            if (board[0][i] == 'O') unnion(board,0,i);
            // 最后一行
            if (board[len1 - 1][i] == 'O') unnion(board,len1 - 1,i);
        }

        for (int i = 0; i < len1; i++){
            for (int j = 0; j < len2;j++){
                if (board[i][j] == 'O' && !arr[i][j]){
                    board[i][j] = 'X';
                }
            }
        }
    }


    public void unnion(char[][] board,int i , int j){
        int len1 = board.length;
        int len2 = board.length;
        if (i < 0 || j < 0 || i >= len1 || j >= len2 || board[i][j] != 'O' || arr[i][j]){
            return;
        }

        arr[i][j] = true;

        unnion(board,i + 1,j);
        unnion(board,i - 1,j);
        unnion(board, i,j + 1);
        unnion(board,i,j - 1);
    }

}


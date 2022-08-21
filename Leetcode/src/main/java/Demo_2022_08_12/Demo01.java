package Demo_2022_08_12;

/**
 * @author 程世玉
 * @data 2022/8/12.
 * 1、题目链接：<a href="https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/">...</a>
 * 2、题目描述：
 * 给定一个m x n 二维字符网格board 和一个字符串单词word 。如果word 存在于网格中，返回 true ；否则，返回 false 。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 这个不会做，等什么时候有空再看吧
 *
 */
public class Demo01 {

    public static void main(String[] args) {
        char[][] c = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        exist(c,"ABCCED");
    }

    /**
     * description: 计算矩阵长度
     * @author: 程世玉.
     */
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }

    static boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if(k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }

}

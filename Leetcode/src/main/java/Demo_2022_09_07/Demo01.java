package Demo_2022_09_07;

/**
 * @author 程世玉
 * @data 2022/9/7.
 * 1、<a href="https://leetcode.cn/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/?favorite=xb9nqhhg">...</a>
 * 2、 二维数组中的查找
 * 这个题目已经做过了，重新再做一遍
 */
public class Demo01 {
    /**
     * description: 给一个二维平面，然后快速找到一个数是否存在这里面
     *
     * @author: 程世玉
     * @Date: 2022/9/7
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return dfs(matrix, target, 0, 0);
    }


    /**
     * description: 采用一波深度优先遍历试试,这种方式完全是可以的，但是，仅仅是超时罢了
     *
     * 方法一：最终看人家评论，再牛的算法，最终俩for循环，人家的效率高的一批
     *
     * 方法二，我目前的深度优先算法，完全可以写，但是不是最优解，我的这个深度优先算法可以进行一个优化，优化结果请看dfs1
     *
     *
     *
     * @author: 程世玉
     * @Date: 2022/9/7
     */
    private static boolean dfs(int[][] maxtrix, int target, int x, int y) {
        int len1 = maxtrix.length;
        int len2 = maxtrix[0].length;
        if (maxtrix[x][y] == target) {
            return true;
        }
        if (x + 1 < len1 && y + 1 < len2 && maxtrix[x][len2 - 1] >= target && maxtrix[x][len2 - 1] >= target && maxtrix[x][y + 1] <= target && maxtrix[x + 1][y] <= target) {

            if (dfs(maxtrix, target, x + 1, y)) {
                return true;
            }
            // 向右遍历
            if (dfs(maxtrix, target, x, y + 1)) {
                return true;
            }
        } else if (x + 1 < len1 && y + 1 < len2 ){
            dfs(maxtrix, target, x + 1, y + 1);
        }
        return false;
    }





    /**
     * description: 换一种角度，从另一条角度进行一个遍历试试,向左向下遍历
     * @author: 程世玉
     * @Date: 2022/9/7
     */
    private static boolean dfs1(int[][] maxtrix, int target, int x, int y) {
        int len1 = maxtrix.length;
        int len2 = maxtrix[0].length;
        if (maxtrix[x][y] == target) {
            return true;
        }
        if (maxtrix[x][len2 - 1] >= target && maxtrix[len1 - 1][y] >= target && x + 1 > len1 && y - 1 > len2){
            // 向左平移
            if (dfs1(maxtrix,target,x,y - 1)){
                return true;
            }
            // 向下平移
            if (dfs1(maxtrix,target,x + 1,y)){
                return true;
            }
        }else if ( x + 1 > len1 && y - 1 > len2){
            dfs1(maxtrix,target,x+1,y-1);
        }

        return false;
    }
}

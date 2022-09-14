package Demo_2022_09_14;

import java.util.HashMap;

/**
 * @author 程世玉
 * @data 2022/9/14.
 * 1、题目链接：<a href="https://leetcode.cn/problems/chou-shu-lcof/?favorite=xb9nqhhg">...</a>
 * 2、我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 */
public class Demo01 {

    static HashMap<Integer, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(1352));
    }

    public static int nthUglyNumber(int n) {
        int i = 0;
        int temp = 1;
        int sum = 0;
        while (i < n) {
            if (dfs(temp)) {
                map.put(sum, true);
                sum = temp;
                i++;
            }
            temp++;
        }
        return sum;
    }

    public static boolean dfs(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        if (n % 2 == 0) {
            if (map.get(n >> 1) == null) {
                return false;
            }
            n = n >> 1;
        } else if (n % 3 == 0) {
            if (map.get(n / 3) == null) {
                return false;
            }
            return true;
        } else if (n % 5 == 0) {
            if (map.get(n / 5) == null) {
                return false;
            }
            return true;
        } else return false;
        return dfs(n);
    }
}

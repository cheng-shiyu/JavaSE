package Demo_2022_08_03;

/**
 * @author 程世玉
 * @data 2022/8/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/">...</a>
 * 2、实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.printf("%.5f",myPow1(
                2.0, 5));
    }

    public static double myPow(double x, int n) {

        if (x == 0.0 || n == 0){
            return 1.00;
        }
        if (x == 1.000000 || x == -1.0 && n % 2 == 0){
            return 1.00000;
        }

        if (x == -1.00000){
            return -1.0;
        }
        if (n == 2){
            return x * x;
        }
        if (n == 1){
            return x;
        }

        double sum = 0.0;

        sum = x;
        if (n > 0){
            for (int i = 0; i < n - 1; i++){
                sum = sum * x;
            }
            return sum;
        }else {
           String m = String.valueOf(n);
           Long b = Long.valueOf(m.replaceAll("-", ""));
            for (int i = 0; i < b - 1 ; i++){
                sum = sum * x;
                if (sum > 1000000){
                    return 0.00000;
                }
            }
            return 1 / sum;
        }
    }


    /**
     * description: 网上的新解决方案
     * @author: 程世玉.
     */
    public static double myPow1(double x,int n){
        if(n == 0) return 1;
        if(n == 1) return x;
        if(n == -1) return 1 / x;
        double half = myPow1(x, n / 2);
        double mod = myPow1(x, n % 2);
        return half * half * mod;
    }


}

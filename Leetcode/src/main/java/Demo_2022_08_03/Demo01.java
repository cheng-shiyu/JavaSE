package Demo_2022_08_03;

/**
 * @author 程世玉
 * @data 2022/8/4.
 * 1、题目链接：<a href="https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/">题目链接</a>
 * 2、题目要求：编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为 汉明重量).）。
 */
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000010000000 ));
    }

    // Java自带的有这个方法，可以解决这个问题，我下面写的方法，其实是将一个十进制数字转换为二进制，然后统计1的个数，但是不符合题意，因为题意说的传进来的是一个二进制32位数字
    public static int hammingWeight(int n) {
       return Integer.bitCount(n);
    }

    /**
     * description: 统计字符串中某一个元素存在的数量
     * @author: 程世玉.
     * 替换掉某一个元素，然后判断长度的变化即可
     */
    public static int countByString(String s,String regex){

        String all = s.replaceAll(regex, "");

        return s.length() - all.length();
    }


    /**
     * description: 递归计算
     * @author: 程世玉.
     */
    public static String a(int n ,String sum){
        if (n == 1){
            return "1";
        }
        sum += a(n / 2,sum);
        sum += n % 2;
        return sum;
    }
}

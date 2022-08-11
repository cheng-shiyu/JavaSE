package Demo_2022_05_09;

/**
 * @author 程世玉
 * @data 2022/5/9.
 * 题目链接：https://leetcode.cn/problems/reverse-integer/
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围[−231, 231− 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class love1 {
    public static void main(String[] args) {
        int reverse = reverse(
                1463847412);
        System.out.println(reverse);
    }


    // 第一种思路，最垃圾的思路，硬算
//    public static int reverse(int x) {
//        boolean flag = false;
//
//        if (x == 0){
//            return 0;
//        }
//        if (x < 0){
//            flag = true;
//            x = -x;
//        }
//        String s = String.valueOf(x);
//        char[] chars = s.toCharArray();
//
//        StringBuffer sb = new StringBuffer();
//        for (int i = chars.length - 1; i >=0; i--){
//            sb.append(chars[i]);
//        }
//        int i = 0;
//        try {
//            i = Integer.parseInt(sb.toString());
//        } catch (NumberFormatException e) {
//            return 0;
//        }
//        if (flag){
//            return -i;
//        }else {
//            return i;
//        }
//    }


    // 可以采用取模运算的方式  核心思想，判断溢出，既然我要判断这个数字溢出没，但是它溢出了，它会变成一个小的数，这样就没有办法检测出溢出
    // 所以我们思路就是，我们2147483647降级，从原本10位变成9位，让9位的这个数跟你比较你9位的数，如果你比我大，那么你乘10之后会更加的大，所以就直接返回0即可
    public static int reverse(int x) {
//        判断是否未0
        if (judeg2(x)) {
            return 0;
        }


        int num = 0;
        int flag = 0;
        while (x != 0){
//提前判断是否溢出,但是仅仅对正数有作用，对于负数没有作用
            if (judeg1(num,x % 10)) {
                return 0;
            }
            // 这里，要进行判断是否溢出，问题是溢出它也不报错，就直接换了个小一点的数
            num = (int) (x  % 10 + num * 10);
            x = x / 10;
            flag++;
        }
        return num;
    }

    public static boolean judeg1(int num,int x){
        if (num > 214748364) {
            return true;
        }
        if (num == 214748364 && x % 10 > 7){
            return true;
        }
        if (num < -214748364){
            return true;
        }
        return false;
    }
    public static boolean judeg2(int x){
        if (x == 0){
            return true;
        }
        return false;
    }
}

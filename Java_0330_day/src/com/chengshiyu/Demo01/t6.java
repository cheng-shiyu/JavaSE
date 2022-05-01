package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 14:46
 * @PROJECT_NAME JavaSE
 * @Description
 * 讨论一下运算符
 */
public class t6 {
    public static void main(String[] args) {
        /**
         * 加减乘除取模
         */
//        int a = 1010;
//        System.out.println(1010 * 10);    // 10100
//        System.out.println(1010 / 10);   // 101
//        System.out.println(10 / 10);  // 1
//        System.out.println(1 / 10);  // 0
//        System.out.println(11 / 10); // 1
//        System.out.println(15 / 2);   // 7
//        System.out.println(163 % 10); // 3
//        System.out.println(15 % 2);  // 1
//
//        String name="";
//
//        if (name != null && name.length() == 0){
//
//        }


        /**
         * &  同为1 则为1
         * |  同为0 则为0  只要右一个1那就是有1
         * ~  取反
         * ^  不相同则为1
         * >> 1 右移 一位
         * << 2 左移二位
         * >>>1 右移一位补零
         */


        System.out.println(1 & 2);
        System.out.println(1 | 2);

        System.out.println(2^1);
        System.out.println(~1);

        float c = (float) 1.36;
        System.out.println(2 >> 1);   // 2 / 2  1

        System.out.println(15 >> 1);  // 15 / 2   7
        System.out.println(15 >>> 1);
        System.out.println(19 >> 1);  // 19 / 2   9


        System.out.println(19 >> 2);  // 19 / 2*2  4
        System.out.println(4 >> 2);   //4 / 2*2    1
        System.out.println(16 >> 2);  // 16 / 2*2   4

        int a = 19>10 ? 1:3;
    }
}

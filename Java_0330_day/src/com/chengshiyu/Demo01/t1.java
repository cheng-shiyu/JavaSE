package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 13:21
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class t1 {
    public static void main(String[] args) {
        byte b = 'a';
        System.out.println("字符a = " + b);

        /**
         * 正数最大值  01111111
         * 负数最小值  10000000
         *
         *
         * 01111111 = 127
         * 10000000 = 128
         * 10000001 = 129
         * 10000010 = 130
         * 所以从二进制的角度来讲，130其实是-126
         *
         *
         */

        System.out.println((byte)127);  // 127
        System.out.println((byte)128); // -128
        System.out.println((byte)129); // -127
        System.out.println((byte)130); // -126
    }
}

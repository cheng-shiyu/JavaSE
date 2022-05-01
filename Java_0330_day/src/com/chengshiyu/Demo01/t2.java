package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 13:36
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class t2 {
    public static void main(String[] args) {
        /*标准写法*/
        int i = Byte.toUnsignedInt((byte) 130);
        System.out.println(i);  // 130

        /**
         * 1、此刻byte是无符号类型，byte是一字节，八位
         * 2、那么无符号类型，byte取值范围就是0---255
         * 接下来，我们就会来验证一下
         */

        // 看看255能否正常输出
        System.out.println(Byte.toUnsignedInt((byte) 255));  // 255

        // 看看0能否正常被输出
        System.out.println(Byte.toUnsignedInt((byte) 0));  // 0

        // 1111 1111 = -1 或者 255    -1不在取值范围内，因为此刻没有符号，那么就直接是255
        System.out.println(Byte.toUnsignedInt((byte) -1));  // 255

        // 0000 0001  = 1
        // 取反之后是 1111 1110
        // 求取反之后的值，那么就是再反过来计算  -[（0000 0001）+1] = -（1 + 1） = -2
        System.out.println(~1);   // -2

        System.out.println(~2);   // -3
        System.out.println(~0);   // -1
        System.out.println(~-1);  // 0
    }
}

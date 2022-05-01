package com.chengshiyu.Demo01;

/**
 * @author 程世玉
 * @create 2022/3/30 20:30
 * @PROJECT_NAME JavaSE
 * @Description  基本数据类型转换
 */
public class t7 {
    public static void main(String[] args) {
        /**
         *
         * 转换规则，小单位可以向大单位转换一般没有啥大的问题
         * 但是大的单位向小的单位，很可能出现错误，因为容易出现数字溢出
         * 1、int转long
         * 2、int转short
         * 3、int转double
         * 4、int转char
         */

        int a = 1000;

        char c = (char) a;
        System.out.println(c);
        short s = (short) a;
        System.out.println(s);
        long l = a;
        System.out.println(l);
        double d = a;
        System.out.println(d);


    }
}

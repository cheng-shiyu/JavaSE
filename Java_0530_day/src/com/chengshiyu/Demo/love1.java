package com.chengshiyu.Demo;

/**
 * @author 程世玉
 * @data 2022/5/30.
 * 探究 a += b 与 a = a + b
 * 涉及的知识点
 * 隐式转换，强转
 */
public class love1 {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 13;

        a += b;
        System.out.println(a);

        // 下面这个会报错
//        a = a + b;

    }
}

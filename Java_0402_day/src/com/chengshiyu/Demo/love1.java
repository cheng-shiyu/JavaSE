package com.chengshiyu.Demo;
/**
 * @Description: 验证一下Integer在比较的时候是否会自动拆箱为int类型
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/4/2 9:10
 */
public class love1 {
    public static void main(String[] args) {
        Integer a = null;
        Object b = a != 0 ? a.intValue() : "a = 0";
        System.out.println("a/10 = " + b);


    }
}

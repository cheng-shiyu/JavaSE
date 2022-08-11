package com.chengshiyu.Demo01;

import java.util.function.Predicate;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * Predicate 断言接口
 * 有两个判断条件
 * 1、字符串长度是否大于5
 * 2、判断字符串中是否包含a
 */
public class love6 {
    public static void main(String[] args) {
        boolean b = checkString("abcdefjjj",
                t -> {
                    System.out.println("条件一执行了");
                    return t.contains("a");
                },
                t -> {
                    System.out.println("条件二执行了");
                    return t.length() > 5;
                });

        System.out.println(b);
    }


    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
        /*满足条件1的同时满足条件2*/
        return pre1.and(pre2).test(s);
    }
}

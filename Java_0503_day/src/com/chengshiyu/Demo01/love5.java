package com.chengshiyu.Demo01;

import java.util.function.Predicate;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * Predicate 断言接口
 * 仅仅有一个接口，一个断言判断
 */
public class love5 {
    /*判断字符串的长度是否大于5，如果大于5，则满足条件*/
    public static void main(String[] args) {
        boolean b = checkString("abcdef", s -> {
            return s.length() > 5;
        });

        System.out.println(b);
    }

    /*判断是否满足我们这个条件*/
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}

package com.chengshiyu.Demo01;

import java.util.function.Function;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * Function 类型转换接口
 * 顾名思义：y=fun(x),做一个类型转换
 */
public class love7 {

    public static void main(String[] args) {
        /*将字符串转换为Integer*/
       Integer num =  change("123456", Integer::parseInt);
        System.out.println(num);
    }

    public static Integer change(String num, Function<String,Integer> function){
        return function.apply(num);
    }
}

package com.chengshiyu.app;

import java.util.function.Supplier;

/**
 * @author 程世玉
 * @create 2022/3/19 17:36
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class mian9 {
    public static void main(String[] args) {
        Supplier<Integer> number = getNumber();
        System.out.println(number.get());



    }

    public static Supplier<Integer> getNumber(){
        int a = 10;
        int b = 11;

        return ()-> a + b;
    }

}

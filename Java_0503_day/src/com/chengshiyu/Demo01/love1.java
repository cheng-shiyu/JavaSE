package com.chengshiyu.Demo01;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author 程世玉
 * @data 2022/5/3.
 * 提供者接口 Supplier
 */
public class love1 {
    public static void main(String[] args) {
        String s = "程世玉";
        char[] arr = t1(new Supplier<char[]>() {
            @Override
            public char[] get() {
                return s.toCharArray();
            }
        });
        Stream.of(arr).forEach(System.out::println);
    }


    public static char[] t1(Supplier<char[]> characterSupplier) {
        return characterSupplier.get();
    }
}


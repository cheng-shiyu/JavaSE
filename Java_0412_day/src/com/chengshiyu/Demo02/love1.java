package com.chengshiyu.Demo02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Stream;

/**
 * Stream联系
 * 1、map映射 ，自定义参数解析器的时候就有这个
 */
public class love1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,9,4,1,3};

        Arrays.stream(arr).map(new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return 165;
            }
        }).forEach(System.out::println);

        String[] arr1 = new String[]{"12", "33", "44"};

//        Arrays.stream(arr1).map()


        ArrayList<Object> list = new ArrayList<>();
//        list.stream().map(new )


        Stream.of(arr).map(new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }

        });
    }
}

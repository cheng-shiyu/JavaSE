package com.chengshiyu.Demo03;

import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/4/12.
 * 数组拷贝
 */
public class love1 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int arr2[] = {1,2,3,4,5};
        int[] arr3 = new int[10];  // 如果后面不想向下面一样直接定义变量，那么就必须指定数量
        int[] arr4 = new int[]{1,2,3,4,5,6,7};



        /*数组拷贝  这种是地址传递*/
        int[] copyArr = arr1;
        copyArr[0] = 99;
        Arrays.stream(arr1).forEach(System.out::println);
        System.out.println("=============================================");
        /*数组拷贝  这种常用在数组扩容*/
       arr1 = Arrays.copyOf(arr1,arr1.length*2);
       Arrays.stream(arr1).forEach(System.out::println);
    }
}

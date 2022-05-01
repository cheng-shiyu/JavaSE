package com.chengshiyu.Demo03;

import java.util.Arrays;
import java.util.Random;

/**
 * @author 程世玉
 * @data 2022/4/12.
 * 数组排序
 */
public class love2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random random = new Random(10);
        for (int i = 0; i < 20; i++){
            arr[i] = random.nextInt();
        }

        /*对数组进行排序 快速排序法*/
        Arrays.sort(arr);

        Arrays.stream(arr).forEach(System.out::println);

    }
}


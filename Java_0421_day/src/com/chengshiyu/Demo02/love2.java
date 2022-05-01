package com.chengshiyu.Demo02;

import org.junit.jupiter.api.Test;

/**
 * @author 程世玉
 * @data 2022/4/21.
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。
 * 思路，先找到最大和最小的数字
 * 并获取到其下标
 */
public class love2 {
    public boolean containsNearbyDuplicate (int[] a, int k) {
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++){
                if ((a[i] == a[j] )&& (i > j ? i - j == k : j - i == k)){
                    return true;
                }
            }
        }
        return false;
    }

    @Test
    public void t1(){
        int[] arr = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(arr, 1));

//        if (1 == 1 && 1 == 1){
//            System.out.println("gogogogo");
//        }
    }
}

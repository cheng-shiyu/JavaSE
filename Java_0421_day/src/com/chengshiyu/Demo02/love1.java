package com.chengshiyu.Demo02;

import org.junit.jupiter.api.Test;

/**
 * @author 程世玉
 * @data 2022/4/21.
 */
public class love1 {
    public int findPos (int[] A, int t) {
        for (int i = 0; i < A.length; i++){
            if (A[i] == t){
                return i;
            }
        }
        return -1;
    }

    @Test
    public void t1(){
        int[] arr = new int[]{4,5,6,7,8,9,10,9};
        int pos = findPos(arr, 11);
        System.out.println(pos);
    }
}

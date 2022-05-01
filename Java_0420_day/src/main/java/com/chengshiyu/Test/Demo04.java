package com.chengshiyu.Test;

import com.chengshiyu.Array.ArrayList1;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class Demo04 {
    public static void main(String[] args) {
        ArrayList1<Integer> list1 = new ArrayList1<>();

        for (int i = 0; i < 100; i++){
            list1.add(i);
        }

        for (int i = 0; i < 100; i++){
            list1.remove(i);
        }
    }
}

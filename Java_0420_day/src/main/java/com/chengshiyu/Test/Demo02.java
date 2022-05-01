package com.chengshiyu.Test;

import com.chengshiyu.Array.LinkedList;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class Demo02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        System.out.println(list.get(1));
    }
}

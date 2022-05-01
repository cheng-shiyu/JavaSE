package com.chengshiyu.Test;

import com.chengshiyu.Array.LinkedList1;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class Demo03 {
    public static void main(String[] args) {
        LinkedList1<Integer> list = new LinkedList1<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(0));
    }
}

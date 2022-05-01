package com.chengshiyu.Test;

import com.chengshiyu.Array.twoLinkedList;

/**
 * @author 程世玉
 * @data 2022/4/23.
 * 双向链表测试
 */
public class Demo05 {
    public static void main(String[] args) {
        twoLinkedList<Integer> list= new twoLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
//        list.add(0,15);

        System.out.println(list.get(1));
    }
}

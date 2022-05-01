package com.chengshiyu.Test;

import com.chengshiyu.Array.twocirculateLinkedList1;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 约瑟夫问题解决方案
 */
public class Demo06 {
    public static void main(String[] args) {
        twocirculateLinkedList1<Integer> list = new twocirculateLinkedList1<>();
        for (int i = 1; i <= 8; i++){
            list.add(i);
        }
        list.reset();
        while (!list.isEmpty()){
            list.next();
            list.next();
            list.remove();
        }
    }
}

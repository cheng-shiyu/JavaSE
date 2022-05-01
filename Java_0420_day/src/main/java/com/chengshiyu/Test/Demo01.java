package com.chengshiyu.Test;

import com.chengshiyu.Array.ArrayList;
import com.chengshiyu.entity.User;

/**
 * @author 程世玉
 * @data 2022/4/20.
 */
public class Demo01 {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//
////        list.add(10);
////        list.add(20);
////        list.add(30);
////
////        list.add(0,123);
////
////        System.out.println(list.toString());

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("程世玉1","123456"));
        list.add(new User("程世玉2","123456"));
        list.add(new User("程世玉3","123456"));
        list.add(new User("程世玉4","123456"));
        list.add(new User("程世玉5","123456"));
        int indexOf = list.indexOf(new User("程世玉5", "123456"));
//        System.out.println(indexOf);
        System.out.println(list);


//        new LinkedList<>()
    }
}

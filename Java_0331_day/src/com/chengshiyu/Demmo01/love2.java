package com.chengshiyu.Demmo01;

import com.chengshiyu.Utils.User;
import com.chengshiyu.Utils.loveUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @Description: list集合中几种常见的输出方式
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/3/31 22:01
 */

public class love2 {
    public static void main(String[] args) {
        ArrayList<User> list =
                loveUtils.getArrayUser();

        /*方式一，通过faoreach进行遍历*/
        list.forEach(System.out::println);
        System.out.println("====================");
        list.sort(Comparator.comparingInt(User::getAge));
        Iterator<User> iterator = list.iterator();
        /*方式二、使用迭代器进行遍历对象*/
        while (iterator.hasNext()){
            User next = iterator.next();
            System.out.println(next);
        }
        System.out.println("====================");

        /*方式三、通过增强for进行遍历*/
        for (User user : list) {
            System.out.println(user);
        }
        System.out.println("====================");
        /*方式四、下标进行遍历*/
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("====================");
        /*方式五、使用stream流进行遍历*/
        list.stream().forEach(System.out::println);

    }
}

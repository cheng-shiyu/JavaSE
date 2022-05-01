package com.chengshiyu.app;

import com.chengshiyu.pojo.User;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 程世玉
 * @create 2022/3/19 16:48
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class main7 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User(18, "程世玉");
        User user2 = new User(1, "w");
        User user3 = new User(8, "j");
        User user4 = new User(128, "c");
        User user5 = new User(18, "s");
        User user6 = new User(188, "y");
        User user7 = new User(10, "l");
        User user8 = new User(118, "o");
        User user9 = new User(13, "v");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);
        list.add(user7);
        list.add(user8);
        list.add(user9);


        /*1、使用迭代器方式*/
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            User next = iterator.next();
            if (next.getAge() > 18){
                /*只要年龄大于18，就去除*/
                iterator.remove();
            }
        }

        /*2、使用lambda表达式*/
        list.removeIf(e -> e.getAge() > 10);


    }
}

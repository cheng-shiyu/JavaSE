package com.chengshiyu.app;

import com.chengshiyu.pojo.User;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author 程世玉
 * @create 2022/3/25 9:42
 * @PROJECT_NAME JavaSE
 * @Description  复习一边lambda表达式
 */
public class main11 {
    @Test
    public void t1() {
        /*遍历集合*/
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


//        for (User user : list) {
//            System.out.println(user);
//        }

//        list.forEach(System.out::println);
//
//        /*下面俩中方式*/
//        list.forEach((a)->{
//            System.out.println(a.getAge());
//        });

        list.forEach(User::getAge);
    }
}

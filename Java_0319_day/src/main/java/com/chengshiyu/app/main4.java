package com.chengshiyu.app;

import com.chengshiyu.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 程世玉
 * @create 2022/3/19 14:54
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class main4 {

    /*集合排序，对于对象进行排序*/
    @Test
    public void t1() {
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


        /*下面这三种都是可以的*/
        list.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        list.sort((o1,o2)->{
            return o1.getAge() - o2.getAge();
        });


        list.sort(Comparator.comparingInt(User::getAge));



        for (User user : list) {
            System.out.println(user);
        }
    }
}

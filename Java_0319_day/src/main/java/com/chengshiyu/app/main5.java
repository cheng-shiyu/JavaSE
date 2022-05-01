package com.chengshiyu.app;

import com.chengshiyu.pojo.User;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author 程世玉
 * @create 2022/3/19 16:48
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class main5 {
    public static void main(String[] args) {
        TreeSet<User> set = new TreeSet<User>((o1, o2)->{
            if (o1.getAge() >= o2.getAge()){
                /*前面的比后面的大，我们不想让大的排后面，就返回-1 false即可*/
                return -1;
            }else {
                return 1;
            }
        });

        User user1 = new User(18, "程世玉");
        User user2 = new User(1, "w");
        User user3 = new User(8, "j");
        User user4 = new User(128, "c");
        User user5 = new User(18, "s");
        User user6 = new User(188, "y");
        User user7 = new User(10, "l");
        User user8 = new User(118, "o");
        User user9 = new User(13, "v");

        set.add(user1);
        set.add(user2);
        set.add(user3);
        set.add(user4);
        set.add(user5);
        set.add(user6);
        set.add(user7);
        set.add(user8);
        set.add(user9);

        System.out.println(set);
    }
}

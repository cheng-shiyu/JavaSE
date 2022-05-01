package com.chengshiyu.Demo02.Test;

import com.chengshiyu.Demo02.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author 程世玉
 * @create 2022/3/27 9:13
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class test {
    public static ArrayList<User> getUserArrayList() {
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

        return list;
    }


    public static ArrayList<Integer> getNumArrayList() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(9);
        list.add(5);
        list.add(10);
        list.add(11);
        list.add(18);
        list.add(3);
        list.add(4);
        list.add(1);

        return list;
    }


    public static void print(List list) {
        list.forEach(System.out::println);
    }

    /**
     * list集合进行排序
     */
    @Test
    public void t1() {
        ArrayList<Integer> list = getNumArrayList();

        /*方式一、不适用lambda表达式进行变成*/
        // 1、先输出一下集合
        System.out.println("初始化集合");
        print(list);
        // 2、进行遍历排序,这个可以使用冒泡排序，中序排序，等等很多排序方式
        for (Integer num : list) {

        }


        // 使用sort进行排序
        list.sort(Comparator.comparingInt(o -> o));

//        list.sort((o1,o2)->{
//            return o1 - o2;
//        });
        System.out.println("排序后的集合");
        print(list);
    }


    @Test
    public void t2() {
        ArrayList<User> list = getUserArrayList();

        list.sort((o1, o2) -> {
            return o1.getAge() - o2.getAge();
        });

        list.sort((o1, o2) -> o1.getAge() - o2.getAge());


//        这种报错！！！
//        list.sort(Comparator.comparingInt(list.get(0).getAge() -> list.get(0).getAge()));
    }
}

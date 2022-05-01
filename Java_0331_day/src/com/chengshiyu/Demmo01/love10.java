package com.chengshiyu.Demmo01;

import com.chengshiyu.Utils.User;
import com.chengshiyu.Utils.loveUtils;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Stream;

/**
 * @Description: 流的中间操作
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/3/31 22:59
 * 1、遍历逐一处理（forEach）
 * 2、过滤处理（filter）
 * 3、映射（map）
 * 4、统计流中元素的个数（count
 * 5、截取特定数量的前几个流元素（limit）
 * 6、跳过前几个，获取之后的流（skip）
 * 7、组合流（concat）
 * 8、排序（sorted）
 * 9、去重（distinct）
 */
// 8、排序（sorted）
public class love10 {
    /*list集合进行排序*/
    @Test
    public void t1() {
        ArrayList<User> list = loveUtils.getArrayUser();

        /*方式一*/
        list.sort((o1, o2) -> o1.getAge() - o2.getAge());

        /*方式二*/
        list.sort(Comparator.comparingInt(User::getAge));

        list.forEach(System.out::println);
    }

    /*set集合输出的三种方式*/
    @Test
    public void t2() {
        HashSet<User> setUser = loveUtils.getSetUser();

        // 不可以通过下标了！！！从这个角度来讲，增强for的循环就有这方面的原因，底层用的是迭代器
//        for (int i = 0; i < setUser.size(); i++){
//            System.out.println(setUser);
//        }

        /*1、通过循环遍历得到每一个对象*/
        for (User user : setUser) {
            System.out.println(user);
        }
        System.out.println("====================");
        /*2、直接输出，得到的set集合里面所有数据*/
        System.out.println(setUser);
        System.out.println("====================");

        /*3、通过迭代器进行循环遍历*/
        Iterator<User> iterator = setUser.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("====================");
        /*4、通过stream流尽心循环输出*/
        setUser.stream().filter(e -> e.getAge() < 500).forEach(System.out::println);

    }


    /*set集合进行指定规则操作*/
    @Test
    public void t3() {
        HashSet<User> setUser = loveUtils.getSetUser();
        setUser.stream().filter(e -> e.getAge() < 500).forEach(System.out::println);
    }

    @Test
    public void t4() {
        /*创建set集合*/
//        HashSet<User> set = new HashSet<User>();
        TreeSet<User> set = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        try {
//            Class<loveUtils> loveUtilsClass = loveUtils.class;
//            loveUtils loveUtils = new loveUtils();
//            Class<? extends com.chengshiyu.Utils.loveUtils> aClass1 = loveUtils.getClass();

            Class<?> aClass = Class.forName("com.chengshiyu.Utils.loveUtils");

            Method method = aClass.getDeclaredMethod("getRandomName");
            method.setAccessible(true);

            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                String invoke = (String) method.invoke(aClass.newInstance());
                set.add(new User(invoke, random.nextInt(100)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        set.forEach(System.out::println);

    }

    @Test
    public void t5() {
        String[] arr = new String[]{"1", "8", "3", "2"};
        Stream<String> stream = Stream.of(arr);
        stream.sorted().forEach(s -> System.out.println(s));
    }

    @Test
    public void t6() {
        ArrayList<User> list = loveUtils.getArrayUser();
        Stream<User> sorted = list.stream().sorted((o1,o2)->o1.getAge() - o2.getAge());

        sorted.forEach(System.out::println);
    }

}

package com.chengshiyu.Demmo01;

import java.util.*;
import java.util.stream.Stream;

/**
 * @Description: stream流使用流的三种地方
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/3/31 22:25
 */
public class love3 {
    public static void main(String[] args) {
        // 第一种方式，使用集合进行获取
        Collection list1 = new ArrayList<String>();
        list1.add("123");
        list1.stream().forEach(System.out::println);

        // 第二种，通过map进行获取stream流
        HashMap<Object, Object> map = new HashMap<>();
        map.put("t1","1");
        Set<Object> keySet = map.keySet();
        Collection<Object> values = map.values();
        keySet.stream().forEach(System.out::println);
        values.stream().forEach(System.out::println);

        Set<Map.Entry<Object, Object>> set = map.entrySet();
        System.out.println(set);


        /*3、数组进行获取stream*/
        String[] arr=new String[]{"苹果","香蕉","草莓"};
        Stream<String> stream = Stream.of(arr);
        /*又或者是下面这种*/
        Stream<String> stream1 = Arrays.stream(arr);
    }
}

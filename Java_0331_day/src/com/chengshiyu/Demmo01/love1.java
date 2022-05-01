package com.chengshiyu.Demmo01;

import java.util.ArrayList;
import java.util.stream.Stream;
/*需求，将list中存在的字符串里面的的数字找到，并求平均值 常规方式*/
public class love1 {
    public static void main(String[] args) {
        /*常规方法进行书写*/
        ArrayList<String> list
                = new ArrayList<>();
        list.add("程世玉");
        list.add("123");
        list.add("1584");
        list.add("18ap");

        float sum = 0;
        int num = 0;
        for (String s : list) {
            if (s.matches("\\d+")){
                int parseInt = Integer.parseInt(s);
                sum += parseInt;
                num +=1;
            }
        }

        System.out.printf("sum = %f\t",sum);
        System.out.println("共 " + num + "个数字");
        System.out.println(sum / num);




        /*采用stream流的方式进行编写*/
        Stream<String> stream = list.stream();
        System.out.println(stream);
        long count = stream.count();
        System.out.println(count);
    }
}

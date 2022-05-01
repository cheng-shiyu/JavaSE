package com.chengshiyu.Demo02;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @author 程世玉
 * @data 2022/4/12.
 */
public class love2 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            users.add(new User("程世玉" + i,"18648"+i));
        }
        // 使用stream流进行转换
        Stream<String> stream = users.stream().map(User::getName);

        stream.sorted((o1, o2) -> {
            o1 = getNumber(o1);
            o2 = getNumber(o2);
            return Integer.parseInt(o2) - Integer.parseInt(o1);
        }).forEach(System.out::println);
    }

    public static String getNumber(String o1){
        Pattern compile = Pattern.compile("[1-9]+");
        Matcher matcher = compile.matcher(o1);
        if (matcher.find()) {
         return matcher.group();
        }
        return null;
    }
}

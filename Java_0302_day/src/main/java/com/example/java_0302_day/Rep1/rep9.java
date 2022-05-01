package com.example.java_0302_day.Rep1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 16:00
 * @PROJECT_NAME JavaSE
 * @Description 正则表达式的应用！！
 * 手机号码
 * 要求必须以13，14，15，18开头的11位数
 */
public class rep9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();

            String regex = "^1(?=3|4|5|8)\\d{10}$";

            Pattern compile = Pattern.compile(regex);

            Matcher matcher = compile.matcher(next);

            if (matcher.find()) {
                System.out.println("匹配成功！！！");
            }else {
                System.out.println("匹配失败！！！");
            }
        }

    }
}

package com.example.java_0302_day.Rep1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 16:00
 * @PROJECT_NAME JavaSE
 * @Description 正则表达式的应用！！
 * QQ号码
 * 要求：从1-9开头的一个（5-10）位数字
 */
public class rep8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();


            String regex = "^[1-9]\\d{4,9}$";

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

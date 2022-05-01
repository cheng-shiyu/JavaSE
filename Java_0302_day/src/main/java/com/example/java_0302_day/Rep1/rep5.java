package com.example.java_0302_day.Rep1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 16:00
 * @PROJECT_NAME JavaSE
 * @Description 正则表达式的应用！！
 * 1、输入框中必须全是中文
 */
public class rep5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String next = scanner.next();

            String regex = "^[\u0391-\uffe5]+$";

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

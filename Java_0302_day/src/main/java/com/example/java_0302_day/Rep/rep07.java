package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/20 20:17
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class rep07 {
    public static void main(String[] args) {
        String content = "/manangmentSystem/file/9681520220320200000.jpg,/manangmentSystem/file/1799120220320200000.jpg,/manangmentSystem/file/1559320220320200000.jfif";


        String regex = "([^/]+)((?i)(jpg)|(?i)(png)|(?i)(jfif))+";

        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(content);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}

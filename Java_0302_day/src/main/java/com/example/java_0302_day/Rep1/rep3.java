package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 15:34
 * @PROJECT_NAME JavaSE
 * @Description 字符匹配符
 */
public class rep3 {
    public static void main(String[] args) {
        String centent = "fabdddab\ncccsa.......fbaioj5684as..d.f.456asdf456412sdfa4561fas5645asdf123";


        /*abc不区分大小写*/
//        String regex = "(?i)abc";
        /*bc不区分大小写*/
//        String regex = "a(?i)bc";
        /*b不区分大小写二*/
//        String regex = "a((?i)b)c";

        /*匹配任意空白字符*/
//        String regex = "\\s";
        /*匹配任意非空白字符*/
        String regex = "\\S";


        Pattern compile = Pattern.compile(regex);


        Matcher matcher = compile.matcher(centent);

        int i = 1;

        while (matcher.find()) {

            System.out.println("找到："+matcher.group() + ",第"+(i++)+"次！！！");
        }
    }
}

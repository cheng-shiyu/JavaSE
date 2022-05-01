package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 15:22
 * @PROJECT_NAME JavaSE
 * @Description 字符匹配符
 */
public class rep2 {
    public static void main(String[] args) {
        String centent = "fabdddab\ncccsa.......fbaioj5684as..d.f.456asdf456412sdfa4561fas5645asdf123";

        int length = centent.length();
        System.out.println("centent : " + centent);
        System.out.println("length : " + length);

        /*1、  . 代表匹配处理\n以外的东西*/
//        String regex = ".";

        /*2、\\d 匹配所有的数字,\\d 类似与下面的[0,9]*/
//        String regex = "\\d";
//        String regex = "[0-9]";

        /*3、\\D 匹配所有的非数字,包括字符，标点符号之类的*/
//        String  regex = "\\D";
//        String regex = "[^0-9]";
//        String regex = "[a-zA-Z]";

        /*4、匹配单个数字，大小写字母,下面俩类似*/
//        String regex = "\\w";
//        String regex = "[0-9a-zA-Z]";


        /*5、排除数字，字母*/
//        String regex = "\\W";
        String regex = "[^0-9a-zA-Z]";
        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(centent);

        int i = 1;

        while (matcher.find()) {

            System.out.println("找到："+matcher.group() + ",第"+(i++)+"次！！！");
        }
    }
}

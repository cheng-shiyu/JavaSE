package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/3 15:08
 * @PROJECT_NAME JavaSE
 * @Description 元字符---转义字符、字符匹配符
 */
public class rep1 {
    public static void main(String[] args) {
        String centent = "fabdddabcccsa.......fbaioj5684as..d. f.456asdf456412sdfa4561fas5645asdf123";

        /*1、查询普通的字符*/
//        String regex = "b";
        /*2、查询特殊的字符*/
//        String regex = "\\.";

        /*3、可接受列表,查询a-c之间的所有小写字母a b c*/
//        String regex = "[a-c]";

        /*4、不接受的字符列表*/
//        String regex = "[^a-c]";

        /*5、-代表连字符*/
        String regex = "[a-b]";

        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("找到："+matcher.group());
        }
    }
}

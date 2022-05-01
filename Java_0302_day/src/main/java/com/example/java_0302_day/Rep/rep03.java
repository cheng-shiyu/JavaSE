package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 22:29
 * @PROJECT_NAME JavaSE
 * @Description 元字符里面的定位符
 */
public class rep03 {
    /**
     * 1、^
     * @param args
     */
    public static void main(String[] args) {
//        String centent1 = "1234";

        String centent = "123456-abcd";
        /*1、^ 这个是开头以XX开头*/
//        String regstr = "^[0-9]+[a-b]*";  // 如果不用*号，使用centent1则匹配不出来

//        String regstr = "[1-9]-[a-z]+$";


        /*2、匹配字符串，如果最后结尾是以指定字符集结尾，则匹配成功！！！*/
//        String regstr = "cd$";
        String regstr = "cd\\b";


        Pattern compile = Pattern.compile(regstr);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}

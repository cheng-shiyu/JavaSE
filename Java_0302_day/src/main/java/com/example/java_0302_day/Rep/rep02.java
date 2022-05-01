package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 21:42
 * @PROJECT_NAME JavaSE
 * @Description 演示（）的作用
 */
public class rep02 {
    public static void main(String[] args) {

        String centent = "aa1998,2001,19994abc";

        /*
         *
         *   * 出现0次或者多次都行,意思就是，即使最后不是字母，也是可以的
         *
         *  */
//        String regstr = "^[0-9]+[a-z]+";

        String regstr = "(\\d\\d)(\\d\\d)";
        Pattern compile = Pattern.compile(regstr);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("所有的数据："+matcher.group(0));
            System.out.println("第一组："+matcher.group(1));
            System.out.println("第二组："+matcher.group(2));
        }


    }
}

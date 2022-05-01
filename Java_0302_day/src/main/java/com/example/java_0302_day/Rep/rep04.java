package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 23:23
 * @PROJECT_NAME JavaSE
 * @Description 非命名捕获和命名捕获
 */
public class rep04 {
    public static void main(String[] args) {
        /*被匹配的字符串*/
        String centent = "ahsbd1925s48sd568dsf456asdf4894asdf465";

        /*正则表达式规则*/
        /*1、非命名捕获,我们在下面获取不同组的时候，用的是数字*/
//        String regstr = "(\\d\\d)(\\d\\d)";
        /*2、命名捕获，我们在下面可以获取不同组的时候，可以根据名字*/
        String regstr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";


        /*创建Pattern对象*/
        Pattern compile = Pattern.compile(regstr);

        /*使用进行匹配*/
        Matcher matcher = compile.matcher(centent);

        /*进行输出*/
        while(matcher.find()){
            System.out.println("所有内容："+matcher.group());
            System.out.println("第一组内容：" + matcher.group(1));
            System.out.println("第二组内容：" + matcher.group(2));

            System.out.println("第一组内容：" + matcher.group("g1"));
            System.out.println("第二组内容：" + matcher.group("g2"));
        }


    }
}

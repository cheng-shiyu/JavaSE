package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 23:47
 * @PROJECT_NAME JavaSE
 * @Description
 * 特别分组方式
 * （？:pattern）
 * (?=pattern)
 * (?!pattern)
 */
public class rep05 {
    public static void main(String[] args) {
        String centent = "aaa1jksoapfk" +
                "aaa2156156156" +
                "aaa3sajio45" +
                "aaa4asojifiosajfiosajfiojasd";

        /*（）？：pattern*/
        String regstr = "aaa1*|aaa2*|aaa3+";

        Pattern compile = Pattern.compile(regstr);

        Matcher matcher = compile.matcher(centent);

        while(matcher.find()){
            System.out.println("找到了"+matcher.group());
        }



    }
}

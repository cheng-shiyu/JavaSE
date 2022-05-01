package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 23:54
 * @PROJECT_NAME JavaSE
 * @Description
 * 探究一下 * ？ 以及+
 */
public class rep06 {
    public static void main(String[] args) {
        String centent = "a1aa1111111ab11111a1aaaaaaa";

        /* “*”符号 出现0次到任意多次，意思就是a1或者a12只要出现一次，就记录一次*/
//        String regstr = "a12*";

//        String regstr = "a1*";

        /*匹配前面的子表达式一次或多次*/
//        String regstr = "a1+";

        /*匹配前面的子表达式零次或一次，或指明一个非贪婪限定符*/
        /*匹配前面的子表达式零次或一次。例如，"do(es)?" 可以匹配 "do" 、 "does" 中的 "does" 、 "doxy" 中的 "do" 。? 等价于 {0,1}。*/
        String regstr = "a{0,1}";
        Pattern compile = Pattern.compile(regstr);
        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("找到了"+matcher.group());
        }
    }
}

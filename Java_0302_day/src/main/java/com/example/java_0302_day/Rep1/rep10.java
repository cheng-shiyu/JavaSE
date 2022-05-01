package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/5 15:33
 * @PROJECT_NAME JavaSE
 * @Description
 *  1、'.' 放到[]里面和外面的区别
 *  2、‘？’放到[]里面和外面的区别
 */
public class rep10 {
    public static void main(String[] args) {
        String centent = "jiaofdjioa?asjfio.dsf.dfsa.fdsa.fsda.fasd.";

        
        /*1、‘.’ 放到外面，则默认是匹配所有的字符，除了换行符 \n*/
//        String regex = ".+";
//        String regex = ".";
        /*2、‘.’是匹配所有的字符，除了\n，？加载后面，可以有也可以没有0/1个*/
//        String regex = ".?";

        /*3、‘.’ 和 ‘？’ 放入[]中则这俩符号没有上面的特殊意义，就是简单的匹配这俩字符*/
//        String regex = "[.]";
        String regex = "[?]";
        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("找到：" + matcher.group());
        }
    }
}

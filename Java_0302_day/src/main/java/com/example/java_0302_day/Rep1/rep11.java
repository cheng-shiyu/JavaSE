package com.example.java_0302_day.Rep1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/5 15:44
 * @PROJECT_NAME JavaSE
 * @Description 1、匹配url里面的每一节内容
 */
public class rep11 {
    public static void main(String[] args) {
//        String centent = "https://www.bilibili.com/video/BV1Eq4y1E79W?p=17&spm_id_from=333.1007.top_right_bar_window_history.content.click&=1=2";

        /*匹配http或者https*/
//        String regex = "^[http|https]+";

        /*配置https以及：//*/
//        String regex = "^([http|https]+://)";
        /*匹配域名   https://blo-g.csdn.net   */
//        String regex = "^(([http|https]+://)?([\\w-]+\\.)+(\\w)+)";
        /*匹配域名后面的路径*/
//        String regex = "^(([http|https]+://)?([\\w-]+\\.)+(\\w)+)(\\/[\\w-]+)+";

        /*匹配url后面所有的变量，所有的参数*/
//        String regex = "^(([http|https]+://)?([\\w-]+\\.)+(\\w)+)(\\/[\\w-]+)+(\\?)([\\w-=?._%&]+)";
        String centent = "/manangmentSystem/file/441320220224171526.jpg,/manangmentSystem/file/341320220224174038.JPG,/manangmentSystem/file/194520220224164539.JPG";
        String regex = "([^\\\\/]+)([\\w.]+)((?i)jpg|(?i)png)$";


        Pattern compile = Pattern.compile(regex);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("找到：" + matcher.group());
        }
    }
}


package com.example.java_0302_day.Rep;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 程世玉
 * @create 2022/3/2 13:42
 * @PROJECT_NAME JavaSE
 * @Description
 */
public class rep01 {
    public static void main(String[] args) {

        String centent = "2012-08-16T11:07:10.793" +
                "a1908,AaBbCcDdFf," +
                "a11111aa111a22222程世玉，城市与，澄清 forver,a196358b A1285sdf47M Bas48asdf456f" +
                "aBc";


        /*以数字开头，只要前三个，并且需要是连续三个都是数字*/
//        String regstr = "\\d{3}";


        /*
        这个是获取所有的英文字母，
        + 代表，只要是连续的一串字母，就输出出来，但凡中间加一个非字母的，就输出出来
        如果不写 + ，那么就是说一个一个输出
        * */
//        String regstr = "[a-zA-Z]+";

        /*匹配数字，两个两个匹配，一次匹配四个*/
//        String regstr = "(\\d\\d\\d\\d)-(\\d\\d)-(\\d\\d)";


        /*上面也可以这样写*/
//        String regstr = "(\\d{4})-([0-2][0-9])-([0-2])([0-9])((?i)[a-z][0-9]):([0-9]:[0-9]:[0-9])";
//        String regstr = "(\\d{4})-([0-2][0-9])-([0-9]+)((?i)[a-z][0-9]+):([0-9]+:[0-9]+\\.[0-9]+)";

        /*如果想要找. 需要进行\. java里面需要转义，需要是\\. 如果直接搜索. 那么就是直接全部搜出来了！！！*/
//        String regstr = "\\.";

        /*只有后俩不区分大小写，a还是区分大小写的*/
//        String regstr = "a(?i)bc";

        /*开头是以a开头，结束是以b结束，中间只能填写俩，但是可以随便填写*/
//        String regstr = "a..b";

        /*开头a 和 结束 b 不区分大小写，中间只能填写3，但是可以随便填写*/
//        String regstr = "(?i)a...(?i)b";

        /*
        所有的非数字的选择出来,如果想让选择出来的非字母字符以串的形式出来，那么就应该写成这个  \\D+
        [^0-9] 与\\D 是等同的
         */
//        String regstr = "\\D";  // \\D+
//        String regstr = "[^0-9]";

        // 选择三到四个数字
//        String regstr = "[0-9]{3}(\\d)?";
//        String regstr = "\\d{3}(\\d)?";
//        String regstr = "\\d{3,5}";   // 小细节，默认就是贪心匹配，默认选择多的，因为如果你有五个，那你三个一定是满足的，所以人家直接找到的就是三

        /*或，这个或者那个，这些都是可以的！！！*/
//        String regstr =  "程|成|澄|诚|城";
//        String regstr =  "[程成澄诚城]";


        /*匹配0次或者多次，全部进行匹配一次*/
//        String regstr = "城*";

        /*? 表明出现0次或者1次*/
//        String regstr = "a+";
        String regstr = "^[a-zA-Z]+Ff?";  // 前面任意字母，结尾以Ff或者F结尾的，则可以获取

        Pattern compile = Pattern.compile(regstr);

        Matcher matcher = compile.matcher(centent);

        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }

    }
}

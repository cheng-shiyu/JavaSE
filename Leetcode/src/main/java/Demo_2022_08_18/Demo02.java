package Demo_2022_08_18;

/**
 * @author 程世玉
 * @data 2022/8/21.
 * 1、题目链接:<a href="https://leetcode.cn/problems/ti-huan-kong-ge-lcof/">...</a>
 * 2、题目描述：请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Demo02 {
    /**
     * description: 直接使用官方自带的
     * @author: 程世玉.
     */
//    public String replaceSpace(String s) {
//        return s.replaceAll(" ","%20");
//    }


    /**
     * description: 第二种方式，自己编写,其实官方提供的那个，速度并不是非常的快，她的效率还没有我下面这个效率高
     * @author: 程世玉.
     */
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char aChar : chars) {
            if (aChar == ' '){
                stringBuilder.append("%20");
            }else {
                stringBuilder.append(aChar);
            }
        }
        return stringBuilder.toString();
    }


}

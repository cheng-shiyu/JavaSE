package Demo_2022_08_31;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 程世玉
 * @data 2022/8/31.
 * 1、题目链接：<a href="https://leetcode.cn/problems/integer-to-roman/">...</a>
 * 2、数字转换为罗马值
 */
public class Demo01 {


    public static void main(String[] args) {
        System.out.println(intToRoma1(1994));
    }


    /**
     * description: 问题是个什么问题呢？
     * 数字转换为罗马数字，这个其实是可以拆分成为一个一个组件的
     * 求每次最大的一个计算值，就是这几个罗马数字，最大满足需求的一组
     *
     * @author: 程世玉
     * @Date: 2022/8/31
     * <p>
     * 这种算是硬编码的一种方式，其实我们是可以通过贪心算法来实现这个功能
     */
    public static String intToRoman(int num) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(2000, "MM");
        map.put(3000, "MMM");
        map.put(100, "C");
        map.put(200, "CC");
        map.put(300, "CCC");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(600, "DC");
        map.put(700, "DCC");
        map.put(800, "DCCC");
        map.put(900, "CM");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        ArrayList<String> list = new ArrayList<>();
        list.add(map.get((num / 1000) * 1000));
        list.add(map.get(((num / 100) % 10) * 100));
        list.add(map.get(((num / 10) % 10) * 10));
        list.add(map.get((num % 10)));

        StringBuilder sb = new StringBuilder();

        for (String s : list) {
            if (s != null) {
                sb.append(s);
            }
        }

        return sb.toString();
    }


    public static String intToRoma1(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < values.length; i++){
            if (num == 0){
                break;
            }
            int value = values[i];
            String symbol = symbols[i];
            while (num >= value){
                num -= value;
                sb.append(symbol);
            }
        }

        return sb.toString();
    }
}
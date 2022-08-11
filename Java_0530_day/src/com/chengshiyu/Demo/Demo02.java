package com.chengshiyu.Demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 程世玉
 * @data 2022/8/7.
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("请输入您要计算的列表：");
            String text = scanner.next();

            double sum = parse(text);

            System.out.println("总和=" + sum);

//            System.out.println("是否需要继续，停止请按2，继续请按1");

//            String flag = scanner.next();
//
//            if (!flag.equals("1")) {
//                System.out.println("程序运行结束");
//                return;
//            }
        }
    }


    private static double parse(String text){
        String[] split = text.split("[+\\-*]");

        char[] chars = text.toCharArray();

        LinkedList<Integer> nums = new LinkedList<>();
        ArrayList<Character> operator = new ArrayList<>();

        for (char aChar : chars) {
            switch (aChar){
                case '+','/','-','*':
                    operator.add(aChar);
                default:
                    break;
            }
        }

        for (String s : split) {
            nums.add(Integer.valueOf(s));
        }

        for (int i = 1; i < nums.size();){
            Integer a = nums.remove(i--);
            Integer b = nums.remove(i++);
            Character opt = operator.remove(0);

            Integer sum = sum(a, b, opt);

            nums.add(0,sum);
        }

        return nums.get(0);
    }

    private static Integer sum(Integer a,Integer b,Character opt){
        return switch (opt) {
            case '+' -> a + b;
            case '-' -> b - a;
            case '*' -> a * b;
            default -> 0;
        };
    }
}

package com.chengshiyu.Demo03;

import java.util.Scanner;

/**
 * @author 程世玉
 * @data 2022/4/24.
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.replace("[", "");
        String s2 = s1.replace("]", "");
        String s3 = s2.replace(",", "");
        System.out.println(s3);
        String[] split = s3.split(" ");
        char[] chars = split[0].toCharArray();
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++){
            ints[i] = chars[i];
        }

        boolean b = t2(ints, Integer.parseInt(split[1]));
        System.out.println(b);
    }


    public static boolean t2(int[] nums,int num){
        for (int n : nums) {
            if (n == num){
                return true;
            }
        }
        return false;
    }

    public static boolean t1(int[] nums,int num){
        int[] nnmus = new int[nums.length];
        int index = 0;
        int rand = 5;
        for (int i = rand; i < nums.length; i++){
            nnmus[index] = nnmus[i];
            index++;
        }
        for (int i = 0; i < rand; i++){
            nums[index] = nums[i];
            index++;
        }

        for (int n : nnmus) {
            if (n == num){
                return true;
            }
        }
        return false;
    }
}

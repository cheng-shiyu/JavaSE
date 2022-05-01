package com.chengshiyu.Test;



import java.nio.charset.StandardCharsets;

/**
 * @author 程世玉
 * @data 2022/4/24.
 */
public class Demo07 {
    public static void main(String[] args) {
        byte[] bytes = "abjcisa".getBytes(StandardCharsets.UTF_8);

        for (byte s : bytes) {
            System.out.println(s);
        }

        String s = new String(bytes);
        System.out.println(s);
    }

}

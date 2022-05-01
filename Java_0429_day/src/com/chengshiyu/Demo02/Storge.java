package com.chengshiyu.Demo02;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author 程世玉
 * @data 2022/4/29.
 * 仓库
 */
public class Storge extends Thread {
    private ArrayList<String> list = new ArrayList<String>();
    private static final int MAX_VALUE = 100;


    public static void main(String[] args) {
        LocalDate.now();

    }
}

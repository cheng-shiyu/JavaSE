package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 线程交错打印
 */
public class love5 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {

        });
        thread.start();

    }
    public static void printTo(){
        System.out.println(Thread.currentThread().getName() + "------> 执行");
    }
}



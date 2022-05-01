package com.chengshiyu.Demo;

/**
 * @author 程世玉
 * @data 2022/4/27.
 * wait等待
 * 这个只能作用域代码块，并不能作用与非锁代码块中
 */
public class love1 {
//    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        String lock = "锁对象";
        String s = "sss";
        System.out.println("同步前的代码");
        s.wait();
        synchronized (lock){
            System.out.println("开始等待前！！！");
            lock.wait();
            System.out.println("等待结束！！！");
        }
        System.out.println("同步之后的代码");
    }
}
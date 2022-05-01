package com.chengshiyu.Demo03;

public class love1 {
    public static void main(String[] args) {
        /*1、普通管*/
        new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }).start();


        /*获取线程名字*/
        System.out.println(new Thread(() -> {
            System.out.println(Thread.currentThread().getId());
        }).getName());

        // ======================================
        t1 x1 = new t1();
        x1.start();
        // ======================================
        t2 x2 = new t2();
        Thread thread = new Thread(x2);
        thread.start();
        System.out.println("Thread(x2).getName() = " + thread.getName());


    }
}

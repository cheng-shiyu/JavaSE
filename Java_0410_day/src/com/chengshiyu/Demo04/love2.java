package com.chengshiyu.Demo04;

public class love2 {
    public static void main(String[] args) {
        /*创建x1对象*/
        t1 t = new t1();

        t.start();
//
//        t.run();
//
//
//        t.interrupt();
//
//        t.isInterrupted();



        /*设置x1的名字*/
//        thread1.setName("线程一");
        /*创建线程对象*/
        Thread thread2 = new Thread(t);
        /*开启线程，开始运行*/
        thread2.start();

        System.err.println("main方法中的线程一 = "+thread2.getName());

        System.err.println("main方法中的线程二 = "+Thread.currentThread().getName());

        /**
         * 收获
         * 1、创建一个线程，为啥子main线程也要进去？
         * 2、t1构造方法中，会直接创建一个线程，那么意味着，创建对象这个过程也是一个线程？
         * 3、run方法中，我new出来一个Thread，将thread1对象放入其中，一个Thread1，一个原来的线程，
         * 问题就是，那他是让原来线程Thread-0工作呢还是Thread-1工作呢，
         * 猜测，如果Thread-0工作的，那么Thead-1同时还可以做其他的事情（实际情况是）
         */
    }
}

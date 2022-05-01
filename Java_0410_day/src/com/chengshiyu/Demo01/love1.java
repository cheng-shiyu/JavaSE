package com.chengshiyu.Demo01;

public class love1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + "执行该方法！！！");
        }
    }

//    @Override
//    public synchronized void start() {
//        super.start();
//    }
}

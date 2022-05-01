package com.chengshiyu.Demo03;

public class t2 implements Runnable{
//    public t2(Thread thread) {
//        System.out.println("t2构造方法中，Thread.currentThread.getName ： " + Thread.currentThread().getName());
//        System.out.println("t2构造方法中，this.getName ： " + thread.getName());
//    }


    @Override
    public void run() {
        System.out.println("====================");
        System.out.println("t2中Thread.currentThread() = " + Thread.currentThread().getName());
    }
}

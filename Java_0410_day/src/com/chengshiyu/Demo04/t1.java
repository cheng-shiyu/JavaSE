package com.chengshiyu.Demo04;

public class t1 extends Thread implements  Runnable{



    public t1() {
        System.out.println("t1构造方法中，Thread.currentThread.getName ： " + Thread.currentThread().getName());
//        Thread.currentThread().setName("主线程");
        System.out.println("t1构造方法中，this.getName ： " + this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法中，thread.currentThread.getName() ：" + Thread.currentThread().getName());
        System.out.println("run方法中，this.getName() ：" + this.getName());
//        try {
//            // 既然这样说，那么我这个线程停止，跟你Thread。currentThread有关系吗
//            this.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("this.isAlive() = "+this.isAlive());
//        System.out.println("Thread.currentThread().isAlive() = "+Thread.currentThread().isAlive());
    }





}

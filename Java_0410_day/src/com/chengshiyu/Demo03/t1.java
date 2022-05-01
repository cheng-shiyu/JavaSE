package com.chengshiyu.Demo03;

public class t1 extends Thread{
    public t1() {
        System.out.println("t1构造方法中，Thread.currentThread.getName ： " + Thread.currentThread().getName());
//        Thread.currentThread().sleep(1000);
        System.out.println("t1构造方法中，this.getName ： " + this.getName());

    }

    @Override
    public void run() {
        System.out.println("run方法中，thread.currentThread.getName() ：" + Thread.currentThread().getName());
        System.out.println("run方法中，this.getName() ：" + this.getName());

    }

    private String t4(){
        return "hello wordl";
    }
}

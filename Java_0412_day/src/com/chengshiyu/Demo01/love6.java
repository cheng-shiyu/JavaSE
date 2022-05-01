package com.chengshiyu.Demo01;

/**
 * 可见性
 */
public class love6 {
    public static volatile boolean flag = true;
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                t1();
            }
        });
        thread.start();

        Thread.sleep(1000);

        flag = false;
    }

    public static void t1() {
        System.out.println("stater");
        while (flag){

        }
        System.out.println("end");
    }

}

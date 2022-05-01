package com.chengshiyu.Demo;

/**
 * @author 程世玉
 * @data 2022/4/27.
 * notify唤醒等待的线程
 */
public class love3 {
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("开始等待");

                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    System.out.println("中断成功，线程结束");
                }
                System.out.println("等待结束");
            }
        });

        thread.start();


        Thread.sleep(1000);

        thread.interrupt();
    }
}
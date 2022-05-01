package com.chengshiyu.Demo1;

/**
 * @author 程世玉
 * @data 2022/4/28.
 * 通知过早的情况
 */
public class love1 {
    private static String lock = "锁对象";
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            synchronized (lock){
                try {
                    System.out.println("开始等待");
                    lock.wait();
                    System.out.println("等待结束");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("开始唤醒");
                lock.notify();
                System.out.println("唤醒结束");
            }
        });

        thread.start();
        thread1.start();

    }


}

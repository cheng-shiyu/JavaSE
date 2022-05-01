package com.chengshiyu.Demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 中断能否中断正在运行的线程
 */
public class love3 {
    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            /*让他休息5s，我看看我中断能不能打断他的运行*/
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1();
        });
        Thread thread1 = new Thread(() -> {
            t1();
        });
        thread.start();
        /*这种陷入计时等待状态的线程是可以被中断的*/
        thread.interrupt();
        thread1.start();
        /*这种普通的运行状态，可以尝试一下，看看是否能够被中断*/
        thread1.interrupt();
    }
    public synchronized static  void t1(){

        int a = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            a++;
        }
        System.out.println(a + Thread.currentThread().getName());
    }
}

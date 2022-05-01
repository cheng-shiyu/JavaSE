package com.chengshiyu.Demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * lock（） 方法
 * 这个方法是获取显示锁
 * unlock() 释放锁
 *
 *
 * 可重入锁
 */
public class love2 {
    private static Lock lock = new ReentrantLock();
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            t1();
        });
        Thread thread1 = new Thread(() -> {
            t1();
        });

        thread.start();
        thread1.start();
    }
    public static  void t1(){
        try {
            /*开始锁*/
            lock.lock();
            /*再次锁*/
            lock.lock();

            System.out.println("开始执行具体的业务代码" + Thread.currentThread().getName());
        } finally {
            System.out.println("开始释放锁对象" + Thread.currentThread().getName());
            lock.unlock();
        }

    }
}

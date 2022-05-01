package com.chengshiyu.Demo01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * lock（） 方法
 * 这个方法是获取显示锁
 * unlock() 释放锁
 */
public class love1 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Thread thread = new Thread(() -> {
            try {
                lock.lock();
                System.out.println("开始执行代码" + Thread.currentThread().getName());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread thread1 = new Thread(() -> {
            try {
                lock.lock();
                System.out.println("开始执行代码" + Thread.currentThread().getName());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });

        thread.start();
        thread1.start();
    }
}

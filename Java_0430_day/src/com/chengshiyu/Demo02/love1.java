package com.chengshiyu.Demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * condition 通知等待机制
 */
public class love1 {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "----》 " + "获取到锁对象了");
                System.out.println(Thread.currentThread().getName() + "----》 " + "准备陷入等待状态");
                condition.await();
                System.out.println(Thread.currentThread().getName() + "----》 " + "被激活");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "----》 " + "获取到锁对象了");
                System.out.println(Thread.currentThread().getName() + "----》 " + "准备陷入等待状态");
                condition.await();
                System.out.println(Thread.currentThread().getName() + "----》 " + "被激活");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }).start();

        Thread.sleep(1000);
        try {
            /*主线程获取锁*/
            lock.lock();
            /*主线程激活这个锁对象*/
            condition.signal();
        } finally {
            lock.unlock();
        }

    }
}

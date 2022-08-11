package com.chengshiyu.Demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * signal 和 signalAll 以及await等待
 */
public class love1 {
    // 创建一个线程，拿到锁，所以我应该先创建锁
    private static Lock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + "获得到锁");
                System.out.println(Thread.currentThread().getName() + "陷入等待状态");
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + "释放锁");
            }
        });

        System.out.println(thread.getName() + "开始启动");
        thread.start();
        /*主线程休息3s*/
        System.out.println(Thread.currentThread().getName() + "休眠了3s，现在开始唤醒" + thread.getName());
        Thread.sleep(3000);

        /*主线程获取到锁，然后激活锁*/
        try {
            lock.lock();
            condition.signal();
        } finally {
            lock.unlock();
        }
    }
}


package com.chengshiyu.Demo03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * 读锁
 */
public class love1 {

//    创建一个读锁对象
    private static ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public static void read() throws InterruptedException {
        ReentrantReadWriteLock.ReadLock readLock = lock.readLock();
        System.out.println(Thread.currentThread().getName() + "线程获取锁的时间为" + System.currentTimeMillis());
        TimeUnit.SECONDS.sleep(1000);
        readLock.unlock();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new Thread(()->{
                try {
                    read();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}

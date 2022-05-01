package com.chengshiyu.Demo01;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * trylock
 */
public class love5 {
    private static ReentrantLock lock1 = new ReentrantLock();
    private static ReentrantLock lock2 = new ReentrantLock();
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            t1();
        });
        Thread thread2 = new Thread(() -> {
            t1();
        });

        thread1.start();
        thread2.start();
    }
    public static void t1(){
        try {
            if (lock1.tryLock(1, TimeUnit.SECONDS)){
                System.out.println(Thread.currentThread().getName() + "---->" + "获取到锁对象");
                Thread.sleep(2000);
            }else {
                System.out.println(Thread.currentThread().getName() + "---->" + "等待五秒也没有获取到锁对象");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            if (lock1.isHeldByCurrentThread()) {
                lock1.unlock();
            }
        }

    }
}

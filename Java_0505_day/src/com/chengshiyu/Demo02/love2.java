package com.chengshiyu.Demo02;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * 两个线程交替运行
 */
public class love2 {

    public static void main(String[] args) {
        MyService myService = new MyService();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                try {
                    myService.printOne();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                try {
                    myService.printTwo();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    static class MyService {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        boolean flag = true;
        public void printOne() throws InterruptedException {
            try {
                lock.lock();
                if (flag){
                    condition.await();
                }
                print(Thread.currentThread());
                condition.signalAll();
                flag = !flag;
            } finally {
                lock.unlock();
            }
        }
        public void printTwo() throws InterruptedException {
            try {
                lock.lock();
                if (!flag){
                    condition.await();
                }
                print(Thread.currentThread());
                condition.signalAll();
                flag = !flag;
            } finally {
                lock.unlock();
            }

        }
    }

    static void print(Thread thread){
        System.out.println(thread.getName() + "运行啦");
    }
}

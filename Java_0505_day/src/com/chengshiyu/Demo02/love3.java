package com.chengshiyu.Demo02;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * ReetntranLock常用API
 * getHoldCount()  当前线程调用lock的次数
 */
public class love3 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(()->{
            for (int i = 0; i < 10; i++){
                lock.lock();
                System.out.println(lock.getHoldCount());
            }
        });
    }

    static void print(Thread thread){
        System.out.println(thread.getName() + "运行啦");
    }
}

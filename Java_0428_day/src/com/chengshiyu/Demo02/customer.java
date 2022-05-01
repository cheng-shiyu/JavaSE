package com.chengshiyu.Demo02;

import java.util.Random;

/**
 * @author 程世玉
 * @data 2022/4/28.
 * 消费者类
 */
public class customer extends Thread {
    private Storage storage;

    public customer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        /*锁着这个对象， 它指定的时候，其余不可以执行*/
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(2000));
                storage.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

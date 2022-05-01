package com.chengshiyu.Demo02;

import java.util.Random;

/**
 * @author 程世玉
 * @data 2022/4/28.
 * 生产者类
 */
public class provider extends Thread {
    private Storage storage;

    public provider(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true) {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(2000));
                storage.produce();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

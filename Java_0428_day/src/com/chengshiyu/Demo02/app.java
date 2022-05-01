package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/28.
 */
public class app {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread thread = new Thread(new customer(storage), "1号");
        Thread thread1 = new Thread(new customer(storage), "2号");
        Thread thread2 = new Thread(new customer(storage), "3号");
        Thread thread3 = new Thread(new provider(storage), "1号");
        Thread thread4 = new Thread(new provider(storage), "2号");
        thread.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}

package com.chengshiyu.Demo02;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * 自定义线程工厂
 */
public class love5 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getId() + "----" + "任务开始执行");
        };

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5,
                5,
                0,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                System.out.println(thread.getId() + "设置为了守护先储层");
                return thread;
            }
        });

        //提交5个任务, 当给当前线程池提交的任务超过5个时,线程池默认抛出异常
        for (int i = 0; i < 5; i++) {
            poolExecutor.execute(task);

        }


        Thread.sleep(1000);
    }
}

package com.chengshiyu.Demo02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 程世玉
 * @data 2022/5/6.
 */
public class love1 {
    public static void main(String[] args) {

        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        /*向线程池中提交20个任务*/
        for (int i = 1; i <= 20; i++){
            threadPool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println( Thread.currentThread().getName() + "--"
                            + Thread.currentThread().getId()
                            + "---" + "任务开始执行");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}

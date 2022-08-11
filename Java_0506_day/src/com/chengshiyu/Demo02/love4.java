package com.chengshiyu.Demo02;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * 延时加载 + 固定频率
 */
public class love4 {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        /**
         * Runnable–要执行的任务
         * initialDelay–延迟第一次执行的时间
         * period–一次执行终止与下一次执行开始之间的延迟
         * unit–initialDelay和delay参数的时间单位
         */
        pool.scheduleWithFixedDelay(()->{
            System.out.println(Thread.currentThread().getId() + "--" + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },2,1, TimeUnit.SECONDS);
    }
}

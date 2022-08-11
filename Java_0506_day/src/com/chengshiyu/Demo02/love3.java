package com.chengshiyu.Demo02;

import java.time.LocalDate;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * 延时任务 + 固定频率
 */
public class love3 {
    public static void main(String[] args) {
        /*线程池中有五个线程，每次执行的可能都不太一样*/
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(10);
        pool.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getId() + "---" + LocalDate.now());
        },2,3, TimeUnit.SECONDS);

        // 前面是延时多久，后面那个是等待多久再次执行
        // 缺点是，如果我等待是3s，但是我线程执行完毕需要5s，那么它按照结束时间等待3s还是从开始时间等待3s呢？
        // 很显然，它是从开始时间等待3s，但是我线程执行了5s超过了怎么办呢，它会一直等待，只要你这个线程执行完毕，
        // 下一个线程立刻就执行，这就是我们上面这个代码的情况


        // 需求，我想要改变这种情况，我想让他等待我当前线程执行完毕之后再开始计时，请看love4
    }
}

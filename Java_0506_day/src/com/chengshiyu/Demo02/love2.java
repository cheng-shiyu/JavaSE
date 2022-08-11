package com.chengshiyu.Demo02;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * 延时任务,延时两秒开始工作
 */
public class love2 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.schedule(()->{
            System.out.println(Thread.currentThread().getId() + "----" + System.currentTimeMillis());
        },2, TimeUnit.SECONDS);




    }
}

package com.chengshiyu.Demo01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 程世玉
 * @data 2022/5/12.
 * 回调函数，采用lambda方式
 * 开启一个异步方法，模拟回调函数
 */
public class love1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"开始运行,开启异步方法");

        // 创建一个线程池,开启五个线程
        ExecutorService pool = Executors.newFixedThreadPool(5);

        CallBack callBack = new CallBack() {
            @Override
            public String callBack(String message) {
                System.out.println("callBack --- " + message);
                return message;
            }
        };
        pool.submit(()->{
            Request request = new Request();
            try {
                request.send(callBack,"你好呀，很高兴见到你");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println(Thread.currentThread().getName()+"结束运行,异步方法仍在运行");

    }
}

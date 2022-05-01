package com.chengshiyu.Demo02;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Callable接口的使用
 */
public class love2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<>() {
            @Override
            public String call() throws Exception {
                return t1();
            }
        };

        // FutureTask实现的是RunnableFuture接口
        // RunnableFuture接口实现的是Runable接口
        // 也就是说，无论你多线程想要以那种形式开启多线程，最终都是要用我的这个Runable接口
        // 接口的概念，其实就是说，
        FutureTask<String> task = new FutureTask<String>(callable);

        new Thread(task).start();

        String s = task.get();


        System.out.println(s);
    }


    public static String t1(){
        return "hello world";
    }
}

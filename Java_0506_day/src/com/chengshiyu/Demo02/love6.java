package com.chengshiyu.Demo02;

import java.util.concurrent.*;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * 线程池扩展
 */
public class love6 {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(5, 5, 0, TimeUnit.SECONDS,
                new SynchronousQueue<>()) {
            @Override
            protected void beforeExecute(Thread t, Runnable r) {
                System.out.println("线程执行之前处理一部分业务");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void afterExecute(Runnable r, Throwable t) {
                System.out.println("线程处理完毕之后再执行一部分代码");
                System.out.println("======================");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void terminated() {
                System.out.println("线程池退出的时候再执行一部分代码");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 0; i < 10; i++){
            int a = i;
            Runnable task = ()->{
                System.out.println("任务" + a + "开始执行");
            };
            Future<?> submit = poolExecutor.submit(task);
            try {
                System.out.println(submit.get() == null ? "线程是Runable接口，没有返回值": submit.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        poolExecutor.shutdown();
    }
}

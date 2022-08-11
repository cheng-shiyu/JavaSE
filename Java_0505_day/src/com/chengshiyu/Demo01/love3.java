package com.chengshiyu.Demo01;

import java.util.concurrent.*;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * Callable 和 Future
 */
public class love3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        /*休眠一段时间，相当于执行了一段业务代码*/
        Thread.sleep(3000);
        return 1;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        FutureTask<Integer> task = new FutureTask<>(new love3());
        pool.submit(task);

        System.out.println(task.get());
    }
}

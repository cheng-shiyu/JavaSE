package com.chengshiyu.Demo01;

import java.util.concurrent.*;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * Callable 和 Future
 */
public class love1 implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            /*休眠1秒*/
            Thread.sleep(1000);
            return 2;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        love1 l = new love1();

        Future<Integer> submit = executorService.submit(l);
        System.out.println(submit.get());

    }

}

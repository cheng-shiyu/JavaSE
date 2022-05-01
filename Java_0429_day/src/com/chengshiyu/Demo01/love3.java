package com.chengshiyu.Demo01;

import java.util.Date;

/**
 * @author 程世玉
 * @data 2022/4/29.
 */
public class love3 {
    static ThreadLocal<Date> threadLocal = new MyThreadLocal();
    /*重新创建一个类，重写initialValue方法，然后在这里面重新编写就可以了*/
    static class MyThreadLocal extends ThreadLocal{
        @Override
        protected Date initialValue() {
            /*1000 是 1毫秒  60 1分钟， 15 是15分钟*/
            /*提前15分钟！！！*/
            return new Date(System.currentTimeMillis() - 1000*60*15);
        }
    }


    public static void main(String[] args) {
        t s = new t();
        Thread thread = new Thread(s);
        thread.start();
    }
    static class t extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                System.out.println(threadLocal.get() + "--->" + i + ":" + Thread.currentThread().getName());
                threadLocal.set(new Date());
                if (threadLocal.get() == null) {
                    threadLocal.set(new Date());
                }
            }
        }
    }
}

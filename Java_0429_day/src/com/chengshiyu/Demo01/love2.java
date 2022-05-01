package com.chengshiyu.Demo01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 程世玉
 * @data 2022/4/29.
 * ThreadLocal基本使用
 */
public class love2 {
    /*创建一个threalocal*/
    static ThreadLocal<SimpleDateFormat> threadLocal =
            new ThreadLocal<>();

    static SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++){
            t s = new t(new Date());
            Thread thread = new Thread(s);
            thread.start();
        }

    }

    static class t extends Thread {
        private Date time;

        public t(Date time) {
            this.time = time;
        }

        @Override
        public void run() {
            SimpleDateFormat format = threadLocal.get();
            if (format == null) {
                format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
                threadLocal.set(format);
            }

            String date = format.format(time);
            System.out.println(date);
        }
    }
}

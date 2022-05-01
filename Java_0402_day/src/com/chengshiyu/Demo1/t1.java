package com.chengshiyu.Demo1;

/**
 * @Description: 线程一
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/4/2 11:57
 */
public class t1 extends Thread {

    static int n = 1;
    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for (int i = 1; i<10000;i++) {
            tank.sum += 1;
            System.out.println("哈布斯添加完后有" + tank.sum + "桶水");
        }

        long end = System.currentTimeMillis();
        System.out.println("t1运行时间" + (end - start));
    }
}

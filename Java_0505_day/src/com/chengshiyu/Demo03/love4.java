package com.chengshiyu.Demo03;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * 线程组的概念
 */
public class love4 {
    public static void main(String[] args) {
        /*获取当前线程组*/
        /*如果我们创建一个线程，没有指定线程组，那么默认就是*/
        ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
        System.out.println(mainGroup);
        System.out.println("=======================");

        /*说明就是main线程组里面的*/
        Thread thread = new Thread(() -> {
        });
        System.out.println(thread);
        System.out.println("=======================");

        /*定义线程组*/
        ThreadGroup group1 = new ThreadGroup("group1");
        System.out.println(group1);
        System.out.println("=======================");
        /*定义线程组，通知指定父组*/
        ThreadGroup group2 = new ThreadGroup(group1, "group2");
        System.out.println(group2);
        System.out.println(group2.getParent() == group1);
        System.out.println("=======================");

        /*创建线程的时候指定线程组*/
        Thread thread1 = new Thread(group1, () -> {

        });
        System.out.println(thread1);


    }
}


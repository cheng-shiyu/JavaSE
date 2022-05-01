package com.chengshiyu.Demo02;

/**
 * @author 程世玉
 * @data 2022/4/19.
 * 验证，如果俩方法，锁的是同一个对象，会发生什么事情
 */
public class love5 {
    public static void main(String[] args) {
        love5 l = new love5();
        /*预测，如果俩方法都没有加锁，那么俩线程应该是交错运行，但是我加锁了，并且都是对同一个对象，那么试试看看行不行*/
        new Thread(l::t1).start();

        new Thread(l::t2).start();

        /*结果，很明显，就是分开运行的，同步运行的*/
        /*结论就是，如果你是按照对象进行加锁，那么，同一对象，无论是几个方法，都只能同时对一个方法进行编写*/
    }

    /*俩都是this，如果同一个对象，调用不同的方法，但是他们的执行对象都是this，会出现什么情况*/
    public synchronized void t1(){
        int num = 100;
        synchronized (this) {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = gogogogogo");
            }
        }
    }
    public void t2(){
        int num = 100;
        synchronized (this) {
            for (int i = 0; i < num; i++) {
                System.out.println(Thread.currentThread().getName() + " = gogogogogo");
            }
        }
    }

}

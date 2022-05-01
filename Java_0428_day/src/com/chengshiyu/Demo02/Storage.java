package com.chengshiyu.Demo02;

import java.util.LinkedList;

/**
 * @author 程世玉
 * @data 2022/4/28.
 * 仓库类
 */
public class Storage {
    /*仓库最大容量是10*/
    private final int MAX_SIZE = 10;

    /*当临时仓库*/
    private final LinkedList<Object> list = new LinkedList<>();

    /*生产者调用的方法*/
    public void produce(){
        synchronized (list){
            if (list.size() >= MAX_SIZE){
                try {
                    System.out.println("仓库已经满了，停止生产");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            /*往仓库里面添加元素*/
            list.add(new Object());
            /*声明是谁生成的*/
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }

    /*消费者调用的方法*/
    public void consumer(){
        synchronized (list){
            if (list.size() <= 0){
                try {
                    System.out.println("仓库为空，无法进行消费");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + list.size());
            list.notifyAll();
        }
    }


}

package com.Demo01;

import java.util.LinkedList;

public class goods {

    // 仓库容量
    private  final int MAX_SIZE = 50;
    // 仓库存储的载体
    private LinkedList<Object> list = new LinkedList<>();

    // 已经上产的个数
    private static int flag = 0;


    public void produce() {
        synchronized (list) {
            while (flag >= MAX_SIZE || list.size() != 0) {
                System.out.println("已经上产够50个了");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
                flag++;
                list.add(new Object());
                System.out.println("生产了一个");
                System.out.println("当前共生产了" + flag + "个");
                list.notifyAll();
        }
    }

    public void consume() {
        synchronized (list) {
            while (list.size() == 0) {
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("消费了一个");
            list.notifyAll();
        }
    }
}




































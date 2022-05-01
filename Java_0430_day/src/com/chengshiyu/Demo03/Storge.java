package com.chengshiyu.Demo03;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 程世玉
 * @data 2022/4/30.
 * 仓库
 */
public class Storge {
    private LinkedList<Object> list = new LinkedList<>();
    private final Integer MAX_VALUE = 10;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();

    private Random random = new Random();

    public void customer() {
        try {
            lock.lock();
            Thread.sleep(random.nextInt(2000));
            if (list.size() <= 0) {
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "---> 消费一个");
            list.removeLast();
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void provider() {

        try {
            lock.lock();
            Thread.sleep(random.nextInt(2000));
            if (list.size() >= MAX_VALUE) {
                condition1.await();
            }
            System.out.println(Thread.currentThread().getName() + "---> 生产一个");
            list.add(new Object());
            condition1.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

package com.chengshiyu.Demo03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 * 读写互斥
 */
public class love3 {
    static class Service {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        public void write() {
            try {
                readWriteLock.writeLock().lock();
                System.out.println("获取到写锁，开始写数据" + System.currentTimeMillis());
                TimeUnit.SECONDS.sleep(3); //模拟写取数据用时3s；
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }

        public void read() {
            try {
                readWriteLock.readLock().lock();
                System.out.println("获取到读锁，开始读取数据" + System.currentTimeMillis());
                TimeUnit.SECONDS.sleep(3); //模拟读取数据用时3s；
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.readLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        Service service = new Service();
//创建五个线程调用write方法；
        new Thread(new Runnable() {
            @Override
            public void run() {
                service.read();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                service.write();
            }
        }).start();
    }
}

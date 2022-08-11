package com.chengshiyu.Demo03;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author 程世玉
 * @data 2022/5/5.
 */
public class love2 {
    static class Service{
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        public void write(){
            try {
                readWriteLock.writeLock().lock();
                System.out.println("获取到写锁，开始写数据"+System.currentTimeMillis());
                        TimeUnit.SECONDS.sleep(3); //模拟写取数据用时3s；
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                readWriteLock.writeLock().unlock();
            }
        }
    }

    public static void main(String[] args) {
        Service service = new Service();
        for (int i = 0; i < 10; i++){
            new Thread(()->{
                service.write();
            }).start();
        }
    }
}

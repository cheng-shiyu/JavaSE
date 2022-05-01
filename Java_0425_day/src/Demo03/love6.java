package Demo03;

import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 原子类，AtomicIntegerArray
 * 原子类的本质就是采用CAS原理，如果存在则类似于回滚的操作，
 * 又或者是，我设置一个奶酪，我要吃奶酪之前，我会先进行一次比较，看看我这个奶酪是否干净，是否被修改过，如果没有被
 * 修改过，那么我们再开始吃，再进行修改
 *
 * 多线程中使用AtomicIntegerArray
 * 目标，将数组中每个元素自增1000次
 */
public class love6 {

    public static  int[] arr = new int[10];

    public static void main(String[] args) throws InterruptedException {

        /*定义一个线程数组*/
        Thread[] threads = new Thread[10];

        /*给每一个线程对象设置对象*/
//        for (Thread thread : threads) {
//            thread = new t();
//        }
        for (int i = 0; i < threads.length; i++){
            threads[i] = new t();
        }
        /*开启子线程*/
        for (Thread thread : threads) {
            thread.start();
        }
        System.out.println("执行了吗");

        /*等子线程执行完毕之后，主线程查看里面数组的值*/
        for (Thread thread : threads) {
            /*等待其运行完毕*/
            thread.join();
        }

        System.out.println(Arrays.toString(arr));

    }


    static class t extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++){
                for (int j = 0; j < arr.length; i++){
                    arr[j] += 1;
                }
            }
        }
    }


}

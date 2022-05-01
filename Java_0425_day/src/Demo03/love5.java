package Demo03;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * 原子类，AtomicIntegerArray
 * 原子类的本质就是采用CAS原理，如果存在则类似于回滚的操作，
 * 又或者是，我设置一个奶酪，我要吃奶酪之前，我会先进行一次比较，看看我这个奶酪是否干净，是否被修改过，如果没有被
 * 修改过，那么我们再开始吃，再进行修改
 */
public class love5 {
    public static void main(String[] args) {
        /*创建一个长度为10的原始数组*/
        AtomicIntegerArray array = new AtomicIntegerArray(10);
        System.out.println(array); //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // 修改数组的元素的值，并把数组元素加上某个值
        System.out.println(array.addAndGet(0, 1));  // 1
        // 返回执行位置的元素
        System.out.println(array.get(0));  // 1
        // 设置指定位置的元素值
        array.set(9,10);
        System.out.println(array.get(9)); // 10

        // 修改数组元素的新值的同时返回数组元素的旧值
        System.out.println(array.getAndSet(0, 156)); // 1


        // CAS操作
        /*如果当前下标的值为10，那么就修改为1000，反正则不进行修改，类似于Redis中的setnx*/
        array.compareAndSet(9,10,1000);

        // 自增/自减
        // 先增加，再获取
        System.out.println(array.get(0));  // 156
        System.out.println(array.incrementAndGet(0)); // 157
        // 先获取，再增加
        System.out.println(array.getAndIncrement(0)); // 157
        System.out.println(array.get(0));  // 158

        // 下减再获取
        System.out.println(array.decrementAndGet(0));
        // 先获取再减
        System.out.println(array.getAndDecrement(0));

    }
}

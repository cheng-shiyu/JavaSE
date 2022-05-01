package Demo03;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * volatile的非原子性
 * 如果是这种情况，当线程多的时候，会出现抢占资源的情况，那么我们加上volatile也是没有用的
 * 想要解决这个问题，我们可以加锁synchronized 虽然不可以锁变量，但是可以锁方法，锁对象，锁类
 * 把这个方法加上锁就可以保证原子性了
 *
 * 上面这种加锁的方式可以解决这个问题，同样的，我们也是可以使用原子类进行加锁
 */
public class love4 {
    public static void main(String[] args) {
        t sx = new t();
        /*开启线程*/
        for (int i = 0; i < 1000; i++){
            new t().start();
        }
    }

    static class t extends Thread{
         static int count;

        public synchronized static void g(){
            for (int i = 0; i < 1000; i++){
               count++;
            }
            System.out.println(Thread.currentThread().getName() + "----> " + count);
        }

        @Override
        public void run() {
            g();
        }
    }
}


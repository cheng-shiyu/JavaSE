package Demo03;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * volatile的非原子性
 * 如果是这种情况，当线程多的时候，会出现抢占资源的情况，那么我们加上volatile也是没有用的
 */
public class love2 {
    public static void main(String[] args) {
        t sx = new t();
        /*开启线程*/
        for (int i = 0; i < 1000; i++){
            new t().start();
        }
    }

    static class t extends Thread{
        volatile static int count;

        public static void g(){
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


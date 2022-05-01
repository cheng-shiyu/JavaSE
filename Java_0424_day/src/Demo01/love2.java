package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 抛出异常的时候是否会释放锁
 */
public class love2 {
    public static void main(String[] args) throws InterruptedException {
        love2 l = new love2();
        new Thread(()->{
            l.m1();
        }).start();

        Thread.sleep(100);
        love2.m2();
    }

    /*类锁，锁住类*/
    public void m1() {
        synchronized (love2.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---->" +
                        i);
                if (i == 50) {
//                    /*此刻会抛出异常，看看其他线程是否可以获取到锁*/
                    Integer.parseInt("abfasoj");
                }
            }
        }
    }


    /*类锁，锁住类*/
    public synchronized static void m2() {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "---->" +
                        i);
            }
    }
}

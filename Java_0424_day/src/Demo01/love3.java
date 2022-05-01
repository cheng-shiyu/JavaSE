package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 死锁问题
 */
public class love3 {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();

        new Thread(()->{
            synchronized (o1){
                System.out.println(Thread.currentThread().getName() + "--->"
                + "获取到o1，同时还需要获取o2");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName() + "--->"
                            + "获取到o2,可以你想干的");
                }
            }
        }).start();

        new Thread(()->{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName() + "--->"
                        + "获取到o2，同时还需要获取o1");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName() + "--->"
                            + "获取到o1,可以你想干的");
                }
            }
        }).start();
    }

    public void t1(){
        Object o1 = new Object();
        Object o2 = new Object();
    }
}

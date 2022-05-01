package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 线程排队，等待前面执行完毕之后再执行 方式二
 */
public class love5 {
    public static void main(String[] args) {
        love5 l = new love5();
        for (int i = 0; i < 10; i++){
            new Thread(()->{
                l.t1();
            }).start();
        }
    }
    public void t1(){
        /*锁对象，不同的对象则不会出现这种情况*/
//        synchronized (this){
            for (int i = 0; i < 50; i++){
                System.out.println(Thread.currentThread().getName()+"---->" + i);
            }
            System.out.println("================");
//        }

    }
}

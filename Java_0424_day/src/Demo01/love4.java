package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 线程排队，等待前面执行完毕之后再执行
 */
public class love4 {
    public static void main(String[] args) {
        Thread prev = Thread.currentThread();
        for (int i = 0; i < 10; i++){
            joinThread currentThread = new joinThread(prev);
            currentThread.start();
            /*如果线程没有执行完毕，让他继续执行完毕*/
            prev = currentThread;
        }
    }

    static class joinThread extends Thread{
        private Thread prev;

        public joinThread(Thread prev) {
            this.prev = prev;
        }

        @Override
        public void run() {
            try {
                /*等待这个线程执行完毕之后其他线程才能执行*/
                prev.join();
                for (int i = 1; i <= 50;i++){
                    System.out.println(Thread.currentThread().getName() + "---->" + i);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void t1(Thread thread){
        for (int i = 0; i < 50; i++){
            System.out.println(Thread.currentThread().getName()+"---->" + i);
        }
    }
}

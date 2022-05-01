package Demo03;

/**
 * @author 程世玉
 * @data 2022/4/25.
 * votalite关键字初见面
 */
public class love1 {
    public static void main(String[] args) throws InterruptedException {
        t1 a = new t1();
        /*开启线程*/
        new Thread(()->{
            a.go();
        }).start();

        Thread.sleep(1000);
        /*主线程修改flag，这样就可以让go停止*/
        a.flag = false;
    }


    public static class t1{
        volatile boolean flag = true;

        int i = 0;
        public void go(){
            System.out.println(Thread.currentThread().getName() +"-----> 循环开始！！！");
            while (flag){
            }
            System.out.println(Thread.currentThread().getName() + "---> 循环结束！！！");
        }
    }
}

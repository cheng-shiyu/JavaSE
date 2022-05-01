package Demo01;

/**
 * @author 程世玉
 * @data 2022/4/24.
 * 脏读
 */
public class love1 {
    public static void main(String[] args) throws InterruptedException {
        t1 t = new t1();
        new Thread(()->{
            try {
                t.setValue("王文静","654321");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // 如果让主线程等待一会，等待其运行完毕呢？
        Thread.sleep(100);

        // 主线程调用get方法获取之，另一个线程同时修改值，会出现什么情况呢？
        t.getValue();
    }


    static class t1{
        private String username="程世玉";
        private String password="123456";

        public void getValue(){
            System.out.println(Thread.currentThread().getName() + "--->" +
                    username + "---" + password);
        }

        public void  setValue(String username,String password) throws InterruptedException {
            this.username = username;
            Thread.sleep(1000);
            this.password = password;
            System.out.println(Thread.currentThread().getName() + "--- setter --->" +
                    username + "----" + password);
        }
    }
}

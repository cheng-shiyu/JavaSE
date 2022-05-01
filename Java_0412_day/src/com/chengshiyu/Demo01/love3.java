package com.chengshiyu.Demo01;

public class love3 {
    public static void main(String[] args) {
        Thread previousThread = Thread.currentThread();
        for (int i = 0; i < 10; i++){
            joinThread curthread = new joinThread(previousThread);
            curthread.start();
            previousThread = curthread;
        }
    }
    static class joinThread extends Thread {
        private Thread previousThread;

        public joinThread(Thread previousThread) {
            this.previousThread = previousThread;
        }

        @Override
        public void run() {
            try {

                /*线程B中出现线程A.join， 则说明，线程B要等待线程A执行完毕再执行线程B*/
                previousThread.join();

                System.out.println(Thread.currentThread().getName() + "love love");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

package com.chengshiyu.Demo01;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author 程世玉
 * @data 2022/5/6.
 */
public class ThreadUtils {
    public static Path getLockFile(){
        return Paths.get("", "tmp.lock");
    }

    public static void sleepTime(int num){
        for (int i = 1; i <= num; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "已经运行了" + i + "秒");
        }
    }

}

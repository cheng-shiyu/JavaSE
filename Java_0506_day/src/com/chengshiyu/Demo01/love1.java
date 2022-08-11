package com.chengshiyu.Demo01;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author 程世玉
 * @data 2022/5/6.
 * Hook钩子线程
 */
public class love1 {
    public static void main(String[] args) throws InterruptedException {
        //1)注入Hook线程,在程序退出时删除.lock文件
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("线程结束的时候会删除lock文件");
            boolean delete = getLockFile().toFile().delete();
            if (delete){
                System.out.println("删除成功！！！");
            }
        }));

        // 2)判断lock文件是否存在，如果存在，则抛出异常
        if (getLockFile().toFile().exists()){
            throw new RuntimeException("已经启动了，先关闭");
        }else {
            // 说明是第一次存在，那么我们就创建一个lock文件
            try {
                boolean newFile = getLockFile().toFile().createNewFile();
                if (newFile){
                    System.out.println("线程启动的时候创建了lock文件，路径:"+ getLockFile());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        // 3) 模拟线程处理文件
        for (int i = 0; i < 10; i++){
            Thread.sleep(1000);
            System.out.println("线程运行了" + (i + 1) + "秒了");
        }
    }
    private static Path getLockFile(){
        return Paths.get("", "tmp.lock");
    }
}

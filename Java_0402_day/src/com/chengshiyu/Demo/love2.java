package com.chengshiyu.Demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Description: 对于文件的操作
 * @Author: 程世玉
 * @Param:
 * @return:
 * @date: 2022/4/2 9:15
 */

public class love2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C://file//公告接口.md");
        if (file.canRead()){
            /*创建流对象*/
            FileInputStream inputStream = new FileInputStream(file);
            /*得到缓冲器*/
            byte[] arr = new byte[8092];


            int len = 0;
            while ((len = inputStream.read(arr)) != -1){
                System.out.println((char)len);
            }
        }else {
            System.out.println("文件不可以查看");
        }
    }
}

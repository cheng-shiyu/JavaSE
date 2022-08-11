package com.chegnshiyu.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 程世玉
 * @data 2022/8/3.
 * 对于文件流的一些操作
 */
public class love2 {
    public static void main(String[] args) throws IOException {

        String property = System.getProperty("user.dir");
        String inputPath = property + "/file/input.txt";
        String ouputPath = property + "/file/ouput.txt";

        // 从源文件读取数据流
        FileInputStream inputStream = new FileInputStream(inputPath);
        // 将数据流输出到文件中
        FileOutputStream fileOutputStream = new FileOutputStream(ouputPath);

        // 缓冲区
        byte[] buf = new byte[1024];

        int flag = 0;

        while ((flag = inputStream.read(buf)) != -1){
            // 读取缓冲区内容，读取多少呢，flag是一次读取的数量
            fileOutputStream.write(buf,0,flag);
        }

        inputStream.close();
        fileOutputStream.close();
    }
}

package com.chengshiyu.Demo01;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @author 程世玉
 * @data 2022/4/29.
 * 通过流在两个线程之间进行通信
 */
public class love1 {
    public static void main(String[] args) throws IOException {
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();

        inputStream.connect(outputStream);

        /*创建两个线程，一个在流中写入数据，一个在流中读取数据*/
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    writerDate(outputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            try {
                readData(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();


    }

    /**
     * 输入与输出的理解
     * 输入，是将目标文件读取出来,有读的功能
     * 输出，是将流读取到文件中，有写的功能
     */
    public static void writerDate(PipedOutputStream outputStream) throws IOException {
        /*我们这里采用输出流的方式，然后读取出来，整到目的地*/
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            stringBuffer.append(i).append(" ");
        }
        String s = stringBuffer.toString();
        byte[] bytes = s.getBytes();
        outputStream.write(bytes);
        outputStream.close();
    }


    /*输出流，从管道里面读取数据*/
    public static void readData(PipedInputStream input) throws IOException {
        /*从管道中读取0-100*/
        byte[] bytes = new byte[1024];
        int len = input.read(bytes); //返回读到的字节数，如果没有读到任何数据返回-1
        while (len != -1) {
            //把bytes数组中从0开始到len个字节转换为字符串打印出来
            System.out.println(new String(bytes, 0, len));
            len = input.read(bytes); //继续从管道中读取数据
        }
        input.close();
    }
}

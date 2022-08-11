package com.chegnshiyu.Demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author 程世玉
 * @data 2022/8/3.
 * 采用nio对文件进行操作
 */
public class love3 {
    public static void main(String[] args) throws IOException {

        String property = System.getProperty("user.dir");
        String inputPath = property + "/file/input.txt";
        String ouputPath = property + "/file/ouput.mp4";

        // 从源文件读取数据流 ,这个是只读
        FileChannel inputChannel = new FileInputStream("C:\\Users\\程世玉\\Desktop\\智能电气\\数据上传统计\\2022.06.06开会\\VID_20220606_175859.mp4").getChannel();
        // 将数据流输出到文件中，这个是只写
        FileChannel outputChannel = new FileOutputStream(ouputPath).getChannel();

        ByteBuffer buffer = ByteBuffer.allocate(1024);

        long size = inputChannel.size();
        for (long left = size; left > 0;){
            System.out.println("position:" + (size - left) + " left:" + left);
            // 位置，然后读取多长，然后读取到输出流中
            left -= inputChannel.transferTo(size - left,left,outputChannel);
        }
    }
}

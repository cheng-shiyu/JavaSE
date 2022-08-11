package com.chegnshiyu.Demo01;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author 程世玉
 * @data 2022/8/3.
 */
public class love1 {
    public static void main(String[] args) throws IOException {

        String property = System.getProperty("user.dir");
        String path = property + "/file/a.txt";
//        User user1 = new User("程世玉1", "123456");
//        User user2 = new User("程世玉2", "123456");
//        User user3 = new User("程世玉3", "123456");
//        User user4 = new User("程世玉4", "123456");
//

//
//        RandomAccessFile accessFile = new RandomAccessFile(path, "rw");
//
//        accessFile.write(user1.getUsername().getBytes(StandardCharsets.UTF_8));
//        accessFile.write(user1.getPassword().getBytes(StandardCharsets.UTF_8));
//        accessFile.write(user2.getUsername().getBytes(StandardCharsets.UTF_8));
//        accessFile.write(user2.getPassword().getBytes(StandardCharsets.UTF_8));
//        accessFile.close();



        // 开始进行只读操作
        RandomAccessFile r = new RandomAccessFile(path, "r");
        int len = 10;
        r.skipBytes(16);

        System.out.println("开始输出第二个节点的信息");
        String str = "";
        for (int i = 0; i < len; i++){
            str = "" + r.readByte();
        }
        System.out.println("username : " + str.toString());

    }
}

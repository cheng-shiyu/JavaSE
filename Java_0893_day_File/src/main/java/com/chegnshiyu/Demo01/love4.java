package com.chegnshiyu.Demo01;

import java.io.*;

/**
 * @author 程世玉
 * @data 2022/8/3.
 * 序列化和反序列化对象，
 */
public class love4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String property = System.getProperty("user.dir");
        String inputPath = property + "/file/input.txt";
        String ouputPath = property + "/file/ouput.txt";

        // 序列化对象
        FileOutputStream fileOutputStream = new FileOutputStream(ouputPath);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        User user = new User("程世玉", "12390");

        objectOutputStream.writeObject(user);

        objectOutputStream.close();
        fileOutputStream.close();

        // 反序列化对象  注意，这里我的路径是outputPath，原因是如果我手动复制这个outputPath文件的内容到inputPath文件中的时候，会解析错误！！
        // 结论，序列化和反序列化，都是二进制文件了，随意的拷贝二进制文件，是会破坏他的一致性的
        FileInputStream fileInputStream = new FileInputStream(ouputPath);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object o = objectInputStream.readObject();
        System.out.println("反序列化得到的结果： " + o);
        objectInputStream.close();
        fileInputStream.close();
    }
}

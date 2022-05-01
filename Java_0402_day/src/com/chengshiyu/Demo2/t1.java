package com.chengshiyu.Demo2;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class t1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

//        File file = new File("c");
//        if (!file.exists()) {
//            file.mkdirs();
//        }
//        System.out.println(file.getAbsoluteFile());

//        properties.load(new FileInputStream("/config.properties"));

//        InputStream asStream = t1.class.getResourceAsStream("config.properties");
//
        File file = new File("Java_0402_day");
        System.out.println(file.getAbsoluteFile());
//        if(!file.exists()){
//            System.out.println("文件找不到");
//        }

//        FileInputStream fileInputStream = new FileInputStream("Java_0402_day/src/com/chengshiyu/Demo2/config.properties");

        properties.load(new FileInputStream("Java_0402_day/src/com/chengshiyu/Demo2/config.properties"));
        String username = properties.getProperty("username");
        System.out.println(username);
    }
}

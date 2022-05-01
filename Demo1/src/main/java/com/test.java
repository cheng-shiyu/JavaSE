package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test {
    public static void main(String[] args) throws Exception {
        /*创建驱动*/
        Class.forName("com.mysql.cj.jdbc.Driver");
        /*进行连接*/
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chengshiyu", "root", "123456");
        /*创建sql语句以及 PreparedStatement对象*/
        String sql = "update user_table set password = ? where username = ?";
        PreparedStatement prepareStatement = connection.prepareStatement(sql);
        /*填充占位符*/
        prepareStatement.setString(1,"Rose");
        prepareStatement.setString(2,"Jack");
        /*执行sql语句*/
        int i = prepareStatement.executeUpdate();
        if (i != 0){
            System.out.println("修改成功");
        }
        /*关闭连接*/
        prepareStatement.close();
        connection.close();
    }
}

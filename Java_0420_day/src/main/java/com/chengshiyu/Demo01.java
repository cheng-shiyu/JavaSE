package com.chengshiyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author 程世玉
 * @data 2022/4/19.
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/chengshiyu";
        String password = "123456";
        String username = "root";

        // 连接数据库
        Connection connection = DriverManager.getConnection(url, username, password);

        // 创建数据库操作对象
        String sql = "insert into user(id,name) values (?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"1");
        preparedStatement.setString(2,"程世玉");

    }
}

package com.chengshiyu.entity;

import java.util.Objects;

/**
 * @author 程世玉
 * @data 2022/4/22.
 */
public class User {
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        User o1 = (User) o;
        return this.username == o1.username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword());
    }
}

package com.demo;

/**
 * Created by yzeng on 19/12/2016.
 */
public class User {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456";

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

    User() {

    }

    User (String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public Boolean isValid()
    {
//        return true;
        System.out.println(username);
        System.out.println(password);
        return username.equals(USERNAME) && password.equals(PASSWORD);
    }
}

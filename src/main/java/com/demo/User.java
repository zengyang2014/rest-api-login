package com.demo;

/**
 * Created by yzeng on 19/12/2016.
 */
public class User {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456";

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    User() {

    }

    User (String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public Boolean checkUser()
    {
//        return true;
        return name.equals(USERNAME) && password.equals(PASSWORD);
    }
}

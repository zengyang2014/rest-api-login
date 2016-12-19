package com.demo;

/**
 * Created by yzeng on 19/12/2016.
 */
public class CheckUser {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "123456";

    public Boolean checkUser(String user, String password)
    {
        if(user.equals(USERNAME) && password.equals(PASSWORD))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

package com.demo.entities;

import javax.persistence.*;
/**
 * Created by yzeng on 19/12/2016.
 */
@Entity
@Table(name = "user")
public class User {
//    private static final String USERNAME = "admin";
//    private static final String PASSWORD = "123456";



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idUser;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;

    public User(){}

    public User(String name, String password)
    {
        this.username = name;
        this.password = password;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

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
}

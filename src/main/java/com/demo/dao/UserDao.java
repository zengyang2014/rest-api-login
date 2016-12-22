package com.demo.dao;

import javax.transaction.Transactional;

import com.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
/**
 * Created by yzeng on 22/12/2016.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Integer> {
    public User findByUsername(String username);
}
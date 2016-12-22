package com.demo.controller;

import com.demo.dao.UserDao;
import com.demo.entities.Result;
import com.demo.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class LoginController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value="/login", consumes = {"application/json"}, method = RequestMethod.POST)
    @ResponseBody
    public HttpEntity<Result> userLogin(@RequestBody @Valid User user) {

        System.out.println(user.toString());

        if(isValid(user))
        {
            return new ResponseEntity<Result>(new Result(LOGIN_SUCCESS, "NULL"), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Result>(new Result(LOGIN_FAIL, "Login Fail, password or ID is not correct."), HttpStatus.OK);
        }

    }

    @org.jetbrains.annotations.NotNull
    private  Boolean isValid(User user)
    {
        User userDaoByName = userDao.findByUsername(user.getUsername());
        if(userDaoByName == null)
            return false;
        else
        {
            if(userDaoByName.getPassword().equals(user.getPassword()))
                return true;
            else
                return false;
        }
    }

    private static final Integer LOGIN_SUCCESS = 0;
    private static final Integer LOGIN_FAIL = 1;

    @Autowired
    public UserDao userDao;
}

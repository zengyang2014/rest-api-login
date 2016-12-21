package com.demo.controller;

import com.demo.Result;
import com.demo.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class LoginController {

    private static final Integer LOGIN_SUCCESS = 0;
    private static final Integer LOGIN_FAIL = 1;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value="/login", consumes = {"application/json"}, method = RequestMethod.POST)
    @ResponseBody
    public HttpEntity<Result> userLogin(@RequestBody @Valid User user) {

        if(user.isValid())
        {
            return new ResponseEntity<Result>(new Result(LOGIN_SUCCESS, "NULL"), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Result>(new Result(LOGIN_FAIL, "Login Fail, password or ID is not correct."), HttpStatus.OK);
        }

    }

}

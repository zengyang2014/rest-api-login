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

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping(value="/login", consumes = {"application/json"}, method = RequestMethod.POST)
    @ResponseBody
    public HttpEntity<Result> userLogin(@RequestBody @Valid User user) {

        if(user.checkUser())
        {
            return new ResponseEntity<Result>(new Result(0, "NULL"), HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<Result>(new Result(1, "Login Fail, password or ID is not correct."), HttpStatus.OK);
        }

    }

}

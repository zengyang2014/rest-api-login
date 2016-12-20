package com.demo.controller;

import com.demo.User;
import org.springframework.web.bind.annotation.*;

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
    String user(@RequestBody User user) {
        if(user.checkUser())
        {
            return "login success";
        }
        else
        {
            return "login fail";
        }
    }
}

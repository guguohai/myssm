package com.seangu.controller;

import com.seangu.model.User;
import com.seangu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private UserService userService;
    //    @RequestMapping("/hello/{player}")
//    public User message(@PathVariable String player) {
    @RequestMapping("/hello")
    public User Hello(String player) {
        User user = userService.getUserInfo();
        return user;
    }
}
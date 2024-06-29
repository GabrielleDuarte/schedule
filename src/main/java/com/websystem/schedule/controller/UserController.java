package com.websystem.schedule.controller;

import com.websystem.schedule.model.User;
import com.websystem.schedule.service.UserService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin()
    @PostMapping(value = "/create")
    public void createUser(@RequestBody User user ) {
        userService.createUser(user);
    }
}

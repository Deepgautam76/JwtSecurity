package com.Jwt.security.Jwt.Security.Controller;

import com.Jwt.security.Jwt.Security.Model.User;
import com.Jwt.security.Jwt.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<?> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/user")
    public User createNewUser(@RequestBody User user){
        System.out.println("Controller:"+user.getUsername() +user.getPassword());
        return userService.creteUser(user);
    }
}

package com.Jwt.security.Jwt.Security.Controller;

import com.Jwt.security.Jwt.Security.Model.User;
import com.Jwt.security.Jwt.Security.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/api/v1/users")
    public List<?> getUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/register")
    public User createNewUser(@RequestBody User user){
        return userService.creteUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        return userService.loginUser(user);
    }
}

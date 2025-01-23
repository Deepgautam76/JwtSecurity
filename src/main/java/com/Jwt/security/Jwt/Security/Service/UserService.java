package com.Jwt.security.Jwt.Security.Service;

import com.Jwt.security.Jwt.Security.Model.User;
import com.Jwt.security.Jwt.Security.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder encoder;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    public User creteUser(User user){
        System.out.println("Service:"+user.getUsername() +user.getPassword());
        User newUser=new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(newUser);
    }

    public User loginUser(User user) {
        Authentication authentication=
                new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword());

        return null;
    }
}

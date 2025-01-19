package com.Jwt.security.Jwt.Security.Service;

import com.Jwt.security.Jwt.Security.Model.User;
import com.Jwt.security.Jwt.Security.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    public User creteUser(User user){
        User newUser=new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(newUser);
    }
}

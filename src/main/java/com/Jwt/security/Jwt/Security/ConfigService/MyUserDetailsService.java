package com.Jwt.security.Jwt.Security.ConfigService;

import com.Jwt.security.Jwt.Security.Model.User;
import com.Jwt.security.Jwt.Security.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepo.findByUsername(username);
        if(user==null){
            System.out.println("User not found in DB:"+username);
            throw new UsernameNotFoundException("User not exist");
        }
        return new UserPrincipal(user);
    }
}

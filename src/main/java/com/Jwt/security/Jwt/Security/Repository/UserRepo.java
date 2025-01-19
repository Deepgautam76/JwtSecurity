package com.Jwt.security.Jwt.Security.Repository;

import com.Jwt.security.Jwt.Security.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User findByUserName(String username);
}

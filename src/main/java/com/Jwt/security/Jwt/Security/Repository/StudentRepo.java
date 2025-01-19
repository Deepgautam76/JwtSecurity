package com.Jwt.security.Jwt.Security.Repository;

import com.Jwt.security.Jwt.Security.Model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Students,Long> {

}

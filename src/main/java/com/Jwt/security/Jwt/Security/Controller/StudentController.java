package com.Jwt.security.Jwt.Security.Controller;

import com.Jwt.security.Jwt.Security.Model.Student;
import com.Jwt.security.Jwt.Security.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

}

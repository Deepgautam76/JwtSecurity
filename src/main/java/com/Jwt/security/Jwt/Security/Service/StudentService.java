package com.Jwt.security.Jwt.Security.Service;

import com.Jwt.security.Jwt.Security.Model.Student;
import com.Jwt.security.Jwt.Security.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public Student createStudent(Student student) {
        Student student1 =new Student();
        student1.setName(student.getName());
        student1.setRollNo(student.getRollNo());
        student1.setAge(student.getAge());
        student1.setYear(student.getYear());

        return studentRepo.save(student1);
    }
}

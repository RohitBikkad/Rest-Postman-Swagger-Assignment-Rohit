package io.swagger.service;

import io.swagger.model.Student;
import io.swagger.repository.StudentApiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentApiService {

    @Autowired
    private StudentApiRepo studentApiRepo;

    public List<Student> getAllStudent(){
        return studentApiRepo.findAll();
    }

    public Student addStudent(Student student){
        return studentApiRepo.save(student);
    }
}

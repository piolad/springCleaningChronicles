package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        21,
                        LocalDate.of(2001, 5, 10),
                        "Mariam.jamal@gmail.com"
                )
        );
    }
}

package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail =  studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email taken");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if(!studentRepository.existsById(id)){
            throw new IllegalStateException("student with id " + id + "does not exist");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(Student student) {
        Student sById = studentRepository.getReferenceById(student.getId());

        sById.setEmail(student.getEmail());
        sById.setName(student.getName());

//        studentRepository.save(sById);
    }
}

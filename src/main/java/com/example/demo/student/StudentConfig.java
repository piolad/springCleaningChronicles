package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student mariam = new Student(
//                    1L,
                    "Mariam",
                    LocalDate.of(2001, 5, 10),
                    "Mariam.jamal@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2004, 5, 10),
                    "alex@gmail.com"
            );

            repository.saveAll(List.of(mariam, alex));
        };
    }
}

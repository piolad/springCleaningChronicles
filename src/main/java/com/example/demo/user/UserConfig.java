package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository urepo){

        return args -> urepo.saveAll(List.of(
            new User(
                    "Piotrek",
                    "piotr@example.com",
                    LocalDate.of(2000,10, 10)
            ),
            new User(
                    "W",
                    "w@example.com",
                    LocalDate.of(2001,7, 15)
            )
        ));
    }
}

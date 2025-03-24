package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("hello")
	public String hello(){
		return "Hello World";
	}

	@GetMapping("ay")
	public String ay(){
		return "ayy";
	}


	@GetMapping("public/sayHi")
	public String hi(){
		return "hi";
	}

//	@GetMapping("public/students")
//	public List<Student> students(){
//		return List.of(
//				new Student(
//						1L,
//						"Mariam",
//						21,
//						LocalDate.of(2001,5, 10),
//						"Mariam.jamal@gmail.com"
//						)
//		);
//	}
}

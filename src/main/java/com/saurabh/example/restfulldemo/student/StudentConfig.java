package com.saurabh.example.restfulldemo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {

            Student saurabh = new Student(
                    "Saurabh",
                    "saurabhmasc@gmail.com",
                    LocalDate.of(1995, Month.JANUARY, 30)
            );

            Student chandan = new Student(
                    "Chandan",
                    "chandanmasc@gmail.com",
                    LocalDate.of(1996, Month.MARCH, 18)
            );

            studentRepository.saveAll(
                    List.of(saurabh, chandan)
            );
        };
    }
}

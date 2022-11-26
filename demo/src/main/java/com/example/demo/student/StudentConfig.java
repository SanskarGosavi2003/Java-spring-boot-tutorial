package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sanskar = new Student(
                    "Sanskar",
                    LocalDate.of(2003, Month.MAY, 2),
                    "sanskargosavi@gmail.com"
            );
            Student santosh = new Student(
                    "Santosh",
                    LocalDate.of(1973, Month.JANUARY, 26),
                    "santoshgosavi@gmail.com"
            );
            repository.saveAll(
                    List.of(sanskar, santosh)
            );
        };
    }
}

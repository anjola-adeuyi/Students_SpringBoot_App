package com.students.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ) {
        return args -> {
            Student jola = new Student (
                    "Jola",
                    "Jola@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );

            Student alex = new Student (
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1990, Month.DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(jola, alex)
            );
        };
    }
}

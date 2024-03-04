package com.students.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Jola",
                        "Jola@gmail.com",
                        LocalDate.of(2000, Month.APRIL, 5),
                        20
                )
        );
    }
}

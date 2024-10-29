package com.example.Digital_Library.repository;

import com.example.Digital_Library.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {
    Student findStudentByRollNumber(String rollNumber);
    Student findStudentByEmail(String email);
}

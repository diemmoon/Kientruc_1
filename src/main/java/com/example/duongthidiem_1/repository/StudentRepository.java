package com.example.duongthidiem_1.repository;

import com.example.duongthidiem_1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Integer> {
}

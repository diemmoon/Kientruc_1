package com.example.duongthidiem_1;

import com.example.duongthidiem_1.entity.Student;
import com.example.duongthidiem_1.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DuongThiDiem1ApplicationTests {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void getAll() {
        System.out.println("getAll: " + studentRepository.getAll());
    }
    @Test
    public void add() {
        studentRepository.addStudent("Duong ", "Diem", "diem@gmail.com");
    }
    @Test
    public void update() {
        Student student = studentRepository.findById(3).get();
        studentRepository.updateStudent(3, "Moon ", "hihi", "kk@gmail.com");
    }

    @Test
    public void delete() {

        studentRepository.deleteStudent(3);
    }

}

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
        System.out.println("getAll: " + studentRepository.findAll());
    }
    @Test
    public void add() {

        studentRepository.save(Student.builder().firstName("Duong").lastName("Diem").email("diem.com").build());
    }

    @Test
    public void update() {
        Student student = studentRepository.findById(1).get();
        student.setFirstName("Moon ");
        System.out.println("Update: " + studentRepository.save(student));
    }

    @Test
     void delete() {
        studentRepository.deleteById(1);
    }

    @Test
    void contextLoads() {
    }


}

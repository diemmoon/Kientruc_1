package com.example.duongthidiem_1.repository;

import com.example.duongthidiem_1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Integer> {
    @Query(value = "select * from student", nativeQuery = true)
    List<Student> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into student(first_name, last_name, email) values(?1,?2,?3)", nativeQuery = true)
    void addStudent(String firstName,String lastName,String email);

    @Transactional
    @Modifying
    @Query(value = "update student set first_name = ?2,last_name = ?3,email = ?4 where id = ?1", nativeQuery = true)
    void updateStudent(int id, String firstName,String lastName,String email);

    @Transactional
    @Modifying
    @Query(value = "delete from student where id = ?1", nativeQuery = true)
    void deleteStudent(int id);
}

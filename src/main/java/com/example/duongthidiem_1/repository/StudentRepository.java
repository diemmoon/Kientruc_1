package com.example.duongthidiem_1.repository;

import com.example.duongthidiem_1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface StudentRepository  extends JpaRepository<Student, Integer> {
    @Query("select s from Student s")
    List<Student> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into student(first_name,last_name,email) values(?1,?2,?3)", nativeQuery = true)
    void addStudent(String firstName, String lastName, String email);

    @Transactional
    @Modifying
    @Query(value = "update Student s set s.firstName=?2, s.lastName=?3, s.email = ?4 where s.id = ?1")
    void updateStudent(int id ,String firstName, String lastName, String email);

    @Transactional
    @Modifying
    @Query("delete from Student s where s.id = ?1")
    void deleteStudent(int id);
}

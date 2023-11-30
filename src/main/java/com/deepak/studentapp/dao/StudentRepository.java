package com.deepak.studentapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deepak.studentapp.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

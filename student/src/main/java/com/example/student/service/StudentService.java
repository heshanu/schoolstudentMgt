package com.example.student.service;

import com.example.student.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public void saveStudent(StudentEntity student);
    public List<StudentEntity> findAllStudents();
    List<StudentEntity> findAllStudentsBySchool(Integer schoolId);
}

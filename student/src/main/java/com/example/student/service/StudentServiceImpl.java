package com.example.student.service;

import com.example.student.entity.StudentEntity;
import com.example.student.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepo studentRepo;

    @Override
    public void saveStudent(StudentEntity student) {
        studentRepo.save(student);
    }

    @Override
    public List<StudentEntity> findAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public List<StudentEntity> findAllStudentsBySchool(Integer schoolId) {
        return studentRepo.findALlByStudentId(schoolId);
    }
}

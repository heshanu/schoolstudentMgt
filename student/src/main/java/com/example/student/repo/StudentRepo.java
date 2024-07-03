package com.example.student.repo;

import com.example.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

    List<StudentEntity> findALlByStudentId(Integer schoolId);

}

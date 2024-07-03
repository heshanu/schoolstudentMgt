package com.example.school.service;

import com.example.school.entity.SchoolEntity;
import com.example.school.response.FullSchoolResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolService{

   // private final StudentClient client;

    void saveSchool(SchoolEntity school);

    List<SchoolEntity> findAllSchools();

    FullSchoolResponse findSchoolsWithStudents(Integer schoolId);


}

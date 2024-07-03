package com.example.school.service;

import com.example.school.entity.SchoolEntity;
import com.example.school.entity.StudentEntity;
import com.example.school.micro.StudentClient;
import com.example.school.repo.SchoolRepo;
import com.example.school.response.FullSchoolResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService{

    private SchoolService schoolService;
    private SchoolRepo schoolRepo;

    private StudentClient client;

    @Override
    public void saveSchool(SchoolEntity school) {
            schoolRepo.save(school);
    }

    @Override
    public List<SchoolEntity> findAllSchools() {
        return schoolRepo.findAll();
    }

    @Override
    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school=schoolRepo.findById(schoolId).
                orElse(SchoolEntity.builder()
                        .name("NOT FOUND")
                        .email("NOT FOUND")
                        .build());
        var students=client.findAllStudentBySchool(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}

package com.example.student.controller;
import com.example.student.entity.StudentEntity;
import com.example.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private StudentService studentSerivce;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody StudentEntity student){
        studentSerivce.saveStudent(StudentEntity.builder().build());
    }

    @GetMapping("/")
    public ResponseEntity<List<StudentEntity>> getAllStudent(){
        return ResponseEntity.ok(studentSerivce.findAllStudents());
    }

    @GetMapping("/school/{school.id}")
    public ResponseEntity<List<StudentEntity>> getAllStudent(@PathVariable ("school-id") Integer schoolId){
        return ResponseEntity.ok(studentSerivce.findAllStudentsBySchool(schoolId));
    }

}

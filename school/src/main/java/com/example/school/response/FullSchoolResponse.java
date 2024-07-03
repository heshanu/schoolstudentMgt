package com.example.school.response;

import com.example.school.entity.StudentEntity;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter @Setter
public class FullSchoolResponse {
    private String name;
    private String email;
    List<StudentEntity> students;
}

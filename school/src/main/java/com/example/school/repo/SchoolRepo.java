package com.example.school.repo;

import com.example.school.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepo extends JpaRepository<SchoolEntity,Integer> {
}

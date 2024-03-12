package io.swagger.repository;

import io.swagger.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentApiRepo extends JpaRepository<Student, Integer> {
}

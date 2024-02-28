package io.personalproject.resumeportal.repository;

import io.personalproject.resumeportal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<Student,Integer> {
    Optional<Student> findByUserName(String userName);
}

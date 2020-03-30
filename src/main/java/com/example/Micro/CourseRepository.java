package com.example.Micro;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, BigInteger>{

}

package com.mongodb.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.example.entities.Student;

public interface StudentRepo extends MongoRepository<Student, Integer>{

}

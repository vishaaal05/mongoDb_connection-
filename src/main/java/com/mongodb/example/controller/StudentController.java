package com.mongodb.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.example.entities.Student;
import com.mongodb.example.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/")
	public ResponseEntity<?> addStudent(@RequestBody Student student){
		
	Student save = this.studentRepo.save(student);
	return ResponseEntity.ok(save);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<?> getStudents(){
		return ResponseEntity.ok(this.studentRepo.findAll());
	}
	
	
}

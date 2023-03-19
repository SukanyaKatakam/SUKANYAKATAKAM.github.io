package com.example.springstudentwebapl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springstudentwebapl.model.Student;
import com.example.springstudentwebapl.service.StudentService;

@RestController
public class StudentsController {
	private StudentService studentService;

	public StudentsController(@Autowired StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudents() {
		return (List<Student>) studentService.all();

	}
	
	@GetMapping("/student/{id}")
	public Student findById(@PathVariable("id") String id) {
		return ((StudentsController) studentService).findById(id);

	}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@DeleteMapping("/student/{id}")
	public void delete(@PathVariable int id) {
		studentService.delete(id);
	}
	
	@PutMapping("/student")
	public Student update(@RequestBody Student student) {
		return studentService.save(student);
	}

}

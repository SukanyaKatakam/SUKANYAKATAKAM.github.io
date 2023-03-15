package com.example.dependencyinjection.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.dependencyinjection.model.Student;
import com.example.dependencyinjection.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	@Qualifier("studentServiceImplMap")
	 private final StudentService studentService;

	    public StudentController( @Qualifier("studentServiceImplMap") StudentService studentService )
	    {
	    	
	        this.studentService = studentService;
	        
	        studentService.add(new Student("423", 2, "Sukanya", "Katakam", "India", "Khammam", new Date()));
	    }

	    @GetMapping( "/student/{id}" )
	    Student findById( @PathVariable( "id" ) String id )
	    {
	        return studentService.findById( id );
	    }
	    
	    @GetMapping("/map")
	    public List<Student> getAllStudents() {
	    	System.out.println("Using map configuration");
	    	return studentService.all();
	    }
}

package com.example.springstudentwebapl.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springstudentwebapl.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{
	
	 Student findById( int id );

}

package com.example.springstudentwebapl.service;

import com.example.springstudentwebapl.model.Student;

public interface StudentService {
	
	Iterable<Student> all();

    Student get( int studentId );

    Student save( Student student );

    void delete( int studentId );

}

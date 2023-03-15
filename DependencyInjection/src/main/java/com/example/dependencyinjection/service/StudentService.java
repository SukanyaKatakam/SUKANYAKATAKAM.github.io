package com.example.dependencyinjection.service;

import java.util.List;

import com.example.dependencyinjection.model.Student;

public interface StudentService {

	 void add( Student student );

	    void delete( Student student );

	    List<Student> all();

	    Student findById( String id );
}

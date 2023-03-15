package com.example.dependencyinjection.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.dependencyinjection.model.Student;

@Service
public class StudentServiceImplMap implements StudentService {

	
	private Map<String, Student> students;
	
	public StudentServiceImplMap() {
		students = new HashMap<>();
	}
	
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
        students.put(student.getIdStudent(), student);
	}

	@Override
	public void delete(Student student) {
		// TODO Auto-generated method stub
       students.remove(student.getIdStudent(), student);
	}

	@Override
	public List<Student> all() {		
		// TODO Auto-generated method stub
		return new ArrayList<>(students.values());
	}

	@Override
	public Student findById(String id) {
		// TODO Auto-generated method stub
		return students.get(id);
	}

}

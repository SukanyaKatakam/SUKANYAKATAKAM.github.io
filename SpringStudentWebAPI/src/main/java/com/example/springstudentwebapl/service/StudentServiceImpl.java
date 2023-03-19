package com.example.springstudentwebapl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springstudentwebapl.model.Student;
import com.example.springstudentwebapl.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	private final StudentRepository studentsRepository;

    public StudentServiceImpl( @Autowired StudentRepository studentsRepository )
    {
        this.studentsRepository = studentsRepository;
    }
    
    @Override
    public Iterable<Student> all()
    {
        return studentsRepository.findAll();
    }
    
    @Override
    public Student get( int studentId )
    {
        return studentsRepository.findById( studentId );
    }
    
    @Override
    public Student save( Student student )
    {
        return studentsRepository.save( student );
    }
    
    @Override
    public void delete( int studentId )
    {
        studentsRepository.deleteById( studentId );
    }
	
}

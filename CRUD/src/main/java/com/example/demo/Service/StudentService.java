package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repository;
	
	public String saveStudent(Student student)
	{
		repository.save(student);
		return "Success";
	}
	public List<Student> getStudent()
	{
		return repository.findAll();
	}
	public Optional<Student> getStudentById(int id)
	{
		return repository.findById(id);
	}
}
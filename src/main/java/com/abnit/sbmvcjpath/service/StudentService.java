package com.abnit.sbmvcjpath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abnit.sbmvcjpath.entity.StudentEntity;
import com.abnit.sbmvcjpath.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	  public StudentEntity save(StudentEntity studentEntity) {
	  
		  StudentEntity respStudentEntity = studentRepository.save(studentEntity);
		  
		  return respStudentEntity; 
	  }
	 
	
	public StudentEntity getStudentById(int id) {
		
		StudentEntity respStudentEntity = studentRepository.getStudentById(id);
		
		return respStudentEntity;
	}
	
	public StudentEntity deleteStudentById(int id) {
		
		StudentEntity respStudentEntity = studentRepository.deleteStudentById(id);
		
		return respStudentEntity;
		
	}

}

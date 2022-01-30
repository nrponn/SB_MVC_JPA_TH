package com.abnit.sbmvcjpath.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import com.abnit.sbmvcjpath.entity.StudentEntity;
import com.abnit.sbmvcjpath.repository.StudentRepository;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTestWithMock {
	
	@InjectMocks
    private StudentService studentService;
    
    @Mock
    private StudentRepository studentRepository;
    
    @Test
    public void testGetStudentById() {
    	//given
    	int id=100;
    	
    	//when
    	studentService.getStudentById(id);
    	
    	//then
    	verify(studentRepository).getStudentById(id);
    }
    
	@Test
	public void testSave() {
		
		//given
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(110);
		studentEntity.setName("Gandhi");
		studentEntity.setAddress("Delhi");
		studentEntity.setGender('M');
		
		//when
		//StudentEntity respStudentEntity = studentRepository.saveStudent(studentEntity);
				
		//then
		//assertThat(respStudentEntity).isEqualTo(studentEntity);
		//verify(studentRepository).saveStudent(studentEntity);
		
	}
	
	@Test
    public void testDeleteStudentById() {
    	//given
    	int id=100;
    	
    	//when
    	studentService.deleteStudentById(id);
    	
    	//then
    	verify(studentRepository).deleteStudentById(id);
    }

}

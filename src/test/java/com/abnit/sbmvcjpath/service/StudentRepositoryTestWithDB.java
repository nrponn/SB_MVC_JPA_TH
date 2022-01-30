package com.abnit.sbmvcjpath.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.abnit.sbmvcjpath.entity.StudentEntity;
import com.abnit.sbmvcjpath.repository.StudentRepository;

@DataJpaTest
public class StudentRepositoryTestWithDB {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testSave() {
		//given
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(110);
		studentEntity.setName("Gandhi");
		studentEntity.setAddress("Delhi");
		studentEntity.setGender('M');
		
		//assertEquals(10,10);
		
		//when
		StudentEntity respStudentEntity = studentRepository.save(studentEntity);
		
		//then
		assertThat(respStudentEntity).isEqualTo(studentEntity);
	}
	
	@Test
	public void testFindById( ) {
		//given
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(110);
		studentEntity.setName("Gandhi");
		studentEntity.setAddress("Delhi");
		studentEntity.setGender('M');
		StudentEntity respStudentEntity = studentRepository.save(studentEntity);
		int id = 110;
		
		//when
		StudentEntity studentEntityRes = studentRepository.getStudentById(id);
		
		//then
		assertThat(studentEntityRes).isNotEqualTo(null);
		assertThat(studentEntityRes).isEqualTo(respStudentEntity);
	}
	
	@Test
	public void testUpdate() {
		
		//given
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(110);
		studentEntity.setName("Mahatma");
		studentEntity.setAddress("Delhi");
		studentEntity.setGender('M');
		
		//assertEquals(10,10);
		
		//when
		StudentEntity respStudentEntity = studentRepository.save(studentEntity);
		
		//then
		assertThat(respStudentEntity).isEqualTo(studentEntity);
		assertThat(respStudentEntity).isNotEqualTo(null);
	}
	
	@Test
	public void testDeleteById( ) {
		//given
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setId(110);
		studentEntity.setName("Gandhi");
		studentEntity.setAddress("Delhi");
		studentEntity.setGender('M');
		StudentEntity respStudentEntity = studentRepository.save(studentEntity);
		int id = 110;
		
		//when
		studentRepository.deleteById(110);
		
		//then
		//assertThat(studentEntityRes).isNotEqualTo(null);
		//assertThat(studentEntityRes).isEqualTo(respStudentEntity);
	}

}

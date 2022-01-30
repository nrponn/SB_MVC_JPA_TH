package com.abnit.sbmvcjpath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abnit.sbmvcjpath.entity.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

	//public StudentEntity saveStudent(StudentEntity studentEntity);
	public StudentEntity getStudentById(int id);
	public StudentEntity deleteStudentById(int id);

}

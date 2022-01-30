package com.abnit.sbmvcjpath.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="t_student")
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
	@Id
	private int id;
	private String name;
	private Character gender;
	private String address;
	
}

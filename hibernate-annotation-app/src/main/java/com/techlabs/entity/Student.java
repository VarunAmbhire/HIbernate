package com.techlabs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id      
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	private String fName;
	private String lName;

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Student(int id,String fName, String lName) {
		super();
		this.id=id;
		this.fName = fName;
		this.lName = lName;
	}

}

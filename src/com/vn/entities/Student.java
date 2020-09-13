package com.vn.entities;

import java.io.Serializable;
import java.sql.Date;

import lombok.Data;

@Data
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5422502354092903770L;
	private String studentID;
	private String studentName;
	private String gender;
	private Date dateOfbirth;
	private String classID;

	public Student() {
		super();
	}

	public Student(String studentID, String studentName, String gender, Date dateOfbirth, String classID) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.gender = gender;
		this.dateOfbirth = dateOfbirth;
		this.classID = classID;
	}
}

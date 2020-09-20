package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Semester implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6259499199625403631L;
	private String semesterID;
	private String semesterName;

	public Semester() {
		super();
	}

	public Semester(String semesterID, String semesterName) {
		super();
		this.semesterID = semesterID;
		this.semesterName = semesterName;
	}

}

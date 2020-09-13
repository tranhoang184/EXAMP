package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Subject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3483028378047283756L;
	private String subjectID;
	private String subjectName;

	public Subject() {
		super();
	}

	public Subject(String subjectID, String subjectName) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
	}
}

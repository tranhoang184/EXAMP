package com.vn.entities;

import java.io.Serializable;
import lombok.Data;

@Data
public class Mark implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1688732026354432950L;
	private String studentID;
	private String subjectID;
	private float mark;
	private float markAVG;
	private String semesterID;

	public Mark() {
		super();
	}

	public Mark(String studentID, String subjectID, float mark, float markAVG, String semesterID) {
		super();
		this.studentID = studentID;
		this.subjectID = subjectID;
		this.mark = mark;
		this.markAVG = markAVG;
		this.semesterID = semesterID;
	}
}

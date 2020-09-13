package com.vn.DAO;

import java.util.List;

import com.vn.entities.Semester;

public interface SemesterDAO {
	String delete(String semesterID);

	Semester create(Semester semester);

	Semester update(Semester semester);

	List<Semester> getAll();

	Semester findById(String semesterID);

}

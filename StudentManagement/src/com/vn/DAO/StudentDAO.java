package com.vn.DAO;

import java.util.List;

import com.vn.entities.Student;

public interface StudentDAO {
	Integer delete(String studentID);

	Student create(Student student);

	Student update(Student student);

	List<Student> getAll();

	Student findById(String studentID);

}

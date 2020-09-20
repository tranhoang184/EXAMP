package com.vn.DAO;

import java.util.List;

import com.vn.entities.Subject;

public interface SubjectDAO {
	Integer delete(String subjectID);

	Subject create(Subject subject);

	Subject update(Subject subject);

	List<Subject> getAll();

	Subject findById(String subjectID);

}

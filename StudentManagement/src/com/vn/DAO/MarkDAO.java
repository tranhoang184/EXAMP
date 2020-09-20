package com.vn.DAO;

import java.util.List;

import com.vn.entities.Mark;

public interface MarkDAO {
	String delete(String studentID);

	Mark create(Mark mark);

	Mark update(Mark mark);

	List<Mark> getAll();

	Mark findById(String studentID);

}
